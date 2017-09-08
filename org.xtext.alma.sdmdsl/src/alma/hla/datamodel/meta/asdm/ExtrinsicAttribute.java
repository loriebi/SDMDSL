package alma.hla.datamodel.meta.asdm;

import org.xtext.alma.sdmdsl.sdmdsl.Field;

import alma.hla.datamodel.util.MMUtil;

public class ExtrinsicAttribute extends ASDMAttribute{
	
	

	public ExtrinsicAttribute(Field field) {
		super(field);
	}
	
	
	
	public String JavaType() {
		String ret = super.JavaType();
		if (array)
			ret += "[]";
        else 
            if (this.isSet())
                ret = TypeSet();
		return ret;
	}
	
	public String XMLJavaType() {
        return this.JavaType();
    }
	
	public String JavaBaseType() {
		String ret = super.JavaType();
		return ret;
	}
	
    public String TypeSet() {
        return MMUtil.UpperCaseName(super.JavaType())+"Set";        
    }
    
	public String CppType() {
		String ret = super.CppType();
		if (array)
		    ret="vector<" + ret + "> ";
        else 
            if (this.set) ret = "set<"+ret+" >";
		return ret;
	}
	
	public String SwigType() {
		return CppType();
	}
    
    public String XMLCppType() {
        return this.CppType().replaceAll("<", "&lt;").replaceAll(">", "&gt;");
    }
	
	public String CppBaseType() {
		String ret = super.CppType();
		return ret;
	}
	
	public String IDLType() {
		String ret = super.IDLType();
		if (this.array) {
			String[] w = ret.split("::");
			String ns = new String("");
			String bn = new String("");
			if (w.length == 2){
				ns = w[0]+"::";
				bn = w[1];
			}
			else {
				ns = "asdmIDLTypes::";
				bn = w[0];
			}
			return ns+"Sof"+bn;
		}
		return ret;
	}
	
	public String IDLBaseType() {
		String ret = super.IDLType();
		return ret;
	}
	
	public String SimpleUpperCaseName() {
		return MMUtil.UpperCaseName(SimpleName());
	}
	
	public String SimpleJavaType() {
		return MMUtil.JavaType(typeName);
	}

	public String SimpleName() {
		return MMUtil.simpleName(typeName);
	}
	
	private String target = "";
	
	/*
	 * Set the name of the Table this extrinsic attribute refers to.
	 */
	public void targetTable(String target) {
		this.target = target;
	}
	
	/*
	 * Get the name of the Table this extrinsic attribute refers to.
	 */
	public String targetTable() {
		return target;
	}
	
	boolean is_id = false;
	
	/*
	 * Set is_id to  true if this extrinsic attribute corresponds to a slice or slices association, otherwise
	 * is_id is left to false..
	 */
	public void isId(boolean is_id) {
		this.is_id = is_id;
	}
	
	/*
	 * Returns true if this extrinsic attribute corresponds to a slice or slices association and false otherwise.
	 */
	public boolean isId() {
		return this.is_id;
	}
	
	boolean is_tag = false;
	/*
	 * Set is_tag to  true if this extrinsic attribute corresponds to a hasa or hasmany association, otherwise
	 * is_tag is left to false..
	 */
	public void isTag(boolean is_tag) {
		this.is_tag = is_tag;
	}
	
	/*
	 * Returns true if this extrinsic attribute corresponds to a slice or slices association and false otherwise.
	 */
	public boolean isTag() {
		return this.is_tag;
	}


	public String getTarget() {
		return target;
	}


	public void setTarget(String target) {
		this.target = target;
	}


	public boolean isIs_id() {
		return is_id;
	}


	public void setIs_id(boolean is_id) {
		this.is_id = is_id;
	}


	public boolean isIs_tag() {
		return is_tag;
	}


	public void setIs_tag(boolean is_tag) {
		this.is_tag = is_tag;
	}
	
	
	
}
