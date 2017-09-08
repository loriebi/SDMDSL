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
 * File AlmaTable.java
 */

package alma.hla.datamodel.meta.asdm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import org.xtext.alma.sdmdsl.sdmdsl.Field;
import org.xtext.alma.sdmdsl.sdmdsl.GlobalField;
import org.xtext.alma.sdmdsl.sdmdsl.Table;
import org.xtext.alma.sdmdsl.sdmdsl.impl.TableImpl;

import alma.hla.datamodel.util.ASDMAttributeComparator;
import alma.hla.datamodel.util.MMUtil;

public class AlmaTable extends TableImpl {

	/** CVSRevision number */
	private static int revision = -1;

	/** CVSBranch number */
	private static String branch = "";

	/**
	 * Defines is the table will be archived as a "binary" MIME document.
	 * (default no).
	 */
	private boolean archiveAsBin = false;

	/**
	 * Defines is the table will be exported on disk as a "binary" file (default
	 * no).
	 */
	private boolean fileAsBin = false;

	/** all attributes of the Table class */
	private List<ASDMAttribute> allTableAttributes;

	/** map of attributes of the Table */
	private HashMap<String, ASDMAttribute> allTableAttributesMap;

	/**
	 * temporal is true if there is one scalar attribute of type TimeInterval in
	 * the key section or in the required value section.
	 */
	private boolean temporal = false;

	/**
	 * The set of attributes which are not static, i.e. those attributes which
	 * define the content of each row of the table.
	 */
	private List<ASDMAttribute> rowAttributes;

	/**
	 * The set of attributes which are static, i.e. those attributes which are
	 * specific to the table and do not define the content of each row.
	 */
	private List<ASDMAttribute> tableAttributes;

	/**
	 * The list of attributes intrinsic to this table.
	 */
	private List<ASDMAttribute> intrinsic;

	/**
	 * The list of attributes needed to manage links.
	 */
	private List<ASDMAttribute> extrinsic;

	/**
	 * The key of this table.
	 */
	private TableKey key;

	/**
	 * List of attribute names, that contain refersTo
	 */
	private List<ASDMAttribute> link;

	/**
	 * The ASDM attributes
	 */
	private List<ASDMAttribute> asdmAttributes;

	/**
	 * The autoIncrementable attributes
	 */
	private List<ASDMAttribute> autoIncrementable;

	/**
	 * The key attributes
	 */
	// private List<ASDMAttribute> keyattributes;

	/**
	 * The required attributes
	 */
	private List<ASDMAttribute> requiredAttributes;

	/**
	 * The list of global (readonly) attributes
	 */
	private List<ASDMAttribute> globalAttributes;

	/**
	 * The required extrinsic attributes
	 */
	private List<ASDMAttribute> requiredExtrinsicAttributes;

	/**
	 * The required noautoincrementable attributes.
	 */
	private List<ASDMAttribute> requiredNoAutoIncrementableAttributes;

	/**
	 * The required value-part attributes
	 */
	private List<ASDMAttribute> requiredValueAttributes;

	/**
	 * The optional attributes
	 */
	private List<ASDMAttribute> optionalAttributes;

	/**
	 * The optional value-part attributes
	 */
	private List<ASDMAttribute> optionalValueAttributes;

	/**
	 * The optional extrinsic attributes
	 */
	private List<ASDMAttribute> optionalExtrinsicAttributes;

	/**
	 * The key-part attribute
	 */
	private List<ASDMAttribute> keyAttributes;

	/**
	 * The key-part noautoinc attributes
	 */
	private List<ASDMAttribute> keyNoAutoIncrementableAttributes;

	/**
	 * The key-part noautoinc notimeinterval attributes
	 */
	private List<ASDMAttribute> keyNoAutoIncNoTimeAttributes;

	/**
	 * The value-part mandatory notimeinterval attributes
	 */
	private List<ASDMAttribute> requiredValueNoTimeAttributes;

	/**
	 * The attributes whose type is an enumeration.
	 */
	private List<ASDMAttribute> enumeratorAttributes;

	/**
	 * The set of the types used in the attributes declarations
	 */
	private List<String> usedTypes;

	/**
	 * The set of the types used in the attributes declarations which are also
	 * extended types.
	 */
	private HashSet<String> usedExtendedTypes;

	/**
	 * The temporal attribute. Supposedly unique , part of the key and of type
	 * ArrayTimeInterval.
	 */
	ASDMAttribute temporalAttribute;

	/* ---------------------- Functions ---------------------- */

	/**
	 * Look for an attribute in tableattributes (i.e. static attribute) whose
	 * name is 'xmlns' and return its value , which is supposed to be the xmlns
	 * prefix for this table. If the attribute is not found or if it does not
	 * have a value, then exit.
	 * 
	 */
	public String xmlnsPrefix() {
		Iterator<ASDMAttribute> iter = globalAttributes.iterator();
		while (iter.hasNext()) {
			ASDMAttribute a = (ASDMAttribute) iter.next();
			if (a.getName().equals("xmlnsPrefix")) {
				String prefix = a.getInitValue();
				if (prefix.matches("[a-zA-Z]+"))
					return prefix;
			}
		}

		/* doesn't have xmlnsPrefix */
		return null;
	}

	/**
	 * @return the (likely only one) autoincrementable attribute (actually this
	 *         set should contain at most 1 element).
	 */
	public ASDMAttribute TheAutoIncrementableAttribute() {
		return this.autoIncrementable.get(0);
	}

	/**
	 * Return true if and only if there are no autoincrementable attributes.
	 */
	public boolean NoAutoIncrementableAttribute() {
		//// System.out.println (this.NameS() + "autoincrementable size = " +
		//// this.autoincrementable.size());
		return this.autoIncrementable.size() == 0;
	}

	/**
	 * Returns a comma separated list of Java declarations of the list of ASDM
	 * attributes passed in the ElementSet s.
	 * 
	 * @return a string containing the Java declarations.
	 */
	private String JavaDeclaration(List<ASDMAttribute> s) {
		StringBuffer tmp = new StringBuffer();
		Iterator<ASDMAttribute> iter = s.iterator();
		boolean first = true;
		while (iter.hasNext()) {
			ASDMAttribute a = (ASDMAttribute) iter.next();
			if (!first)
				tmp.append(", ");
			tmp.append(a.JavaType() + " " + a.getName());
			if (first)
				first = false;
		}
		return tmp.toString();
	}

	/**
	 * @return Returns the comma separated list all attributes that are part of
	 *         the Key NOT including the autoincrementable attribute if any and
	 *         NOT including the temporal ones.
	 */
	public String KeyNoAutoIncNoTimeAttributesList() {
		return SetList(this.keyNoAutoIncNoTimeAttributes, false, false);
	}

