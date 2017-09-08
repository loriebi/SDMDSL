package org.xtext.alma.container.ide.contentassist.antlr.internal;

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
import org.xtext.alma.container.services.ContainerGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalContainerParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ML_COMMENT", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Char'", "'Short'", "'Integer'", "'Long'", "'Float'", "'Double'", "'Complex'", "'String'", "'Boolean'", "'Angle'", "'AngularRate'", "'Flux'", "'Frequency'", "'Humidity'", "'Length'", "'Pressure'", "'Speed'", "'Temperature'", "'Tag'", "'Entity'", "'EntityId'", "'EntityRef'", "'Interval'", "'ArrayTime'", "'ArrayTimeInterval'", "'container'", "'{'", "'}'", "'readOnly'"
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

    	public void setGrammarAccess(ContainerGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleContainer"
    // InternalContainer.g:53:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // InternalContainer.g:54:1: ( ruleContainer EOF )
            // InternalContainer.g:55:1: ruleContainer EOF
            {
             before(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getContainerRule()); 
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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalContainer.g:62:1: ruleContainer : ( ( rule__Container__Group__0 ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:66:2: ( ( ( rule__Container__Group__0 ) ) )
            // InternalContainer.g:67:2: ( ( rule__Container__Group__0 ) )
            {
            // InternalContainer.g:67:2: ( ( rule__Container__Group__0 ) )
            // InternalContainer.g:68:3: ( rule__Container__Group__0 )
            {
             before(grammarAccess.getContainerAccess().getGroup()); 
            // InternalContainer.g:69:3: ( rule__Container__Group__0 )
            // InternalContainer.g:69:4: rule__Container__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getGroup()); 

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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleContainerField"
    // InternalContainer.g:78:1: entryRuleContainerField : ruleContainerField EOF ;
    public final void entryRuleContainerField() throws RecognitionException {
        try {
            // InternalContainer.g:79:1: ( ruleContainerField EOF )
            // InternalContainer.g:80:1: ruleContainerField EOF
            {
             before(grammarAccess.getContainerFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleContainerField();

            state._fsp--;

             after(grammarAccess.getContainerFieldRule()); 
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
    // $ANTLR end "entryRuleContainerField"


    // $ANTLR start "ruleContainerField"
    // InternalContainer.g:87:1: ruleContainerField : ( ( rule__ContainerField__Group__0 ) ) ;
    public final void ruleContainerField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:91:2: ( ( ( rule__ContainerField__Group__0 ) ) )
            // InternalContainer.g:92:2: ( ( rule__ContainerField__Group__0 ) )
            {
            // InternalContainer.g:92:2: ( ( rule__ContainerField__Group__0 ) )
            // InternalContainer.g:93:3: ( rule__ContainerField__Group__0 )
            {
             before(grammarAccess.getContainerFieldAccess().getGroup()); 
            // InternalContainer.g:94:3: ( rule__ContainerField__Group__0 )
            // InternalContainer.g:94:4: rule__ContainerField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContainerField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainerFieldAccess().getGroup()); 

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
    // $ANTLR end "ruleContainerField"


    // $ANTLR start "entryRulePrimitiveTypes"
    // InternalContainer.g:103:1: entryRulePrimitiveTypes : rulePrimitiveTypes EOF ;
    public final void entryRulePrimitiveTypes() throws RecognitionException {
        try {
            // InternalContainer.g:104:1: ( rulePrimitiveTypes EOF )
            // InternalContainer.g:105:1: rulePrimitiveTypes EOF
            {
             before(grammarAccess.getPrimitiveTypesRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveTypes();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypesRule()); 
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
    // $ANTLR end "entryRulePrimitiveTypes"


    // $ANTLR start "rulePrimitiveTypes"
    // InternalContainer.g:112:1: rulePrimitiveTypes : ( ( rule__PrimitiveTypes__Alternatives ) ) ;
    public final void rulePrimitiveTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:116:2: ( ( ( rule__PrimitiveTypes__Alternatives ) ) )
            // InternalContainer.g:117:2: ( ( rule__PrimitiveTypes__Alternatives ) )
            {
            // InternalContainer.g:117:2: ( ( rule__PrimitiveTypes__Alternatives ) )
            // InternalContainer.g:118:3: ( rule__PrimitiveTypes__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypesAccess().getAlternatives()); 
            // InternalContainer.g:119:3: ( rule__PrimitiveTypes__Alternatives )
            // InternalContainer.g:119:4: rule__PrimitiveTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypesAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimitiveTypes"


    // $ANTLR start "entryRuleBasicType"
    // InternalContainer.g:128:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // InternalContainer.g:129:1: ( ruleBasicType EOF )
            // InternalContainer.g:130:1: ruleBasicType EOF
            {
             before(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getBasicTypeRule()); 
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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalContainer.g:137:1: ruleBasicType : ( ( rule__BasicType__Alternatives ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:141:2: ( ( ( rule__BasicType__Alternatives ) ) )
            // InternalContainer.g:142:2: ( ( rule__BasicType__Alternatives ) )
            {
            // InternalContainer.g:142:2: ( ( rule__BasicType__Alternatives ) )
            // InternalContainer.g:143:3: ( rule__BasicType__Alternatives )
            {
             before(grammarAccess.getBasicTypeAccess().getAlternatives()); 
            // InternalContainer.g:144:3: ( rule__BasicType__Alternatives )
            // InternalContainer.g:144:4: rule__BasicType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRulePhysicalType"
    // InternalContainer.g:153:1: entryRulePhysicalType : rulePhysicalType EOF ;
    public final void entryRulePhysicalType() throws RecognitionException {
        try {
            // InternalContainer.g:154:1: ( rulePhysicalType EOF )
            // InternalContainer.g:155:1: rulePhysicalType EOF
            {
             before(grammarAccess.getPhysicalTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePhysicalType();

            state._fsp--;

             after(grammarAccess.getPhysicalTypeRule()); 
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
    // $ANTLR end "entryRulePhysicalType"


    // $ANTLR start "rulePhysicalType"
    // InternalContainer.g:162:1: rulePhysicalType : ( ( rule__PhysicalType__Alternatives ) ) ;
    public final void rulePhysicalType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:166:2: ( ( ( rule__PhysicalType__Alternatives ) ) )
            // InternalContainer.g:167:2: ( ( rule__PhysicalType__Alternatives ) )
            {
            // InternalContainer.g:167:2: ( ( rule__PhysicalType__Alternatives ) )
            // InternalContainer.g:168:3: ( rule__PhysicalType__Alternatives )
            {
             before(grammarAccess.getPhysicalTypeAccess().getAlternatives()); 
            // InternalContainer.g:169:3: ( rule__PhysicalType__Alternatives )
            // InternalContainer.g:169:4: rule__PhysicalType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PhysicalType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPhysicalTypeAccess().getAlternatives()); 

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
    // $ANTLR end "rulePhysicalType"


    // $ANTLR start "entryRuleTechnicalType"
    // InternalContainer.g:178:1: entryRuleTechnicalType : ruleTechnicalType EOF ;
    public final void entryRuleTechnicalType() throws RecognitionException {
        try {
            // InternalContainer.g:179:1: ( ruleTechnicalType EOF )
            // InternalContainer.g:180:1: ruleTechnicalType EOF
            {
             before(grammarAccess.getTechnicalTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleTechnicalType();

            state._fsp--;

             after(grammarAccess.getTechnicalTypeRule()); 
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
    // $ANTLR end "entryRuleTechnicalType"


    // $ANTLR start "ruleTechnicalType"
    // InternalContainer.g:187:1: ruleTechnicalType : ( ( rule__TechnicalType__Alternatives ) ) ;
    public final void ruleTechnicalType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:191:2: ( ( ( rule__TechnicalType__Alternatives ) ) )
            // InternalContainer.g:192:2: ( ( rule__TechnicalType__Alternatives ) )
            {
            // InternalContainer.g:192:2: ( ( rule__TechnicalType__Alternatives ) )
            // InternalContainer.g:193:3: ( rule__TechnicalType__Alternatives )
            {
             before(grammarAccess.getTechnicalTypeAccess().getAlternatives()); 
            // InternalContainer.g:194:3: ( rule__TechnicalType__Alternatives )
            // InternalContainer.g:194:4: rule__TechnicalType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TechnicalType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTechnicalTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTechnicalType"


    // $ANTLR start "entryRuleTimeType"
    // InternalContainer.g:203:1: entryRuleTimeType : ruleTimeType EOF ;
    public final void entryRuleTimeType() throws RecognitionException {
        try {
            // InternalContainer.g:204:1: ( ruleTimeType EOF )
            // InternalContainer.g:205:1: ruleTimeType EOF
            {
             before(grammarAccess.getTimeTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeType();

            state._fsp--;

             after(grammarAccess.getTimeTypeRule()); 
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
    // $ANTLR end "entryRuleTimeType"


    // $ANTLR start "ruleTimeType"
    // InternalContainer.g:212:1: ruleTimeType : ( ( rule__TimeType__Alternatives ) ) ;
    public final void ruleTimeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:216:2: ( ( ( rule__TimeType__Alternatives ) ) )
            // InternalContainer.g:217:2: ( ( rule__TimeType__Alternatives ) )
            {
            // InternalContainer.g:217:2: ( ( rule__TimeType__Alternatives ) )
            // InternalContainer.g:218:3: ( rule__TimeType__Alternatives )
            {
             before(grammarAccess.getTimeTypeAccess().getAlternatives()); 
            // InternalContainer.g:219:3: ( rule__TimeType__Alternatives )
            // InternalContainer.g:219:4: rule__TimeType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTimeType"


    // $ANTLR start "rule__PrimitiveTypes__Alternatives"
    // InternalContainer.g:227:1: rule__PrimitiveTypes__Alternatives : ( ( ruleBasicType ) | ( rulePhysicalType ) | ( ruleTechnicalType ) | ( ruleTimeType ) );
    public final void rule__PrimitiveTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:231:1: ( ( ruleBasicType ) | ( rulePhysicalType ) | ( ruleTechnicalType ) | ( ruleTimeType ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                {
                alt1=1;
                }
                break;
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                {
                alt1=2;
                }
                break;
            case 29:
            case 30:
            case 31:
            case 32:
                {
                alt1=3;
                }
                break;
            case 33:
            case 34:
            case 35:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalContainer.g:232:2: ( ruleBasicType )
                    {
                    // InternalContainer.g:232:2: ( ruleBasicType )
                    // InternalContainer.g:233:3: ruleBasicType
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getBasicTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBasicType();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveTypesAccess().getBasicTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalContainer.g:238:2: ( rulePhysicalType )
                    {
                    // InternalContainer.g:238:2: ( rulePhysicalType )
                    // InternalContainer.g:239:3: rulePhysicalType
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getPhysicalTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePhysicalType();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveTypesAccess().getPhysicalTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalContainer.g:244:2: ( ruleTechnicalType )
                    {
                    // InternalContainer.g:244:2: ( ruleTechnicalType )
                    // InternalContainer.g:245:3: ruleTechnicalType
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getTechnicalTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTechnicalType();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveTypesAccess().getTechnicalTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalContainer.g:250:2: ( ruleTimeType )
                    {
                    // InternalContainer.g:250:2: ( ruleTimeType )
                    // InternalContainer.g:251:3: ruleTimeType
                    {
                     before(grammarAccess.getPrimitiveTypesAccess().getTimeTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleTimeType();

                    state._fsp--;

                     after(grammarAccess.getPrimitiveTypesAccess().getTimeTypeParserRuleCall_3()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__PrimitiveTypes__Alternatives"


    // $ANTLR start "rule__BasicType__Alternatives"
    // InternalContainer.g:260:1: rule__BasicType__Alternatives : ( ( 'Char' ) | ( 'Short' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Float' ) | ( 'Double' ) | ( 'Complex' ) | ( 'String' ) | ( 'Boolean' ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:264:1: ( ( 'Char' ) | ( 'Short' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Float' ) | ( 'Double' ) | ( 'Complex' ) | ( 'String' ) | ( 'Boolean' ) )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
                {
                alt2=7;
                }
                break;
            case 18:
                {
                alt2=8;
                }
                break;
            case 19:
                {
                alt2=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalContainer.g:265:2: ( 'Char' )
                    {
                    // InternalContainer.g:265:2: ( 'Char' )
                    // InternalContainer.g:266:3: 'Char'
                    {
                     before(grammarAccess.getBasicTypeAccess().getCharKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getCharKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalContainer.g:271:2: ( 'Short' )
                    {
                    // InternalContainer.g:271:2: ( 'Short' )
                    // InternalContainer.g:272:3: 'Short'
                    {
                     before(grammarAccess.getBasicTypeAccess().getShortKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getShortKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalContainer.g:277:2: ( 'Integer' )
                    {
                    // InternalContainer.g:277:2: ( 'Integer' )
                    // InternalContainer.g:278:3: 'Integer'
                    {
                     before(grammarAccess.getBasicTypeAccess().getIntegerKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getIntegerKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalContainer.g:283:2: ( 'Long' )
                    {
                    // InternalContainer.g:283:2: ( 'Long' )
                    // InternalContainer.g:284:3: 'Long'
                    {
                     before(grammarAccess.getBasicTypeAccess().getLongKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getLongKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalContainer.g:289:2: ( 'Float' )
                    {
                    // InternalContainer.g:289:2: ( 'Float' )
                    // InternalContainer.g:290:3: 'Float'
                    {
                     before(grammarAccess.getBasicTypeAccess().getFloatKeyword_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getFloatKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalContainer.g:295:2: ( 'Double' )
                    {
                    // InternalContainer.g:295:2: ( 'Double' )
                    // InternalContainer.g:296:3: 'Double'
                    {
                     before(grammarAccess.getBasicTypeAccess().getDoubleKeyword_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getDoubleKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalContainer.g:301:2: ( 'Complex' )
                    {
                    // InternalContainer.g:301:2: ( 'Complex' )
                    // InternalContainer.g:302:3: 'Complex'
                    {
                     before(grammarAccess.getBasicTypeAccess().getComplexKeyword_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getComplexKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalContainer.g:307:2: ( 'String' )
                    {
                    // InternalContainer.g:307:2: ( 'String' )
                    // InternalContainer.g:308:3: 'String'
                    {
                     before(grammarAccess.getBasicTypeAccess().getStringKeyword_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getStringKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalContainer.g:313:2: ( 'Boolean' )
                    {
                    // InternalContainer.g:313:2: ( 'Boolean' )
                    // InternalContainer.g:314:3: 'Boolean'
                    {
                     before(grammarAccess.getBasicTypeAccess().getBooleanKeyword_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getBooleanKeyword_8()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__BasicType__Alternatives"


    // $ANTLR start "rule__PhysicalType__Alternatives"
    // InternalContainer.g:323:1: rule__PhysicalType__Alternatives : ( ( 'Angle' ) | ( 'AngularRate' ) | ( 'Flux' ) | ( 'Frequency' ) | ( 'Humidity' ) | ( 'Length' ) | ( 'Pressure' ) | ( 'Speed' ) | ( 'Temperature' ) );
    public final void rule__PhysicalType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:327:1: ( ( 'Angle' ) | ( 'AngularRate' ) | ( 'Flux' ) | ( 'Frequency' ) | ( 'Humidity' ) | ( 'Length' ) | ( 'Pressure' ) | ( 'Speed' ) | ( 'Temperature' ) )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            case 23:
                {
                alt3=4;
                }
                break;
            case 24:
                {
                alt3=5;
                }
                break;
            case 25:
                {
                alt3=6;
                }
                break;
            case 26:
                {
                alt3=7;
                }
                break;
            case 27:
                {
                alt3=8;
                }
                break;
            case 28:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalContainer.g:328:2: ( 'Angle' )
                    {
                    // InternalContainer.g:328:2: ( 'Angle' )
                    // InternalContainer.g:329:3: 'Angle'
                    {
                     before(grammarAccess.getPhysicalTypeAccess().getAngleKeyword_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getPhysicalTypeAccess().getAngleKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalContainer.g:334:2: ( 'AngularRate' )
                    {
                    // InternalContainer.g:334:2: ( 'AngularRate' )
                    // InternalContainer.g:335:3: 'AngularRate'
                    {
                     before(grammarAccess.getPhysicalTypeAccess().getAngularRateKeyword_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getPhysicalTypeAccess().getAngularRateKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalContainer.g:340:2: ( 'Flux' )
                    {
                    // InternalContainer.g:340:2: ( 'Flux' )
                    // InternalContainer.g:341:3: 'Flux'
                    {
                     before(grammarAccess.getPhysicalTypeAccess().getFluxKeyword_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getPhysicalTypeAccess().getFluxKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalContainer.g:346:2: ( 'Frequency' )
                    {
                    // InternalContainer.g:346:2: ( 'Frequency' )
                    // InternalContainer.g:347:3: 'Frequency'
                    {
                     before(grammarAccess.getPhysicalTypeAccess().getFrequencyKeyword_3()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getPhysicalTypeAccess().getFrequencyKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalContainer.g:352:2: ( 'Humidity' )
                    {
                    // InternalContainer.g:352:2: ( 'Humidity' )
                    // InternalContainer.g:353:3: 'Humidity'
                    {
                     before(grammarAccess.getPhysicalTypeAccess().getHumidityKeyword_4()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getPhysicalTypeAccess().getHumidityKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalContainer.g:358:2: ( 'Length' )
                    {
                    // InternalContainer.g:358:2: ( 'Length' )
                    // InternalContainer.g:359:3: 'Length'
                    {
                     before(grammarAccess.getPhysicalTypeAccess().getLengthKeyword_5()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getPhysicalTypeAccess().getLengthKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalContainer.g:364:2: ( 'Pressure' )
                    {
                    // InternalContainer.g:364:2: ( 'Pressure' )
                    // InternalContainer.g:365:3: 'Pressure'
                    {
                     before(grammarAccess.getPhysicalTypeAccess().getPressureKeyword_6()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getPhysicalTypeAccess().getPressureKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalContainer.g:370:2: ( 'Speed' )
                    {
                    // InternalContainer.g:370:2: ( 'Speed' )
                    // InternalContainer.g:371:3: 'Speed'
                    {
                     before(grammarAccess.getPhysicalTypeAccess().getSpeedKeyword_7()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getPhysicalTypeAccess().getSpeedKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalContainer.g:376:2: ( 'Temperature' )
                    {
                    // InternalContainer.g:376:2: ( 'Temperature' )
                    // InternalContainer.g:377:3: 'Temperature'
                    {
                     before(grammarAccess.getPhysicalTypeAccess().getTemperatureKeyword_8()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getPhysicalTypeAccess().getTemperatureKeyword_8()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__PhysicalType__Alternatives"


    // $ANTLR start "rule__TechnicalType__Alternatives"
    // InternalContainer.g:386:1: rule__TechnicalType__Alternatives : ( ( 'Tag' ) | ( 'Entity' ) | ( 'EntityId' ) | ( 'EntityRef' ) );
    public final void rule__TechnicalType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:390:1: ( ( 'Tag' ) | ( 'Entity' ) | ( 'EntityId' ) | ( 'EntityRef' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt4=1;
                }
                break;
            case 30:
                {
                alt4=2;
                }
                break;
            case 31:
                {
                alt4=3;
                }
                break;
            case 32:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalContainer.g:391:2: ( 'Tag' )
                    {
                    // InternalContainer.g:391:2: ( 'Tag' )
                    // InternalContainer.g:392:3: 'Tag'
                    {
                     before(grammarAccess.getTechnicalTypeAccess().getTagKeyword_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getTechnicalTypeAccess().getTagKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalContainer.g:397:2: ( 'Entity' )
                    {
                    // InternalContainer.g:397:2: ( 'Entity' )
                    // InternalContainer.g:398:3: 'Entity'
                    {
                     before(grammarAccess.getTechnicalTypeAccess().getEntityKeyword_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getTechnicalTypeAccess().getEntityKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalContainer.g:403:2: ( 'EntityId' )
                    {
                    // InternalContainer.g:403:2: ( 'EntityId' )
                    // InternalContainer.g:404:3: 'EntityId'
                    {
                     before(grammarAccess.getTechnicalTypeAccess().getEntityIdKeyword_2()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getTechnicalTypeAccess().getEntityIdKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalContainer.g:409:2: ( 'EntityRef' )
                    {
                    // InternalContainer.g:409:2: ( 'EntityRef' )
                    // InternalContainer.g:410:3: 'EntityRef'
                    {
                     before(grammarAccess.getTechnicalTypeAccess().getEntityRefKeyword_3()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getTechnicalTypeAccess().getEntityRefKeyword_3()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__TechnicalType__Alternatives"


    // $ANTLR start "rule__TimeType__Alternatives"
    // InternalContainer.g:419:1: rule__TimeType__Alternatives : ( ( 'Interval' ) | ( 'ArrayTime' ) | ( 'ArrayTimeInterval' ) );
    public final void rule__TimeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:423:1: ( ( 'Interval' ) | ( 'ArrayTime' ) | ( 'ArrayTimeInterval' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt5=1;
                }
                break;
            case 34:
                {
                alt5=2;
                }
                break;
            case 35:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalContainer.g:424:2: ( 'Interval' )
                    {
                    // InternalContainer.g:424:2: ( 'Interval' )
                    // InternalContainer.g:425:3: 'Interval'
                    {
                     before(grammarAccess.getTimeTypeAccess().getIntervalKeyword_0()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getTimeTypeAccess().getIntervalKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalContainer.g:430:2: ( 'ArrayTime' )
                    {
                    // InternalContainer.g:430:2: ( 'ArrayTime' )
                    // InternalContainer.g:431:3: 'ArrayTime'
                    {
                     before(grammarAccess.getTimeTypeAccess().getArrayTimeKeyword_1()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getTimeTypeAccess().getArrayTimeKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalContainer.g:436:2: ( 'ArrayTimeInterval' )
                    {
                    // InternalContainer.g:436:2: ( 'ArrayTimeInterval' )
                    // InternalContainer.g:437:3: 'ArrayTimeInterval'
                    {
                     before(grammarAccess.getTimeTypeAccess().getArrayTimeIntervalKeyword_2()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getTimeTypeAccess().getArrayTimeIntervalKeyword_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__TimeType__Alternatives"


    // $ANTLR start "rule__Container__Group__0"
    // InternalContainer.g:446:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:450:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // InternalContainer.g:451:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Container__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__1();

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
    // $ANTLR end "rule__Container__Group__0"


    // $ANTLR start "rule__Container__Group__0__Impl"
    // InternalContainer.g:458:1: rule__Container__Group__0__Impl : ( ( rule__Container__DocAssignment_0 )? ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:462:1: ( ( ( rule__Container__DocAssignment_0 )? ) )
            // InternalContainer.g:463:1: ( ( rule__Container__DocAssignment_0 )? )
            {
            // InternalContainer.g:463:1: ( ( rule__Container__DocAssignment_0 )? )
            // InternalContainer.g:464:2: ( rule__Container__DocAssignment_0 )?
            {
             before(grammarAccess.getContainerAccess().getDocAssignment_0()); 
            // InternalContainer.g:465:2: ( rule__Container__DocAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ML_COMMENT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalContainer.g:465:3: rule__Container__DocAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Container__DocAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerAccess().getDocAssignment_0()); 

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
    // $ANTLR end "rule__Container__Group__0__Impl"


    // $ANTLR start "rule__Container__Group__1"
    // InternalContainer.g:473:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:477:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // InternalContainer.g:478:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Container__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__2();

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
    // $ANTLR end "rule__Container__Group__1"


    // $ANTLR start "rule__Container__Group__1__Impl"
    // InternalContainer.g:485:1: rule__Container__Group__1__Impl : ( 'container' ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:489:1: ( ( 'container' ) )
            // InternalContainer.g:490:1: ( 'container' )
            {
            // InternalContainer.g:490:1: ( 'container' )
            // InternalContainer.g:491:2: 'container'
            {
             before(grammarAccess.getContainerAccess().getContainerKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getContainerKeyword_1()); 

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
    // $ANTLR end "rule__Container__Group__1__Impl"


    // $ANTLR start "rule__Container__Group__2"
    // InternalContainer.g:500:1: rule__Container__Group__2 : rule__Container__Group__2__Impl rule__Container__Group__3 ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:504:1: ( rule__Container__Group__2__Impl rule__Container__Group__3 )
            // InternalContainer.g:505:2: rule__Container__Group__2__Impl rule__Container__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Container__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__3();

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
    // $ANTLR end "rule__Container__Group__2"


    // $ANTLR start "rule__Container__Group__2__Impl"
    // InternalContainer.g:512:1: rule__Container__Group__2__Impl : ( ( rule__Container__NameAssignment_2 ) ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:516:1: ( ( ( rule__Container__NameAssignment_2 ) ) )
            // InternalContainer.g:517:1: ( ( rule__Container__NameAssignment_2 ) )
            {
            // InternalContainer.g:517:1: ( ( rule__Container__NameAssignment_2 ) )
            // InternalContainer.g:518:2: ( rule__Container__NameAssignment_2 )
            {
             before(grammarAccess.getContainerAccess().getNameAssignment_2()); 
            // InternalContainer.g:519:2: ( rule__Container__NameAssignment_2 )
            // InternalContainer.g:519:3: rule__Container__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Container__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Container__Group__2__Impl"


    // $ANTLR start "rule__Container__Group__3"
    // InternalContainer.g:527:1: rule__Container__Group__3 : rule__Container__Group__3__Impl rule__Container__Group__4 ;
    public final void rule__Container__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:531:1: ( rule__Container__Group__3__Impl rule__Container__Group__4 )
            // InternalContainer.g:532:2: rule__Container__Group__3__Impl rule__Container__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Container__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__4();

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
    // $ANTLR end "rule__Container__Group__3"


    // $ANTLR start "rule__Container__Group__3__Impl"
    // InternalContainer.g:539:1: rule__Container__Group__3__Impl : ( '{' ) ;
    public final void rule__Container__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:543:1: ( ( '{' ) )
            // InternalContainer.g:544:1: ( '{' )
            {
            // InternalContainer.g:544:1: ( '{' )
            // InternalContainer.g:545:2: '{'
            {
             before(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Container__Group__3__Impl"


    // $ANTLR start "rule__Container__Group__4"
    // InternalContainer.g:554:1: rule__Container__Group__4 : rule__Container__Group__4__Impl rule__Container__Group__5 ;
    public final void rule__Container__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:558:1: ( rule__Container__Group__4__Impl rule__Container__Group__5 )
            // InternalContainer.g:559:2: rule__Container__Group__4__Impl rule__Container__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Container__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__5();

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
    // $ANTLR end "rule__Container__Group__4"


    // $ANTLR start "rule__Container__Group__4__Impl"
    // InternalContainer.g:566:1: rule__Container__Group__4__Impl : ( ( rule__Container__DataAssignment_4 )* ) ;
    public final void rule__Container__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:570:1: ( ( ( rule__Container__DataAssignment_4 )* ) )
            // InternalContainer.g:571:1: ( ( rule__Container__DataAssignment_4 )* )
            {
            // InternalContainer.g:571:1: ( ( rule__Container__DataAssignment_4 )* )
            // InternalContainer.g:572:2: ( rule__Container__DataAssignment_4 )*
            {
             before(grammarAccess.getContainerAccess().getDataAssignment_4()); 
            // InternalContainer.g:573:2: ( rule__Container__DataAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=11 && LA7_0<=35)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalContainer.g:573:3: rule__Container__DataAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Container__DataAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getContainerAccess().getDataAssignment_4()); 

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
    // $ANTLR end "rule__Container__Group__4__Impl"


    // $ANTLR start "rule__Container__Group__5"
    // InternalContainer.g:581:1: rule__Container__Group__5 : rule__Container__Group__5__Impl ;
    public final void rule__Container__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:585:1: ( rule__Container__Group__5__Impl )
            // InternalContainer.g:586:2: rule__Container__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__5__Impl();

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
    // $ANTLR end "rule__Container__Group__5"


    // $ANTLR start "rule__Container__Group__5__Impl"
    // InternalContainer.g:592:1: rule__Container__Group__5__Impl : ( '}' ) ;
    public final void rule__Container__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:596:1: ( ( '}' ) )
            // InternalContainer.g:597:1: ( '}' )
            {
            // InternalContainer.g:597:1: ( '}' )
            // InternalContainer.g:598:2: '}'
            {
             before(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Container__Group__5__Impl"


    // $ANTLR start "rule__ContainerField__Group__0"
    // InternalContainer.g:608:1: rule__ContainerField__Group__0 : rule__ContainerField__Group__0__Impl rule__ContainerField__Group__1 ;
    public final void rule__ContainerField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:612:1: ( rule__ContainerField__Group__0__Impl rule__ContainerField__Group__1 )
            // InternalContainer.g:613:2: rule__ContainerField__Group__0__Impl rule__ContainerField__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ContainerField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContainerField__Group__1();

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
    // $ANTLR end "rule__ContainerField__Group__0"


    // $ANTLR start "rule__ContainerField__Group__0__Impl"
    // InternalContainer.g:620:1: rule__ContainerField__Group__0__Impl : ( ( rule__ContainerField__PrimitiveTypeAssignment_0 ) ) ;
    public final void rule__ContainerField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:624:1: ( ( ( rule__ContainerField__PrimitiveTypeAssignment_0 ) ) )
            // InternalContainer.g:625:1: ( ( rule__ContainerField__PrimitiveTypeAssignment_0 ) )
            {
            // InternalContainer.g:625:1: ( ( rule__ContainerField__PrimitiveTypeAssignment_0 ) )
            // InternalContainer.g:626:2: ( rule__ContainerField__PrimitiveTypeAssignment_0 )
            {
             before(grammarAccess.getContainerFieldAccess().getPrimitiveTypeAssignment_0()); 
            // InternalContainer.g:627:2: ( rule__ContainerField__PrimitiveTypeAssignment_0 )
            // InternalContainer.g:627:3: rule__ContainerField__PrimitiveTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ContainerField__PrimitiveTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getContainerFieldAccess().getPrimitiveTypeAssignment_0()); 

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
    // $ANTLR end "rule__ContainerField__Group__0__Impl"


    // $ANTLR start "rule__ContainerField__Group__1"
    // InternalContainer.g:635:1: rule__ContainerField__Group__1 : rule__ContainerField__Group__1__Impl rule__ContainerField__Group__2 ;
    public final void rule__ContainerField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:639:1: ( rule__ContainerField__Group__1__Impl rule__ContainerField__Group__2 )
            // InternalContainer.g:640:2: rule__ContainerField__Group__1__Impl rule__ContainerField__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ContainerField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContainerField__Group__2();

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
    // $ANTLR end "rule__ContainerField__Group__1"


    // $ANTLR start "rule__ContainerField__Group__1__Impl"
    // InternalContainer.g:647:1: rule__ContainerField__Group__1__Impl : ( ( rule__ContainerField__NameAssignment_1 ) ) ;
    public final void rule__ContainerField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:651:1: ( ( ( rule__ContainerField__NameAssignment_1 ) ) )
            // InternalContainer.g:652:1: ( ( rule__ContainerField__NameAssignment_1 ) )
            {
            // InternalContainer.g:652:1: ( ( rule__ContainerField__NameAssignment_1 ) )
            // InternalContainer.g:653:2: ( rule__ContainerField__NameAssignment_1 )
            {
             before(grammarAccess.getContainerFieldAccess().getNameAssignment_1()); 
            // InternalContainer.g:654:2: ( rule__ContainerField__NameAssignment_1 )
            // InternalContainer.g:654:3: rule__ContainerField__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ContainerField__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerFieldAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ContainerField__Group__1__Impl"


    // $ANTLR start "rule__ContainerField__Group__2"
    // InternalContainer.g:662:1: rule__ContainerField__Group__2 : rule__ContainerField__Group__2__Impl rule__ContainerField__Group__3 ;
    public final void rule__ContainerField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:666:1: ( rule__ContainerField__Group__2__Impl rule__ContainerField__Group__3 )
            // InternalContainer.g:667:2: rule__ContainerField__Group__2__Impl rule__ContainerField__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ContainerField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContainerField__Group__3();

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
    // $ANTLR end "rule__ContainerField__Group__2"


    // $ANTLR start "rule__ContainerField__Group__2__Impl"
    // InternalContainer.g:674:1: rule__ContainerField__Group__2__Impl : ( ( rule__ContainerField__ReadOnlyAssignment_2 )? ) ;
    public final void rule__ContainerField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:678:1: ( ( ( rule__ContainerField__ReadOnlyAssignment_2 )? ) )
            // InternalContainer.g:679:1: ( ( rule__ContainerField__ReadOnlyAssignment_2 )? )
            {
            // InternalContainer.g:679:1: ( ( rule__ContainerField__ReadOnlyAssignment_2 )? )
            // InternalContainer.g:680:2: ( rule__ContainerField__ReadOnlyAssignment_2 )?
            {
             before(grammarAccess.getContainerFieldAccess().getReadOnlyAssignment_2()); 
            // InternalContainer.g:681:2: ( rule__ContainerField__ReadOnlyAssignment_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==39) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalContainer.g:681:3: rule__ContainerField__ReadOnlyAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ContainerField__ReadOnlyAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerFieldAccess().getReadOnlyAssignment_2()); 

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
    // $ANTLR end "rule__ContainerField__Group__2__Impl"


    // $ANTLR start "rule__ContainerField__Group__3"
    // InternalContainer.g:689:1: rule__ContainerField__Group__3 : rule__ContainerField__Group__3__Impl rule__ContainerField__Group__4 ;
    public final void rule__ContainerField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:693:1: ( rule__ContainerField__Group__3__Impl rule__ContainerField__Group__4 )
            // InternalContainer.g:694:2: rule__ContainerField__Group__3__Impl rule__ContainerField__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__ContainerField__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContainerField__Group__4();

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
    // $ANTLR end "rule__ContainerField__Group__3"


    // $ANTLR start "rule__ContainerField__Group__3__Impl"
    // InternalContainer.g:701:1: rule__ContainerField__Group__3__Impl : ( ( rule__ContainerField__InitValueAssignment_3 )? ) ;
    public final void rule__ContainerField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:705:1: ( ( ( rule__ContainerField__InitValueAssignment_3 )? ) )
            // InternalContainer.g:706:1: ( ( rule__ContainerField__InitValueAssignment_3 )? )
            {
            // InternalContainer.g:706:1: ( ( rule__ContainerField__InitValueAssignment_3 )? )
            // InternalContainer.g:707:2: ( rule__ContainerField__InitValueAssignment_3 )?
            {
             before(grammarAccess.getContainerFieldAccess().getInitValueAssignment_3()); 
            // InternalContainer.g:708:2: ( rule__ContainerField__InitValueAssignment_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalContainer.g:708:3: rule__ContainerField__InitValueAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ContainerField__InitValueAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerFieldAccess().getInitValueAssignment_3()); 

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
    // $ANTLR end "rule__ContainerField__Group__3__Impl"


    // $ANTLR start "rule__ContainerField__Group__4"
    // InternalContainer.g:716:1: rule__ContainerField__Group__4 : rule__ContainerField__Group__4__Impl ;
    public final void rule__ContainerField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:720:1: ( rule__ContainerField__Group__4__Impl )
            // InternalContainer.g:721:2: rule__ContainerField__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContainerField__Group__4__Impl();

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
    // $ANTLR end "rule__ContainerField__Group__4"


    // $ANTLR start "rule__ContainerField__Group__4__Impl"
    // InternalContainer.g:727:1: rule__ContainerField__Group__4__Impl : ( ( rule__ContainerField__DocAssignment_4 )? ) ;
    public final void rule__ContainerField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:731:1: ( ( ( rule__ContainerField__DocAssignment_4 )? ) )
            // InternalContainer.g:732:1: ( ( rule__ContainerField__DocAssignment_4 )? )
            {
            // InternalContainer.g:732:1: ( ( rule__ContainerField__DocAssignment_4 )? )
            // InternalContainer.g:733:2: ( rule__ContainerField__DocAssignment_4 )?
            {
             before(grammarAccess.getContainerFieldAccess().getDocAssignment_4()); 
            // InternalContainer.g:734:2: ( rule__ContainerField__DocAssignment_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ML_COMMENT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalContainer.g:734:3: rule__ContainerField__DocAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ContainerField__DocAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContainerFieldAccess().getDocAssignment_4()); 

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
    // $ANTLR end "rule__ContainerField__Group__4__Impl"


    // $ANTLR start "rule__Container__DocAssignment_0"
    // InternalContainer.g:743:1: rule__Container__DocAssignment_0 : ( RULE_ML_COMMENT ) ;
    public final void rule__Container__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:747:1: ( ( RULE_ML_COMMENT ) )
            // InternalContainer.g:748:2: ( RULE_ML_COMMENT )
            {
            // InternalContainer.g:748:2: ( RULE_ML_COMMENT )
            // InternalContainer.g:749:3: RULE_ML_COMMENT
            {
             before(grammarAccess.getContainerAccess().getDocML_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getDocML_COMMENTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Container__DocAssignment_0"


    // $ANTLR start "rule__Container__NameAssignment_2"
    // InternalContainer.g:758:1: rule__Container__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Container__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:762:1: ( ( RULE_ID ) )
            // InternalContainer.g:763:2: ( RULE_ID )
            {
            // InternalContainer.g:763:2: ( RULE_ID )
            // InternalContainer.g:764:3: RULE_ID
            {
             before(grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Container__NameAssignment_2"


    // $ANTLR start "rule__Container__DataAssignment_4"
    // InternalContainer.g:773:1: rule__Container__DataAssignment_4 : ( ruleContainerField ) ;
    public final void rule__Container__DataAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:777:1: ( ( ruleContainerField ) )
            // InternalContainer.g:778:2: ( ruleContainerField )
            {
            // InternalContainer.g:778:2: ( ruleContainerField )
            // InternalContainer.g:779:3: ruleContainerField
            {
             before(grammarAccess.getContainerAccess().getDataContainerFieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleContainerField();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getDataContainerFieldParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Container__DataAssignment_4"


    // $ANTLR start "rule__ContainerField__PrimitiveTypeAssignment_0"
    // InternalContainer.g:788:1: rule__ContainerField__PrimitiveTypeAssignment_0 : ( rulePrimitiveTypes ) ;
    public final void rule__ContainerField__PrimitiveTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:792:1: ( ( rulePrimitiveTypes ) )
            // InternalContainer.g:793:2: ( rulePrimitiveTypes )
            {
            // InternalContainer.g:793:2: ( rulePrimitiveTypes )
            // InternalContainer.g:794:3: rulePrimitiveTypes
            {
             before(grammarAccess.getContainerFieldAccess().getPrimitiveTypePrimitiveTypesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveTypes();

            state._fsp--;

             after(grammarAccess.getContainerFieldAccess().getPrimitiveTypePrimitiveTypesParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ContainerField__PrimitiveTypeAssignment_0"


    // $ANTLR start "rule__ContainerField__NameAssignment_1"
    // InternalContainer.g:803:1: rule__ContainerField__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ContainerField__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:807:1: ( ( RULE_ID ) )
            // InternalContainer.g:808:2: ( RULE_ID )
            {
            // InternalContainer.g:808:2: ( RULE_ID )
            // InternalContainer.g:809:3: RULE_ID
            {
             before(grammarAccess.getContainerFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContainerFieldAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ContainerField__NameAssignment_1"


    // $ANTLR start "rule__ContainerField__ReadOnlyAssignment_2"
    // InternalContainer.g:818:1: rule__ContainerField__ReadOnlyAssignment_2 : ( ( 'readOnly' ) ) ;
    public final void rule__ContainerField__ReadOnlyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:822:1: ( ( ( 'readOnly' ) ) )
            // InternalContainer.g:823:2: ( ( 'readOnly' ) )
            {
            // InternalContainer.g:823:2: ( ( 'readOnly' ) )
            // InternalContainer.g:824:3: ( 'readOnly' )
            {
             before(grammarAccess.getContainerFieldAccess().getReadOnlyReadOnlyKeyword_2_0()); 
            // InternalContainer.g:825:3: ( 'readOnly' )
            // InternalContainer.g:826:4: 'readOnly'
            {
             before(grammarAccess.getContainerFieldAccess().getReadOnlyReadOnlyKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getContainerFieldAccess().getReadOnlyReadOnlyKeyword_2_0()); 

            }

             after(grammarAccess.getContainerFieldAccess().getReadOnlyReadOnlyKeyword_2_0()); 

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
    // $ANTLR end "rule__ContainerField__ReadOnlyAssignment_2"


    // $ANTLR start "rule__ContainerField__InitValueAssignment_3"
    // InternalContainer.g:837:1: rule__ContainerField__InitValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ContainerField__InitValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:841:1: ( ( RULE_STRING ) )
            // InternalContainer.g:842:2: ( RULE_STRING )
            {
            // InternalContainer.g:842:2: ( RULE_STRING )
            // InternalContainer.g:843:3: RULE_STRING
            {
             before(grammarAccess.getContainerFieldAccess().getInitValueSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getContainerFieldAccess().getInitValueSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__ContainerField__InitValueAssignment_3"


    // $ANTLR start "rule__ContainerField__DocAssignment_4"
    // InternalContainer.g:852:1: rule__ContainerField__DocAssignment_4 : ( RULE_ML_COMMENT ) ;
    public final void rule__ContainerField__DocAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalContainer.g:856:1: ( ( RULE_ML_COMMENT ) )
            // InternalContainer.g:857:2: ( RULE_ML_COMMENT )
            {
            // InternalContainer.g:857:2: ( RULE_ML_COMMENT )
            // InternalContainer.g:858:3: RULE_ML_COMMENT
            {
             before(grammarAccess.getContainerFieldAccess().getDocML_COMMENTTerminalRuleCall_4_0()); 
            match(input,RULE_ML_COMMENT,FOLLOW_2); 
             after(grammarAccess.getContainerFieldAccess().getDocML_COMMENTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__ContainerField__DocAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000004FFFFFF800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000FFFFFF802L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000008000000050L});

}