package alma.hla.datamodel.meta.asdm;

import java.util.Hashtable;

public class ExportEncoding {
	
	private final String name;
	
	private ExportEncoding(String name){
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
	
	public static final ExportEncoding ASCII = new ExportEncoding("ASCII");
	public static ExportEncoding EE_ASCII() {return ASCII;}
	
	public static final ExportEncoding Base64 = new ExportEncoding("Base64");
	public static ExportEncoding EE_Base64() {return Base64;}
	public static ExportEncoding get(String s) {
		return (ExportEncoding) exportEncodingHashTable.get(s);
	}
	
	private static Hashtable<String, ExportEncoding> initializeExportEncodingHashTable() {
		Hashtable<String, ExportEncoding> result = new Hashtable<String, ExportEncoding>();
		result.put("ASCII", ASCII);
		result.put("Base64", Base64);
		return result;
	}
	
	private static Hashtable<String, ExportEncoding> exportEncodingHashTable = initializeExportEncodingHashTable();
}