	/**
	 * Returns the temporal attribute i.e. the one satisfying 1) part of key 2)
	 * type ArrayTimeInterval
	 */
	public ASDMAttribute TemporalAttribute() {
		return temporalAttribute;
	}

	public boolean noIntrinsicAttribute() {
		return intrinsic.size() == 0;
	}

	public boolean noExtrinsicAttribute() {
		return extrinsic.size() == 0;
	}

	/**
	 * @return the set of required attributes (key and value).
	 */
	public List<ASDMAttribute> RequiredExtrinsicAttributesSet() {
		return requiredExtrinsicAttributes;
	}

	/**
	 * Returns the list of comma separated Java declarations of all the
	 * mandatory attributes which are not autoincrementable (complement of the
	 * key).
	 * 
	 * @return a string containing the java declarations.
	 */
	public String RequiredNoAutoIncrementableJava() {
		if (this.autoIncrementable.isEmpty())
			return this.RequiredJava();
		else
			return this.JavaDeclaration(this.requiredNoAutoIncrementableAttributes);
	}

	/**
	 * Returns the list of comma separated Java declarations of all the
	 * mandatory attributes which are part of the value (complement of the key).
	 * 
	 * @return a string containing the java declarations.
	 */
	public String RequiredValueJava() {
		return JavaDeclaration(this.requiredValueAttributes);
	}

	/**
	 * Return the list of comma separated Java declarations of all mandatory
	 * attributes.
	 * 
	 * @return a string containing the java declarations.
	 */
	public String RequiredJava() {
		return this.JavaDeclaration(this.requiredAttributes);
	}

	/**
	 * @return the set of optional extrinsic attributes.
	 */
	public List<ASDMAttribute> OptionalExtrinsicAttributesSet() {
		return optionalExtrinsicAttributes;
	}

	/**
	 * @return the set of key-part non autoincrementable and no temporal
	 *         attributes.
	 * 
	 */
	public List<ASDMAttribute> KeyNoAutoIncNoTimeAttributes() {
		return keyNoAutoIncNoTimeAttributes;
	}

	/**
	 * Returns the comma separated list of java declarations of all attributes
	 * that are part of the Key NOT including the autoincrementable attribute if
	 * any nor the temporal one.
	 * 
	 * @return a string containing the java declarations.
	 */
	public String KeyNoAutoIncNoTimeJava() {
		return JavaDeclaration(this.keyNoAutoIncNoTimeAttributes);
	}

	/**
	 * Returns the comma separated list of Cpp declarations of all the
	 * attributes which are part of the Key.
	 * 
	 * @return a string containing the Cpp declarations.
	 */
	public String KeyCpp() {
		return CppDeclaration(this.keyAttributes);
	}

	/**
	 * Return the list of comma separated Cpp declarations of all mandatory
	 * attributes.
	 * 
	 * @return a string containing the Cpp declarations.
	 */
	public String RequiredCpp() {
		return this.CppDeclaration(this.requiredAttributes);
	}

	/**
	 * Returns the comma separated list of Cpp declarations of all attributes
	 * that are part of the Key NOT including the autoincrementable attribute if
	 * any nor the temporal one.
	 * 
	 * @return a string containing the java declarations.
	 */
	public String KeyNoAutoIncNoTimeCpp() {
		return CppDeclaration(this.keyNoAutoIncNoTimeAttributes);
	}

	/**
	 * Returns the list of comma separated Cpp declarations of all the mandatory
	 * attributes which are not autoincrementable (complement of the key).
	 * 
	 * @return a string containing the java declarations.
	 */
	public String RequiredNoAutoIncrementableCpp() {
		if (this.autoIncrementable.isEmpty())
			return this.RequiredCpp();
		else
			return this.CppDeclaration(this.requiredNoAutoIncrementableAttributes);
	}

	/**
	 * Return the name of this table with a lower case first letter.
	 */
	public String LowerCase() {
		return MMUtil.LowerCaseName(this.name);

	}

	/**
	 * Returns a comma separated list of the attributes names belonging to the
	 * ElementSet s.
	 * 
	 * @return a string containing the list of names.
	 */
	private String SetList(List<ASDMAttribute> s, boolean forRelDB, boolean withQuotes) {
		StringBuffer tmp = new StringBuffer();
		Iterator<ASDMAttribute> iter = s.iterator();
		boolean first = true;
		String aName = null;
		while (iter.hasNext()) {
			ASDMAttribute a = (ASDMAttribute) iter.next();
			if (forRelDB)
				aName = a.SQLName();
			else
				aName = a.getName();
			if (!first)
				tmp.append(", ");
			if (forRelDB && a.isArrayTimeIntervalType() && !a.isArray()) {
				if (withQuotes)
					tmp.append("\\\"");
				tmp.append(aName + "_START");
				if (withQuotes)
					tmp.append("\\\"");
				tmp.append(",");
				if (withQuotes)
					tmp.append("\\\"");
				tmp.append(aName + "_DUR");
				if (withQuotes)
					tmp.append("\\\"");
			} else {
				if (withQuotes)
					tmp.append("\\\"");
				// if (forRelDB && a.isEnumeration() && !a.isArray())
				// tmp.append(a.NameS().toUpperCase()+"_ID");
				// else
				tmp.append(aName);
				if (withQuotes)
					tmp.append("\\\"");
			}
			if (first)
				first = false;
		}
		return tmp.toString();
	}

	/**
	 * @return a string containing the names of all attributes which are
	 *         mandatory and not autoincrementable.Names are separated by
	 *         commas.
	 */
	public String RequiredNoAutoIncrementableAttributesList() {
		return SetList(this.requiredNoAutoIncrementableAttributes, false, false);
	}

	/**
	 * Returns the comma separated list of java declarations of all the
	 * attributes which are part of the Key.
	 * 
	 * @return a string containing the java declarations.
	 */
	public String KeyJava() {
		return JavaDeclaration(this.keyAttributes);
	}

	public String SQLName() {
		int maxLength = 30 - 4; // for some suffixes in the ASDM_ASDM table.
		String s = "ASDM_" + this.name;
		// Because Oracle does not want table names longer than 30.
		// In other words ASDM table names must differentiate from each
		// other before the 30th character.
		return s.substring(0, Math.min(maxLength, s.length())).toUpperCase();
	}

	/**
	 * @return Returns the comma separated list all attributes that are part of
	 *         the Key, including the autoincrementable attribute if any and
	 *         with ArrayTimeInterval variables splitted in two parts.
	 */
	public String KeyAttributesList4RelDB() {
		return SetList(this.keyAttributes, true, false);
	}

	/**
	 * @return a string containing the names of all attributes which are
	 *         mandatory part of the Value. Names are separated by commas and
	 *         with ArrayTimeInterval variables splitted in two parts.
	 */
	public String RequiredValueAttributesList4RelDB() {
		return SetList(this.requiredValueAttributes, true, false);
	}

