package org.xtext.alma.sdmdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.alma.sdmdsl.services.SdmdslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSdmdslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_ID", "RULE_STRING", "RULE_WS", "RULE_INT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'package'", "'.'", "'Char'", "'Short'", "'Integer'", "'Long'", "'Float'", "'Double'", "'Complex'", "'String'", "'Boolean'", "'Angle'", "'AngularRate'", "'Flux'", "'Frequency'", "'Humidity'", "'Length'", "'Pressure'", "'Speed'", "'Temperature'", "'Tag'", "'Entity'", "'EntityId'", "'EntityRef'", "'Interval'", "'ArrayTime'", "'ArrayTimeInterval'", "'table'", "'{'", "'Key'", "':'", "'Required Data'", "'Optional Data'", "'Global Data'", "'}'", "'scalar'", "'autoIncrementable'", "'refersToASlice'", "'refersToOne'", "'refersToMany'", "'refersToManySlices'", "'|'", "'readOnly'", "'['", "']'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=4;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=7;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSdmdslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSdmdslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSdmdslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSdmdsl.g"; }



     	private SdmdslGrammarAccess grammarAccess;

        public InternalSdmdslParser(TokenStream input, SdmdslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SdmdslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSdmdsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSdmdsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalSdmdsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSdmdsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_element_3_0= ruleTable ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_element_3_0 = null;



        	enterRule();

        try {
            // InternalSdmdsl.g:77:2: ( ( ( (lv_doc_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_element_3_0= ruleTable ) ) ) )
            // InternalSdmdsl.g:78:2: ( ( (lv_doc_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_element_3_0= ruleTable ) ) )
            {
            // InternalSdmdsl.g:78:2: ( ( (lv_doc_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_element_3_0= ruleTable ) ) )
            // InternalSdmdsl.g:79:3: ( (lv_doc_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_element_3_0= ruleTable ) )
            {
            // InternalSdmdsl.g:79:3: ( (lv_doc_0_0= RULE_ML_COMMENT ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ML_COMMENT) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSdmdsl.g:80:4: (lv_doc_0_0= RULE_ML_COMMENT )
                    {
                    // InternalSdmdsl.g:80:4: (lv_doc_0_0= RULE_ML_COMMENT )
                    // InternalSdmdsl.g:81:5: lv_doc_0_0= RULE_ML_COMMENT
                    {
                    lv_doc_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_3); 

                    					newLeafNode(lv_doc_0_0, grammarAccess.getModelAccess().getDocML_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"doc",
                    						lv_doc_0_0,
                    						"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getPackageKeyword_1());
            		
            // InternalSdmdsl.g:101:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalSdmdsl.g:102:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalSdmdsl.g:102:4: (lv_name_2_0= ruleQualifiedName )
            // InternalSdmdsl.g:103:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.alma.sdmdsl.Sdmdsl.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSdmdsl.g:120:3: ( (lv_element_3_0= ruleTable ) )
            // InternalSdmdsl.g:121:4: (lv_element_3_0= ruleTable )
            {
            // InternalSdmdsl.g:121:4: (lv_element_3_0= ruleTable )
            // InternalSdmdsl.g:122:5: lv_element_3_0= ruleTable
            {

            					newCompositeNode(grammarAccess.getModelAccess().getElementTableParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_element_3_0=ruleTable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_3_0,
            						"org.xtext.alma.sdmdsl.Sdmdsl.Table");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSdmdsl.g:143:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSdmdsl.g:143:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSdmdsl.g:144:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSdmdsl.g:150:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSdmdsl.g:156:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSdmdsl.g:157:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSdmdsl.g:157:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSdmdsl.g:158:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalSdmdsl.g:165:3: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSdmdsl.g:166:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,12,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRulePrimitiveTypes"
    // InternalSdmdsl.g:183:1: entryRulePrimitiveTypes returns [String current=null] : iv_rulePrimitiveTypes= rulePrimitiveTypes EOF ;
    public final String entryRulePrimitiveTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypes = null;


        try {
            // InternalSdmdsl.g:183:54: (iv_rulePrimitiveTypes= rulePrimitiveTypes EOF )
            // InternalSdmdsl.g:184:2: iv_rulePrimitiveTypes= rulePrimitiveTypes EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveTypes=rulePrimitiveTypes();

            state._fsp--;

             current =iv_rulePrimitiveTypes.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveTypes"


    // $ANTLR start "rulePrimitiveTypes"
    // InternalSdmdsl.g:190:1: rulePrimitiveTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BasicType_0= ruleBasicType | this_PhysicalType_1= rulePhysicalType | this_TechnicalType_2= ruleTechnicalType | this_TimeType_3= ruleTimeType ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_BasicType_0 = null;

        AntlrDatatypeRuleToken this_PhysicalType_1 = null;

        AntlrDatatypeRuleToken this_TechnicalType_2 = null;

        AntlrDatatypeRuleToken this_TimeType_3 = null;



        	enterRule();

        try {
            // InternalSdmdsl.g:196:2: ( (this_BasicType_0= ruleBasicType | this_PhysicalType_1= rulePhysicalType | this_TechnicalType_2= ruleTechnicalType | this_TimeType_3= ruleTimeType ) )
            // InternalSdmdsl.g:197:2: (this_BasicType_0= ruleBasicType | this_PhysicalType_1= rulePhysicalType | this_TechnicalType_2= ruleTechnicalType | this_TimeType_3= ruleTimeType )
            {
            // InternalSdmdsl.g:197:2: (this_BasicType_0= ruleBasicType | this_PhysicalType_1= rulePhysicalType | this_TechnicalType_2= ruleTechnicalType | this_TimeType_3= ruleTimeType )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                {
                alt3=1;
                }
                break;
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                {
                alt3=2;
                }
                break;
            case 31:
            case 32:
            case 33:
            case 34:
                {
                alt3=3;
                }
                break;
            case 35:
            case 36:
            case 37:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSdmdsl.g:198:3: this_BasicType_0= ruleBasicType
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveTypesAccess().getBasicTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BasicType_0=ruleBasicType();

                    state._fsp--;


                    			current.merge(this_BasicType_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSdmdsl.g:209:3: this_PhysicalType_1= rulePhysicalType
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveTypesAccess().getPhysicalTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PhysicalType_1=rulePhysicalType();

                    state._fsp--;


                    			current.merge(this_PhysicalType_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSdmdsl.g:220:3: this_TechnicalType_2= ruleTechnicalType
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveTypesAccess().getTechnicalTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TechnicalType_2=ruleTechnicalType();

                    state._fsp--;


                    			current.merge(this_TechnicalType_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSdmdsl.g:231:3: this_TimeType_3= ruleTimeType
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveTypesAccess().getTimeTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimeType_3=ruleTimeType();

                    state._fsp--;


                    			current.merge(this_TimeType_3);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveTypes"


    // $ANTLR start "entryRuleBasicType"
    // InternalSdmdsl.g:245:1: entryRuleBasicType returns [String current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final String entryRuleBasicType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasicType = null;


        try {
            // InternalSdmdsl.g:245:49: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalSdmdsl.g:246:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalSdmdsl.g:252:1: ruleBasicType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Char' | kw= 'Short' | kw= 'Integer' | kw= 'Long' | kw= 'Float' | kw= 'Double' | kw= 'Complex' | kw= 'String' | kw= 'Boolean' ) ;
    public final AntlrDatatypeRuleToken ruleBasicType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSdmdsl.g:258:2: ( (kw= 'Char' | kw= 'Short' | kw= 'Integer' | kw= 'Long' | kw= 'Float' | kw= 'Double' | kw= 'Complex' | kw= 'String' | kw= 'Boolean' ) )
            // InternalSdmdsl.g:259:2: (kw= 'Char' | kw= 'Short' | kw= 'Integer' | kw= 'Long' | kw= 'Float' | kw= 'Double' | kw= 'Complex' | kw= 'String' | kw= 'Boolean' )
            {
            // InternalSdmdsl.g:259:2: (kw= 'Char' | kw= 'Short' | kw= 'Integer' | kw= 'Long' | kw= 'Float' | kw= 'Double' | kw= 'Complex' | kw= 'String' | kw= 'Boolean' )
            int alt4=9;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            case 17:
                {
                alt4=5;
                }
                break;
            case 18:
                {
                alt4=6;
                }
                break;
            case 19:
                {
                alt4=7;
                }
                break;
            case 20:
                {
                alt4=8;
                }
                break;
            case 21:
                {
                alt4=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSdmdsl.g:260:3: kw= 'Char'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getCharKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSdmdsl.g:266:3: kw= 'Short'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getShortKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSdmdsl.g:272:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getIntegerKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSdmdsl.g:278:3: kw= 'Long'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getLongKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSdmdsl.g:284:3: kw= 'Float'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getFloatKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSdmdsl.g:290:3: kw= 'Double'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getDoubleKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalSdmdsl.g:296:3: kw= 'Complex'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getComplexKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalSdmdsl.g:302:3: kw= 'String'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getStringKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalSdmdsl.g:308:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getBooleanKeyword_8());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRulePhysicalType"
    // InternalSdmdsl.g:317:1: entryRulePhysicalType returns [String current=null] : iv_rulePhysicalType= rulePhysicalType EOF ;
    public final String entryRulePhysicalType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePhysicalType = null;


        try {
            // InternalSdmdsl.g:317:52: (iv_rulePhysicalType= rulePhysicalType EOF )
            // InternalSdmdsl.g:318:2: iv_rulePhysicalType= rulePhysicalType EOF
            {
             newCompositeNode(grammarAccess.getPhysicalTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhysicalType=rulePhysicalType();

            state._fsp--;

             current =iv_rulePhysicalType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhysicalType"


    // $ANTLR start "rulePhysicalType"
    // InternalSdmdsl.g:324:1: rulePhysicalType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Angle' | kw= 'AngularRate' | kw= 'Flux' | kw= 'Frequency' | kw= 'Humidity' | kw= 'Length' | kw= 'Pressure' | kw= 'Speed' | kw= 'Temperature' ) ;
    public final AntlrDatatypeRuleToken rulePhysicalType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSdmdsl.g:330:2: ( (kw= 'Angle' | kw= 'AngularRate' | kw= 'Flux' | kw= 'Frequency' | kw= 'Humidity' | kw= 'Length' | kw= 'Pressure' | kw= 'Speed' | kw= 'Temperature' ) )
            // InternalSdmdsl.g:331:2: (kw= 'Angle' | kw= 'AngularRate' | kw= 'Flux' | kw= 'Frequency' | kw= 'Humidity' | kw= 'Length' | kw= 'Pressure' | kw= 'Speed' | kw= 'Temperature' )
            {
            // InternalSdmdsl.g:331:2: (kw= 'Angle' | kw= 'AngularRate' | kw= 'Flux' | kw= 'Frequency' | kw= 'Humidity' | kw= 'Length' | kw= 'Pressure' | kw= 'Speed' | kw= 'Temperature' )
            int alt5=9;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            case 25:
                {
                alt5=4;
                }
                break;
            case 26:
                {
                alt5=5;
                }
                break;
            case 27:
                {
                alt5=6;
                }
                break;
            case 28:
                {
                alt5=7;
                }
                break;
            case 29:
                {
                alt5=8;
                }
                break;
            case 30:
                {
                alt5=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSdmdsl.g:332:3: kw= 'Angle'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPhysicalTypeAccess().getAngleKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSdmdsl.g:338:3: kw= 'AngularRate'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPhysicalTypeAccess().getAngularRateKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSdmdsl.g:344:3: kw= 'Flux'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPhysicalTypeAccess().getFluxKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSdmdsl.g:350:3: kw= 'Frequency'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPhysicalTypeAccess().getFrequencyKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSdmdsl.g:356:3: kw= 'Humidity'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPhysicalTypeAccess().getHumidityKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSdmdsl.g:362:3: kw= 'Length'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPhysicalTypeAccess().getLengthKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalSdmdsl.g:368:3: kw= 'Pressure'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPhysicalTypeAccess().getPressureKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalSdmdsl.g:374:3: kw= 'Speed'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPhysicalTypeAccess().getSpeedKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalSdmdsl.g:380:3: kw= 'Temperature'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPhysicalTypeAccess().getTemperatureKeyword_8());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhysicalType"


    // $ANTLR start "entryRuleTechnicalType"
    // InternalSdmdsl.g:389:1: entryRuleTechnicalType returns [String current=null] : iv_ruleTechnicalType= ruleTechnicalType EOF ;
    public final String entryRuleTechnicalType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTechnicalType = null;


        try {
            // InternalSdmdsl.g:389:53: (iv_ruleTechnicalType= ruleTechnicalType EOF )
            // InternalSdmdsl.g:390:2: iv_ruleTechnicalType= ruleTechnicalType EOF
            {
             newCompositeNode(grammarAccess.getTechnicalTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTechnicalType=ruleTechnicalType();

            state._fsp--;

             current =iv_ruleTechnicalType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTechnicalType"


    // $ANTLR start "ruleTechnicalType"
    // InternalSdmdsl.g:396:1: ruleTechnicalType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Tag' | kw= 'Entity' | kw= 'EntityId' | kw= 'EntityRef' ) ;
    public final AntlrDatatypeRuleToken ruleTechnicalType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSdmdsl.g:402:2: ( (kw= 'Tag' | kw= 'Entity' | kw= 'EntityId' | kw= 'EntityRef' ) )
            // InternalSdmdsl.g:403:2: (kw= 'Tag' | kw= 'Entity' | kw= 'EntityId' | kw= 'EntityRef' )
            {
            // InternalSdmdsl.g:403:2: (kw= 'Tag' | kw= 'Entity' | kw= 'EntityId' | kw= 'EntityRef' )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt6=1;
                }
                break;
            case 32:
                {
                alt6=2;
                }
                break;
            case 33:
                {
                alt6=3;
                }
                break;
            case 34:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSdmdsl.g:404:3: kw= 'Tag'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTechnicalTypeAccess().getTagKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSdmdsl.g:410:3: kw= 'Entity'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTechnicalTypeAccess().getEntityKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSdmdsl.g:416:3: kw= 'EntityId'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTechnicalTypeAccess().getEntityIdKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSdmdsl.g:422:3: kw= 'EntityRef'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTechnicalTypeAccess().getEntityRefKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTechnicalType"


    // $ANTLR start "entryRuleTimeType"
    // InternalSdmdsl.g:431:1: entryRuleTimeType returns [String current=null] : iv_ruleTimeType= ruleTimeType EOF ;
    public final String entryRuleTimeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimeType = null;


        try {
            // InternalSdmdsl.g:431:48: (iv_ruleTimeType= ruleTimeType EOF )
            // InternalSdmdsl.g:432:2: iv_ruleTimeType= ruleTimeType EOF
            {
             newCompositeNode(grammarAccess.getTimeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeType=ruleTimeType();

            state._fsp--;

             current =iv_ruleTimeType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeType"


    // $ANTLR start "ruleTimeType"
    // InternalSdmdsl.g:438:1: ruleTimeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Interval' | kw= 'ArrayTime' | kw= 'ArrayTimeInterval' ) ;
    public final AntlrDatatypeRuleToken ruleTimeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSdmdsl.g:444:2: ( (kw= 'Interval' | kw= 'ArrayTime' | kw= 'ArrayTimeInterval' ) )
            // InternalSdmdsl.g:445:2: (kw= 'Interval' | kw= 'ArrayTime' | kw= 'ArrayTimeInterval' )
            {
            // InternalSdmdsl.g:445:2: (kw= 'Interval' | kw= 'ArrayTime' | kw= 'ArrayTimeInterval' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt7=1;
                }
                break;
            case 36:
                {
                alt7=2;
                }
                break;
            case 37:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSdmdsl.g:446:3: kw= 'Interval'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTimeTypeAccess().getIntervalKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSdmdsl.g:452:3: kw= 'ArrayTime'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTimeTypeAccess().getArrayTimeKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSdmdsl.g:458:3: kw= 'ArrayTimeInterval'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTimeTypeAccess().getArrayTimeIntervalKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeType"


    // $ANTLR start "entryRuleTable"
    // InternalSdmdsl.g:467:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalSdmdsl.g:467:46: (iv_ruleTable= ruleTable EOF )
            // InternalSdmdsl.g:468:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalSdmdsl.g:474:1: ruleTable returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'table' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_keyLevel_4_0= 'Key' ) ) otherlv_5= ':' ( (lv_keyData_6_0= ruleField ) )* ) ( ( (lv_reqLevel_7_0= 'Required Data' ) )? otherlv_8= ':' ( (lv_reqData_9_0= ruleField ) )* )? ( ( (lv_optLevel_10_0= 'Optional Data' ) )? otherlv_11= ':' ( (lv_optData_12_0= ruleField ) )* )? ( ( (lv_globalLevel_13_0= 'Global Data' ) )? otherlv_14= ':' ( (lv_globalData_15_0= ruleGlobalField ) )* )? otherlv_16= '}' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_keyLevel_4_0=null;
        Token otherlv_5=null;
        Token lv_reqLevel_7_0=null;
        Token otherlv_8=null;
        Token lv_optLevel_10_0=null;
        Token otherlv_11=null;
        Token lv_globalLevel_13_0=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_keyData_6_0 = null;

        EObject lv_reqData_9_0 = null;

        EObject lv_optData_12_0 = null;

        EObject lv_globalData_15_0 = null;



        	enterRule();

        try {
            // InternalSdmdsl.g:480:2: ( ( ( (lv_doc_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'table' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_keyLevel_4_0= 'Key' ) ) otherlv_5= ':' ( (lv_keyData_6_0= ruleField ) )* ) ( ( (lv_reqLevel_7_0= 'Required Data' ) )? otherlv_8= ':' ( (lv_reqData_9_0= ruleField ) )* )? ( ( (lv_optLevel_10_0= 'Optional Data' ) )? otherlv_11= ':' ( (lv_optData_12_0= ruleField ) )* )? ( ( (lv_globalLevel_13_0= 'Global Data' ) )? otherlv_14= ':' ( (lv_globalData_15_0= ruleGlobalField ) )* )? otherlv_16= '}' ) )
            // InternalSdmdsl.g:481:2: ( ( (lv_doc_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'table' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_keyLevel_4_0= 'Key' ) ) otherlv_5= ':' ( (lv_keyData_6_0= ruleField ) )* ) ( ( (lv_reqLevel_7_0= 'Required Data' ) )? otherlv_8= ':' ( (lv_reqData_9_0= ruleField ) )* )? ( ( (lv_optLevel_10_0= 'Optional Data' ) )? otherlv_11= ':' ( (lv_optData_12_0= ruleField ) )* )? ( ( (lv_globalLevel_13_0= 'Global Data' ) )? otherlv_14= ':' ( (lv_globalData_15_0= ruleGlobalField ) )* )? otherlv_16= '}' )
            {
            // InternalSdmdsl.g:481:2: ( ( (lv_doc_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'table' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_keyLevel_4_0= 'Key' ) ) otherlv_5= ':' ( (lv_keyData_6_0= ruleField ) )* ) ( ( (lv_reqLevel_7_0= 'Required Data' ) )? otherlv_8= ':' ( (lv_reqData_9_0= ruleField ) )* )? ( ( (lv_optLevel_10_0= 'Optional Data' ) )? otherlv_11= ':' ( (lv_optData_12_0= ruleField ) )* )? ( ( (lv_globalLevel_13_0= 'Global Data' ) )? otherlv_14= ':' ( (lv_globalData_15_0= ruleGlobalField ) )* )? otherlv_16= '}' )
            // InternalSdmdsl.g:482:3: ( (lv_doc_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'table' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_keyLevel_4_0= 'Key' ) ) otherlv_5= ':' ( (lv_keyData_6_0= ruleField ) )* ) ( ( (lv_reqLevel_7_0= 'Required Data' ) )? otherlv_8= ':' ( (lv_reqData_9_0= ruleField ) )* )? ( ( (lv_optLevel_10_0= 'Optional Data' ) )? otherlv_11= ':' ( (lv_optData_12_0= ruleField ) )* )? ( ( (lv_globalLevel_13_0= 'Global Data' ) )? otherlv_14= ':' ( (lv_globalData_15_0= ruleGlobalField ) )* )? otherlv_16= '}'
            {
            // InternalSdmdsl.g:482:3: ( (lv_doc_0_0= RULE_ML_COMMENT ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ML_COMMENT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSdmdsl.g:483:4: (lv_doc_0_0= RULE_ML_COMMENT )
                    {
                    // InternalSdmdsl.g:483:4: (lv_doc_0_0= RULE_ML_COMMENT )
                    // InternalSdmdsl.g:484:5: lv_doc_0_0= RULE_ML_COMMENT
                    {
                    lv_doc_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_7); 

                    					newLeafNode(lv_doc_0_0, grammarAccess.getTableAccess().getDocML_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTableRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"doc",
                    						lv_doc_0_0,
                    						"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTableAccess().getTableKeyword_1());
            		
            // InternalSdmdsl.g:504:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSdmdsl.g:505:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSdmdsl.g:505:4: (lv_name_2_0= RULE_ID )
            // InternalSdmdsl.g:506:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSdmdsl.g:526:3: ( ( (lv_keyLevel_4_0= 'Key' ) ) otherlv_5= ':' ( (lv_keyData_6_0= ruleField ) )* )
            // InternalSdmdsl.g:527:4: ( (lv_keyLevel_4_0= 'Key' ) ) otherlv_5= ':' ( (lv_keyData_6_0= ruleField ) )*
            {
            // InternalSdmdsl.g:527:4: ( (lv_keyLevel_4_0= 'Key' ) )
            // InternalSdmdsl.g:528:5: (lv_keyLevel_4_0= 'Key' )
            {
            // InternalSdmdsl.g:528:5: (lv_keyLevel_4_0= 'Key' )
            // InternalSdmdsl.g:529:6: lv_keyLevel_4_0= 'Key'
            {
            lv_keyLevel_4_0=(Token)match(input,40,FOLLOW_10); 

            						newLeafNode(lv_keyLevel_4_0, grammarAccess.getTableAccess().getKeyLevelKeyKeyword_4_0_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getTableRule());
            						}
            						setWithLastConsumed(current, "keyLevel", true, "Key");
            					

            }


            }

            otherlv_5=(Token)match(input,41,FOLLOW_11); 

            				newLeafNode(otherlv_5, grammarAccess.getTableAccess().getColonKeyword_4_1());
            			
            // InternalSdmdsl.g:545:4: ( (lv_keyData_6_0= ruleField ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=13 && LA9_0<=37)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSdmdsl.g:546:5: (lv_keyData_6_0= ruleField )
            	    {
            	    // InternalSdmdsl.g:546:5: (lv_keyData_6_0= ruleField )
            	    // InternalSdmdsl.g:547:6: lv_keyData_6_0= ruleField
            	    {

            	    						newCompositeNode(grammarAccess.getTableAccess().getKeyDataFieldParserRuleCall_4_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_keyData_6_0=ruleField();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTableRule());
            	    						}
            	    						add(
            	    							current,
            	    							"keyData",
            	    							lv_keyData_6_0,
            	    							"org.xtext.alma.sdmdsl.Sdmdsl.Field");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            // InternalSdmdsl.g:565:3: ( ( (lv_reqLevel_7_0= 'Required Data' ) )? otherlv_8= ':' ( (lv_reqData_9_0= ruleField ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==42) ) {
                alt12=1;
            }
            else if ( (LA12_0==41) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSdmdsl.g:566:4: ( (lv_reqLevel_7_0= 'Required Data' ) )? otherlv_8= ':' ( (lv_reqData_9_0= ruleField ) )*
                    {
                    // InternalSdmdsl.g:566:4: ( (lv_reqLevel_7_0= 'Required Data' ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==42) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalSdmdsl.g:567:5: (lv_reqLevel_7_0= 'Required Data' )
                            {
                            // InternalSdmdsl.g:567:5: (lv_reqLevel_7_0= 'Required Data' )
                            // InternalSdmdsl.g:568:6: lv_reqLevel_7_0= 'Required Data'
                            {
                            lv_reqLevel_7_0=(Token)match(input,42,FOLLOW_10); 

                            						newLeafNode(lv_reqLevel_7_0, grammarAccess.getTableAccess().getReqLevelRequiredDataKeyword_5_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTableRule());
                            						}
                            						setWithLastConsumed(current, "reqLevel", true, "Required Data");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,41,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getTableAccess().getColonKeyword_5_1());
                    			
                    // InternalSdmdsl.g:584:4: ( (lv_reqData_9_0= ruleField ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID||(LA11_0>=13 && LA11_0<=37)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSdmdsl.g:585:5: (lv_reqData_9_0= ruleField )
                    	    {
                    	    // InternalSdmdsl.g:585:5: (lv_reqData_9_0= ruleField )
                    	    // InternalSdmdsl.g:586:6: lv_reqData_9_0= ruleField
                    	    {

                    	    						newCompositeNode(grammarAccess.getTableAccess().getReqDataFieldParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_reqData_9_0=ruleField();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTableRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"reqData",
                    	    							lv_reqData_9_0,
                    	    							"org.xtext.alma.sdmdsl.Sdmdsl.Field");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSdmdsl.g:604:3: ( ( (lv_optLevel_10_0= 'Optional Data' ) )? otherlv_11= ':' ( (lv_optData_12_0= ruleField ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==43) ) {
                alt15=1;
            }
            else if ( (LA15_0==41) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSdmdsl.g:605:4: ( (lv_optLevel_10_0= 'Optional Data' ) )? otherlv_11= ':' ( (lv_optData_12_0= ruleField ) )*
                    {
                    // InternalSdmdsl.g:605:4: ( (lv_optLevel_10_0= 'Optional Data' ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==43) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalSdmdsl.g:606:5: (lv_optLevel_10_0= 'Optional Data' )
                            {
                            // InternalSdmdsl.g:606:5: (lv_optLevel_10_0= 'Optional Data' )
                            // InternalSdmdsl.g:607:6: lv_optLevel_10_0= 'Optional Data'
                            {
                            lv_optLevel_10_0=(Token)match(input,43,FOLLOW_10); 

                            						newLeafNode(lv_optLevel_10_0, grammarAccess.getTableAccess().getOptLevelOptionalDataKeyword_6_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTableRule());
                            						}
                            						setWithLastConsumed(current, "optLevel", true, "Optional Data");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,41,FOLLOW_13); 

                    				newLeafNode(otherlv_11, grammarAccess.getTableAccess().getColonKeyword_6_1());
                    			
                    // InternalSdmdsl.g:623:4: ( (lv_optData_12_0= ruleField ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID||(LA14_0>=13 && LA14_0<=37)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalSdmdsl.g:624:5: (lv_optData_12_0= ruleField )
                    	    {
                    	    // InternalSdmdsl.g:624:5: (lv_optData_12_0= ruleField )
                    	    // InternalSdmdsl.g:625:6: lv_optData_12_0= ruleField
                    	    {

                    	    						newCompositeNode(grammarAccess.getTableAccess().getOptDataFieldParserRuleCall_6_2_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_optData_12_0=ruleField();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTableRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"optData",
                    	    							lv_optData_12_0,
                    	    							"org.xtext.alma.sdmdsl.Sdmdsl.Field");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSdmdsl.g:643:3: ( ( (lv_globalLevel_13_0= 'Global Data' ) )? otherlv_14= ':' ( (lv_globalData_15_0= ruleGlobalField ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==41||LA18_0==44) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSdmdsl.g:644:4: ( (lv_globalLevel_13_0= 'Global Data' ) )? otherlv_14= ':' ( (lv_globalData_15_0= ruleGlobalField ) )*
                    {
                    // InternalSdmdsl.g:644:4: ( (lv_globalLevel_13_0= 'Global Data' ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==44) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalSdmdsl.g:645:5: (lv_globalLevel_13_0= 'Global Data' )
                            {
                            // InternalSdmdsl.g:645:5: (lv_globalLevel_13_0= 'Global Data' )
                            // InternalSdmdsl.g:646:6: lv_globalLevel_13_0= 'Global Data'
                            {
                            lv_globalLevel_13_0=(Token)match(input,44,FOLLOW_10); 

                            						newLeafNode(lv_globalLevel_13_0, grammarAccess.getTableAccess().getGlobalLevelGlobalDataKeyword_7_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getTableRule());
                            						}
                            						setWithLastConsumed(current, "globalLevel", true, "Global Data");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,41,FOLLOW_14); 

                    				newLeafNode(otherlv_14, grammarAccess.getTableAccess().getColonKeyword_7_1());
                    			
                    // InternalSdmdsl.g:662:4: ( (lv_globalData_15_0= ruleGlobalField ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_ID||(LA17_0>=13 && LA17_0<=37)) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalSdmdsl.g:663:5: (lv_globalData_15_0= ruleGlobalField )
                    	    {
                    	    // InternalSdmdsl.g:663:5: (lv_globalData_15_0= ruleGlobalField )
                    	    // InternalSdmdsl.g:664:6: lv_globalData_15_0= ruleGlobalField
                    	    {

                    	    						newCompositeNode(grammarAccess.getTableAccess().getGlobalDataGlobalFieldParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_globalData_15_0=ruleGlobalField();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTableRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"globalData",
                    	    							lv_globalData_15_0,
                    	    							"org.xtext.alma.sdmdsl.Sdmdsl.GlobalField");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_16=(Token)match(input,45,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleField"
    // InternalSdmdsl.g:690:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalSdmdsl.g:690:46: (iv_ruleField= ruleField EOF )
            // InternalSdmdsl.g:691:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalSdmdsl.g:697:1: ruleField returns [EObject current=null] : ( ( ( (lv_primitiveType_0_0= rulePrimitiveTypes ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_scalar_3_0= 'scalar' ) )? | ( (lv_dataDim_4_0= ruleDimensions ) )+ ) ( (lv_autoIncrementable_5_0= 'autoIncrementable' ) )? ( ( ( (lv_refsToAslice_6_0= 'refersToASlice' ) ) | ( (lv_refsToOne_7_0= 'refersToOne' ) ) | ( (lv_refsToMany_8_0= 'refersToMany' ) ) | ( (lv_refsToManySlices_9_0= 'refersToManySlices' ) ) ) ( (lv_refersTo_10_0= RULE_ID ) ) (otherlv_11= '|' ( (lv_refersTo2_12_0= RULE_ID ) ) )? )? ( (lv_doc_13_0= RULE_ML_COMMENT ) )? ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_scalar_3_0=null;
        Token lv_autoIncrementable_5_0=null;
        Token lv_refsToAslice_6_0=null;
        Token lv_refsToOne_7_0=null;
        Token lv_refsToMany_8_0=null;
        Token lv_refsToManySlices_9_0=null;
        Token lv_refersTo_10_0=null;
        Token otherlv_11=null;
        Token lv_refersTo2_12_0=null;
        Token lv_doc_13_0=null;
        AntlrDatatypeRuleToken lv_primitiveType_0_0 = null;

        EObject lv_dataDim_4_0 = null;



        	enterRule();

        try {
            // InternalSdmdsl.g:703:2: ( ( ( ( (lv_primitiveType_0_0= rulePrimitiveTypes ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_scalar_3_0= 'scalar' ) )? | ( (lv_dataDim_4_0= ruleDimensions ) )+ ) ( (lv_autoIncrementable_5_0= 'autoIncrementable' ) )? ( ( ( (lv_refsToAslice_6_0= 'refersToASlice' ) ) | ( (lv_refsToOne_7_0= 'refersToOne' ) ) | ( (lv_refsToMany_8_0= 'refersToMany' ) ) | ( (lv_refsToManySlices_9_0= 'refersToManySlices' ) ) ) ( (lv_refersTo_10_0= RULE_ID ) ) (otherlv_11= '|' ( (lv_refersTo2_12_0= RULE_ID ) ) )? )? ( (lv_doc_13_0= RULE_ML_COMMENT ) )? ) )
            // InternalSdmdsl.g:704:2: ( ( ( (lv_primitiveType_0_0= rulePrimitiveTypes ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_scalar_3_0= 'scalar' ) )? | ( (lv_dataDim_4_0= ruleDimensions ) )+ ) ( (lv_autoIncrementable_5_0= 'autoIncrementable' ) )? ( ( ( (lv_refsToAslice_6_0= 'refersToASlice' ) ) | ( (lv_refsToOne_7_0= 'refersToOne' ) ) | ( (lv_refsToMany_8_0= 'refersToMany' ) ) | ( (lv_refsToManySlices_9_0= 'refersToManySlices' ) ) ) ( (lv_refersTo_10_0= RULE_ID ) ) (otherlv_11= '|' ( (lv_refersTo2_12_0= RULE_ID ) ) )? )? ( (lv_doc_13_0= RULE_ML_COMMENT ) )? )
            {
            // InternalSdmdsl.g:704:2: ( ( ( (lv_primitiveType_0_0= rulePrimitiveTypes ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_scalar_3_0= 'scalar' ) )? | ( (lv_dataDim_4_0= ruleDimensions ) )+ ) ( (lv_autoIncrementable_5_0= 'autoIncrementable' ) )? ( ( ( (lv_refsToAslice_6_0= 'refersToASlice' ) ) | ( (lv_refsToOne_7_0= 'refersToOne' ) ) | ( (lv_refsToMany_8_0= 'refersToMany' ) ) | ( (lv_refsToManySlices_9_0= 'refersToManySlices' ) ) ) ( (lv_refersTo_10_0= RULE_ID ) ) (otherlv_11= '|' ( (lv_refersTo2_12_0= RULE_ID ) ) )? )? ( (lv_doc_13_0= RULE_ML_COMMENT ) )? )
            // InternalSdmdsl.g:705:3: ( ( (lv_primitiveType_0_0= rulePrimitiveTypes ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_scalar_3_0= 'scalar' ) )? | ( (lv_dataDim_4_0= ruleDimensions ) )+ ) ( (lv_autoIncrementable_5_0= 'autoIncrementable' ) )? ( ( ( (lv_refsToAslice_6_0= 'refersToASlice' ) ) | ( (lv_refsToOne_7_0= 'refersToOne' ) ) | ( (lv_refsToMany_8_0= 'refersToMany' ) ) | ( (lv_refsToManySlices_9_0= 'refersToManySlices' ) ) ) ( (lv_refersTo_10_0= RULE_ID ) ) (otherlv_11= '|' ( (lv_refersTo2_12_0= RULE_ID ) ) )? )? ( (lv_doc_13_0= RULE_ML_COMMENT ) )?
            {
            // InternalSdmdsl.g:705:3: ( ( (lv_primitiveType_0_0= rulePrimitiveTypes ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=13 && LA19_0<=37)) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSdmdsl.g:706:4: ( (lv_primitiveType_0_0= rulePrimitiveTypes ) )
                    {
                    // InternalSdmdsl.g:706:4: ( (lv_primitiveType_0_0= rulePrimitiveTypes ) )
                    // InternalSdmdsl.g:707:5: (lv_primitiveType_0_0= rulePrimitiveTypes )
                    {
                    // InternalSdmdsl.g:707:5: (lv_primitiveType_0_0= rulePrimitiveTypes )
                    // InternalSdmdsl.g:708:6: lv_primitiveType_0_0= rulePrimitiveTypes
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getPrimitiveTypePrimitiveTypesParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_primitiveType_0_0=rulePrimitiveTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"primitiveType",
                    							lv_primitiveType_0_0,
                    							"org.xtext.alma.sdmdsl.Sdmdsl.PrimitiveTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSdmdsl.g:726:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalSdmdsl.g:726:4: ( (otherlv_1= RULE_ID ) )
                    // InternalSdmdsl.g:727:5: (otherlv_1= RULE_ID )
                    {
                    // InternalSdmdsl.g:727:5: (otherlv_1= RULE_ID )
                    // InternalSdmdsl.g:728:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getEnumerationEnumTypeCrossReference_0_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSdmdsl.g:740:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSdmdsl.g:741:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSdmdsl.g:741:4: (lv_name_2_0= RULE_ID )
            // InternalSdmdsl.g:742:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSdmdsl.g:758:3: ( ( (lv_scalar_3_0= 'scalar' ) )? | ( (lv_dataDim_4_0= ruleDimensions ) )+ )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==EOF||(LA22_0>=RULE_ML_COMMENT && LA22_0<=RULE_ID)||(LA22_0>=13 && LA22_0<=37)||(LA22_0>=41 && LA22_0<=51)) ) {
                alt22=1;
            }
            else if ( (LA22_0==54) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalSdmdsl.g:759:4: ( (lv_scalar_3_0= 'scalar' ) )?
                    {
                    // InternalSdmdsl.g:759:4: ( (lv_scalar_3_0= 'scalar' ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==46) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalSdmdsl.g:760:5: (lv_scalar_3_0= 'scalar' )
                            {
                            // InternalSdmdsl.g:760:5: (lv_scalar_3_0= 'scalar' )
                            // InternalSdmdsl.g:761:6: lv_scalar_3_0= 'scalar'
                            {
                            lv_scalar_3_0=(Token)match(input,46,FOLLOW_16); 

                            						newLeafNode(lv_scalar_3_0, grammarAccess.getFieldAccess().getScalarScalarKeyword_2_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getFieldRule());
                            						}
                            						setWithLastConsumed(current, "scalar", lv_scalar_3_0, "scalar");
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalSdmdsl.g:774:4: ( (lv_dataDim_4_0= ruleDimensions ) )+
                    {
                    // InternalSdmdsl.g:774:4: ( (lv_dataDim_4_0= ruleDimensions ) )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==54) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalSdmdsl.g:775:5: (lv_dataDim_4_0= ruleDimensions )
                    	    {
                    	    // InternalSdmdsl.g:775:5: (lv_dataDim_4_0= ruleDimensions )
                    	    // InternalSdmdsl.g:776:6: lv_dataDim_4_0= ruleDimensions
                    	    {

                    	    						newCompositeNode(grammarAccess.getFieldAccess().getDataDimDimensionsParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_dataDim_4_0=ruleDimensions();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"dataDim",
                    	    							lv_dataDim_4_0,
                    	    							"org.xtext.alma.sdmdsl.Sdmdsl.Dimensions");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt21 >= 1 ) break loop21;
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                throw eee;
                        }
                        cnt21++;
                    } while (true);


                    }
                    break;

            }

            // InternalSdmdsl.g:794:3: ( (lv_autoIncrementable_5_0= 'autoIncrementable' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSdmdsl.g:795:4: (lv_autoIncrementable_5_0= 'autoIncrementable' )
                    {
                    // InternalSdmdsl.g:795:4: (lv_autoIncrementable_5_0= 'autoIncrementable' )
                    // InternalSdmdsl.g:796:5: lv_autoIncrementable_5_0= 'autoIncrementable'
                    {
                    lv_autoIncrementable_5_0=(Token)match(input,47,FOLLOW_17); 

                    					newLeafNode(lv_autoIncrementable_5_0, grammarAccess.getFieldAccess().getAutoIncrementableAutoIncrementableKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldRule());
                    					}
                    					setWithLastConsumed(current, "autoIncrementable", true, "autoIncrementable");
                    				

                    }


                    }
                    break;

            }

            // InternalSdmdsl.g:808:3: ( ( ( (lv_refsToAslice_6_0= 'refersToASlice' ) ) | ( (lv_refsToOne_7_0= 'refersToOne' ) ) | ( (lv_refsToMany_8_0= 'refersToMany' ) ) | ( (lv_refsToManySlices_9_0= 'refersToManySlices' ) ) ) ( (lv_refersTo_10_0= RULE_ID ) ) (otherlv_11= '|' ( (lv_refersTo2_12_0= RULE_ID ) ) )? )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=48 && LA26_0<=51)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSdmdsl.g:809:4: ( ( (lv_refsToAslice_6_0= 'refersToASlice' ) ) | ( (lv_refsToOne_7_0= 'refersToOne' ) ) | ( (lv_refsToMany_8_0= 'refersToMany' ) ) | ( (lv_refsToManySlices_9_0= 'refersToManySlices' ) ) ) ( (lv_refersTo_10_0= RULE_ID ) ) (otherlv_11= '|' ( (lv_refersTo2_12_0= RULE_ID ) ) )?
                    {
                    // InternalSdmdsl.g:809:4: ( ( (lv_refsToAslice_6_0= 'refersToASlice' ) ) | ( (lv_refsToOne_7_0= 'refersToOne' ) ) | ( (lv_refsToMany_8_0= 'refersToMany' ) ) | ( (lv_refsToManySlices_9_0= 'refersToManySlices' ) ) )
                    int alt24=4;
                    switch ( input.LA(1) ) {
                    case 48:
                        {
                        alt24=1;
                        }
                        break;
                    case 49:
                        {
                        alt24=2;
                        }
                        break;
                    case 50:
                        {
                        alt24=3;
                        }
                        break;
                    case 51:
                        {
                        alt24=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }

                    switch (alt24) {
                        case 1 :
                            // InternalSdmdsl.g:810:5: ( (lv_refsToAslice_6_0= 'refersToASlice' ) )
                            {
                            // InternalSdmdsl.g:810:5: ( (lv_refsToAslice_6_0= 'refersToASlice' ) )
                            // InternalSdmdsl.g:811:6: (lv_refsToAslice_6_0= 'refersToASlice' )
                            {
                            // InternalSdmdsl.g:811:6: (lv_refsToAslice_6_0= 'refersToASlice' )
                            // InternalSdmdsl.g:812:7: lv_refsToAslice_6_0= 'refersToASlice'
                            {
                            lv_refsToAslice_6_0=(Token)match(input,48,FOLLOW_4); 

                            							newLeafNode(lv_refsToAslice_6_0, grammarAccess.getFieldAccess().getRefsToAsliceRefersToASliceKeyword_4_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFieldRule());
                            							}
                            							setWithLastConsumed(current, "refsToAslice", true, "refersToASlice");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalSdmdsl.g:825:5: ( (lv_refsToOne_7_0= 'refersToOne' ) )
                            {
                            // InternalSdmdsl.g:825:5: ( (lv_refsToOne_7_0= 'refersToOne' ) )
                            // InternalSdmdsl.g:826:6: (lv_refsToOne_7_0= 'refersToOne' )
                            {
                            // InternalSdmdsl.g:826:6: (lv_refsToOne_7_0= 'refersToOne' )
                            // InternalSdmdsl.g:827:7: lv_refsToOne_7_0= 'refersToOne'
                            {
                            lv_refsToOne_7_0=(Token)match(input,49,FOLLOW_4); 

                            							newLeafNode(lv_refsToOne_7_0, grammarAccess.getFieldAccess().getRefsToOneRefersToOneKeyword_4_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFieldRule());
                            							}
                            							setWithLastConsumed(current, "refsToOne", true, "refersToOne");
                            						

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalSdmdsl.g:840:5: ( (lv_refsToMany_8_0= 'refersToMany' ) )
                            {
                            // InternalSdmdsl.g:840:5: ( (lv_refsToMany_8_0= 'refersToMany' ) )
                            // InternalSdmdsl.g:841:6: (lv_refsToMany_8_0= 'refersToMany' )
                            {
                            // InternalSdmdsl.g:841:6: (lv_refsToMany_8_0= 'refersToMany' )
                            // InternalSdmdsl.g:842:7: lv_refsToMany_8_0= 'refersToMany'
                            {
                            lv_refsToMany_8_0=(Token)match(input,50,FOLLOW_4); 

                            							newLeafNode(lv_refsToMany_8_0, grammarAccess.getFieldAccess().getRefsToManyRefersToManyKeyword_4_0_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFieldRule());
                            							}
                            							setWithLastConsumed(current, "refsToMany", true, "refersToMany");
                            						

                            }


                            }


                            }
                            break;
                        case 4 :
                            // InternalSdmdsl.g:855:5: ( (lv_refsToManySlices_9_0= 'refersToManySlices' ) )
                            {
                            // InternalSdmdsl.g:855:5: ( (lv_refsToManySlices_9_0= 'refersToManySlices' ) )
                            // InternalSdmdsl.g:856:6: (lv_refsToManySlices_9_0= 'refersToManySlices' )
                            {
                            // InternalSdmdsl.g:856:6: (lv_refsToManySlices_9_0= 'refersToManySlices' )
                            // InternalSdmdsl.g:857:7: lv_refsToManySlices_9_0= 'refersToManySlices'
                            {
                            lv_refsToManySlices_9_0=(Token)match(input,51,FOLLOW_4); 

                            							newLeafNode(lv_refsToManySlices_9_0, grammarAccess.getFieldAccess().getRefsToManySlicesRefersToManySlicesKeyword_4_0_3_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFieldRule());
                            							}
                            							setWithLastConsumed(current, "refsToManySlices", true, "refersToManySlices");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalSdmdsl.g:870:4: ( (lv_refersTo_10_0= RULE_ID ) )
                    // InternalSdmdsl.g:871:5: (lv_refersTo_10_0= RULE_ID )
                    {
                    // InternalSdmdsl.g:871:5: (lv_refersTo_10_0= RULE_ID )
                    // InternalSdmdsl.g:872:6: lv_refersTo_10_0= RULE_ID
                    {
                    lv_refersTo_10_0=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(lv_refersTo_10_0, grammarAccess.getFieldAccess().getRefersToIDTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"refersTo",
                    							lv_refersTo_10_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalSdmdsl.g:888:4: (otherlv_11= '|' ( (lv_refersTo2_12_0= RULE_ID ) ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==52) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalSdmdsl.g:889:5: otherlv_11= '|' ( (lv_refersTo2_12_0= RULE_ID ) )
                            {
                            otherlv_11=(Token)match(input,52,FOLLOW_4); 

                            					newLeafNode(otherlv_11, grammarAccess.getFieldAccess().getVerticalLineKeyword_4_2_0());
                            				
                            // InternalSdmdsl.g:893:5: ( (lv_refersTo2_12_0= RULE_ID ) )
                            // InternalSdmdsl.g:894:6: (lv_refersTo2_12_0= RULE_ID )
                            {
                            // InternalSdmdsl.g:894:6: (lv_refersTo2_12_0= RULE_ID )
                            // InternalSdmdsl.g:895:7: lv_refersTo2_12_0= RULE_ID
                            {
                            lv_refersTo2_12_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                            							newLeafNode(lv_refersTo2_12_0, grammarAccess.getFieldAccess().getRefersTo2IDTerminalRuleCall_4_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFieldRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"refersTo2",
                            								lv_refersTo2_12_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalSdmdsl.g:913:3: ( (lv_doc_13_0= RULE_ML_COMMENT ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ML_COMMENT) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSdmdsl.g:914:4: (lv_doc_13_0= RULE_ML_COMMENT )
                    {
                    // InternalSdmdsl.g:914:4: (lv_doc_13_0= RULE_ML_COMMENT )
                    // InternalSdmdsl.g:915:5: lv_doc_13_0= RULE_ML_COMMENT
                    {
                    lv_doc_13_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_2); 

                    					newLeafNode(lv_doc_13_0, grammarAccess.getFieldAccess().getDocML_COMMENTTerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"doc",
                    						lv_doc_13_0,
                    						"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleGlobalField"
    // InternalSdmdsl.g:935:1: entryRuleGlobalField returns [EObject current=null] : iv_ruleGlobalField= ruleGlobalField EOF ;
    public final EObject entryRuleGlobalField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalField = null;


        try {
            // InternalSdmdsl.g:935:52: (iv_ruleGlobalField= ruleGlobalField EOF )
            // InternalSdmdsl.g:936:2: iv_ruleGlobalField= ruleGlobalField EOF
            {
             newCompositeNode(grammarAccess.getGlobalFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalField=ruleGlobalField();

            state._fsp--;

             current =iv_ruleGlobalField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalField"


    // $ANTLR start "ruleGlobalField"
    // InternalSdmdsl.g:942:1: ruleGlobalField returns [EObject current=null] : ( ( ( (lv_primitiveType_0_0= rulePrimitiveTypes ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_readOnly_3_0= 'readOnly' ) )? ( (lv_initValue_4_0= RULE_STRING ) ) ( (lv_doc_5_0= RULE_ML_COMMENT ) )? ) ;
    public final EObject ruleGlobalField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_readOnly_3_0=null;
        Token lv_initValue_4_0=null;
        Token lv_doc_5_0=null;
        AntlrDatatypeRuleToken lv_primitiveType_0_0 = null;



        	enterRule();

        try {
            // InternalSdmdsl.g:948:2: ( ( ( ( (lv_primitiveType_0_0= rulePrimitiveTypes ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_readOnly_3_0= 'readOnly' ) )? ( (lv_initValue_4_0= RULE_STRING ) ) ( (lv_doc_5_0= RULE_ML_COMMENT ) )? ) )
            // InternalSdmdsl.g:949:2: ( ( ( (lv_primitiveType_0_0= rulePrimitiveTypes ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_readOnly_3_0= 'readOnly' ) )? ( (lv_initValue_4_0= RULE_STRING ) ) ( (lv_doc_5_0= RULE_ML_COMMENT ) )? )
            {
            // InternalSdmdsl.g:949:2: ( ( ( (lv_primitiveType_0_0= rulePrimitiveTypes ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_readOnly_3_0= 'readOnly' ) )? ( (lv_initValue_4_0= RULE_STRING ) ) ( (lv_doc_5_0= RULE_ML_COMMENT ) )? )
            // InternalSdmdsl.g:950:3: ( ( (lv_primitiveType_0_0= rulePrimitiveTypes ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_readOnly_3_0= 'readOnly' ) )? ( (lv_initValue_4_0= RULE_STRING ) ) ( (lv_doc_5_0= RULE_ML_COMMENT ) )?
            {
            // InternalSdmdsl.g:950:3: ( ( (lv_primitiveType_0_0= rulePrimitiveTypes ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=13 && LA28_0<=37)) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalSdmdsl.g:951:4: ( (lv_primitiveType_0_0= rulePrimitiveTypes ) )
                    {
                    // InternalSdmdsl.g:951:4: ( (lv_primitiveType_0_0= rulePrimitiveTypes ) )
                    // InternalSdmdsl.g:952:5: (lv_primitiveType_0_0= rulePrimitiveTypes )
                    {
                    // InternalSdmdsl.g:952:5: (lv_primitiveType_0_0= rulePrimitiveTypes )
                    // InternalSdmdsl.g:953:6: lv_primitiveType_0_0= rulePrimitiveTypes
                    {

                    						newCompositeNode(grammarAccess.getGlobalFieldAccess().getPrimitiveTypePrimitiveTypesParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_primitiveType_0_0=rulePrimitiveTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGlobalFieldRule());
                    						}
                    						set(
                    							current,
                    							"primitiveType",
                    							lv_primitiveType_0_0,
                    							"org.xtext.alma.sdmdsl.Sdmdsl.PrimitiveTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSdmdsl.g:971:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalSdmdsl.g:971:4: ( (otherlv_1= RULE_ID ) )
                    // InternalSdmdsl.g:972:5: (otherlv_1= RULE_ID )
                    {
                    // InternalSdmdsl.g:972:5: (otherlv_1= RULE_ID )
                    // InternalSdmdsl.g:973:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGlobalFieldRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(otherlv_1, grammarAccess.getGlobalFieldAccess().getEnumerationEnumTypeCrossReference_0_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSdmdsl.g:985:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSdmdsl.g:986:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSdmdsl.g:986:4: (lv_name_2_0= RULE_ID )
            // InternalSdmdsl.g:987:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_2_0, grammarAccess.getGlobalFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGlobalFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSdmdsl.g:1003:3: ( (lv_readOnly_3_0= 'readOnly' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==53) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSdmdsl.g:1004:4: (lv_readOnly_3_0= 'readOnly' )
                    {
                    // InternalSdmdsl.g:1004:4: (lv_readOnly_3_0= 'readOnly' )
                    // InternalSdmdsl.g:1005:5: lv_readOnly_3_0= 'readOnly'
                    {
                    lv_readOnly_3_0=(Token)match(input,53,FOLLOW_21); 

                    					newLeafNode(lv_readOnly_3_0, grammarAccess.getGlobalFieldAccess().getReadOnlyReadOnlyKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGlobalFieldRule());
                    					}
                    					setWithLastConsumed(current, "readOnly", true, "readOnly");
                    				

                    }


                    }
                    break;

            }

            // InternalSdmdsl.g:1017:3: ( (lv_initValue_4_0= RULE_STRING ) )
            // InternalSdmdsl.g:1018:4: (lv_initValue_4_0= RULE_STRING )
            {
            // InternalSdmdsl.g:1018:4: (lv_initValue_4_0= RULE_STRING )
            // InternalSdmdsl.g:1019:5: lv_initValue_4_0= RULE_STRING
            {
            lv_initValue_4_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_initValue_4_0, grammarAccess.getGlobalFieldAccess().getInitValueSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGlobalFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"initValue",
            						lv_initValue_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSdmdsl.g:1035:3: ( (lv_doc_5_0= RULE_ML_COMMENT ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ML_COMMENT) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSdmdsl.g:1036:4: (lv_doc_5_0= RULE_ML_COMMENT )
                    {
                    // InternalSdmdsl.g:1036:4: (lv_doc_5_0= RULE_ML_COMMENT )
                    // InternalSdmdsl.g:1037:5: lv_doc_5_0= RULE_ML_COMMENT
                    {
                    lv_doc_5_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_2); 

                    					newLeafNode(lv_doc_5_0, grammarAccess.getGlobalFieldAccess().getDocML_COMMENTTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGlobalFieldRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"doc",
                    						lv_doc_5_0,
                    						"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobalField"


    // $ANTLR start "entryRuleDimensions"
    // InternalSdmdsl.g:1057:1: entryRuleDimensions returns [EObject current=null] : iv_ruleDimensions= ruleDimensions EOF ;
    public final EObject entryRuleDimensions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimensions = null;


        try {
            // InternalSdmdsl.g:1057:51: (iv_ruleDimensions= ruleDimensions EOF )
            // InternalSdmdsl.g:1058:2: iv_ruleDimensions= ruleDimensions EOF
            {
             newCompositeNode(grammarAccess.getDimensionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDimensions=ruleDimensions();

            state._fsp--;

             current =iv_ruleDimensions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDimensions"


    // $ANTLR start "ruleDimensions"
    // InternalSdmdsl.g:1064:1: ruleDimensions returns [EObject current=null] : (this_Defined_0= ruleDefined | this_NotDefined_1= ruleNotDefined ) ;
    public final EObject ruleDimensions() throws RecognitionException {
        EObject current = null;

        EObject this_Defined_0 = null;

        EObject this_NotDefined_1 = null;



        	enterRule();

        try {
            // InternalSdmdsl.g:1070:2: ( (this_Defined_0= ruleDefined | this_NotDefined_1= ruleNotDefined ) )
            // InternalSdmdsl.g:1071:2: (this_Defined_0= ruleDefined | this_NotDefined_1= ruleNotDefined )
            {
            // InternalSdmdsl.g:1071:2: (this_Defined_0= ruleDefined | this_NotDefined_1= ruleNotDefined )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==54) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==RULE_WS||LA31_1==55) ) {
                    alt31=2;
                }
                else if ( (LA31_1==RULE_ID||LA31_1==RULE_INT||LA31_1==60) ) {
                    alt31=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalSdmdsl.g:1072:3: this_Defined_0= ruleDefined
                    {

                    			newCompositeNode(grammarAccess.getDimensionsAccess().getDefinedParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Defined_0=ruleDefined();

                    state._fsp--;


                    			current = this_Defined_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSdmdsl.g:1081:3: this_NotDefined_1= ruleNotDefined
                    {

                    			newCompositeNode(grammarAccess.getDimensionsAccess().getNotDefinedParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NotDefined_1=ruleNotDefined();

                    state._fsp--;


                    			current = this_NotDefined_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDimensions"


    // $ANTLR start "entryRuleNotDefined"
    // InternalSdmdsl.g:1093:1: entryRuleNotDefined returns [EObject current=null] : iv_ruleNotDefined= ruleNotDefined EOF ;
    public final EObject entryRuleNotDefined() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotDefined = null;


        try {
            // InternalSdmdsl.g:1093:51: (iv_ruleNotDefined= ruleNotDefined EOF )
            // InternalSdmdsl.g:1094:2: iv_ruleNotDefined= ruleNotDefined EOF
            {
             newCompositeNode(grammarAccess.getNotDefinedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotDefined=ruleNotDefined();

            state._fsp--;

             current =iv_ruleNotDefined; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotDefined"


    // $ANTLR start "ruleNotDefined"
    // InternalSdmdsl.g:1100:1: ruleNotDefined returns [EObject current=null] : ( ( (lv_obj_0_0= '[' ) ) (this_WS_1= RULE_WS )* otherlv_2= ']' ) ;
    public final EObject ruleNotDefined() throws RecognitionException {
        EObject current = null;

        Token lv_obj_0_0=null;
        Token this_WS_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSdmdsl.g:1106:2: ( ( ( (lv_obj_0_0= '[' ) ) (this_WS_1= RULE_WS )* otherlv_2= ']' ) )
            // InternalSdmdsl.g:1107:2: ( ( (lv_obj_0_0= '[' ) ) (this_WS_1= RULE_WS )* otherlv_2= ']' )
            {
            // InternalSdmdsl.g:1107:2: ( ( (lv_obj_0_0= '[' ) ) (this_WS_1= RULE_WS )* otherlv_2= ']' )
            // InternalSdmdsl.g:1108:3: ( (lv_obj_0_0= '[' ) ) (this_WS_1= RULE_WS )* otherlv_2= ']'
            {
            // InternalSdmdsl.g:1108:3: ( (lv_obj_0_0= '[' ) )
            // InternalSdmdsl.g:1109:4: (lv_obj_0_0= '[' )
            {
            // InternalSdmdsl.g:1109:4: (lv_obj_0_0= '[' )
            // InternalSdmdsl.g:1110:5: lv_obj_0_0= '['
            {
            lv_obj_0_0=(Token)match(input,54,FOLLOW_22); 

            					newLeafNode(lv_obj_0_0, grammarAccess.getNotDefinedAccess().getObjLeftSquareBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNotDefinedRule());
            					}
            					setWithLastConsumed(current, "obj", lv_obj_0_0, "[");
            				

            }


            }

            // InternalSdmdsl.g:1122:3: (this_WS_1= RULE_WS )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_WS) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSdmdsl.g:1123:4: this_WS_1= RULE_WS
            	    {
            	    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_22); 

            	    				newLeafNode(this_WS_1, grammarAccess.getNotDefinedAccess().getWSTerminalRuleCall_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_2=(Token)match(input,55,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getNotDefinedAccess().getRightSquareBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotDefined"


    // $ANTLR start "entryRuleDefined"
    // InternalSdmdsl.g:1136:1: entryRuleDefined returns [EObject current=null] : iv_ruleDefined= ruleDefined EOF ;
    public final EObject entryRuleDefined() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefined = null;


        try {
            // InternalSdmdsl.g:1136:48: (iv_ruleDefined= ruleDefined EOF )
            // InternalSdmdsl.g:1137:2: iv_ruleDefined= ruleDefined EOF
            {
             newCompositeNode(grammarAccess.getDefinedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefined=ruleDefined();

            state._fsp--;

             current =iv_ruleDefined; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefined"


    // $ANTLR start "ruleDefined"
    // InternalSdmdsl.g:1143:1: ruleDefined returns [EObject current=null] : (otherlv_0= '[' ( (lv_dataDimValue_1_0= ruleAddition ) ) otherlv_2= ']' ) ;
    public final EObject ruleDefined() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dataDimValue_1_0 = null;



        	enterRule();

        try {
            // InternalSdmdsl.g:1149:2: ( (otherlv_0= '[' ( (lv_dataDimValue_1_0= ruleAddition ) ) otherlv_2= ']' ) )
            // InternalSdmdsl.g:1150:2: (otherlv_0= '[' ( (lv_dataDimValue_1_0= ruleAddition ) ) otherlv_2= ']' )
            {
            // InternalSdmdsl.g:1150:2: (otherlv_0= '[' ( (lv_dataDimValue_1_0= ruleAddition ) ) otherlv_2= ']' )
            // InternalSdmdsl.g:1151:3: otherlv_0= '[' ( (lv_dataDimValue_1_0= ruleAddition ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getDefinedAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSdmdsl.g:1155:3: ( (lv_dataDimValue_1_0= ruleAddition ) )
            // InternalSdmdsl.g:1156:4: (lv_dataDimValue_1_0= ruleAddition )
            {
            // InternalSdmdsl.g:1156:4: (lv_dataDimValue_1_0= ruleAddition )
            // InternalSdmdsl.g:1157:5: lv_dataDimValue_1_0= ruleAddition
            {

            					newCompositeNode(grammarAccess.getDefinedAccess().getDataDimValueAdditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_dataDimValue_1_0=ruleAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinedRule());
            					}
            					set(
            						current,
            						"dataDimValue",
            						lv_dataDimValue_1_0,
            						"org.xtext.alma.sdmdsl.Sdmdsl.Addition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,55,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDefinedAccess().getRightSquareBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefined"


    // $ANTLR start "entryRuleFieldDimensions"
    // InternalSdmdsl.g:1182:1: entryRuleFieldDimensions returns [EObject current=null] : iv_ruleFieldDimensions= ruleFieldDimensions EOF ;
    public final EObject entryRuleFieldDimensions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldDimensions = null;


        try {
            // InternalSdmdsl.g:1182:56: (iv_ruleFieldDimensions= ruleFieldDimensions EOF )
            // InternalSdmdsl.g:1183:2: iv_ruleFieldDimensions= ruleFieldDimensions EOF
            {
             newCompositeNode(grammarAccess.getFieldDimensionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldDimensions=ruleFieldDimensions();

            state._fsp--;

             current =iv_ruleFieldDimensions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldDimensions"


    // $ANTLR start "ruleFieldDimensions"
    // InternalSdmdsl.g:1189:1: ruleFieldDimensions returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleFieldDimensions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalSdmdsl.g:1195:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalSdmdsl.g:1196:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalSdmdsl.g:1196:2: ( (otherlv_0= RULE_ID ) )
            // InternalSdmdsl.g:1197:3: (otherlv_0= RULE_ID )
            {
            // InternalSdmdsl.g:1197:3: (otherlv_0= RULE_ID )
            // InternalSdmdsl.g:1198:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFieldDimensionsRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getFieldDimensionsAccess().getDimValueFieldCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldDimensions"


    // $ANTLR start "entryRuleOtherTableField"
    // InternalSdmdsl.g:1212:1: entryRuleOtherTableField returns [EObject current=null] : iv_ruleOtherTableField= ruleOtherTableField EOF ;
    public final EObject entryRuleOtherTableField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherTableField = null;


        try {
            // InternalSdmdsl.g:1212:56: (iv_ruleOtherTableField= ruleOtherTableField EOF )
            // InternalSdmdsl.g:1213:2: iv_ruleOtherTableField= ruleOtherTableField EOF
            {
             newCompositeNode(grammarAccess.getOtherTableFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOtherTableField=ruleOtherTableField();

            state._fsp--;

             current =iv_ruleOtherTableField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOtherTableField"


    // $ANTLR start "ruleOtherTableField"
    // InternalSdmdsl.g:1219:1: ruleOtherTableField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_fieldName_2_0= RULE_ID ) ) ) ;
    public final EObject ruleOtherTableField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_fieldName_2_0=null;


        	enterRule();

        try {
            // InternalSdmdsl.g:1225:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_fieldName_2_0= RULE_ID ) ) ) )
            // InternalSdmdsl.g:1226:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_fieldName_2_0= RULE_ID ) ) )
            {
            // InternalSdmdsl.g:1226:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_fieldName_2_0= RULE_ID ) ) )
            // InternalSdmdsl.g:1227:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_fieldName_2_0= RULE_ID ) )
            {
            // InternalSdmdsl.g:1227:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSdmdsl.g:1228:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSdmdsl.g:1228:4: (lv_name_0_0= RULE_ID )
            // InternalSdmdsl.g:1229:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_0_0, grammarAccess.getOtherTableFieldAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOtherTableFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOtherTableFieldAccess().getFullStopKeyword_1());
            		
            // InternalSdmdsl.g:1249:3: ( (lv_fieldName_2_0= RULE_ID ) )
            // InternalSdmdsl.g:1250:4: (lv_fieldName_2_0= RULE_ID )
            {
            // InternalSdmdsl.g:1250:4: (lv_fieldName_2_0= RULE_ID )
            // InternalSdmdsl.g:1251:5: lv_fieldName_2_0= RULE_ID
            {
            lv_fieldName_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_fieldName_2_0, grammarAccess.getOtherTableFieldAccess().getFieldNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOtherTableFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fieldName",
            						lv_fieldName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOtherTableField"


    // $ANTLR start "entryRuleIntDimensions"
    // InternalSdmdsl.g:1271:1: entryRuleIntDimensions returns [EObject current=null] : iv_ruleIntDimensions= ruleIntDimensions EOF ;
    public final EObject entryRuleIntDimensions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntDimensions = null;


        try {
            // InternalSdmdsl.g:1271:54: (iv_ruleIntDimensions= ruleIntDimensions EOF )
            // InternalSdmdsl.g:1272:2: iv_ruleIntDimensions= ruleIntDimensions EOF
            {
             newCompositeNode(grammarAccess.getIntDimensionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntDimensions=ruleIntDimensions();

            state._fsp--;

             current =iv_ruleIntDimensions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntDimensions"


    // $ANTLR start "ruleIntDimensions"
    // InternalSdmdsl.g:1278:1: ruleIntDimensions returns [EObject current=null] : ( (lv_dimValue_0_0= RULE_INT ) ) ;
    public final EObject ruleIntDimensions() throws RecognitionException {
        EObject current = null;

        Token lv_dimValue_0_0=null;


        	enterRule();

        try {
            // InternalSdmdsl.g:1284:2: ( ( (lv_dimValue_0_0= RULE_INT ) ) )
            // InternalSdmdsl.g:1285:2: ( (lv_dimValue_0_0= RULE_INT ) )
            {
            // InternalSdmdsl.g:1285:2: ( (lv_dimValue_0_0= RULE_INT ) )
            // InternalSdmdsl.g:1286:3: (lv_dimValue_0_0= RULE_INT )
            {
            // InternalSdmdsl.g:1286:3: (lv_dimValue_0_0= RULE_INT )
            // InternalSdmdsl.g:1287:4: lv_dimValue_0_0= RULE_INT
            {
            lv_dimValue_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_dimValue_0_0, grammarAccess.getIntDimensionsAccess().getDimValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntDimensionsRule());
            				}
            				setWithLastConsumed(
            					current,
            					"dimValue",
            					lv_dimValue_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntDimensions"


    // $ANTLR start "entryRuleAddition"
    // InternalSdmdsl.g:1306:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalSdmdsl.g:1306:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalSdmdsl.g:1307:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalSdmdsl.g:1313:1: ruleAddition returns [EObject current=null] : ( ( (lv_addValue_0_0= ruleMultiplication ) ) ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_addValue_2_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        EObject lv_addValue_0_0 = null;

        EObject lv_addValue_2_0 = null;



        	enterRule();

        try {
            // InternalSdmdsl.g:1319:2: ( ( ( (lv_addValue_0_0= ruleMultiplication ) ) ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_addValue_2_0= ruleMultiplication ) ) )* ) )
            // InternalSdmdsl.g:1320:2: ( ( (lv_addValue_0_0= ruleMultiplication ) ) ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_addValue_2_0= ruleMultiplication ) ) )* )
            {
            // InternalSdmdsl.g:1320:2: ( ( (lv_addValue_0_0= ruleMultiplication ) ) ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_addValue_2_0= ruleMultiplication ) ) )* )
            // InternalSdmdsl.g:1321:3: ( (lv_addValue_0_0= ruleMultiplication ) ) ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_addValue_2_0= ruleMultiplication ) ) )*
            {
            // InternalSdmdsl.g:1321:3: ( (lv_addValue_0_0= ruleMultiplication ) )
            // InternalSdmdsl.g:1322:4: (lv_addValue_0_0= ruleMultiplication )
            {
            // InternalSdmdsl.g:1322:4: (lv_addValue_0_0= ruleMultiplication )
            // InternalSdmdsl.g:1323:5: lv_addValue_0_0= ruleMultiplication
            {

            					newCompositeNode(grammarAccess.getAdditionAccess().getAddValueMultiplicationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_addValue_0_0=ruleMultiplication();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdditionRule());
            					}
            					add(
            						current,
            						"addValue",
            						lv_addValue_0_0,
            						"org.xtext.alma.sdmdsl.Sdmdsl.Multiplication");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSdmdsl.g:1340:3: ( ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_addValue_2_0= ruleMultiplication ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=56 && LA34_0<=57)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSdmdsl.g:1341:4: ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) ) ( (lv_addValue_2_0= ruleMultiplication ) )
            	    {
            	    // InternalSdmdsl.g:1341:4: ( ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) ) )
            	    // InternalSdmdsl.g:1342:5: ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) )
            	    {
            	    // InternalSdmdsl.g:1342:5: ( (lv_op_1_1= '+' | lv_op_1_2= '-' ) )
            	    // InternalSdmdsl.g:1343:6: (lv_op_1_1= '+' | lv_op_1_2= '-' )
            	    {
            	    // InternalSdmdsl.g:1343:6: (lv_op_1_1= '+' | lv_op_1_2= '-' )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==56) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==57) ) {
            	        alt33=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalSdmdsl.g:1344:7: lv_op_1_1= '+'
            	            {
            	            lv_op_1_1=(Token)match(input,56,FOLLOW_23); 

            	            							newLeafNode(lv_op_1_1, grammarAccess.getAdditionAccess().getOpPlusSignKeyword_1_0_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							addWithLastConsumed(current, "op", lv_op_1_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalSdmdsl.g:1355:7: lv_op_1_2= '-'
            	            {
            	            lv_op_1_2=(Token)match(input,57,FOLLOW_23); 

            	            							newLeafNode(lv_op_1_2, grammarAccess.getAdditionAccess().getOpHyphenMinusKeyword_1_0_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							addWithLastConsumed(current, "op", lv_op_1_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalSdmdsl.g:1368:4: ( (lv_addValue_2_0= ruleMultiplication ) )
            	    // InternalSdmdsl.g:1369:5: (lv_addValue_2_0= ruleMultiplication )
            	    {
            	    // InternalSdmdsl.g:1369:5: (lv_addValue_2_0= ruleMultiplication )
            	    // InternalSdmdsl.g:1370:6: lv_addValue_2_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getAddValueMultiplicationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_addValue_2_0=ruleMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"addValue",
            	    							lv_addValue_2_0,
            	    							"org.xtext.alma.sdmdsl.Sdmdsl.Multiplication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalSdmdsl.g:1392:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalSdmdsl.g:1392:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalSdmdsl.g:1393:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalSdmdsl.g:1399:1: ruleMultiplication returns [EObject current=null] : ( ( (lv_multValue_0_0= rulePrimary ) ) ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' ) ) ) ( (lv_multValue_2_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        EObject lv_multValue_0_0 = null;

        EObject lv_multValue_2_0 = null;



        	enterRule();

        try {
            // InternalSdmdsl.g:1405:2: ( ( ( (lv_multValue_0_0= rulePrimary ) ) ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' ) ) ) ( (lv_multValue_2_0= rulePrimary ) ) )* ) )
            // InternalSdmdsl.g:1406:2: ( ( (lv_multValue_0_0= rulePrimary ) ) ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' ) ) ) ( (lv_multValue_2_0= rulePrimary ) ) )* )
            {
            // InternalSdmdsl.g:1406:2: ( ( (lv_multValue_0_0= rulePrimary ) ) ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' ) ) ) ( (lv_multValue_2_0= rulePrimary ) ) )* )
            // InternalSdmdsl.g:1407:3: ( (lv_multValue_0_0= rulePrimary ) ) ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' ) ) ) ( (lv_multValue_2_0= rulePrimary ) ) )*
            {
            // InternalSdmdsl.g:1407:3: ( (lv_multValue_0_0= rulePrimary ) )
            // InternalSdmdsl.g:1408:4: (lv_multValue_0_0= rulePrimary )
            {
            // InternalSdmdsl.g:1408:4: (lv_multValue_0_0= rulePrimary )
            // InternalSdmdsl.g:1409:5: lv_multValue_0_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getMultiplicationAccess().getMultValuePrimaryParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
            lv_multValue_0_0=rulePrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            					}
            					add(
            						current,
            						"multValue",
            						lv_multValue_0_0,
            						"org.xtext.alma.sdmdsl.Sdmdsl.Primary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSdmdsl.g:1426:3: ( ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' ) ) ) ( (lv_multValue_2_0= rulePrimary ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=58 && LA36_0<=59)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalSdmdsl.g:1427:4: ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' ) ) ) ( (lv_multValue_2_0= rulePrimary ) )
            	    {
            	    // InternalSdmdsl.g:1427:4: ( ( (lv_op_1_1= '*' | lv_op_1_2= '/' ) ) )
            	    // InternalSdmdsl.g:1428:5: ( (lv_op_1_1= '*' | lv_op_1_2= '/' ) )
            	    {
            	    // InternalSdmdsl.g:1428:5: ( (lv_op_1_1= '*' | lv_op_1_2= '/' ) )
            	    // InternalSdmdsl.g:1429:6: (lv_op_1_1= '*' | lv_op_1_2= '/' )
            	    {
            	    // InternalSdmdsl.g:1429:6: (lv_op_1_1= '*' | lv_op_1_2= '/' )
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==58) ) {
            	        alt35=1;
            	    }
            	    else if ( (LA35_0==59) ) {
            	        alt35=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalSdmdsl.g:1430:7: lv_op_1_1= '*'
            	            {
            	            lv_op_1_1=(Token)match(input,58,FOLLOW_23); 

            	            							newLeafNode(lv_op_1_1, grammarAccess.getMultiplicationAccess().getOpAsteriskKeyword_1_0_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							addWithLastConsumed(current, "op", lv_op_1_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalSdmdsl.g:1441:7: lv_op_1_2= '/'
            	            {
            	            lv_op_1_2=(Token)match(input,59,FOLLOW_23); 

            	            							newLeafNode(lv_op_1_2, grammarAccess.getMultiplicationAccess().getOpSolidusKeyword_1_0_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							addWithLastConsumed(current, "op", lv_op_1_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalSdmdsl.g:1454:4: ( (lv_multValue_2_0= rulePrimary ) )
            	    // InternalSdmdsl.g:1455:5: (lv_multValue_2_0= rulePrimary )
            	    {
            	    // InternalSdmdsl.g:1455:5: (lv_multValue_2_0= rulePrimary )
            	    // InternalSdmdsl.g:1456:6: lv_multValue_2_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getMultValuePrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_multValue_2_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"multValue",
            	    							lv_multValue_2_0,
            	    							"org.xtext.alma.sdmdsl.Sdmdsl.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimary"
    // InternalSdmdsl.g:1478:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalSdmdsl.g:1478:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalSdmdsl.g:1479:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalSdmdsl.g:1485:1: rulePrimary returns [EObject current=null] : ( ( ( (lv_primValue_0_1= ruleIntDimensions | lv_primValue_0_2= ruleOtherTableField | lv_primValue_0_3= ruleFieldDimensions ) ) ) | (otherlv_1= '(' ( (lv_primAddValue_2_0= ruleAddition ) ) otherlv_3= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_primValue_0_1 = null;

        EObject lv_primValue_0_2 = null;

        EObject lv_primValue_0_3 = null;

        EObject lv_primAddValue_2_0 = null;



        	enterRule();

        try {
            // InternalSdmdsl.g:1491:2: ( ( ( ( (lv_primValue_0_1= ruleIntDimensions | lv_primValue_0_2= ruleOtherTableField | lv_primValue_0_3= ruleFieldDimensions ) ) ) | (otherlv_1= '(' ( (lv_primAddValue_2_0= ruleAddition ) ) otherlv_3= ')' ) ) )
            // InternalSdmdsl.g:1492:2: ( ( ( (lv_primValue_0_1= ruleIntDimensions | lv_primValue_0_2= ruleOtherTableField | lv_primValue_0_3= ruleFieldDimensions ) ) ) | (otherlv_1= '(' ( (lv_primAddValue_2_0= ruleAddition ) ) otherlv_3= ')' ) )
            {
            // InternalSdmdsl.g:1492:2: ( ( ( (lv_primValue_0_1= ruleIntDimensions | lv_primValue_0_2= ruleOtherTableField | lv_primValue_0_3= ruleFieldDimensions ) ) ) | (otherlv_1= '(' ( (lv_primAddValue_2_0= ruleAddition ) ) otherlv_3= ')' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID||LA38_0==RULE_INT) ) {
                alt38=1;
            }
            else if ( (LA38_0==60) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalSdmdsl.g:1493:3: ( ( (lv_primValue_0_1= ruleIntDimensions | lv_primValue_0_2= ruleOtherTableField | lv_primValue_0_3= ruleFieldDimensions ) ) )
                    {
                    // InternalSdmdsl.g:1493:3: ( ( (lv_primValue_0_1= ruleIntDimensions | lv_primValue_0_2= ruleOtherTableField | lv_primValue_0_3= ruleFieldDimensions ) ) )
                    // InternalSdmdsl.g:1494:4: ( (lv_primValue_0_1= ruleIntDimensions | lv_primValue_0_2= ruleOtherTableField | lv_primValue_0_3= ruleFieldDimensions ) )
                    {
                    // InternalSdmdsl.g:1494:4: ( (lv_primValue_0_1= ruleIntDimensions | lv_primValue_0_2= ruleOtherTableField | lv_primValue_0_3= ruleFieldDimensions ) )
                    // InternalSdmdsl.g:1495:5: (lv_primValue_0_1= ruleIntDimensions | lv_primValue_0_2= ruleOtherTableField | lv_primValue_0_3= ruleFieldDimensions )
                    {
                    // InternalSdmdsl.g:1495:5: (lv_primValue_0_1= ruleIntDimensions | lv_primValue_0_2= ruleOtherTableField | lv_primValue_0_3= ruleFieldDimensions )
                    int alt37=3;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_INT) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==RULE_ID) ) {
                        int LA37_2 = input.LA(2);

                        if ( (LA37_2==12) ) {
                            alt37=2;
                        }
                        else if ( (LA37_2==EOF||(LA37_2>=55 && LA37_2<=59)||LA37_2==61) ) {
                            alt37=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 37, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalSdmdsl.g:1496:6: lv_primValue_0_1= ruleIntDimensions
                            {

                            						newCompositeNode(grammarAccess.getPrimaryAccess().getPrimValueIntDimensionsParserRuleCall_0_0_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_primValue_0_1=ruleIntDimensions();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                            						}
                            						set(
                            							current,
                            							"primValue",
                            							lv_primValue_0_1,
                            							"org.xtext.alma.sdmdsl.Sdmdsl.IntDimensions");
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;
                        case 2 :
                            // InternalSdmdsl.g:1512:6: lv_primValue_0_2= ruleOtherTableField
                            {

                            						newCompositeNode(grammarAccess.getPrimaryAccess().getPrimValueOtherTableFieldParserRuleCall_0_0_1());
                            					
                            pushFollow(FOLLOW_2);
                            lv_primValue_0_2=ruleOtherTableField();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                            						}
                            						set(
                            							current,
                            							"primValue",
                            							lv_primValue_0_2,
                            							"org.xtext.alma.sdmdsl.Sdmdsl.OtherTableField");
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;
                        case 3 :
                            // InternalSdmdsl.g:1528:6: lv_primValue_0_3= ruleFieldDimensions
                            {

                            						newCompositeNode(grammarAccess.getPrimaryAccess().getPrimValueFieldDimensionsParserRuleCall_0_0_2());
                            					
                            pushFollow(FOLLOW_2);
                            lv_primValue_0_3=ruleFieldDimensions();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                            						}
                            						set(
                            							current,
                            							"primValue",
                            							lv_primValue_0_3,
                            							"org.xtext.alma.sdmdsl.Sdmdsl.FieldDimensions");
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSdmdsl.g:1547:3: (otherlv_1= '(' ( (lv_primAddValue_2_0= ruleAddition ) ) otherlv_3= ')' )
                    {
                    // InternalSdmdsl.g:1547:3: (otherlv_1= '(' ( (lv_primAddValue_2_0= ruleAddition ) ) otherlv_3= ')' )
                    // InternalSdmdsl.g:1548:4: otherlv_1= '(' ( (lv_primAddValue_2_0= ruleAddition ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalSdmdsl.g:1552:4: ( (lv_primAddValue_2_0= ruleAddition ) )
                    // InternalSdmdsl.g:1553:5: (lv_primAddValue_2_0= ruleAddition )
                    {
                    // InternalSdmdsl.g:1553:5: (lv_primAddValue_2_0= ruleAddition )
                    // InternalSdmdsl.g:1554:6: lv_primAddValue_2_0= ruleAddition
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getPrimAddValueAdditionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_primAddValue_2_0=ruleAddition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"primAddValue",
                    							lv_primAddValue_2_0,
                    							"org.xtext.alma.sdmdsl.Sdmdsl.Addition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,61,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00003E3FFFFFE020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00003A3FFFFFE020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000323FFFFFE020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000203FFFFFE020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x004FC00000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000F800000000012L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000F000000000012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0010000000000012L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0020000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0080000000000080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x1000000000000120L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x2000000000000000L});

}