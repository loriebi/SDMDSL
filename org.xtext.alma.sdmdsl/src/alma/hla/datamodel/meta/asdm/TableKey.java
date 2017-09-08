package alma.hla.datamodel.meta.asdm;

import java.util.ArrayList;
import java.util.List;

import org.xtext.alma.sdmdsl.sdmdsl.Field;

import alma.hla.datamodel.util.MMUtil;

public class TableKey extends ASDMAttribute{
	
	
	/**
	 * This is the sequence of attributes in this table that make up the key.
	 * These attributes may either be intrinsic or extrinsic attributes.  
	 * There is a 1-to-1 mapping between the field and base arrays.
	 */
	private ASDMAttribute[] field;
	
	/**
	 * This is the sequence of attributes that form the basis for the key.  These
	 * attributes may be in other tables.  These references may also be null, which 
	 * indicates there is no basis; i.e. they refer to attributes already in this table.
	 */
	private ASDMAttribute[] base;
	
	
	
	

	
	/* -------------------- Constructor -------------------- */
	
	public TableKey() {
		key = true;
	}
	
	public TableKey(Field field) {
		super(field);

		key = true;
	}

	/* -------------------- Initialization -------------------- */
	public void init(List<ASDMAttribute> keyAttributes){
		super.name = "key";
		
		int size = keyAttributes.size();
		
		field = new ASDMAttribute[size];
		base = new ASDMAttribute[size];
		
		String keyName = null;
		String tableName = null;
		String baseAttribute = null; 
		
		for(int i=0;i<size;i++){
			keyName = keyAttributes.get(0).getName();
			
			if(keyAttributes.get(0).getRefersTo() != null){
				tableName = keyAttributes.get(0).getRefersTo();
			}
			
			

			setReference(i,keyName,tableName,baseAttribute,keyAttributes);
			
		}
		
		
	}
	
	
	/* -------------------- Functions -------------------- */
	
	public void setReference(int index,String keyName,String tableName,String baseAttribute,List<ASDMAttribute> keyAttributes){
		
		// 1. If baseTable and baseAttribute are both null, then it must refer to an 
		// attribute in this table.
		if (tableName == null && baseAttribute == null) {
			field[index] = keyAttributes.get(index);
			return;
		}
		
		
		// 2. Otherwise, the base table name might be this one.
		AlmaTable table = null;
		if(tableName.equals(super.tableName)){
			
		}
		field[index] = keyAttributes.get(index);
	}
	
	public List<ASDMAttribute> getFieldSet() {
		List<ASDMAttribute> res = new ArrayList<ASDMAttribute>();
		for(int i=0; i<field.length;i++){
			res.add(field[i]);
		}
		return res;
	}
	
	public String FieldNames1 () {
		String result = "";
		for (int i = 0; i < field.length; ++i) {
			if (i == field.length - 1)
				result += "\"" + field[i].getName() + "\"";
			else
				result += "\"" + field[i].getName() + "\", ";
		}
		return result;
	}
	
	
	/**
	 * List of field names: x.getName() + "|" + x.getSequence() + "|" + x.getVersion()
	 */
	public String FieldNames4 () {
		String result = "";
		for (int i = 0; i < field.length; ++i) {
			if (i == field.length - 1)
				result += "x.get" + MMUtil.UpperCaseName(field[i].getName()) + "()";
			else
				result += "x.get" + MMUtil.UpperCaseName(field[i].getName()) + "() + \"|\" + ";
		}
		return result;
	}

	
	/* -------------------- Setters and Getters -------------------- */
	
	
	public ASDMAttribute[] getField() {
		return field;
	}
	
	public void setField(ASDMAttribute[] field) {
		this.field = field;
	}

	public ASDMAttribute[] getBase() {
		return base;
	}

	public void setBase(ASDMAttribute[] base) {
		this.base = base;
	}


	
}
