package org.xtext.alma.enumeration.generator;

import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.mwe.ResourceDescriptionsProvider;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.xtext.alma.enumeration.EnumerationStandaloneSetupGenerated;
import org.xtext.alma.enumeration.generator.enumfilesystem.EnumerationFileSystemAccess;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

public class Main {
	
	private static Logger logger = Logger.getLogger(Main.class);
	private static String enum_dir = null;
	
	// inner class, generic extension filter
	public class GenericExtFilter implements FilenameFilter {

		private String ext;
		
		public GenericExtFilter(String ext){
			this.ext = ext;
		}
		
		@Override
		public boolean accept(File dir, String name) {
			return name.endsWith(ext);
		}
		
	}
	
	
	private void discoverResources(ResourceSet set,String directory,String extension) throws Exception {
		logger.info("About to discover resources in files with extension '"+extension+"', located in directory '"+directory+"'.");
		File dir = new File(directory);
		
		if (!dir.exists()) {
			throw new Exception("'"+dir+"' does not exist.");
		}
		
		if ((!dir.isDirectory())) {
			throw new Exception("'"+dir+"' is not a directory.");
		}
		
		GenericExtFilter filter = new GenericExtFilter(extension);
		
		String[] fileNames = dir.list(filter);
		if (fileNames.length == 0) {
			throw new Exception("No file found with extension '"+extension+"'.");
		}

		for (String fileName : fileNames) {
			logger.info("Discovered resource '"+fileName+"'.");
			set.getResource(URI.createURI(directory+File.separator+fileName), true);
		}
		logger.info("Discovered " + fileNames.length + " resources.");
	}
	
	
	@SuppressWarnings("static-access")
	public static void main(String[] args){
		if(args.length == 0){
			logger.error("Aborting: no path to EMF resource provided!");
			return;
		}
		
		Options options = new Options();
		options.addOption(OptionBuilder.withLongOpt("enum-dir")
						.withDescription("Directory of 'enumeration' source files")
						.hasArg().withArgName("enum-dir-name")
						.create());
		
		CommandLineParser parser = new GnuParser();
		
		try {
			CommandLine line = parser.parse(options, args);
			
			if (line.hasOption("enum-dir")) {
				Main.enum_dir=line.getOptionValue("enum-dir");
			}else{
				throw new Exception("The directory of `enum` files was not specified");
			}
			
		}
		catch (Exception e) {
			logger.error(e.getMessage());
			return;
		}
		
		Injector injector = new EnumerationStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
		Main main = injector.getInstance(Main.class);
		
		// runs generator 
		try {
			main.runGenerator();
		} catch(Exception e){
			logger.error(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Inject ResourceDescriptionsProvider rdp;
	
	@Inject Provider<ResourceSet> resourceSetProvider;
	
	@Inject IResourceValidator validator;
	
	@Inject EnumerationFileSystemAccess enumFileAccess;
	
	@Inject EnumerationGenerator generator;
	
	@Inject IContainer.Manager manager;	
	
	
	
	
	protected void runGenerator() throws Exception {
		logger.info("Entering code generator");
		
		
		File directory = new File(enum_dir);
		
		
		if (!directory.exists()) {
			throw new Exception("'"+ directory +"' no such directory.");
		}
		if (!directory.isDirectory()) {
			throw new Exception("'"+ directory +"' not a directory.");
		}
		
		logger.info("'.enum' resources will be looked for in '"+ directory.toPath().toAbsolutePath().toString() +"'.");
		
		// load the resource
		ResourceSet set = resourceSetProvider.get();

		// Discover the resources in the directory provided on the command line.
		discoverResources(set,directory.toPath().toString(), ".enum");
		EList<Resource> resources = set.getResources();
		
			
		// validation of the resource
		logger.info("Starting validation!!!");
		logger.info("---------------------------------------------------------------------------");
		for(int i=0;i<resources.size();i++){
			List<Issue> list = 	validator.validate(resources.get(i), CheckMode.ALL, CancelIndicator.NullImpl);
			if(!list.isEmpty()){
				for(Issue issue : list){
					logger.error(issue);
				}
				logger.info("Validation failed for " + resources.get(i).getURI());
				logger.info("Aborting code generation!!!");
				logger.info("---------------------------------------------------------------------------");
				return;
			}
							
			logger.info("Validation succeeded for " + resources.get(i).getURI());
		}
		logger.info("End of Validation!!!");
		logger.info("---------------------------------------------------------------------------");
		
		// configure and start the generator
		enumFileAccess.setOutputPath("generated");
		GeneratorContext gc = new GeneratorContext();
		gc.setCancelIndicator(CancelIndicator.NullImpl);
				
		
		Main.logger.info("Starting generation!!!");
		Main.logger.info("---------------------------------------------------------------------------");
		// runs EnumerationGenerator
		generator.doGenerate(resources, enumFileAccess, gc);

		Main.logger.info("End of code generation!!!");
		Main.logger.info("---------------------------------------------------------------------------");
		
		logger.info("Exiting code generator");
	}
	
	
	
	
	
	public static Logger getLogger(){
		return logger;
	}
	
}