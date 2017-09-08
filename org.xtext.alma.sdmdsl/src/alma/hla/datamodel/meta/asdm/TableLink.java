package alma.hla.datamodel.meta.asdm;

public class TableLink extends ASDMAttribute{
	
	
	/**
     * Is this link an optional association?
     */
	private boolean optional;
	
	/**
     * Is this link a one-to-one association?
     */
    private boolean oneToOne;

    /**
     * Is this link a one-to-many association?
     */
    private boolean oneToMany;

    
    private boolean oneToZeroOrMany;

    private boolean oneToOneOrMany;
    
    
    /**
     * Is this link a hasA association
     */
    private boolean hasa;

    /**
     * Is this link a slice association ?
     * 
     */
    private boolean slice;
    
    
    /**
     * Is this link a hasmany association ?
     */
    private boolean hasmany;
	
    
    
    /**
     * Is this link a no-extrinsic association?
     */
    private boolean isNoExtrinsic;
    
    
    
    /**
     * The AlmaTable that is attached to the opposite end of this link.
     */
    private AlmaTable target;
    
    
    
    /**
     * The TableKey in the target table that is used to traverse the link to the
     * target table.
     */
    private TableKey targetKey;
    
    
    private ASDMAttribute[] attribute;
    
	
	/* -------------------- Constructor -------------------- */
	
    public TableLink() {
        oneToOne = false;
        oneToMany = false;
        oneToZeroOrMany = false;
        oneToOneOrMany = false;
        slice = false;
        hasmany = false;
        hasa = false;
        optional = false;
        isNoExtrinsic = false;
    }
	/* -------------------- Initialization -------------------- */
	public void init(){
		initializeHasA();
	}
	
	void initializeHasA(){
		
	}
	
	
	/* -------------------- Setters and Getters -------------------- */
	
	
	
	
}
