package alma.hla.datamodel.meta.asdm;

public class AutoIncrementableAttribute extends ASDMAttribute{
	/**
	 * Create an AutoIncrementableAttribute
	 */
	public AutoIncrementableAttribute() {
		//System.out.println("Detected an autoincrementable attribute ");
		this.autoIncrementable = true;
	}
}
