package org.xtext.alma.container.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.alma.container.services.ContainerGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalContainerParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'container'", "'{'", "'}'", "'readOnly'", "'Char'", "'Short'", "'Integer'", "'Long'", "'Float'", "'Double'", "'Complex'", "'String'", "'Boolean'", "'Angle'", "'AngularRate'", "'Flux'", "'Frequency'", "'Humidity'", "'Length'", "'Pressure'", "'Speed'", "'Temperature'", "'Tag'", "'Entity'", "'EntityId'", "'EntityRef'", "'Interval'", "'ArrayTime'", "'ArrayTimeInterval'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=4;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalContainerParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalContainerParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalContainerParser.tokenNames; }
    public String getGrammarFileName() { return "InternalContainer.g"; }



     	private ContainerGrammarAccess grammarAccess;

        public InternalContainerParser(TokenStream input, ContainerGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Container";
       	}

       	@Override
       	protected ContainerGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleContainer"
    // InternalContainer.g:64:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalContainer.g:64:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalContainer.g:65:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalContainer.g:71:1: ruleContainer returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'container' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_data_4_0= ruleContainerField ) )* otherlv_5= '}' ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_data_4_0 = null;



        	enterRule();

        try {
            // InternalContainer.g:77:2: ( ( ( (lv_doc_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'container' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_data_4_0= ruleContainerField ) )* otherlv_5= '}' ) )
            // InternalContainer.g:78:2: ( ( (lv_doc_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'container' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_data_4_0= ruleContainerField ) )* otherlv_5= '}' )
            {
            // InternalContainer.g:78:2: ( ( (lv_doc_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'container' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_data_4_0= ruleContainerField ) )* otherlv_5= '}' )
            // InternalContainer.g:79:3: ( (lv_doc_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'container' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_data_4_0= ruleContainerField ) )* otherlv_5= '}'
            {
            // InternalContainer.g:79:3: ( (lv_doc_0_0= RULE_ML_COMMENT ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ML_COMMENT) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalContainer.g:80:4: (lv_doc_0_0= RULE_ML_COMMENT )
                    {
                    // InternalContainer.g:80:4: (lv_doc_0_0= RULE_ML_COMMENT )
                    // InternalContainer.g:81:5: lv_doc_0_0= RULE_ML_COMMENT
                    {
                    lv_doc_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_3); 

                    					newLeafNode(lv_doc_0_0, grammarAccess.getContainerAccess().getDocML_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContainerRule());
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

            			newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1());
            		
            // InternalContainer.g:101:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalContainer.g:102:4: (lv_name_2_0= RULE_ID )
            {
            // InternalContainer.g:102:4: (lv_name_2_0= RULE_ID )
            // InternalContainer.g:103:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalContainer.g:123:3: ( (lv_data_4_0= ruleContainerField ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=15 && LA2_0<=39)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalContainer.g:124:4: (lv_data_4_0= ruleContainerField )
            	    {
            	    // InternalContainer.g:124:4: (lv_data_4_0= ruleContainerField )
            	    // InternalContainer.g:125:5: lv_data_4_0= ruleContainerField
            	    {

            	    					newCompositeNode(grammarAccess.getContainerAccess().getDataContainerFieldParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_data_4_0=ruleContainerField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContainerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"data",
            	    						lv_data_4_0,
            	    						"org.xtext.alma.container.Container.ContainerField");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleContainerField"
    // InternalContainer.g:150:1: entryRuleContainerField returns [EObject current=null] : iv_ruleContainerField= ruleContainerField EOF ;
    public final EObject entryRuleContainerField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerField = null;


        try {
            // InternalContainer.g:150:55: (iv_ruleContainerField= ruleContainerField EOF )
            // InternalContainer.g:151:2: iv_ruleContainerField= ruleContainerField EOF
            {
             newCompositeNode(grammarAccess.getContainerFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainerField=ruleContainerField();

            state._fsp--;

             current =iv_ruleContainerField; 
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
    // $ANTLR end "entryRuleContainerField"


    // $ANTLR start "ruleContainerField"
    // InternalContainer.g:157:1: ruleContainerField returns [EObject current=null] : ( ( (lv_primitiveType_0_0= rulePrimitiveTypes ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_readOnly_2_0= 'readOnly' ) )? ( (lv_initValue_3_0= RULE_STRING ) )? ( (lv_doc_4_0= RULE_ML_COMMENT ) )? ) ;
    public final EObject ruleContainerField() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_readOnly_2_0=null;
        Token lv_initValue_3_0=null;
        Token lv_doc_4_0=null;
        AntlrDatatypeRuleToken lv_primitiveType_0_0 = null;



        	enterRule();

        try {
            // InternalContainer.g:163:2: ( ( ( (lv_primitiveType_0_0= rulePrimitiveTypes ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_readOnly_2_0= 'readOnly' ) )? ( (lv_initValue_3_0= RULE_STRING ) )? ( (lv_doc_4_0= RULE_ML_COMMENT ) )? ) )
            // InternalContainer.g:164:2: ( ( (lv_primitiveType_0_0= rulePrimitiveTypes ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_readOnly_2_0= 'readOnly' ) )? ( (lv_initValue_3_0= RULE_STRING ) )? ( (lv_doc_4_0= RULE_ML_COMMENT ) )? )
            {
            // InternalContainer.g:164:2: ( ( (lv_primitiveType_0_0= rulePrimitiveTypes ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_readOnly_2_0= 'readOnly' ) )? ( (lv_initValue_3_0= RULE_STRING ) )? ( (lv_doc_4_0= RULE_ML_COMMENT ) )? )
            // InternalContainer.g:165:3: ( (lv_primitiveType_0_0= rulePrimitiveTypes ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_readOnly_2_0= 'readOnly' ) )? ( (lv_initValue_3_0= RULE_STRING ) )? ( (lv_doc_4_0= RULE_ML_COMMENT ) )?
            {
            // InternalContainer.g:165:3: ( (lv_primitiveType_0_0= rulePrimitiveTypes ) )
            // InternalContainer.g:166:4: (lv_primitiveType_0_0= rulePrimitiveTypes )
            {
            // InternalContainer.g:166:4: (lv_primitiveType_0_0= rulePrimitiveTypes )
            // InternalContainer.g:167:5: lv_primitiveType_0_0= rulePrimitiveTypes
            {

            					newCompositeNode(grammarAccess.getContainerFieldAccess().getPrimitiveTypePrimitiveTypesParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_primitiveType_0_0=rulePrimitiveTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainerFieldRule());
            					}
            					set(
            						current,
            						"primitiveType",
            						lv_primitiveType_0_0,
            						"org.xtext.alma.container.Container.PrimitiveTypes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalContainer.g:184:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalContainer.g:185:4: (lv_name_1_0= RULE_ID )
            {
            // InternalContainer.g:185:4: (lv_name_1_0= RULE_ID )
            // InternalContainer.g:186:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContainerFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainerFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalContainer.g:202:3: ( (lv_readOnly_2_0= 'readOnly' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalContainer.g:203:4: (lv_readOnly_2_0= 'readOnly' )
                    {
                    // InternalContainer.g:203:4: (lv_readOnly_2_0= 'readOnly' )
                    // InternalContainer.g:204:5: lv_readOnly_2_0= 'readOnly'
                    {
                    lv_readOnly_2_0=(Token)match(input,14,FOLLOW_8); 

                    					newLeafNode(lv_readOnly_2_0, grammarAccess.getContainerFieldAccess().getReadOnlyReadOnlyKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContainerFieldRule());
                    					}
                    					setWithLastConsumed(current, "readOnly", true, "readOnly");
                    				

                    }


                    }
                    break;

            }

            // InternalContainer.g:216:3: ( (lv_initValue_3_0= RULE_STRING ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalContainer.g:217:4: (lv_initValue_3_0= RULE_STRING )
                    {
                    // InternalContainer.g:217:4: (lv_initValue_3_0= RULE_STRING )
                    // InternalContainer.g:218:5: lv_initValue_3_0= RULE_STRING
                    {
                    lv_initValue_3_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    					newLeafNode(lv_initValue_3_0, grammarAccess.getContainerFieldAccess().getInitValueSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContainerFieldRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"initValue",
                    						lv_initValue_3_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalContainer.g:234:3: ( (lv_doc_4_0= RULE_ML_COMMENT ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ML_COMMENT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalContainer.g:235:4: (lv_doc_4_0= RULE_ML_COMMENT )
                    {
                    // InternalContainer.g:235:4: (lv_doc_4_0= RULE_ML_COMMENT )
                    // InternalContainer.g:236:5: lv_doc_4_0= RULE_ML_COMMENT
                    {
                    lv_doc_4_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_2); 

                    					newLeafNode(lv_doc_4_0, grammarAccess.getContainerFieldAccess().getDocML_COMMENTTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContainerFieldRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"doc",
                    						lv_doc_4_0,
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
    // $ANTLR end "ruleContainerField"


    // $ANTLR start "entryRulePrimitiveTypes"
    // InternalContainer.g:256:1: entryRulePrimitiveTypes returns [String current=null] : iv_rulePrimitiveTypes= rulePrimitiveTypes EOF ;
    public final String entryRulePrimitiveTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypes = null;


        try {
            // InternalContainer.g:256:54: (iv_rulePrimitiveTypes= rulePrimitiveTypes EOF )
            // InternalContainer.g:257:2: iv_rulePrimitiveTypes= rulePrimitiveTypes EOF
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
    // InternalContainer.g:263:1: rulePrimitiveTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BasicType_0= ruleBasicType | this_PhysicalType_1= rulePhysicalType | this_TechnicalType_2= ruleTechnicalType | this_TimeType_3= ruleTimeType ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_BasicType_0 = null;

        AntlrDatatypeRuleToken this_PhysicalType_1 = null;

        AntlrDatatypeRuleToken this_TechnicalType_2 = null;

        AntlrDatatypeRuleToken this_TimeType_3 = null;



        	enterRule();

        try {
            // InternalContainer.g:269:2: ( (this_BasicType_0= ruleBasicType | this_PhysicalType_1= rulePhysicalType | this_TechnicalType_2= ruleTechnicalType | this_TimeType_3= ruleTimeType ) )
            // InternalContainer.g:270:2: (this_BasicType_0= ruleBasicType | this_PhysicalType_1= rulePhysicalType | this_TechnicalType_2= ruleTechnicalType | this_TimeType_3= ruleTimeType )
            {
            // InternalContainer.g:270:2: (this_BasicType_0= ruleBasicType | this_PhysicalType_1= rulePhysicalType | this_TechnicalType_2= ruleTechnicalType | this_TimeType_3= ruleTimeType )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                {
                alt6=1;
                }
                break;
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                {
                alt6=2;
                }
                break;
            case 33:
            case 34:
            case 35:
            case 36:
                {
                alt6=3;
                }
                break;
            case 37:
            case 38:
            case 39:
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
                    // InternalContainer.g:271:3: this_BasicType_0= ruleBasicType
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
                    // InternalContainer.g:282:3: this_PhysicalType_1= rulePhysicalType
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
                    // InternalContainer.g:293:3: this_TechnicalType_2= ruleTechnicalType
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
                    // InternalContainer.g:304:3: this_TimeType_3= ruleTimeType
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
    // InternalContainer.g:318:1: entryRuleBasicType returns [String current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final String entryRuleBasicType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasicType = null;


        try {
            // InternalContainer.g:318:49: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalContainer.g:319:2: iv_ruleBasicType= ruleBasicType EOF
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
    // InternalContainer.g:325:1: ruleBasicType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Char' | kw= 'Short' | kw= 'Integer' | kw= 'Long' | kw= 'Float' | kw= 'Double' | kw= 'Complex' | kw= 'String' | kw= 'Boolean' ) ;
    public final AntlrDatatypeRuleToken ruleBasicType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalContainer.g:331:2: ( (kw= 'Char' | kw= 'Short' | kw= 'Integer' | kw= 'Long' | kw= 'Float' | kw= 'Double' | kw= 'Complex' | kw= 'String' | kw= 'Boolean' ) )
            // InternalContainer.g:332:2: (kw= 'Char' | kw= 'Short' | kw= 'Integer' | kw= 'Long' | kw= 'Float' | kw= 'Double' | kw= 'Complex' | kw= 'String' | kw= 'Boolean' )
            {
            // InternalContainer.g:332:2: (kw= 'Char' | kw= 'Short' | kw= 'Integer' | kw= 'Long' | kw= 'Float' | kw= 'Double' | kw= 'Complex' | kw= 'String' | kw= 'Boolean' )
            int alt7=9;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt7=1;
                }
                break;
            case 16:
                {
                alt7=2;
                }
                break;
            case 17:
                {
                alt7=3;
                }
                break;
            case 18:
                {
                alt7=4;
                }
                break;
            case 19:
                {
                alt7=5;
                }
                break;
            case 20:
                {
                alt7=6;
                }
                break;
            case 21:
                {
                alt7=7;
                }
                break;
            case 22:
                {
                alt7=8;
                }
                break;
            case 23:
                {
                alt7=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalContainer.g:333:3: kw= 'Char'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getCharKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalContainer.g:339:3: kw= 'Short'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getShortKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalContainer.g:345:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getIntegerKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalContainer.g:351:3: kw= 'Long'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getLongKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalContainer.g:357:3: kw= 'Float'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getFloatKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalContainer.g:363:3: kw= 'Double'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getDoubleKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalContainer.g:369:3: kw= 'Complex'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getComplexKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalContainer.g:375:3: kw= 'String'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getStringKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalContainer.g:381:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

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
    // InternalContainer.g:390:1: entryRulePhysicalType returns [String current=null] : iv_rulePhysicalType= rulePhysicalType EOF ;
    public final String entryRulePhysicalType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePhysicalType = null;


        try {
            // InternalContainer.g:390:52: (iv_rulePhysicalType= rulePhysicalType EOF )
            // InternalContainer.g:391:2: iv_rulePhysicalType= rulePhysicalType EOF
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
    // InternalContainer.g:397:1: rulePhysicalType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Angle' | kw= 'AngularRate' | kw= 'Flux' | kw= 'Frequency' | kw= 'Humidity' | kw= 'Length' | kw= 'Pressure' | kw= 'Speed' | kw= 'Temperature' ) ;
    public final AntlrDatatypeRuleToken rulePhysicalType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalContainer.g:403:2: ( (kw= 'Angle' | kw= 'AngularRate' | kw= 'Flux' | kw= 'Frequency' | kw= 'Humidity' | kw= 'Length' | kw= 'Pressure' | kw= 'Speed' | kw= 'Temperature' ) )
            // InternalContainer.g:404:2: (kw= 'Angle' | kw= 'AngularRate' | kw= 'Flux' | kw= 'Frequency' | kw= 'Humidity' | kw= 'Length' | kw= 'Pressure' | kw= 'Speed' | kw= 'Temperature' )
            {
            // InternalContainer.g:404:2: (kw= 'Angle' | kw= 'AngularRate' | kw= 'Flux' | kw= 'Frequency' | kw= 'Humidity' | kw= 'Length' | kw= 'Pressure' | kw= 'Speed' | kw= 'Temperature' )
            int alt8=9;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt8=1;
                }
                break;
            case 25:
                {
                alt8=2;
                }
                break;
            case 26:
                {
                alt8=3;
                }
                break;
            case 27:
                {
                alt8=4;
                }
                break;
            case 28:
                {
                alt8=5;
                }
                break;
            case 29:
                {
                alt8=6;
                }
                break;
            case 30:
                {
                alt8=7;
                }
                break;
            case 31:
                {
                alt8=8;
                }
                break;
            case 32:
                {
                alt8=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalContainer.g:405:3: kw= 'Angle'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPhysicalTypeAccess().getAngleKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalContainer.g:411:3: kw= 'AngularRate'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPhysicalTypeAccess().getAngularRateKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalContainer.g:417:3: kw= 'Flux'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPhysicalTypeAccess().getFluxKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalContainer.g:423:3: kw= 'Frequency'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPhysicalTypeAccess().getFrequencyKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalContainer.g:429:3: kw= 'Humidity'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPhysicalTypeAccess().getHumidityKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalContainer.g:435:3: kw= 'Length'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPhysicalTypeAccess().getLengthKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalContainer.g:441:3: kw= 'Pressure'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPhysicalTypeAccess().getPressureKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalContainer.g:447:3: kw= 'Speed'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPhysicalTypeAccess().getSpeedKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalContainer.g:453:3: kw= 'Temperature'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

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
    // InternalContainer.g:462:1: entryRuleTechnicalType returns [String current=null] : iv_ruleTechnicalType= ruleTechnicalType EOF ;
    public final String entryRuleTechnicalType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTechnicalType = null;


        try {
            // InternalContainer.g:462:53: (iv_ruleTechnicalType= ruleTechnicalType EOF )
            // InternalContainer.g:463:2: iv_ruleTechnicalType= ruleTechnicalType EOF
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
    // InternalContainer.g:469:1: ruleTechnicalType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Tag' | kw= 'Entity' | kw= 'EntityId' | kw= 'EntityRef' ) ;
    public final AntlrDatatypeRuleToken ruleTechnicalType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalContainer.g:475:2: ( (kw= 'Tag' | kw= 'Entity' | kw= 'EntityId' | kw= 'EntityRef' ) )
            // InternalContainer.g:476:2: (kw= 'Tag' | kw= 'Entity' | kw= 'EntityId' | kw= 'EntityRef' )
            {
            // InternalContainer.g:476:2: (kw= 'Tag' | kw= 'Entity' | kw= 'EntityId' | kw= 'EntityRef' )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt9=1;
                }
                break;
            case 34:
                {
                alt9=2;
                }
                break;
            case 35:
                {
                alt9=3;
                }
                break;
            case 36:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalContainer.g:477:3: kw= 'Tag'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTechnicalTypeAccess().getTagKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalContainer.g:483:3: kw= 'Entity'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTechnicalTypeAccess().getEntityKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalContainer.g:489:3: kw= 'EntityId'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTechnicalTypeAccess().getEntityIdKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalContainer.g:495:3: kw= 'EntityRef'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

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
    // InternalContainer.g:504:1: entryRuleTimeType returns [String current=null] : iv_ruleTimeType= ruleTimeType EOF ;
    public final String entryRuleTimeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimeType = null;


        try {
            // InternalContainer.g:504:48: (iv_ruleTimeType= ruleTimeType EOF )
            // InternalContainer.g:505:2: iv_ruleTimeType= ruleTimeType EOF
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
    // InternalContainer.g:511:1: ruleTimeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Interval' | kw= 'ArrayTime' | kw= 'ArrayTimeInterval' ) ;
    public final AntlrDatatypeRuleToken ruleTimeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalContainer.g:517:2: ( (kw= 'Interval' | kw= 'ArrayTime' | kw= 'ArrayTimeInterval' ) )
            // InternalContainer.g:518:2: (kw= 'Interval' | kw= 'ArrayTime' | kw= 'ArrayTimeInterval' )
            {
            // InternalContainer.g:518:2: (kw= 'Interval' | kw= 'ArrayTime' | kw= 'ArrayTimeInterval' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt10=1;
                }
                break;
            case 38:
                {
                alt10=2;
                }
                break;
            case 39:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalContainer.g:519:3: kw= 'Interval'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTimeTypeAccess().getIntervalKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalContainer.g:525:3: kw= 'ArrayTime'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTimeTypeAccess().getArrayTimeKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalContainer.g:531:3: kw= 'ArrayTimeInterval'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000FFFFFFA000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004052L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});

}