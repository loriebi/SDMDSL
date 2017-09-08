package org.xtext.alma.enumeration.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.alma.enumeration.services.EnumerationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEnumerationParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(EnumerationGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleEnumType"
    // InternalEnumeration.g:53:1: entryRuleEnumType : ruleEnumType EOF ;
    public final void entryRuleEnumType() throws RecognitionException {
        try {
            // InternalEnumeration.g:54:1: ( ruleEnumType EOF )
            // InternalEnumeration.g:55:1: ruleEnumType EOF
            {
             before(grammarAccess.getEnumTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumType();

            state._fsp--;

             after(grammarAccess.getEnumTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumType"


    // $ANTLR start "ruleEnumType"
    // InternalEnumeration.g:62:1: ruleEnumType : ( ( rule__EnumType__Group__0 ) ) ;
    public final void ruleEnumType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:66:2: ( ( ( rule__EnumType__Group__0 ) ) )
            // InternalEnumeration.g:67:2: ( ( rule__EnumType__Group__0 ) )
            {
            // InternalEnumeration.g:67:2: ( ( rule__EnumType__Group__0 ) )
            // InternalEnumeration.g:68:3: ( rule__EnumType__Group__0 )
            {
             before(grammarAccess.getEnumTypeAccess().getGroup()); 
            // InternalEnumeration.g:69:3: ( rule__EnumType__Group__0 )
            // InternalEnumeration.g:69:4: rule__EnumType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumType"


    // $ANTLR start "entryRuleEnumValueWithoutComma"
    // InternalEnumeration.g:78:1: entryRuleEnumValueWithoutComma : ruleEnumValueWithoutComma EOF ;
    public final void entryRuleEnumValueWithoutComma() throws RecognitionException {
        try {
            // InternalEnumeration.g:79:1: ( ruleEnumValueWithoutComma EOF )
            // InternalEnumeration.g:80:1: ruleEnumValueWithoutComma EOF
            {
             before(grammarAccess.getEnumValueWithoutCommaRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumValueWithoutComma();

            state._fsp--;

             after(grammarAccess.getEnumValueWithoutCommaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumValueWithoutComma"


    // $ANTLR start "ruleEnumValueWithoutComma"
    // InternalEnumeration.g:87:1: ruleEnumValueWithoutComma : ( ( rule__EnumValueWithoutComma__Group__0 ) ) ;
    public final void ruleEnumValueWithoutComma() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:91:2: ( ( ( rule__EnumValueWithoutComma__Group__0 ) ) )
            // InternalEnumeration.g:92:2: ( ( rule__EnumValueWithoutComma__Group__0 ) )
            {
            // InternalEnumeration.g:92:2: ( ( rule__EnumValueWithoutComma__Group__0 ) )
            // InternalEnumeration.g:93:3: ( rule__EnumValueWithoutComma__Group__0 )
            {
             before(grammarAccess.getEnumValueWithoutCommaAccess().getGroup()); 
            // InternalEnumeration.g:94:3: ( rule__EnumValueWithoutComma__Group__0 )
            // InternalEnumeration.g:94:4: rule__EnumValueWithoutComma__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumValueWithoutComma__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumValueWithoutCommaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumValueWithoutComma"


    // $ANTLR start "entryRuleEnumValue"
    // InternalEnumeration.g:103:1: entryRuleEnumValue : ruleEnumValue EOF ;
    public final void entryRuleEnumValue() throws RecognitionException {
        try {
            // InternalEnumeration.g:104:1: ( ruleEnumValue EOF )
            // InternalEnumeration.g:105:1: ruleEnumValue EOF
            {
             before(grammarAccess.getEnumValueRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumValue();

            state._fsp--;

             after(grammarAccess.getEnumValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumValue"


    // $ANTLR start "ruleEnumValue"
    // InternalEnumeration.g:112:1: ruleEnumValue : ( ( rule__EnumValue__Group__0 ) ) ;
    public final void ruleEnumValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:116:2: ( ( ( rule__EnumValue__Group__0 ) ) )
            // InternalEnumeration.g:117:2: ( ( rule__EnumValue__Group__0 ) )
            {
            // InternalEnumeration.g:117:2: ( ( rule__EnumValue__Group__0 ) )
            // InternalEnumeration.g:118:3: ( rule__EnumValue__Group__0 )
            {
             before(grammarAccess.getEnumValueAccess().getGroup()); 
            // InternalEnumeration.g:119:3: ( rule__EnumValue__Group__0 )
            // InternalEnumeration.g:119:4: rule__EnumValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumValue"


    // $ANTLR start "rule__EnumType__Group__0"
    // InternalEnumeration.g:127:1: rule__EnumType__Group__0 : rule__EnumType__Group__0__Impl rule__EnumType__Group__1 ;
    public final void rule__EnumType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:131:1: ( rule__EnumType__Group__0__Impl rule__EnumType__Group__1 )
            // InternalEnumeration.g:132:2: rule__EnumType__Group__0__Impl rule__EnumType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EnumType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__0"


    // $ANTLR start "rule__EnumType__Group__0__Impl"
    // InternalEnumeration.g:139:1: rule__EnumType__Group__0__Impl : ( ( rule__EnumType__DocGlobalAssignment_0 )? ) ;
    public final void rule__EnumType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:143:1: ( ( ( rule__EnumType__DocGlobalAssignment_0 )? ) )
            // InternalEnumeration.g:144:1: ( ( rule__EnumType__DocGlobalAssignment_0 )? )
            {
            // InternalEnumeration.g:144:1: ( ( rule__EnumType__DocGlobalAssignment_0 )? )
            // InternalEnumeration.g:145:2: ( rule__EnumType__DocGlobalAssignment_0 )?
            {
             before(grammarAccess.getEnumTypeAccess().getDocGlobalAssignment_0()); 
            // InternalEnumeration.g:146:2: ( rule__EnumType__DocGlobalAssignment_0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ML_COMMENT) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalEnumeration.g:146:3: rule__EnumType__DocGlobalAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumType__DocGlobalAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumTypeAccess().getDocGlobalAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__0__Impl"


    // $ANTLR start "rule__EnumType__Group__1"
    // InternalEnumeration.g:154:1: rule__EnumType__Group__1 : rule__EnumType__Group__1__Impl rule__EnumType__Group__2 ;
    public final void rule__EnumType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:158:1: ( rule__EnumType__Group__1__Impl rule__EnumType__Group__2 )
            // InternalEnumeration.g:159:2: rule__EnumType__Group__1__Impl rule__EnumType__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__EnumType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__1"


    // $ANTLR start "rule__EnumType__Group__1__Impl"
    // InternalEnumeration.g:166:1: rule__EnumType__Group__1__Impl : ( 'version' ) ;
    public final void rule__EnumType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:170:1: ( ( 'version' ) )
            // InternalEnumeration.g:171:1: ( 'version' )
            {
            // InternalEnumeration.g:171:1: ( 'version' )
            // InternalEnumeration.g:172:2: 'version'
            {
             before(grammarAccess.getEnumTypeAccess().getVersionKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getVersionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__1__Impl"


    // $ANTLR start "rule__EnumType__Group__2"
    // InternalEnumeration.g:181:1: rule__EnumType__Group__2 : rule__EnumType__Group__2__Impl rule__EnumType__Group__3 ;
    public final void rule__EnumType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:185:1: ( rule__EnumType__Group__2__Impl rule__EnumType__Group__3 )
            // InternalEnumeration.g:186:2: rule__EnumType__Group__2__Impl rule__EnumType__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__EnumType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__2"


    // $ANTLR start "rule__EnumType__Group__2__Impl"
    // InternalEnumeration.g:193:1: rule__EnumType__Group__2__Impl : ( ( rule__EnumType__VersionAssignment_2 ) ) ;
    public final void rule__EnumType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:197:1: ( ( ( rule__EnumType__VersionAssignment_2 ) ) )
            // InternalEnumeration.g:198:1: ( ( rule__EnumType__VersionAssignment_2 ) )
            {
            // InternalEnumeration.g:198:1: ( ( rule__EnumType__VersionAssignment_2 ) )
            // InternalEnumeration.g:199:2: ( rule__EnumType__VersionAssignment_2 )
            {
             before(grammarAccess.getEnumTypeAccess().getVersionAssignment_2()); 
            // InternalEnumeration.g:200:2: ( rule__EnumType__VersionAssignment_2 )
            // InternalEnumeration.g:200:3: rule__EnumType__VersionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EnumType__VersionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getVersionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__2__Impl"


    // $ANTLR start "rule__EnumType__Group__3"
    // InternalEnumeration.g:208:1: rule__EnumType__Group__3 : rule__EnumType__Group__3__Impl rule__EnumType__Group__4 ;
    public final void rule__EnumType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:212:1: ( rule__EnumType__Group__3__Impl rule__EnumType__Group__4 )
            // InternalEnumeration.g:213:2: rule__EnumType__Group__3__Impl rule__EnumType__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__EnumType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__3"


    // $ANTLR start "rule__EnumType__Group__3__Impl"
    // InternalEnumeration.g:220:1: rule__EnumType__Group__3__Impl : ( 'revision' ) ;
    public final void rule__EnumType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:224:1: ( ( 'revision' ) )
            // InternalEnumeration.g:225:1: ( 'revision' )
            {
            // InternalEnumeration.g:225:1: ( 'revision' )
            // InternalEnumeration.g:226:2: 'revision'
            {
             before(grammarAccess.getEnumTypeAccess().getRevisionKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getRevisionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__3__Impl"


    // $ANTLR start "rule__EnumType__Group__4"
    // InternalEnumeration.g:235:1: rule__EnumType__Group__4 : rule__EnumType__Group__4__Impl rule__EnumType__Group__5 ;
    public final void rule__EnumType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:239:1: ( rule__EnumType__Group__4__Impl rule__EnumType__Group__5 )
            // InternalEnumeration.g:240:2: rule__EnumType__Group__4__Impl rule__EnumType__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__EnumType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__4"


    // $ANTLR start "rule__EnumType__Group__4__Impl"
    // InternalEnumeration.g:247:1: rule__EnumType__Group__4__Impl : ( ( rule__EnumType__RevisionAssignment_4 ) ) ;
    public final void rule__EnumType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:251:1: ( ( ( rule__EnumType__RevisionAssignment_4 ) ) )
            // InternalEnumeration.g:252:1: ( ( rule__EnumType__RevisionAssignment_4 ) )
            {
            // InternalEnumeration.g:252:1: ( ( rule__EnumType__RevisionAssignment_4 ) )
            // InternalEnumeration.g:253:2: ( rule__EnumType__RevisionAssignment_4 )
            {
             before(grammarAccess.getEnumTypeAccess().getRevisionAssignment_4()); 
            // InternalEnumeration.g:254:2: ( rule__EnumType__RevisionAssignment_4 )
            // InternalEnumeration.g:254:3: rule__EnumType__RevisionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__EnumType__RevisionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getRevisionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__4__Impl"


    // $ANTLR start "rule__EnumType__Group__5"
    // InternalEnumeration.g:262:1: rule__EnumType__Group__5 : rule__EnumType__Group__5__Impl rule__EnumType__Group__6 ;
    public final void rule__EnumType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:266:1: ( rule__EnumType__Group__5__Impl rule__EnumType__Group__6 )
            // InternalEnumeration.g:267:2: rule__EnumType__Group__5__Impl rule__EnumType__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__EnumType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__5"


    // $ANTLR start "rule__EnumType__Group__5__Impl"
    // InternalEnumeration.g:274:1: rule__EnumType__Group__5__Impl : ( 'xmlns' ) ;
    public final void rule__EnumType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:278:1: ( ( 'xmlns' ) )
            // InternalEnumeration.g:279:1: ( 'xmlns' )
            {
            // InternalEnumeration.g:279:1: ( 'xmlns' )
            // InternalEnumeration.g:280:2: 'xmlns'
            {
             before(grammarAccess.getEnumTypeAccess().getXmlnsKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getXmlnsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__5__Impl"


    // $ANTLR start "rule__EnumType__Group__6"
    // InternalEnumeration.g:289:1: rule__EnumType__Group__6 : rule__EnumType__Group__6__Impl rule__EnumType__Group__7 ;
    public final void rule__EnumType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:293:1: ( rule__EnumType__Group__6__Impl rule__EnumType__Group__7 )
            // InternalEnumeration.g:294:2: rule__EnumType__Group__6__Impl rule__EnumType__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__EnumType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__6"


    // $ANTLR start "rule__EnumType__Group__6__Impl"
    // InternalEnumeration.g:301:1: rule__EnumType__Group__6__Impl : ( ( rule__EnumType__XmlnsAssignment_6 ) ) ;
    public final void rule__EnumType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:305:1: ( ( ( rule__EnumType__XmlnsAssignment_6 ) ) )
            // InternalEnumeration.g:306:1: ( ( rule__EnumType__XmlnsAssignment_6 ) )
            {
            // InternalEnumeration.g:306:1: ( ( rule__EnumType__XmlnsAssignment_6 ) )
            // InternalEnumeration.g:307:2: ( rule__EnumType__XmlnsAssignment_6 )
            {
             before(grammarAccess.getEnumTypeAccess().getXmlnsAssignment_6()); 
            // InternalEnumeration.g:308:2: ( rule__EnumType__XmlnsAssignment_6 )
            // InternalEnumeration.g:308:3: rule__EnumType__XmlnsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__EnumType__XmlnsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getXmlnsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__6__Impl"


    // $ANTLR start "rule__EnumType__Group__7"
    // InternalEnumeration.g:316:1: rule__EnumType__Group__7 : rule__EnumType__Group__7__Impl rule__EnumType__Group__8 ;
    public final void rule__EnumType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:320:1: ( rule__EnumType__Group__7__Impl rule__EnumType__Group__8 )
            // InternalEnumeration.g:321:2: rule__EnumType__Group__7__Impl rule__EnumType__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__EnumType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__7"


    // $ANTLR start "rule__EnumType__Group__7__Impl"
    // InternalEnumeration.g:328:1: rule__EnumType__Group__7__Impl : ( ( rule__EnumType__DocEnumAssignment_7 )? ) ;
    public final void rule__EnumType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:332:1: ( ( ( rule__EnumType__DocEnumAssignment_7 )? ) )
            // InternalEnumeration.g:333:1: ( ( rule__EnumType__DocEnumAssignment_7 )? )
            {
            // InternalEnumeration.g:333:1: ( ( rule__EnumType__DocEnumAssignment_7 )? )
            // InternalEnumeration.g:334:2: ( rule__EnumType__DocEnumAssignment_7 )?
            {
             before(grammarAccess.getEnumTypeAccess().getDocEnumAssignment_7()); 
            // InternalEnumeration.g:335:2: ( rule__EnumType__DocEnumAssignment_7 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ML_COMMENT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEnumeration.g:335:3: rule__EnumType__DocEnumAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumType__DocEnumAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumTypeAccess().getDocEnumAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__7__Impl"


    // $ANTLR start "rule__EnumType__Group__8"
    // InternalEnumeration.g:343:1: rule__EnumType__Group__8 : rule__EnumType__Group__8__Impl rule__EnumType__Group__9 ;
    public final void rule__EnumType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:347:1: ( rule__EnumType__Group__8__Impl rule__EnumType__Group__9 )
            // InternalEnumeration.g:348:2: rule__EnumType__Group__8__Impl rule__EnumType__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__EnumType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__8"


    // $ANTLR start "rule__EnumType__Group__8__Impl"
    // InternalEnumeration.g:355:1: rule__EnumType__Group__8__Impl : ( 'enum' ) ;
    public final void rule__EnumType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:359:1: ( ( 'enum' ) )
            // InternalEnumeration.g:360:1: ( 'enum' )
            {
            // InternalEnumeration.g:360:1: ( 'enum' )
            // InternalEnumeration.g:361:2: 'enum'
            {
             before(grammarAccess.getEnumTypeAccess().getEnumKeyword_8()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getEnumKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__8__Impl"


    // $ANTLR start "rule__EnumType__Group__9"
    // InternalEnumeration.g:370:1: rule__EnumType__Group__9 : rule__EnumType__Group__9__Impl rule__EnumType__Group__10 ;
    public final void rule__EnumType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:374:1: ( rule__EnumType__Group__9__Impl rule__EnumType__Group__10 )
            // InternalEnumeration.g:375:2: rule__EnumType__Group__9__Impl rule__EnumType__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__EnumType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__9"


    // $ANTLR start "rule__EnumType__Group__9__Impl"
    // InternalEnumeration.g:382:1: rule__EnumType__Group__9__Impl : ( ( rule__EnumType__NameAssignment_9 ) ) ;
    public final void rule__EnumType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:386:1: ( ( ( rule__EnumType__NameAssignment_9 ) ) )
            // InternalEnumeration.g:387:1: ( ( rule__EnumType__NameAssignment_9 ) )
            {
            // InternalEnumeration.g:387:1: ( ( rule__EnumType__NameAssignment_9 ) )
            // InternalEnumeration.g:388:2: ( rule__EnumType__NameAssignment_9 )
            {
             before(grammarAccess.getEnumTypeAccess().getNameAssignment_9()); 
            // InternalEnumeration.g:389:2: ( rule__EnumType__NameAssignment_9 )
            // InternalEnumeration.g:389:3: rule__EnumType__NameAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__EnumType__NameAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getNameAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__9__Impl"


    // $ANTLR start "rule__EnumType__Group__10"
    // InternalEnumeration.g:397:1: rule__EnumType__Group__10 : rule__EnumType__Group__10__Impl rule__EnumType__Group__11 ;
    public final void rule__EnumType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:401:1: ( rule__EnumType__Group__10__Impl rule__EnumType__Group__11 )
            // InternalEnumeration.g:402:2: rule__EnumType__Group__10__Impl rule__EnumType__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__EnumType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__10"


    // $ANTLR start "rule__EnumType__Group__10__Impl"
    // InternalEnumeration.g:409:1: rule__EnumType__Group__10__Impl : ( '{' ) ;
    public final void rule__EnumType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:413:1: ( ( '{' ) )
            // InternalEnumeration.g:414:1: ( '{' )
            {
            // InternalEnumeration.g:414:1: ( '{' )
            // InternalEnumeration.g:415:2: '{'
            {
             before(grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getLeftCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__10__Impl"


    // $ANTLR start "rule__EnumType__Group__11"
    // InternalEnumeration.g:424:1: rule__EnumType__Group__11 : rule__EnumType__Group__11__Impl rule__EnumType__Group__12 ;
    public final void rule__EnumType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:428:1: ( rule__EnumType__Group__11__Impl rule__EnumType__Group__12 )
            // InternalEnumeration.g:429:2: rule__EnumType__Group__11__Impl rule__EnumType__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__EnumType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__11"


    // $ANTLR start "rule__EnumType__Group__11__Impl"
    // InternalEnumeration.g:436:1: rule__EnumType__Group__11__Impl : ( ( rule__EnumType__ValuesAssignment_11 ) ) ;
    public final void rule__EnumType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:440:1: ( ( ( rule__EnumType__ValuesAssignment_11 ) ) )
            // InternalEnumeration.g:441:1: ( ( rule__EnumType__ValuesAssignment_11 ) )
            {
            // InternalEnumeration.g:441:1: ( ( rule__EnumType__ValuesAssignment_11 ) )
            // InternalEnumeration.g:442:2: ( rule__EnumType__ValuesAssignment_11 )
            {
             before(grammarAccess.getEnumTypeAccess().getValuesAssignment_11()); 
            // InternalEnumeration.g:443:2: ( rule__EnumType__ValuesAssignment_11 )
            // InternalEnumeration.g:443:3: rule__EnumType__ValuesAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__EnumType__ValuesAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getValuesAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__11__Impl"


    // $ANTLR start "rule__EnumType__Group__12"
    // InternalEnumeration.g:451:1: rule__EnumType__Group__12 : rule__EnumType__Group__12__Impl rule__EnumType__Group__13 ;
    public final void rule__EnumType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:455:1: ( rule__EnumType__Group__12__Impl rule__EnumType__Group__13 )
            // InternalEnumeration.g:456:2: rule__EnumType__Group__12__Impl rule__EnumType__Group__13
            {
            pushFollow(FOLLOW_11);
            rule__EnumType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumType__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__12"


    // $ANTLR start "rule__EnumType__Group__12__Impl"
    // InternalEnumeration.g:463:1: rule__EnumType__Group__12__Impl : ( ( rule__EnumType__ValuesAssignment_12 )* ) ;
    public final void rule__EnumType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:467:1: ( ( ( rule__EnumType__ValuesAssignment_12 )* ) )
            // InternalEnumeration.g:468:1: ( ( rule__EnumType__ValuesAssignment_12 )* )
            {
            // InternalEnumeration.g:468:1: ( ( rule__EnumType__ValuesAssignment_12 )* )
            // InternalEnumeration.g:469:2: ( rule__EnumType__ValuesAssignment_12 )*
            {
             before(grammarAccess.getEnumTypeAccess().getValuesAssignment_12()); 
            // InternalEnumeration.g:470:2: ( rule__EnumType__ValuesAssignment_12 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEnumeration.g:470:3: rule__EnumType__ValuesAssignment_12
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__EnumType__ValuesAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getEnumTypeAccess().getValuesAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__12__Impl"


    // $ANTLR start "rule__EnumType__Group__13"
    // InternalEnumeration.g:478:1: rule__EnumType__Group__13 : rule__EnumType__Group__13__Impl ;
    public final void rule__EnumType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:482:1: ( rule__EnumType__Group__13__Impl )
            // InternalEnumeration.g:483:2: rule__EnumType__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumType__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__13"


    // $ANTLR start "rule__EnumType__Group__13__Impl"
    // InternalEnumeration.g:489:1: rule__EnumType__Group__13__Impl : ( '}' ) ;
    public final void rule__EnumType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:493:1: ( ( '}' ) )
            // InternalEnumeration.g:494:1: ( '}' )
            {
            // InternalEnumeration.g:494:1: ( '}' )
            // InternalEnumeration.g:495:2: '}'
            {
             before(grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_13()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__13__Impl"


    // $ANTLR start "rule__EnumValueWithoutComma__Group__0"
    // InternalEnumeration.g:505:1: rule__EnumValueWithoutComma__Group__0 : rule__EnumValueWithoutComma__Group__0__Impl rule__EnumValueWithoutComma__Group__1 ;
    public final void rule__EnumValueWithoutComma__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:509:1: ( rule__EnumValueWithoutComma__Group__0__Impl rule__EnumValueWithoutComma__Group__1 )
            // InternalEnumeration.g:510:2: rule__EnumValueWithoutComma__Group__0__Impl rule__EnumValueWithoutComma__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__EnumValueWithoutComma__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumValueWithoutComma__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValueWithoutComma__Group__0"


    // $ANTLR start "rule__EnumValueWithoutComma__Group__0__Impl"
    // InternalEnumeration.g:517:1: rule__EnumValueWithoutComma__Group__0__Impl : ( ( rule__EnumValueWithoutComma__NameAssignment_0 ) ) ;
    public final void rule__EnumValueWithoutComma__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:521:1: ( ( ( rule__EnumValueWithoutComma__NameAssignment_0 ) ) )
            // InternalEnumeration.g:522:1: ( ( rule__EnumValueWithoutComma__NameAssignment_0 ) )
            {
            // InternalEnumeration.g:522:1: ( ( rule__EnumValueWithoutComma__NameAssignment_0 ) )
            // InternalEnumeration.g:523:2: ( rule__EnumValueWithoutComma__NameAssignment_0 )
            {
             before(grammarAccess.getEnumValueWithoutCommaAccess().getNameAssignment_0()); 
            // InternalEnumeration.g:524:2: ( rule__EnumValueWithoutComma__NameAssignment_0 )
            // InternalEnumeration.g:524:3: rule__EnumValueWithoutComma__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EnumValueWithoutComma__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumValueWithoutCommaAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValueWithoutComma__Group__0__Impl"


    // $ANTLR start "rule__EnumValueWithoutComma__Group__1"
    // InternalEnumeration.g:532:1: rule__EnumValueWithoutComma__Group__1 : rule__EnumValueWithoutComma__Group__1__Impl ;
    public final void rule__EnumValueWithoutComma__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:536:1: ( rule__EnumValueWithoutComma__Group__1__Impl )
            // InternalEnumeration.g:537:2: rule__EnumValueWithoutComma__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumValueWithoutComma__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValueWithoutComma__Group__1"


    // $ANTLR start "rule__EnumValueWithoutComma__Group__1__Impl"
    // InternalEnumeration.g:543:1: rule__EnumValueWithoutComma__Group__1__Impl : ( ( rule__EnumValueWithoutComma__DocAssignment_1 )? ) ;
    public final void rule__EnumValueWithoutComma__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:547:1: ( ( ( rule__EnumValueWithoutComma__DocAssignment_1 )? ) )
            // InternalEnumeration.g:548:1: ( ( rule__EnumValueWithoutComma__DocAssignment_1 )? )
            {
            // InternalEnumeration.g:548:1: ( ( rule__EnumValueWithoutComma__DocAssignment_1 )? )
            // InternalEnumeration.g:549:2: ( rule__EnumValueWithoutComma__DocAssignment_1 )?
            {
             before(grammarAccess.getEnumValueWithoutCommaAccess().getDocAssignment_1()); 
            // InternalEnumeration.g:550:2: ( rule__EnumValueWithoutComma__DocAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ML_COMMENT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEnumeration.g:550:3: rule__EnumValueWithoutComma__DocAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumValueWithoutComma__DocAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumValueWithoutCommaAccess().getDocAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValueWithoutComma__Group__1__Impl"


    // $ANTLR start "rule__EnumValue__Group__0"
    // InternalEnumeration.g:559:1: rule__EnumValue__Group__0 : rule__EnumValue__Group__0__Impl rule__EnumValue__Group__1 ;
    public final void rule__EnumValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:563:1: ( rule__EnumValue__Group__0__Impl rule__EnumValue__Group__1 )
            // InternalEnumeration.g:564:2: rule__EnumValue__Group__0__Impl rule__EnumValue__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__EnumValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__0"


    // $ANTLR start "rule__EnumValue__Group__0__Impl"
    // InternalEnumeration.g:571:1: rule__EnumValue__Group__0__Impl : ( ',' ) ;
    public final void rule__EnumValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:575:1: ( ( ',' ) )
            // InternalEnumeration.g:576:1: ( ',' )
            {
            // InternalEnumeration.g:576:1: ( ',' )
            // InternalEnumeration.g:577:2: ','
            {
             before(grammarAccess.getEnumValueAccess().getCommaKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEnumValueAccess().getCommaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__0__Impl"


    // $ANTLR start "rule__EnumValue__Group__1"
    // InternalEnumeration.g:586:1: rule__EnumValue__Group__1 : rule__EnumValue__Group__1__Impl rule__EnumValue__Group__2 ;
    public final void rule__EnumValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:590:1: ( rule__EnumValue__Group__1__Impl rule__EnumValue__Group__2 )
            // InternalEnumeration.g:591:2: rule__EnumValue__Group__1__Impl rule__EnumValue__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__EnumValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__1"


    // $ANTLR start "rule__EnumValue__Group__1__Impl"
    // InternalEnumeration.g:598:1: rule__EnumValue__Group__1__Impl : ( ( rule__EnumValue__NameAssignment_1 ) ) ;
    public final void rule__EnumValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:602:1: ( ( ( rule__EnumValue__NameAssignment_1 ) ) )
            // InternalEnumeration.g:603:1: ( ( rule__EnumValue__NameAssignment_1 ) )
            {
            // InternalEnumeration.g:603:1: ( ( rule__EnumValue__NameAssignment_1 ) )
            // InternalEnumeration.g:604:2: ( rule__EnumValue__NameAssignment_1 )
            {
             before(grammarAccess.getEnumValueAccess().getNameAssignment_1()); 
            // InternalEnumeration.g:605:2: ( rule__EnumValue__NameAssignment_1 )
            // InternalEnumeration.g:605:3: rule__EnumValue__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumValue__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumValueAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__1__Impl"


    // $ANTLR start "rule__EnumValue__Group__2"
    // InternalEnumeration.g:613:1: rule__EnumValue__Group__2 : rule__EnumValue__Group__2__Impl ;
    public final void rule__EnumValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:617:1: ( rule__EnumValue__Group__2__Impl )
            // InternalEnumeration.g:618:2: rule__EnumValue__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumValue__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__2"


    // $ANTLR start "rule__EnumValue__Group__2__Impl"
    // InternalEnumeration.g:624:1: rule__EnumValue__Group__2__Impl : ( ( rule__EnumValue__DocAssignment_2 )? ) ;
    public final void rule__EnumValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:628:1: ( ( ( rule__EnumValue__DocAssignment_2 )? ) )
            // InternalEnumeration.g:629:1: ( ( rule__EnumValue__DocAssignment_2 )? )
            {
            // InternalEnumeration.g:629:1: ( ( rule__EnumValue__DocAssignment_2 )? )
            // InternalEnumeration.g:630:2: ( rule__EnumValue__DocAssignment_2 )?
            {
             before(grammarAccess.getEnumValueAccess().getDocAssignment_2()); 
            // InternalEnumeration.g:631:2: ( rule__EnumValue__DocAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ML_COMMENT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEnumeration.g:631:3: rule__EnumValue__DocAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumValue__DocAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumValueAccess().getDocAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__Group__2__Impl"


    // $ANTLR start "rule__EnumType__DocGlobalAssignment_0"
    // InternalEnumeration.g:640:1: rule__EnumType__DocGlobalAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__EnumType__DocGlobalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:644:1: ( ( RULE_ML_COMMENT ) )
            // InternalEnumeration.g:645:2: ( RULE_ML_COMMENT )
            {
            // InternalEnumeration.g:645:2: ( RULE_ML_COMMENT )
            // InternalEnumeration.g:646:3: RULE_ML_COMMENT
            {
             before(grammarAccess.getEnumTypeAccess().getDocGlobalML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getDocGlobalML_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__DocGlobalAssignment_0"


    // $ANTLR start "rule__EnumType__VersionAssignment_2"
    // InternalEnumeration.g:655:1: rule__EnumType__VersionAssignment_2 : ( RULE_INT ) ;
    public final void rule__EnumType__VersionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:659:1: ( ( RULE_INT ) )
            // InternalEnumeration.g:660:2: ( RULE_INT )
            {
            // InternalEnumeration.g:660:2: ( RULE_INT )
            // InternalEnumeration.g:661:3: RULE_INT
            {
             before(grammarAccess.getEnumTypeAccess().getVersionINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getVersionINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__VersionAssignment_2"


    // $ANTLR start "rule__EnumType__RevisionAssignment_4"
    // InternalEnumeration.g:670:1: rule__EnumType__RevisionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__EnumType__RevisionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:674:1: ( ( RULE_STRING ) )
            // InternalEnumeration.g:675:2: ( RULE_STRING )
            {
            // InternalEnumeration.g:675:2: ( RULE_STRING )
            // InternalEnumeration.g:676:3: RULE_STRING
            {
             before(grammarAccess.getEnumTypeAccess().getRevisionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getRevisionSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__RevisionAssignment_4"


    // $ANTLR start "rule__EnumType__XmlnsAssignment_6"
    // InternalEnumeration.g:685:1: rule__EnumType__XmlnsAssignment_6 : ( RULE_STRING ) ;
    public final void rule__EnumType__XmlnsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:689:1: ( ( RULE_STRING ) )
            // InternalEnumeration.g:690:2: ( RULE_STRING )
            {
            // InternalEnumeration.g:690:2: ( RULE_STRING )
            // InternalEnumeration.g:691:3: RULE_STRING
            {
             before(grammarAccess.getEnumTypeAccess().getXmlnsSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getXmlnsSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__XmlnsAssignment_6"


    // $ANTLR start "rule__EnumType__DocEnumAssignment_7"
    // InternalEnumeration.g:700:1: rule__EnumType__DocEnumAssignment_7 : ( RULE_ML_COMMENT ) ;
    public final void rule__EnumType__DocEnumAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:704:1: ( ( RULE_ML_COMMENT ) )
            // InternalEnumeration.g:705:2: ( RULE_ML_COMMENT )
            {
            // InternalEnumeration.g:705:2: ( RULE_ML_COMMENT )
            // InternalEnumeration.g:706:3: RULE_ML_COMMENT
            {
             before(grammarAccess.getEnumTypeAccess().getDocEnumML_COMMENTTerminalRuleCall_7_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getDocEnumML_COMMENTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__DocEnumAssignment_7"


    // $ANTLR start "rule__EnumType__NameAssignment_9"
    // InternalEnumeration.g:715:1: rule__EnumType__NameAssignment_9 : ( RULE_ID ) ;
    public final void rule__EnumType__NameAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:719:1: ( ( RULE_ID ) )
            // InternalEnumeration.g:720:2: ( RULE_ID )
            {
            // InternalEnumeration.g:720:2: ( RULE_ID )
            // InternalEnumeration.g:721:3: RULE_ID
            {
             before(grammarAccess.getEnumTypeAccess().getNameIDTerminalRuleCall_9_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumTypeAccess().getNameIDTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__NameAssignment_9"


    // $ANTLR start "rule__EnumType__ValuesAssignment_11"
    // InternalEnumeration.g:730:1: rule__EnumType__ValuesAssignment_11 : ( ruleEnumValueWithoutComma ) ;
    public final void rule__EnumType__ValuesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:734:1: ( ( ruleEnumValueWithoutComma ) )
            // InternalEnumeration.g:735:2: ( ruleEnumValueWithoutComma )
            {
            // InternalEnumeration.g:735:2: ( ruleEnumValueWithoutComma )
            // InternalEnumeration.g:736:3: ruleEnumValueWithoutComma
            {
             before(grammarAccess.getEnumTypeAccess().getValuesEnumValueWithoutCommaParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumValueWithoutComma();

            state._fsp--;

             after(grammarAccess.getEnumTypeAccess().getValuesEnumValueWithoutCommaParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__ValuesAssignment_11"


    // $ANTLR start "rule__EnumType__ValuesAssignment_12"
    // InternalEnumeration.g:745:1: rule__EnumType__ValuesAssignment_12 : ( ruleEnumValue ) ;
    public final void rule__EnumType__ValuesAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:749:1: ( ( ruleEnumValue ) )
            // InternalEnumeration.g:750:2: ( ruleEnumValue )
            {
            // InternalEnumeration.g:750:2: ( ruleEnumValue )
            // InternalEnumeration.g:751:3: ruleEnumValue
            {
             before(grammarAccess.getEnumTypeAccess().getValuesEnumValueParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumValue();

            state._fsp--;

             after(grammarAccess.getEnumTypeAccess().getValuesEnumValueParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__ValuesAssignment_12"


    // $ANTLR start "rule__EnumValueWithoutComma__NameAssignment_0"
    // InternalEnumeration.g:760:1: rule__EnumValueWithoutComma__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumValueWithoutComma__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:764:1: ( ( RULE_ID ) )
            // InternalEnumeration.g:765:2: ( RULE_ID )
            {
            // InternalEnumeration.g:765:2: ( RULE_ID )
            // InternalEnumeration.g:766:3: RULE_ID
            {
             before(grammarAccess.getEnumValueWithoutCommaAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumValueWithoutCommaAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValueWithoutComma__NameAssignment_0"


    // $ANTLR start "rule__EnumValueWithoutComma__DocAssignment_1"
    // InternalEnumeration.g:775:1: rule__EnumValueWithoutComma__DocAssignment_1 : ( RULE_ML_COMMENT ) ;
    public final void rule__EnumValueWithoutComma__DocAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:779:1: ( ( RULE_ML_COMMENT ) )
            // InternalEnumeration.g:780:2: ( RULE_ML_COMMENT )
            {
            // InternalEnumeration.g:780:2: ( RULE_ML_COMMENT )
            // InternalEnumeration.g:781:3: RULE_ML_COMMENT
            {
             before(grammarAccess.getEnumValueWithoutCommaAccess().getDocML_COMMENTTerminalRuleCall_1_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_2); 
             after(grammarAccess.getEnumValueWithoutCommaAccess().getDocML_COMMENTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValueWithoutComma__DocAssignment_1"


    // $ANTLR start "rule__EnumValue__NameAssignment_1"
    // InternalEnumeration.g:790:1: rule__EnumValue__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumValue__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:794:1: ( ( RULE_ID ) )
            // InternalEnumeration.g:795:2: ( RULE_ID )
            {
            // InternalEnumeration.g:795:2: ( RULE_ID )
            // InternalEnumeration.g:796:3: RULE_ID
            {
             before(grammarAccess.getEnumValueAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumValueAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__NameAssignment_1"


    // $ANTLR start "rule__EnumValue__DocAssignment_2"
    // InternalEnumeration.g:805:1: rule__EnumValue__DocAssignment_2 : ( RULE_ML_COMMENT ) ;
    public final void rule__EnumValue__DocAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEnumeration.g:809:1: ( ( RULE_ML_COMMENT ) )
            // InternalEnumeration.g:810:2: ( RULE_ML_COMMENT )
            {
            // InternalEnumeration.g:810:2: ( RULE_ML_COMMENT )
            // InternalEnumeration.g:811:3: RULE_ML_COMMENT
            {
             before(grammarAccess.getEnumValueAccess().getDocML_COMMENTTerminalRuleCall_2_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_2); 
             after(grammarAccess.getEnumValueAccess().getDocML_COMMENTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumValue__DocAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});

}