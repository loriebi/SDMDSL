/*
 * ALMA - Atacama Large Millimeter Array
 * (c) European Southern Observatory, 2002
 * (c) Associated Universities Inc., 2002
 * Copyright by ESO (in the framework of the ALMA collaboration),
 * Copyright by AUI (in the framework of the ALMA collaboration),
 * All rights reserved.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY, without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston,
 * MA 02111-1307  USA
 *
 * File AlmaTableContainer.java
 */

package alma.hla.datamodel.meta.asdm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import org.xtext.alma.container.container.ContainerField;
import org.xtext.alma.container.container.impl.ContainerImpl;



/**
 * The AlmaTableContainer class contains the information about the
 * AlmaTableContainer in the model.  There must be one and only one
 * AlmaTableContainer in the model.
 */
public class AlmaTableContainer extends ContainerImpl{
	
	
	private class CustomComparator implements Comparator<AlmaTable>{
		@Override
	    public int compare(AlmaTable o1, AlmaTable o2) {
	        return o1.getName().compareTo(o2.getName());
	    }
	}
	
	/** CVSRevision number */
	private static String revision = "-1"; 
	
	
	/** CVSBranch number */
	private static String branch = "";
	
	
	/**
	 * Instance of the class AlmaTableContainer (Singleton pattern)
	 */
	private static AlmaTableContainer instance = new AlmaTableContainer();
	
	
	private HashMap<String, AlmaTable> tableMap;
	

	
	/**
	 * The xmlns prefix
	 */
	public String xmlnsPrefix;
	
	
	/**
	 * The version number
	 */
	private String version;
	
	
	
	/**
	 * The AlmaTables that belong to this container.
	 */
	private List<AlmaTable> tables; 
	
	/**
	 * This member variable is a workaround for the problem that if the ASDMAttributes
	 * method is called more than once, all calls after the first one will
	 * include the attributes defined by the BasicType() method.
	 */
	private List<ASDMAttribute> asdmAttributes = new ArrayList<ASDMAttribute>(); 
	
	
	/**
	 * initialization of container attributes 	
	 */
	public void init(org.xtext.alma.container.container.Container container){

		this.name = container.getName();
		this.data = container.getData();
		
		if(container.getDoc() != null){
			StringBuilder sb = new StringBuilder(container.getDoc());
			sb.deleteCharAt(0);
			sb.deleteCharAt(0);
			sb.deleteCharAt(sb.length() - 1);
			sb.deleteCharAt(sb.length() - 1);
			this.doc = sb.toString();
		}else 
			this.doc = "";
		
		for(ContainerField field : container.getData() ){
			ASDMAttribute attr = new ASDMAttribute(field);
			attr.setTableName(this.name);

			asdmAttributes.add(attr);
		}
		
		initXmlnsPrefix();
		initVersion();

	}
	
	/*
	 * initialization of xmlnsPrefix attribute
	 */
	private void initXmlnsPrefix(){
		for(ContainerField containerField : data){
			if(containerField.getName().equals("xmlnsPrefix")){
				this.xmlnsPrefix = containerField.getInitValue();
			}
		}
	}
	
	/*
	 * initialization of version attribute
	 */
	private void initVersion(){
		for(ContainerField containerField : data){
			if(containerField.getName().equals("version")){
				this.xmlnsPrefix = containerField.getInitValue();
			}
		}
	}
	
	
	/**
	 * Constructor
	 */
	private AlmaTableContainer(){
		super();
		
		this.tables = new ArrayList<AlmaTable>();
		this.tableMap = new HashMap<String,AlmaTable>();
	}
	
	
	
	
	/**
	 * Return the directory path that corresponds to the path statement.
	 * @return
	 */
	public String DirPath() {
		return Path().replace('.','/');
	}
	
	/**
	 * Generate the prefix for the package statement in the generated classes.
	 * @return The string that should be prefixed to the package statement.
	 */ 
	public String Path() {
		return "alma.asdm";
	}

	
	/**
	 * Generate the prefix for the import statement in the generated classes
	 * that imports the extended types.
	 * @return The string that should be prefixed to the package statement.
	 */ 
	public String ExtendedTypes(){
		return "alma.hla.runtime.asdm.types";
	}
	
	
	public String ExtendedIDLTypes() {
		return "alma.asdmIDLTypes";
	}

	
	/**
	 * returns sorted list of tables
	 */
	public List<AlmaTable> sortedAlmaTable(){
		List<AlmaTable> sortedList = new ArrayList<AlmaTable>();
		
		/*
		 * Main table is always first in sortedList 
		 */
		AlmaTable mainTable = new AlmaTable();
		for(AlmaTable table : tables){
			if(!table.getName().equals("Main")){
				sortedList.add(table);
			}else{
				mainTable = table;
			}
		}
		
		Collections.sort(sortedList, new CustomComparator());
		sortedList.add(0,mainTable);
		
		return sortedList;
	}
	
	
	/**
	 * adds table to List and to Map
	 * @param table
	 */
	public void addTable(AlmaTable table){
		tables.add(table);
		tableMap.put(table.getName(),table);
	}
	
	
	/**
	 * Set the tables that belong to this container.
	 * @param table
	 */
	public void setTables(List<AlmaTable> tables) {
		this.tables = tables;
	}
	
	/**
	 * Return the ASDMAttributes that belong to this container as an ElementSet
	 * @return
	 */
	public List<ASDMAttribute> ASDMAttributes() {
		return asdmAttributes;
	}
	
	/**
	 * Return the List of BasicType ASDMAttributes   
	 * @return
	 */
	public List<ASDMAttribute> BasicType(){
		
		List<ASDMAttribute> result = new ArrayList<ASDMAttribute>();
		BasicType type[] = BasicType.getBasicType();
		
		ASDMAttribute attr = null;
		
		for(int i=0;i<type.length;i++){
			attr = new ASDMAttribute();
			
			attr.setName("dummy");
			attr.setTypeName(type[i].getJavaName());
			
			result.add(attr);
		}
		
		return result;
	}
	
	
	
	
	
	
	/* --------------------------------- Getters and Setters ---------------------------- */

	
	/**
	 * Return the tables that belong to this container.
	 * @return
	 */
	public List<AlmaTable> getTables(){
		return this.tables;
	}


	public static AlmaTableContainer getInstance() {
		return instance;
	}


	public HashMap<String, AlmaTable> getTableMap() {
		return tableMap;
	}


	public void setTableMap(HashMap<String, AlmaTable> tableMap) {
		this.tableMap = tableMap;
	}


	public List<ASDMAttribute> getAsdmAttributes() {
		return asdmAttributes;
	}


	public void setAsdmAttributes(List<ASDMAttribute> asdmAttributes) {
		this.asdmAttributes = asdmAttributes;
	}


	public String getXmlnsPrefix() {
		return xmlnsPrefix;
	}
	
	public void setXmlnsprefix(String xmlnsPrefix) {
		this.xmlnsPrefix = xmlnsPrefix;
	}


	public static void setRevision(String revision) {
		AlmaTableContainer.revision = revision;
	}


	public static void setBranch(String branch) {
		AlmaTableContainer.branch = branch;
	}


	public static String getRevision() {
		return revision;
	}


	public static String getBranch() {
		return branch;
	}


	public String getVersion() {
		return version;
	}


	public void setVersion(String version) {
		this.version = version;
	}
	
	
	
}