	/**
	 * @return a string containing the names of all attributes which are
	 *         optional part of the Value. Names are separated by commas and
	 *         ArrayTimeInterval variables splitted in two parts
	 */
	public String OptionalValueAttributesList4RelDB() {
		return SetList(this.optionalValueAttributes, true, false);
	}

	public String KeyAttributesQuestionMarks4RelDB() {
		return questionMarks4RelDB(this.keyAttributes);
	}

	public String RequiredValueAttributesQuestionMarks4RelDB() {
		return questionMarks4RelDB(this.requiredValueAttributes);
	}

	public String OptionalValueAttributesQuestionMarks4RelDB() {
		return questionMarks4RelDB(this.optionalValueAttributes);
	}

	private String questionMarks4RelDB(List<ASDMAttribute> list) {
		StringBuffer sb = new StringBuffer();
		Iterator<ASDMAttribute> iter = list.iterator();
		boolean first = true;
		while (iter.hasNext()) {
			ASDMAttribute a = (ASDMAttribute) iter.next();
			if (!first)
				sb.append(", ");
			if (!a.isArray() && a.isArrayTimeIntervalType()) {
				sb.append("to_timestamp(?, 'YYYY MM DD HH24 MI SS FF9')");
				sb.append(",?");
			} else if (!a.isArray() && a.isArrayTimeType()) {
				sb.append("to_timestamp(?, 'YYYY MM DD HH24 MI SS FF9')");
			} else {
				sb.append("?");
			}
			if (first)
				first = false;
		}
		return sb.toString();
	}

	/*
	 * @return true (resp.) if at least one (resp. none) of the attributes is of
	 * type long.
	 */
	public boolean hasLongAttribute() {
		for (ASDMAttribute attr : allTableAttributes) {
			if (attr.getTypeName().equals("Long"))
				return true;
		}

		return false;
	}

	/**
	 * returns sorted key attributes set of tables
	 */
	public List<ASDMAttribute> sortedKeyAttributes() {
		List<ASDMAttribute> sortedList = new ArrayList<ASDMAttribute>();

		for (ASDMAttribute attr : this.keyAttributes) {
			sortedList.add(attr);
		}

		Collections.sort(sortedList, new CustomComparator());

		return sortedList;
	}

	/**
	 * returns sorted required value attributes set of tables
	 */
	public List<ASDMAttribute> sortedRequiredValueAttributes() {
		List<ASDMAttribute> sortedList = new ArrayList<ASDMAttribute>();

		for (ASDMAttribute attr : this.requiredValueAttributes) {
			sortedList.add(attr);
		}

		Collections.sort(sortedList, new CustomComparator());

		return sortedList;
	}

	/**
	 * returns sorted optional value attributes set of tables
	 */
	public List<ASDMAttribute> sortedOptionalValueAttributes() {
		List<ASDMAttribute> sortedList = new ArrayList<ASDMAttribute>();

		for (ASDMAttribute attr : this.optionalValueAttributes) {
			sortedList.add(attr);
		}

		Collections.sort(sortedList, new CustomComparator());

		return sortedList;
	}

	/* ---------------------- Constructors ---------------------- */

	public AlmaTable() {

		super();

		this.allTableAttributes = new ArrayList<ASDMAttribute>();

		this.intrinsic = new ArrayList<ASDMAttribute>();
		this.extrinsic = new ArrayList<ASDMAttribute>();
		this.autoIncrementable = new ArrayList<ASDMAttribute>();
		this.key = new TableKey();
		this.link = new ArrayList<ASDMAttribute>();
		this.globalAttributes = new ArrayList<ASDMAttribute>();
	}

	public AlmaTable(Table table) {

		super();

		this.allTableAttributes = new ArrayList<ASDMAttribute>();
		this.allTableAttributesMap = new HashMap<String, ASDMAttribute>();

		this.intrinsic = new ArrayList<ASDMAttribute>();
		this.extrinsic = new ArrayList<ASDMAttribute>();
		this.autoIncrementable = new ArrayList<ASDMAttribute>();
		this.key = new TableKey();
		this.link = new ArrayList<ASDMAttribute>();
		this.globalAttributes = new ArrayList<ASDMAttribute>();

		this.name = table.getName();

		// documentation
		if (table.getDoc() != null) {
			StringBuilder sb = new StringBuilder(table.getDoc());
			sb.deleteCharAt(0);
			sb.deleteCharAt(0);
			sb.deleteCharAt(sb.length() - 1);
			sb.deleteCharAt(sb.length() - 1);
			this.doc = sb.toString();
		} else {
			this.doc = "";
		}

		/* filling general information about all attributes of the Table */
		for (Field field : table.getKeyData()) {
			ASDMAttribute attr = new ASDMAttribute(field);
			attr.setKey(true);
			attr.setTableName(this.name);
			this.allTableAttributes.add(attr);
			this.allTableAttributesMap.put(attr.getName(), attr);
		}
		for (Field field : table.getReqData()) {
			ASDMAttribute attr = new ASDMAttribute(field);
			attr.setRequired(true);
			attr.setTableName(this.name);
			this.allTableAttributes.add(attr);
			this.allTableAttributesMap.put(attr.getName(), attr);
		}
		for (Field field : table.getOptData()) {
			ASDMAttribute attr = new ASDMAttribute(field);
			attr.setOptional(true);
			attr.setTableName(this.name);
			this.allTableAttributes.add(attr);
			this.allTableAttributesMap.put(attr.getName(), attr);
		}
		for (GlobalField gField : table.getGlobalData()) {
			ASDMAttribute attr = new ASDMAttribute(gField);
			attr.setGlobal(true);
			attr.setTableName(this.name);
			this.globalAttributes.add(attr);
			this.allTableAttributesMap.put(attr.getName(), attr);
		}

	}

	/* ---------------------- Initialization ---------------------- */
	public void init() {

		initIntrinsic();

		initKey();

		initLink();

		initAutoIncrementable();

		initAttributeSets();

		initShapesAndFormat();

	}

	/**
	 * Initialization step 1: - go through all the attributes that belong to
	 * this table and store those that are intrinisic to this table in its set
	 * of ASDMAttributes.
	 */
	public void initIntrinsic() {
		for (ASDMAttribute attr : allTableAttributes) {
			if (attr.getRefersTo() == null) {
				intrinsic.add(attr);
			}
		}
	}

	/**
	 * Initialization step 2: Go through the ASDMAttributes that belong to this
	 * table and store the keys in the key set. Those keys are initialized in
	 * the process, which may cause some link attributes to be created.
	 */
	public void initKey() {

		List<ASDMAttribute> attributes = new ArrayList<ASDMAttribute>();

		for (ASDMAttribute attr : allTableAttributes) {
			if (attr.isKey()) {
				attributes.add(attr);
			}
		}

		/* initialization of table key */
		key.init(attributes);

	}

