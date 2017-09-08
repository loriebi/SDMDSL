package org.xtext.alma.enumeration.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.alma.enumeration.services.EnumerationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEnumerationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'version'", "'revision'", "'xmlns'", "'enum'", "'{'", "'}'", "','"
    };
    public static final int RULE_ID=7;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=4;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalEnumerationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEnumerationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEnumerationParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEnumeration.g"; }



     	private EnumerationGrammarAccess grammarAccess;

        public InternalEnumerationParser(TokenStream input, EnumerationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EnumType";
       	}

       	@Override
       	protected EnumerationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEnumType"
    // InternalEnumeration.g:64:1: entryRuleEnumType returns [EObject current=null] : iv_ruleEnumType= ruleEnumType EOF ;
    public final EObject entryRuleEnumType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumType = null;


        try {
            // InternalEnumeration.g:64:49: (iv_ruleEnumType= ruleEnumType EOF )
            // InternalEnumeration.g:65:2: iv_ruleEnumType= ruleEnumType EOF
            {
             newCompositeNode(grammarAccess.getEnumTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumType=ruleEnumType();

            state._fsp--;

             current =iv_ruleEnumType; 
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
    // $ANTLR end "entryRuleEnumType"


    // $ANTLR start "ruleEnumType"
    // InternalEnumeration.g:71:1: ruleEnumType returns [EObject current=null] : ( ( (lv_docGlobal_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'version' ( (lv_version_2_0= RULE_INT ) ) otherlv_3= 'revision' ( (lv_revision_4_0= RULE_STRING ) ) otherlv_5= 'xmlns' ( (lv_xmlns_6_0= RULE_STRING ) ) ( (lv_docEnum_7_0= RULE_ML_COMMENT ) )? otherlv_8= 'enum' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '{' ( (lv_values_11_0= ruleEnumValueWithoutComma ) ) ( (lv_values_12_0= ruleEnumValue ) )* otherlv_13= '}' ) ;
    public final EObject ruleEnumType() throws RecognitionException {
        EObject current = null;

        Token lv_docGlobal_0_0=null;
        Token otherlv_1=null;
        Token lv_version_2_0=null;
        Token otherlv_3=null;
        Token lv_revision_4_0=null;
        Token otherlv_5=null;
        Token lv_xmlns_6_0=null;
        Token lv_docEnum_7_0=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        EObject lv_values_11_0 = null;

        EObject lv_values_12_0 = null;



        	enterRule();

        try {
            // InternalEnumeration.g:77:2: ( ( ( (lv_docGlobal_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'version' ( (lv_version_2_0= RULE_INT ) ) otherlv_3= 'revision' ( (lv_revision_4_0= RULE_STRING ) ) otherlv_5= 'xmlns' ( (lv_xmlns_6_0= RULE_STRING ) ) ( (lv_docEnum_7_0= RULE_ML_COMMENT ) )? otherlv_8= 'enum' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '{' ( (lv_values_11_0= ruleEnumValueWithoutComma ) ) ( (lv_values_12_0= ruleEnumValue ) )* otherlv_13= '}' ) )
            // InternalEnumeration.g:78:2: ( ( (lv_docGlobal_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'version' ( (lv_version_2_0= RULE_INT ) ) otherlv_3= 'revision' ( (lv_revision_4_0= RULE_STRING ) ) otherlv_5= 'xmlns' ( (lv_xmlns_6_0= RULE_STRING ) ) ( (lv_docEnum_7_0= RULE_ML_COMMENT ) )? otherlv_8= 'enum' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '{' ( (lv_values_11_0= ruleEnumValueWithoutComma ) ) ( (lv_values_12_0= ruleEnumValue ) )* otherlv_13= '}' )
            {
            // InternalEnumeration.g:78:2: ( ( (lv_docGlobal_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'version' ( (lv_version_2_0= RULE_INT ) ) otherlv_3= 'revision' ( (lv_revision_4_0= RULE_STRING ) ) otherlv_5= 'xmlns' ( (lv_xmlns_6_0= RULE_STRING ) ) ( (lv_docEnum_7_0= RULE_ML_COMMENT ) )? otherlv_8= 'enum' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '{' ( (lv_values_11_0= ruleEnumValueWithoutComma ) ) ( (lv_values_12_0= ruleEnumValue ) )* otherlv_13= '}' )
            // InternalEnumeration.g:79:3: ( (lv_docGlobal_0_0= RULE_ML_COMMENT ) )? otherlv_1= 'version' ( (lv_version_2_0= RULE_INT ) ) otherlv_3= 'revision' ( (lv_revision_4_0= RULE_STRING ) ) otherlv_5= 'xmlns' ( (lv_xmlns_6_0= RULE_STRING ) ) ( (lv_docEnum_7_0= RULE_ML_COMMENT ) )? otherlv_8= 'enum' ( (lv_name_9_0= RULE_ID ) ) otherlv_10= '{' ( (lv_values_11_0= ruleEnumValueWithoutComma ) ) ( (lv_values_12_0= ruleEnumValue ) )* otherlv_13= '}'
            {
            // InternalEnumeration.g:79:3: ( (lv_docGlobal_0_0= RULE_ML_COMMENT ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ML_COMMENT) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalEnumeration.g:80:4: (lv_docGlobal_0_0= RULE_ML_COMMENT )
                    {
                    // InternalEnumeration.g:80:4: (lv_docGlobal_0_0= RULE_ML_COMMENT )
                    // InternalEnumeration.g:81:5: lv_docGlobal_0_0= RULE_ML_COMMENT
                    {
                    lv_docGlobal_0_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_3); 

                    					newLeafNode(lv_docGlobal_0_0, grammarAccess.getEnumTypeAccess().getDocGlobalML_COMMENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEnumTypeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"docGlobal",
                    						lv_docGlobal_0_0,
                    						"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumTypeAccess().getVersionKeyword_1());
            		
            // InternalEnumeration.g:101:3: ( (lv_version_2_0= RULE_INT ) )
            // InternalEnumeration.g:102:4: (lv_version_2_0= RULE_INT )
            {
            // InternalEnumeration.g:102:4: (lv_version_2_0= RULE_INT )
            // InternalEnumeration.g:103:5: lv_version_2_0= RULE_INT
            {
            lv_version_2_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            					newLeafNode(lv_version_2_0, grammarAccess.getEnumTypeAccess().getVersionINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"version",
            						lv_version_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumTypeAccess().getRevisionKeyword_3());
            		
            // InternalEnumeration.g:123:3: ( (lv_revision_4_0= RULE_STRING ) )
            // InternalEnumeration.g:124:4: (lv_revision_4_0= RULE_STRING )
            {
            // InternalEnumeration.g:124:4: (lv_revision_4_0= RULE_STRING )
            // InternalEnumeration.g:125:5: lv_revision_4_0= RULE_STRING
            {
            lv_revision_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_revision_4_0, grammarAccess.getEnumTypeAccess().getRevisionSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"revision",
            						lv_revision_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getEnumTypeAccess().getXmlnsKeyword_5());
            		
            // InternalEnumeration.g:145:3: ( (lv_xmlns_6_0= RULE_STRING ) )
            // InternalEnumeration.g:146:4: (lv_xmlns_6_0= RULE_STRING )
            {
            // InternalEnumeration.g:146:4: (lv_xmlns_6_0= RULE_STRING )
            // InternalEnumeration.g:147:5: lv_xmlns_6_0= RULE_STRING
            {
            lv_xmlns_6_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_xmlns_6_0, grammarAccess.getEnumTypeAccess().getXmlnsSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"xmlns",
            						lv_xmlns_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalEnumeration.g:163:3: ( (lv_docEnum_7_0= RULE_ML_COMMENT ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ML_COMMENT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEnumeration.g:164:4: (lv_docEnum_7_0= RULE_ML_COMMENT )
                    {
                    // InternalEnumeration.g:164:4: (lv_docEnum_7_0= RULE_ML_COMMENT )
                    // InternalEnumeration.g:165:5: lv_docEnum_7_0= RULE_ML_COMMENT
                    {
                    lv_docEnum_7_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_9); 

                    					newLeafNode(lv_docEnum_7_0, grammarAccess.getEnumTypeAccess().getDocEnumML_COMMENTTerminalRuleCall_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEnumTypeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"docEnum",
                    						lv_docEnum_7_0,
                    						"org.eclipse.xtext.common.Terminals.ML_COMMENT");
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getEnumTypeAccess().getEnumKeyword_8());
            		
            // InternalEnumeration.g:185:3: ( (lv_name_9_0= RULE_ID ) )
            // InternalEnumeration.g:186:4: (lv_name_9_0= RULE_ID )
            {
            // InternalEnumeration.g:186:4: (lv_name_9_0= RULE_ID )
            // InternalEnumeration.g:187:5: lv_name_9_0= RULE_ID
            {
            lv_name_9_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_9_0, grammarAccess.getEnumTypeAccess().getNameIDTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_9_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalEnumeration.g:207:3: ( (lv_values_11_0= ruleEnumValueWithoutComma ) )
            // InternalEnumeration.g:208:4: (lv_values_11_0= ruleEnumValueWithoutComma )
            {
            // InternalEnumeration.g:208:4: (lv_values_11_0= ruleEnumValueWithoutComma )
            // InternalEnumeration.g:209:5: lv_values_11_0= ruleEnumValueWithoutComma
            {

            					newCompositeNode(grammarAccess.getEnumTypeAccess().getValuesEnumValueWithoutCommaParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_12);
            lv_values_11_0=ruleEnumValueWithoutComma();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumTypeRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_11_0,
            						"org.xtext.alma.enumeration.Enumeration.EnumValueWithoutComma");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEnumeration.g:226:3: ( (lv_values_12_0= ruleEnumValue ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEnumeration.g:227:4: (lv_values_12_0= ruleEnumValue )
            	    {
            	    // InternalEnumeration.g:227:4: (lv_values_12_0= ruleEnumValue )
            	    // InternalEnumeration.g:228:5: lv_values_12_0= ruleEnumValue
            	    {

            	    					newCompositeNode(grammarAccess.getEnumTypeAccess().getValuesEnumValueParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_values_12_0=ruleEnumValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEnumTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"values",
            	    						lv_values_12_0,
            	    						"org.xtext.alma.enumeration.Enumeration.EnumValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_13=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleEnumType"


    // $ANTLR start "entryRuleEnumValueWithoutComma"
    // InternalEnumeration.g:253:1: entryRuleEnumValueWithoutComma returns [EObject current=null] : iv_ruleEnumValueWithoutComma= ruleEnumValueWithoutComma EOF ;
    public final EObject entryRuleEnumValueWithoutComma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValueWithoutComma = null;


        try {
            // InternalEnumeration.g:253:62: (iv_ruleEnumValueWithoutComma= ruleEnumValueWithoutComma EOF )
            // InternalEnumeration.g:254:2: iv_ruleEnumValueWithoutComma= ruleEnumValueWithoutComma EOF
            {
             newCompositeNode(grammarAccess.getEnumValueWithoutCommaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumValueWithoutComma=ruleEnumValueWithoutComma();

            state._fsp--;

             current =iv_ruleEnumValueWithoutComma; 
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
    // $ANTLR end "entryRuleEnumValueWithoutComma"


    // $ANTLR start "ruleEnumValueWithoutComma"
    // InternalEnumeration.g:260:1: ruleEnumValueWithoutComma returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_doc_1_0= RULE_ML_COMMENT ) )? ) ;
    public final EObject ruleEnumValueWithoutComma() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_doc_1_0=null;


        	enterRule();

        try {
            // InternalEnumeration.g:266:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_doc_1_0= RULE_ML_COMMENT ) )? ) )
            // InternalEnumeration.g:267:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_doc_1_0= RULE_ML_COMMENT ) )? )
            {
            // InternalEnumeration.g:267:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_doc_1_0= RULE_ML_COMMENT ) )? )
            // InternalEnumeration.g:268:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_doc_1_0= RULE_ML_COMMENT ) )?
            {
            // InternalEnumeration.g:268:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEnumeration.g:269:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEnumeration.g:269:4: (lv_name_0_0= RULE_ID )
            // InternalEnumeration.g:270:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEnumValueWithoutCommaAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumValueWithoutCommaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEnumeration.g:286:3: ( (lv_doc_1_0= RULE_ML_COMMENT ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ML_COMMENT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEnumeration.g:287:4: (lv_doc_1_0= RULE_ML_COMMENT )
                    {
                    // InternalEnumeration.g:287:4: (lv_doc_1_0= RULE_ML_COMMENT )
                    // InternalEnumeration.g:288:5: lv_doc_1_0= RULE_ML_COMMENT
                    {
                    lv_doc_1_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_2); 

                    					newLeafNode(lv_doc_1_0, grammarAccess.getEnumValueWithoutCommaAccess().getDocML_COMMENTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEnumValueWithoutCommaRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"doc",
                    						lv_doc_1_0,
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
    // $ANTLR end "ruleEnumValueWithoutComma"


    // $ANTLR start "entryRuleEnumValue"
    // InternalEnumeration.g:308:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // InternalEnumeration.g:308:50: (iv_ruleEnumValue= ruleEnumValue EOF )
            // InternalEnumeration.g:309:2: iv_ruleEnumValue= ruleEnumValue EOF
            {
             newCompositeNode(grammarAccess.getEnumValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumValue=ruleEnumValue();

            state._fsp--;

             current =iv_ruleEnumValue; 
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
    // $ANTLR end "entryRuleEnumValue"


    // $ANTLR start "ruleEnumValue"
    // InternalEnumeration.g:315:1: ruleEnumValue returns [EObject current=null] : (otherlv_0= ',' ( (lv_name_1_0= RULE_ID ) ) ( (lv_doc_2_0= RULE_ML_COMMENT ) )? ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_doc_2_0=null;


        	enterRule();

        try {
            // InternalEnumeration.g:321:2: ( (otherlv_0= ',' ( (lv_name_1_0= RULE_ID ) ) ( (lv_doc_2_0= RULE_ML_COMMENT ) )? ) )
            // InternalEnumeration.g:322:2: (otherlv_0= ',' ( (lv_name_1_0= RULE_ID ) ) ( (lv_doc_2_0= RULE_ML_COMMENT ) )? )
            {
            // InternalEnumeration.g:322:2: (otherlv_0= ',' ( (lv_name_1_0= RULE_ID ) ) ( (lv_doc_2_0= RULE_ML_COMMENT ) )? )
            // InternalEnumeration.g:323:3: otherlv_0= ',' ( (lv_name_1_0= RULE_ID ) ) ( (lv_doc_2_0= RULE_ML_COMMENT ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumValueAccess().getCommaKeyword_0());
            		
            // InternalEnumeration.g:327:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEnumeration.g:328:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEnumeration.g:328:4: (lv_name_1_0= RULE_ID )
            // InternalEnumeration.g:329:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnumValueAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEnumeration.g:345:3: ( (lv_doc_2_0= RULE_ML_COMMENT ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ML_COMMENT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEnumeration.g:346:4: (lv_doc_2_0= RULE_ML_COMMENT )
                    {
                    // InternalEnumeration.g:346:4: (lv_doc_2_0= RULE_ML_COMMENT )
                    // InternalEnumeration.g:347:5: lv_doc_2_0= RULE_ML_COMMENT
                    {
                    lv_doc_2_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_2); 

                    					newLeafNode(lv_doc_2_0, grammarAccess.getEnumValueAccess().getDocML_COMMENTTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEnumValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"doc",
                    						lv_doc_2_0,
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
    // $ANTLR end "ruleEnumValue"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000012L});

}