package org.xtext.alma.sdmdsl.generator.sdmfilesystem;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.RuntimeIOException;
import org.xtext.alma.sdmdsl.generator.Main;

public class SDMFileSystemAccess extends JavaIoFileSystemAccess{
	
	private File file;
	
	public void setFile(String fileName){
		file = getFile(fileName, "DEFAULT_OUTPUT");
	}
	
	public File getFile(){
		return file;
	}
	
	
	public void generateFile(CharSequence contents) throws RuntimeIOException {
		
		Main.logger.info("Generating file ---> " + file);
		if (!getOutputConfig("DEFAULT_OUTPUT").isOverrideExistingResources() && file.exists()) {
			return;
		}
		try {
			createFolder(file.getParentFile());
			String encoding = getEncoding(getURI(file.getName(), "DEFAULT_OUTPUT"));
			OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file), encoding);
			try {
				writer.append(postProcess(file.getName(), "DEFAULT_OUTPUT", contents, encoding));
				if (isWriteTrace())
					generateTrace(file.getName(), "DEFAULT_OUTPUT", contents);
			} finally {
				writer.close();
			}
		} catch (IOException e) {
			throw new RuntimeIOException(e);
		}
	}
	
	
	
	public boolean fileExists(){
		
		if(file.exists()) return true;
		return false;

	}
	

}