	/**
	 * Initialization step 3: Analyze all the AssociationEnds that are connected
	 * to this table and create and store the TableLinks. These are the links to
	 * other tables that belong to this table. This process also completes the
	 * set of LinkAttributes that belong to this table.
	 */
	public void initLink() {
		for (ASDMAttribute attr : allTableAttributes) {
			if (attr.getRefersTo() != null) {
				link.add(attr);
			}
		}

	}

	/**
	 * Initialization step 4: Go through the ASDMAttributes that belong to this
	 * table and store the autoIncrementable ones in the autoIncrementable set.
	 */
	public void initAutoIncrementable() {
		for (ASDMAttribute attr : allTableAttributes) {
			if (attr.isAutoIncrementable()) {
				this.autoIncrementable.add(attr);
			}
		}
	}

	/**
	 * Initialization step 5: go through the ASDMAttributes that belong to this
	 * table: - to populate rowAttributes and tableAttributes. - to populate
	 * asdmAttributes, requiredValueAttributes, keyAttributes and
	 * keyNoAutoincrementableAttributes, requredExtrinsicAttributes and
	 * optionalExtrinsicAttributes element sets.
	 */
	public void initAttributeSets() {

		tableAttributes = new ArrayList<ASDMAttribute>();
		rowAttributes = new ArrayList<ASDMAttribute>();
		keyAttributes = new ArrayList<ASDMAttribute>();

		asdmAttributes = new ArrayList<ASDMAttribute>();

		optionalValueAttributes = new ArrayList<ASDMAttribute>();

		requiredValueAttributes = new ArrayList<ASDMAttribute>();
		requiredAttributes = new ArrayList<ASDMAttribute>();
		requiredNoAutoIncrementableAttributes = new ArrayList<ASDMAttribute>();
		requiredValueNoTimeAttributes = new ArrayList<ASDMAttribute>();

		optionalExtrinsicAttributes = new ArrayList<ASDMAttribute>();
		requiredExtrinsicAttributes = new ArrayList<ASDMAttribute>();

		keyNoAutoIncrementableAttributes = new ArrayList<ASDMAttribute>();
		keyNoAutoIncNoTimeAttributes = new ArrayList<ASDMAttribute>();

		enumeratorAttributes = new ArrayList<ASDMAttribute>();

		/* tableAttributes and rowAttributes sets */
		for (ASDMAttribute attr : allTableAttributes) {
			if (attr.isStatic()) {
				tableAttributes.add(attr);
			} else {
				rowAttributes.add(attr);
			}
		}

		/* asdmAttributes */
		asdmAttributes = rowAttributes;

		/* extrinsic */
		for (ASDMAttribute attr : allTableAttributes) {
			if (attr.isExtrinsic()) {
				extrinsic.add(attr);
			}
		}
		// We sort alphabetically the set of extrinsic attributes
		extrinsic = (ASDMAttributeComparator.sort(extrinsic));

		// The key attributes.
		// Start with the autoincrementable operator if any.
		/**
		 * A new strategy to populate keyattributes based on the order specified
		 * in the "key" attribute
		 */
		keyAttributes = key.getFieldSet();

		/* keyNoAutoIncrementableAttributes */
		for (Object attr : keyAttributes) {
			if (!((ASDMAttribute) attr).isAutoIncrementable())
				keyNoAutoIncrementableAttributes.add((ASDMAttribute) attr);
		}

		/* The requiredValueAttributes */
		for (Object o : asdmAttributes) {
			ASDMAttribute attr = (ASDMAttribute) o;
			if (attr.isRequired() && (extrinsic.contains(o) || intrinsic.contains(o)))
				requiredValueAttributes.add((ASDMAttribute) o);
		}

		/* The optionalValueAttributes */
		for (Object o : asdmAttributes)
			if (((ASDMAttribute) o).isOptional())
				optionalValueAttributes.add((ASDMAttribute) o);

		/* The required attributes */
		for (Object o : keyAttributes)
			requiredAttributes.add((ASDMAttribute) o);

		for (Object o : requiredValueAttributes)
			requiredAttributes.add((ASDMAttribute) o);

		/* The requiredNoAutoIncrementableAttributes. */
		if (this.autoIncrementable.isEmpty())
			requiredNoAutoIncrementableAttributes = requiredAttributes;
		else {
			for (Object o : requiredAttributes)
				if (!((ASDMAttribute) o).isAutoIncrementable())
					requiredNoAutoIncrementableAttributes.add((ASDMAttribute) o);
		}

		/*
		 * Fills requiredExtrinsicAttributes and optionalExtrinsicAttributes
		 * sets.
		 */
		for (ASDMAttribute o : extrinsic) {
			if (o.isOptional())
				optionalExtrinsicAttributes.add(o);
			else
				requiredExtrinsicAttributes.add(o);
		}

		/*
		 * The element set of key-part no autoincrementable and not temporal
		 * attributes.
		 */

		temporalAttribute = null;

		for (Object o : keyAttributes) {
			ASDMAttribute attr = (ASDMAttribute) o;
			if (!(attr.isAutoIncrementable()))
				if (!attr.isTemporal())
					keyNoAutoIncNoTimeAttributes.add((ASDMAttribute) o);
				else {
					if (temporalAttribute == null) {
						temporal = true;
						temporalAttribute = attr;
					} else
						System.err.println("There can't be more than one attribute of type " + attr.JavaType());
				}
		}

		/* The element set of value-part required and no temporal attributes. */
		for (Object o : requiredValueAttributes) {
			ASDMAttribute aa = (ASDMAttribute) o;
			if (!(aa.isTemporal()))
				requiredValueNoTimeAttributes.add((ASDMAttribute) o);
		}

		// The element set of attributes whose type is an enumeration.
		for (ASDMAttribute attr : asdmAttributes) {
			ASDMAttribute a = (ASDMAttribute) attr;
			if (a.getEnumeration() != null)
				enumeratorAttributes.add(a);
		}

		usedTypes = new ArrayList<String>();
		usedExtendedTypes = new HashSet<String>();
		for (ASDMAttribute attr : allTableAttributes) {
			usedTypes.add(attr.getTypeName());
			if (attr.isExtendedType()) {
				usedExtendedTypes.add(attr.getTypeName());
			}
		}

	}

	public void initShapesAndFormat() {
		/*
		 * TODO : processing shapes and checking export format
		 */
	}

	/**
	 * Returns the comma separated list of java declarations of all attributes
	 * that are part of the Key NOT including the autoincrementable attribute if
	 * any.
	 * 
	 * @return a string containing the java declarations.
	 */
	public String KeyNoAutoIncJava() {
		if (this.autoIncrementable.size() == 0)
			return KeyJava();
		return JavaDeclaration(this.keyNoAutoIncrementableAttributes);
	}

