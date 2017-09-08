package alma.hla.datamodel.meta.enumeration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.xtext.alma.enumeration.enumeration.EnumType;

/**
 * The EnumerationContainer class contains the information about all
 * enumerations in the model.  There must be one and only one
 * EnumerationContainer in the model.
 */
public class EnumerationContainer {
	
	/**
	 * Instance of the class AlmaTableContainer (Singleton pattern)
	 */
	private static EnumerationContainer instance = new EnumerationContainer();
	
	private HashMap<String, EnumType> enumMap;
	
	
	/**
	 * The enumerations that belong to this container.
	 */
	private List<EnumType> enumerations; 
	
	
	
	/**
	 * Constructor
	 */
	private EnumerationContainer(){
		
		this.enumerations = new ArrayList<EnumType>();
		this.enumMap = new HashMap<String,EnumType>();
		
	}
	
	
	/**
	 * adds enumeration to List and to Map
	 * @param enumeration
	 */
	public void addTable(EnumType enumeration){
		enumerations.add(enumeration);
		enumMap.put(enumeration.getName(),enumeration);
	}
	
	
	/**
	 * Set the enumerations that belong to this container.
	 * @param enumerations
	 */
	public void setTables(List<EnumType> enumerations) {
		this.enumerations = enumerations;
	}


	public static EnumerationContainer getInstance() {
		return instance;
	}


	public HashMap<String, EnumType> getEnumMap() {
		return enumMap;
	}


	public void setEnumMap(HashMap<String, EnumType> enumMap) {
		this.enumMap = enumMap;
	}


	public List<EnumType> getEnumerations() {
		return enumerations;
	}


	public void setEnumerations(List<EnumType> enumerations) {
		this.enumerations = enumerations;
	}
	
	
}