	/**
	 * Returns the comma separated list of Cpp declarations of all attributes
	 * that are part of the Key NOT including the autoincrementable attribute if
	 * any.
	 * 
	 * @return a string containing the cpp declarations.
	 */
	public String KeyNoAutoIncCpp() {
		if (this.autoIncrementable.size() == 0)
			return KeyCpp();
		return CppDeclaration(this.keyNoAutoIncrementableAttributes);
	}

	/**
	 * Return true if and only if there are links.
	 */
	public boolean noLink() {
		return link.size() == 0;
	}

	/**
	 * Return the name of this table in lower cases.
	 */
	public String ToLowerCase() {
		String s = this.name;
		return s.toLowerCase();
	}

	/**
	 *
	 * Build a list of C parameters for definition of sdm_add()xxxxRow() : Take
	 * all the required attributes, except autoIncrementable example : (int *
	 * stationId, double * pressure,...)
	 */
	public String RequiredAddCList() {
		Iterator<ASDMAttribute> iter = null;
		String s = "";
		boolean first = true;

		if (!requiredNoAutoIncrementableAttributes.isEmpty()) {
			iter = requiredNoAutoIncrementableAttributes.iterator();
			while (iter.hasNext()) {
				ASDMAttribute a = (ASDMAttribute) iter.next();
				// if (!a.isAutoIncrementable() && !a.isOptional()) {
				if (first)
					first = false;
				else
					s = s + ", ";
				if (!a.isArray() && !a.isStringType() && !a.CppType().equals("EntityRef")) {
					s = s + a.CType() + " * " + a.getName();
				} else { // array or string
					s = s + a.CType() + " * " + a.getName() + ", int * " + a.getName() + "Dim";
				}
				// }
			}
		}
		return s;
	}

	/**
	 *
	 * Build a list of parameters for getRowByKey example :
	 * (Tag(*station),ArrayTimeInterval(*timeInterval, *(timeInterval+1)))
	 *
	 */
	public String KeyCppFromCList() {
		Iterator<ASDMAttribute> iter = null;
		String s = " ";
		if (!keyAttributes.isEmpty()) {
			iter = keyAttributes.iterator();
			while (iter.hasNext()) {
				ASDMAttribute a = (ASDMAttribute) iter.next();
				String t = a.CppType();
				if (t.equals("Tag")) {
					// String tagType = a.NameS().substring(0,
					// a.NameS().indexOf("Id"));
					// tagType = tagType.substring(0, 1).toUpperCase() +
					// tagType.substring(1);
					s = s + "Tag(*" + a.getName() + ", " + a.CppTagType() + ")";
				} else if (t.equals("Angle") || t.equals("AngularRate") || t.equals("Flux") || t.equals("Frequency")
						|| t.equals("Humidity") || t.equals("Interval") || t.equals("Length") || t.equals("Pressure")
						|| t.equals("Speed") ||
						// t.equals("Tag") ||
						t.equals("Temperature"))
					s = s + a.CppType() + "(*" + a.getName() + ")";
				else if (t.equals("ArrayTime"))
					s = s + a.CppType() + "(*" + a.getName() + ")";
				else if (t.equals("ArrayTimeInterval"))
					s = s + a.CppType() + "(*" + a.getName() + ", *(" + a.getName() + "+1))";
				else if (t.equals("EntityRef"))
					s = s + a.CppType() + "(string(" + a.getName() + "))";
				else if (t.equals("string"))
					s = s + a.CppType() + "(" + a.getName() + ")";
				else
					s = s + "*" + a.getName();
				if (iter.hasNext())
					s = s + ", ";
			}
		}
		return s;
	}

	/**
	 *
	 * Build a list of parameters for getRowByKey Same than previous routine,
	 * except that ArrayTimeInterval() contains only a start time (interval<0)
	 * example : (Tag(*station),ArrayTimeInterval(*timeInterval,
	 * *(timeInterval+1)))
	 *
	 */
	public String KeyCppFromCListWithoutInterval() {
		Iterator<ASDMAttribute> iter = null;
		String s = " ";
		if (!keyAttributes.isEmpty()) {
			iter = keyAttributes.iterator();
			while (iter.hasNext()) {
				ASDMAttribute a = (ASDMAttribute) iter.next();
				String t = a.CppType();
				if (t.equals("Tag")) {
					// String tagType = a.NameS().substring(0,
					// a.NameS().indexOf("Id"));
					// tagType = tagType.substring(0, 1).toUpperCase() +
					// tagType.substring(1);
					s = s + "Tag(*" + a.getName() + ", " + a.CppTagType() + ")";
				} else if (t.equals("Angle") || t.equals("AngularRate") || t.equals("Flux") || t.equals("Frequency")
						|| t.equals("Humidity") || t.equals("Interval") || t.equals("Length") || t.equals("Pressure")
						|| t.equals("Speed") ||
						// t.equals("Tag") ||
						t.equals("Temperature"))
					s = s + a.CppType() + "(*" + a.getName() + ")";
				else if (t.equals("ArrayTime"))
					s = s + a.CppType() + "(*" + a.getName() + ")";
				else if (t.equals("ArrayTimeInterval"))
					s = s + a.CppType() + "(*" + a.getName() + ")";
				else if (t.equals("EntityRef"))
					s = s + a.CppType() + "(string(" + a.getName() + "))";
				else if (t.equals("string"))
					s = s + a.CppType() + "(" + a.getName() + ")";
				else
					s = s + "*" + a.getName();
				if (iter.hasNext())
					s = s + ", ";
			}
		}
		return s;
	}

	/**
	 *
	 * Build a list of parameters for newRow() example : ( Tag(*station),
	 * ArrayTimeInterval(*timeInterval, *(timeInterval+1)),
	 * Pressure(*pressure),...)
	 *
	 */
	public String RequiredValueCppFromCList() {
		Iterator<ASDMAttribute> iter = null;
		String s = "";
		if (!requiredNoAutoIncrementableAttributes.isEmpty()) {
			iter = requiredNoAutoIncrementableAttributes.iterator();
			while (iter.hasNext()) {
				ASDMAttribute a = (ASDMAttribute) iter.next();
				String t = a.CppType();
				if (t.equals("Tag")) {
					s = s + a.CppType() + "(*" + a.getName() + "," + a.CppTagType() + ")";
				} else if (t.equals("Angle") || t.equals("AngularRate") || t.equals("Flux") || t.equals("Frequency")
						|| t.equals("Humidity") || t.equals("Interval") || t.equals("Length") || t.equals("Pressure")
						|| t.equals("Speed") ||
						// t.equals("Tag") ||
						t.equals("Temperature"))
					s = s + a.CppType() + "(*" + a.getName() + ")";
				else if (t.equals("ArrayTime"))
					s = s + a.CppType() + "(*" + a.getName() + ")";
				else if (t.equals("ArrayTimeInterval"))
					s = s + a.CppType() + "(*" + a.getName() + ", *(" + a.getName() + "+1))";
				else if (t.equals("EntityRef"))
					s = s + a.CppType() + "(string(" + a.getName() + "))";
				else if (t.equals("string"))
					s = s + a.CppType() + "(" + a.getName() + ")";
				else if (a.isArray())
					s = s + a.getName() + "Vec";
				else
					s = s + "*" + a.getName();
				if (iter.hasNext())
					s = s + ", ";
			}
		}
		return s;
	}

	/**
	 *
	 * Build a list of C parameters for definition of sdm_getxxxxRow() Take all
	 * the required attributes (including autoIncrementable) example : (int *
	 * stationId, double * pressure,...)
	 */
	public String RequiredGetCList() {
		Iterator<ASDMAttribute> iter = null;
		String s = "";
		boolean first = true;

		if (!requiredAttributes.isEmpty()) {
			iter = requiredAttributes.iterator();
			while (iter.hasNext()) {
				ASDMAttribute a = (ASDMAttribute) iter.next();
				if (first)
					first = false;
				else
					s = s + ", ";
				if (!a.isArray() && !a.isStringType() && !a.CppType().equals("EntityRef")) {
					s = s + a.CType() + " * " + a.getName();
				} else { // array or string
					s = s + a.CType() + " * " + a.getName() + ", int * " + a.getName() + "Dim";

				}
			}
		}
		return s;
	}

	/**
	 *
	 * Build a list of C type parameters for definition of sdm_add_tttt_xxxx,
	 * where tttt is the table name and xxxx the name of an optional parameter
	 * Take all the key attributes example : (int * stationId, double *
	 * pressure,...)
	 */
	public String KeyCTypeList() {
		Iterator<ASDMAttribute> iter = null;
		String s = "";
		boolean first = true;

		if (!keyAttributes.isEmpty()) {
			iter = keyAttributes.iterator();
			while (iter.hasNext()) {
				ASDMAttribute a = (ASDMAttribute) iter.next();
				if (first)
					first = false;
				else
					s = s + ", ";
				if (!a.isArray() && !a.isStringType() && !a.CppType().equals("EntityRef")) {
					s = s + a.CType() + " * " + a.getName();
				} else { // array
					s = s + a.CType() + " * " + a.getName() + ", int * " + a.getName() + "Dim";
				}
			}
		}
		return s;
	}

	/**
	 *
	 * Build a list of parameters for newRow() Same than previous routine,
	 * except that ArrayTimeInterval() contains only a start time (interval<0)
	 * example : ( Tag(*station), ArrayTimeInterval(*timeInterval),
	 * Pressure(*pressure),...)
	 *
	 */
	public String RequiredValueCppFromCListWithoutInterval() {
		Iterator<ASDMAttribute> iter = null;
		String s = "";
		if (!requiredNoAutoIncrementableAttributes.isEmpty()) {
			iter = requiredNoAutoIncrementableAttributes.iterator();
			while (iter.hasNext()) {
				ASDMAttribute a = (ASDMAttribute) iter.next();
				String t = a.CppType();
				if (t.equals("Tag")) {
					s = s + a.CppType() + "(*" + a.getName() + "," + a.CppTagType() + ")";
				} else if (t.equals("Angle") || t.equals("AngularRate") || t.equals("Flux") || t.equals("Frequency")
						|| t.equals("Humidity") || t.equals("Interval") || t.equals("Length") || t.equals("Pressure")
						|| t.equals("Speed") ||
						// t.equals("Tag") ||
						t.equals("Temperature"))
					s = s + a.CppType() + "(*" + a.getName() + ")";
				else if (t.equals("ArrayTime"))
					s = s + a.CppType() + "(*" + a.getName() + ")";
				else if (t.equals("ArrayTimeInterval"))
					s = s + a.CppType() + "(*" + a.getName() + ")";
				else if (t.equals("EntityRef"))
					s = s + a.CppType() + "(string(" + a.getName() + "))";
				else if (t.equals("string"))
					s = s + a.CppType() + "(" + a.getName() + ")";
				else if (a.isArray())
					s = s + a.getName() + "Vec";
				else
					s = s + "*" + a.getName();
				if (iter.hasNext())
					s = s + ", ";
			}
		}
		return s;
	}

	public boolean isArrayTimeIntervalKey() {
		Iterator<ASDMAttribute> iter = null;
		boolean found = false;
		if (!keyAttributes.isEmpty()) {
			iter = keyAttributes.iterator();
			while (iter.hasNext()) {
				ASDMAttribute a = (ASDMAttribute) iter.next();
				if (a.CppType().equals("ArrayTimeInterval")) {
					found = true;
				}
			}
		}

		return found;

	}

	/**
	 *
	 * Build a list of Fortran parameters for use of sdm_add()xxxxRow() : Take
	 * all the required attributes, except autoIncrementable example : (int *
	 * stationId, double * pressure,...)
	 */
	public String RequiredAddFList() {
		Iterator<ASDMAttribute> iter = null;
		String s = "";
		boolean first = true;

		if (!requiredNoAutoIncrementableAttributes.isEmpty()) {
			iter = requiredNoAutoIncrementableAttributes.iterator();
			while (iter.hasNext()) {
				ASDMAttribute a = (ASDMAttribute) iter.next();
				if (first)
					first = false;
				else
					s = s + ", ";
				if (!a.isKey())
					s = s + "row%";
				else
					s = s + "key%";
				if (!a.isArray() && !a.isStringType() && !a.CppType().equals("EntityRef")) {
					s = s + a.getName();
				} else { // array or string
					s = s + a.getName() + ", " + a.getName() + "Dim";
				}
			}
		}
		return s;
	}

	/**
	 *
	 * Build a list of Fortran parameters for definition of sdm_getxxxxRow()
	 * Take all the required attributes (including autoIncrementable) example :
	 * (int * stationId, double * pressure,...)
	 */
	public String RequiredGetFList() {
		Iterator<ASDMAttribute> iter = null;
		String s = "";
		boolean first = true;

		if (!requiredAttributes.isEmpty()) {
			iter = requiredAttributes.iterator();
			while (iter.hasNext()) {
				ASDMAttribute a = (ASDMAttribute) iter.next();
				if (first)
					first = false;
				else
					s = s + ", ";
				if (a.isKey())
					s = s + "key%";
				else
					s = s + "row%";
				if (!a.isArray() && !a.isStringType() && !a.CppType().equals("EntityRef")) {
					s = s + a.getName();
				} else { // array or string
					s = s + a.getName() + ", " + a.getName() + "Dim";

				}
			}
		}
		return s;
	}

	private String FShape2(ASDMAttribute a) {
		String s = "";
		String[] shape = a.getShape_();
		// System.out.println(Arrays.toString(shape));
		if (shape != null) {
			String requiredattributesNames = requiredAttributes.toString();
			String optionalattributesNames = optionalValueAttributes.toString();

			for (int i = shape.length; i > 0; i--) {
				if (i < shape.length)
					s = s + ", ";
				if (!shape[i - 1].trim().equals("")) {
					String part = shape[i - 1];
					StringTokenizer st = new StringTokenizer(shape[i - 1], " /*+-");
					while (st.hasMoreTokens()) {
						String nt = st.nextToken();
						if (requiredattributesNames.contains(nt)) {
							part = part.replace(nt, "row%" + nt);
						}

						if (optionalattributesNames.contains(nt)) {
							part = part.replace(nt, "opt%" + nt);
						}
					}
					s = s + part;
				}
			}
		}
		// System.out.println("FShape2 produced '" + s + "'");
		return s;
	}

	public String RowAllocateFList() {
		Iterator<ASDMAttribute> iter = null;
		String s = "";
		boolean first = true;
		if (!requiredAttributes.isEmpty()) {
			iter = requiredAttributes.iterator();
			while (iter.hasNext()) {
				ASDMAttribute a = (ASDMAttribute) iter.next();
				if (a.isArray()) {
					if (first)
						first = false;
					else
						s = s + ", ";
					s = s + " row%" + a.getName() + "(" + FShape2(a) + ")";
				}
			}
		}
		return s;
	}

	/**
	 * Check for optional arrays
	 */
	public boolean hasOptionalArrays() {
		Iterator<ASDMAttribute> iter = null;
		if (!optionalValueAttributes.isEmpty()) {
			iter = optionalValueAttributes.iterator();
			while (iter.hasNext()) {
				ASDMAttribute a = (ASDMAttribute) iter.next();
				if (a.isArray()) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Check for required arrays
	 */
	public boolean hasRequiredArrays() {
		Iterator<ASDMAttribute> iter = null;
		if (!requiredAttributes.isEmpty()) {
			iter = requiredAttributes.iterator();
			while (iter.hasNext()) {
				ASDMAttribute a = (ASDMAttribute) iter.next();
				if (a.isArray()) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 *
	 * Build a list of Fortran type parameters for use of getTableKeys. Take all
	 * the key attributes example : (stationIdList, pressureList,...)
	 */
	public String KeyFTypeList() {
		Iterator<ASDMAttribute> iter = null;
		String s = "";
		boolean first = true;

		if (!keyAttributes.isEmpty()) {
			iter = keyAttributes.iterator();
			while (iter.hasNext()) {
				ASDMAttribute a = (ASDMAttribute) iter.next();
				if (first)
					first = false;
				else
					s = s + ", ";
				if (!a.isArray() && !a.isStringType() && !a.CppType().equals("EntityRef")) {
					s = s + a.getName() + "List";
				} else { // array
					s = s + a.getName() + "List" + ", " + a.getName() + "ListDim";
				}
			}
		}
		return s;
	}

	/**
	 *
	 * Build a list of Fortran parameters for use of sdmAddTableParameter where
	 * Parameter is the name of an optional parameter; Take all the key
	 * attributes
	 */
	public String KeyFType() {
		Iterator<ASDMAttribute> iter = null;
		String s = "";
		boolean first = true;

		if (!keyAttributes.isEmpty()) {
			iter = keyAttributes.iterator();
			while (iter.hasNext()) {
				ASDMAttribute a = (ASDMAttribute) iter.next();
				if (first)
					first = false;
				else
					s = s + ", ";
				if (!a.isArray() && !a.isStringType() && !a.CppType().equals("EntityRef")) {
					s = s + "key%" + a.getName();
				} else { // array
					s = s + "key%" + a.getName() + ", " + a.getName() + "Dim";
				}
			}
		}
		return s;
	}

	public String OptAllocateFList() {
		Iterator<ASDMAttribute> iter = null;
		String s = "";
		boolean first = true;
		if (!optionalValueAttributes.isEmpty()) {
			iter = optionalValueAttributes.iterator();
			while (iter.hasNext()) {
				ASDMAttribute a = (ASDMAttribute) iter.next();
				if (a.isArray()) {
					if (first)
						first = false;
					else
						s = s + ", ";
					s = s + " opt%" + a.getName() + "(" + FShape2(a) + ")";
				}
			}
		}
		return s;
	}

	/* ---------------------- Setters and Getters ---------------------- */

	public List<ASDMAttribute> getRowAttributes() {
		return rowAttributes;
	}

	public void setRowAttributes(List<ASDMAttribute> rowAttributes) {
		this.rowAttributes = rowAttributes;
	}

	public List<ASDMAttribute> getTableAttributes() {
		return tableAttributes;
	}

	public void setTableAttributes(List<ASDMAttribute> tableAttributes) {
		this.tableAttributes = tableAttributes;
	}

	public List<ASDMAttribute> getIntrinsic() {
		return intrinsic;
	}

	public void setIntrinsic(List<ASDMAttribute> intrinsic) {
		this.intrinsic = intrinsic;
	}

	public List<ASDMAttribute> getExtrinsic() {
		return extrinsic;
	}

	public void setExtrinsic(List<ASDMAttribute> extrinsic) {
		this.extrinsic = extrinsic;
	}

	public TableKey getKey() {
		return key;
	}

	public void setKey(TableKey key) {
		this.key = key;
	}

	public List<ASDMAttribute> getLink() {
		return link;
	}

	public void setLink(List<ASDMAttribute> link) {
		this.link = link;
	}

	public List<ASDMAttribute> getAsdmAttributes() {
		return asdmAttributes;
	}

	public void setAsdmAttributes(List<ASDMAttribute> asdmAttributes) {
		this.asdmAttributes = asdmAttributes;
	}

	public List<ASDMAttribute> getAutoIncrementable() {
		return autoIncrementable;
	}

	public void setAutoIncrementable(List<ASDMAttribute> autoIncrementable) {
		this.autoIncrementable = autoIncrementable;
	}

	public List<ASDMAttribute> getRequiredAttributes() {
		return requiredAttributes;
	}

	public void setRequiredAttributes(List<ASDMAttribute> requiredAttributes) {
		this.requiredAttributes = requiredAttributes;
	}

	public List<ASDMAttribute> getRequiredExtrinsicAttributes() {
		return requiredExtrinsicAttributes;
	}

	public void setRequiredExtrinsicAttributes(List<ASDMAttribute> requiredExtrinsicAttributes) {
		this.requiredExtrinsicAttributes = requiredExtrinsicAttributes;
	}

	public List<ASDMAttribute> getRequiredNoAutoIncrementableAttributes() {
		return requiredNoAutoIncrementableAttributes;
	}

	public void setRequiredNoAutoIncrementableAttributes(List<ASDMAttribute> requiredNoAutoIncrementableAttributes) {
		this.requiredNoAutoIncrementableAttributes = requiredNoAutoIncrementableAttributes;
	}

	public List<ASDMAttribute> getRequiredValueAttributes() {
		return requiredValueAttributes;
	}

	public void setRequiredValueAttributes(List<ASDMAttribute> requiredValueAttributes) {
		this.requiredValueAttributes = requiredValueAttributes;
	}

	public List<ASDMAttribute> getOptionalAttributes() {
		return optionalAttributes;
	}

	public void setOptionalAttributes(List<ASDMAttribute> optionalAttributes) {
		this.optionalAttributes = optionalAttributes;
	}

	public List<ASDMAttribute> getOptionalValueAttributes() {
		return optionalValueAttributes;
	}

	public void setOptionalValueAttributes(List<ASDMAttribute> optionalValueAttributes) {
		this.optionalValueAttributes = optionalValueAttributes;
	}

	public List<ASDMAttribute> getOptionalExtrinsicAttributes() {
		return optionalExtrinsicAttributes;
	}

	public void setOptionalExtrinsicAttributes(List<ASDMAttribute> optionalExtrinsicAttributes) {
		this.optionalExtrinsicAttributes = optionalExtrinsicAttributes;
	}

	public List<ASDMAttribute> getKeyAttributes() {
		return keyAttributes;
	}

	public void setKeyAttributes(List<ASDMAttribute> keyAttributes) {
		this.keyAttributes = keyAttributes;
	}

	public List<ASDMAttribute> getKeyNoAutoIncrementableAttributes() {
		return keyNoAutoIncrementableAttributes;
	}

	public void setKeyNoAutoIncrementableAttributes(List<ASDMAttribute> keyNoAutoIncrementableAttributes) {
		this.keyNoAutoIncrementableAttributes = keyNoAutoIncrementableAttributes;
	}

	public List<ASDMAttribute> getKeyNoAutoIncNoTimeAttributes() {
		return keyNoAutoIncNoTimeAttributes;
	}

	public void setKeyNoAutoIncNoTimeAttributes(List<ASDMAttribute> keyNoAutoIncNoTimeAttributes) {
		this.keyNoAutoIncNoTimeAttributes = keyNoAutoIncNoTimeAttributes;
	}

	public List<ASDMAttribute> getRequiredValueNoTimeAttributes() {
		return requiredValueNoTimeAttributes;
	}

	public void setRequiredValueNoTimeAttributes(List<ASDMAttribute> requiredValueNoTimeAttributes) {
		this.requiredValueNoTimeAttributes = requiredValueNoTimeAttributes;
	}

	public List<ASDMAttribute> getEnumeratorAttributes() {
		return enumeratorAttributes;
	}

	public void setEnumeratorAttributes(List<ASDMAttribute> enumeratorAttributes) {
		this.enumeratorAttributes = enumeratorAttributes;
	}

	public List<String> getUsedTypes() {
		return usedTypes;
	}

	public void setUsedTypes(List<String> usedTypes) {
		this.usedTypes = usedTypes;
	}

	public HashSet<String> getUsedExtendedTypes() {
		return usedExtendedTypes;
	}

	public void setUsedExtendedTypes(HashSet<String> usedExtendedTypes) {
		this.usedExtendedTypes = usedExtendedTypes;
	}

	public ASDMAttribute getTemporalAttribute() {
		return temporalAttribute;
	}

	public void setTemporalAttribute(ASDMAttribute temporalAttribute) {
		this.temporalAttribute = temporalAttribute;
	}

	public boolean isArchiveAsBin() {
		return archiveAsBin;
	}

	public void setArchiveAsBin(String archiveAsBin) {
		this.archiveAsBin = Boolean.valueOf(archiveAsBin);
	}

	public List<ASDMAttribute> getAllTableAttributes() {
		return allTableAttributes;
	}

	public void setAllTableAttributes(List<ASDMAttribute> allTableAttributes) {
		this.allTableAttributes = allTableAttributes;
	}

	/**
	 * Returns a comma separated list of C++ declarations of the list of ASDM
	 * attributes passed in the ElementSet s.
	 * 
	 * @return a string containing the Java declarations.
	 */
	private String CppDeclaration(List<ASDMAttribute> s) {
		StringBuffer tmp = new StringBuffer();
		Iterator<ASDMAttribute> iter = s.iterator();
		boolean first = true;
		while (iter.hasNext()) {
			ASDMAttribute a = (ASDMAttribute) iter.next();
			if (!first)
				tmp.append(", ");
			tmp.append(a.CppType() + " " + a.getName());
			if (first)
				first = false;
		}
		return tmp.toString();
	}

	/**
	 * Returns the list of comma separated Cpp declarations of all the mandatory
	 * attributes which are part of the value (complement of the key).
	 * 
	 * @return a string containing the Cpp declarations.
	 */
	public String RequiredValueCpp() {
		return CppDeclaration(this.requiredValueAttributes);
	}

	public boolean isTemporal() {
		return temporal;
	}

	public void setTemporal(boolean temporal) {
		this.temporal = temporal;
	}

	public boolean isFileAsBin() {
		return fileAsBin;
	}

	public void setFileAsBin(String fileAsBin) {
		this.fileAsBin = Boolean.valueOf(fileAsBin);
	}

	public HashMap<String, ASDMAttribute> getAllTableAttributesMap() {
		return allTableAttributesMap;
	}

	public void setAllTableAttributesMap(HashMap<String, ASDMAttribute> allTableAttributesMap) {
		this.allTableAttributesMap = allTableAttributesMap;
	}

	public List<ASDMAttribute> getGlobalAttributes() {
		return globalAttributes;
	}

	public void setGlobalAttributes(List<ASDMAttribute> globalAttributes) {
		this.globalAttributes = globalAttributes;
	}

	public static int getRevision() {
		return revision;
	}

	public static void setRevision(int revision) {
		AlmaTable.revision = revision;
	}

	public static String getBranch() {
		return branch;
	}

	public static void setBranch(String branch) {
		AlmaTable.branch = branch;
	}

	public void setArchiveAsBin(boolean archiveAsBin) {
		this.archiveAsBin = archiveAsBin;
	}

	public void setFileAsBin(boolean fileAsBin) {
		this.fileAsBin = fileAsBin;
	}

	private class CustomComparator implements Comparator<ASDMAttribute> {
		@Override
		public int compare(ASDMAttribute o1, ASDMAttribute o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}

}
