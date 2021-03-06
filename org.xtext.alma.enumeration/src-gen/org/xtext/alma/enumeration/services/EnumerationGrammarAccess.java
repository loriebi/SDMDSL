/*
 * generated by Xtext 2.9.1
 */
package org.xtext.alma.enumeration.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class EnumerationGrammarAccess extends AbstractGrammarElementFinder {
	
	public class EnumTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.alma.enumeration.Enumeration.EnumType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDocGlobalAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDocGlobalML_COMMENTTerminalRuleCall_0_0 = (RuleCall)cDocGlobalAssignment_0.eContents().get(0);
		private final Keyword cVersionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cVersionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cVersionINTTerminalRuleCall_2_0 = (RuleCall)cVersionAssignment_2.eContents().get(0);
		private final Keyword cRevisionKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cRevisionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cRevisionSTRINGTerminalRuleCall_4_0 = (RuleCall)cRevisionAssignment_4.eContents().get(0);
		private final Keyword cXmlnsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cXmlnsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cXmlnsSTRINGTerminalRuleCall_6_0 = (RuleCall)cXmlnsAssignment_6.eContents().get(0);
		private final Assignment cDocEnumAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cDocEnumML_COMMENTTerminalRuleCall_7_0 = (RuleCall)cDocEnumAssignment_7.eContents().get(0);
		private final Keyword cEnumKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cNameAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cNameIDTerminalRuleCall_9_0 = (RuleCall)cNameAssignment_9.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Assignment cValuesAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cValuesEnumValueWithoutCommaParserRuleCall_11_0 = (RuleCall)cValuesAssignment_11.eContents().get(0);
		private final Assignment cValuesAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cValuesEnumValueParserRuleCall_12_0 = (RuleCall)cValuesAssignment_12.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		//EnumType:
		//	docGlobal=ML_COMMENT?
		//	'version' version=INT
		//	'revision' revision=STRING
		//	'xmlns' xmlns=STRING
		//	docEnum=ML_COMMENT?
		//	'enum' name=ID '{'
		//	values+=EnumValueWithoutComma
		//	values+=EnumValue*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//docGlobal=ML_COMMENT? 'version' version=INT 'revision' revision=STRING 'xmlns' xmlns=STRING docEnum=ML_COMMENT? 'enum'
		//name=ID '{' values+=EnumValueWithoutComma values+=EnumValue* '}'
		public Group getGroup() { return cGroup; }
		
		//docGlobal=ML_COMMENT?
		public Assignment getDocGlobalAssignment_0() { return cDocGlobalAssignment_0; }
		
		//ML_COMMENT
		public RuleCall getDocGlobalML_COMMENTTerminalRuleCall_0_0() { return cDocGlobalML_COMMENTTerminalRuleCall_0_0; }
		
		//'version'
		public Keyword getVersionKeyword_1() { return cVersionKeyword_1; }
		
		//version=INT
		public Assignment getVersionAssignment_2() { return cVersionAssignment_2; }
		
		//INT
		public RuleCall getVersionINTTerminalRuleCall_2_0() { return cVersionINTTerminalRuleCall_2_0; }
		
		//'revision'
		public Keyword getRevisionKeyword_3() { return cRevisionKeyword_3; }
		
		//revision=STRING
		public Assignment getRevisionAssignment_4() { return cRevisionAssignment_4; }
		
		//STRING
		public RuleCall getRevisionSTRINGTerminalRuleCall_4_0() { return cRevisionSTRINGTerminalRuleCall_4_0; }
		
		//'xmlns'
		public Keyword getXmlnsKeyword_5() { return cXmlnsKeyword_5; }
		
		//xmlns=STRING
		public Assignment getXmlnsAssignment_6() { return cXmlnsAssignment_6; }
		
		//STRING
		public RuleCall getXmlnsSTRINGTerminalRuleCall_6_0() { return cXmlnsSTRINGTerminalRuleCall_6_0; }
		
		//docEnum=ML_COMMENT?
		public Assignment getDocEnumAssignment_7() { return cDocEnumAssignment_7; }
		
		//ML_COMMENT
		public RuleCall getDocEnumML_COMMENTTerminalRuleCall_7_0() { return cDocEnumML_COMMENTTerminalRuleCall_7_0; }
		
		//'enum'
		public Keyword getEnumKeyword_8() { return cEnumKeyword_8; }
		
		//name=ID
		public Assignment getNameAssignment_9() { return cNameAssignment_9; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_9_0() { return cNameIDTerminalRuleCall_9_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_10() { return cLeftCurlyBracketKeyword_10; }
		
		//values+=EnumValueWithoutComma
		public Assignment getValuesAssignment_11() { return cValuesAssignment_11; }
		
		//EnumValueWithoutComma
		public RuleCall getValuesEnumValueWithoutCommaParserRuleCall_11_0() { return cValuesEnumValueWithoutCommaParserRuleCall_11_0; }
		
		//values+=EnumValue*
		public Assignment getValuesAssignment_12() { return cValuesAssignment_12; }
		
		//EnumValue
		public RuleCall getValuesEnumValueParserRuleCall_12_0() { return cValuesEnumValueParserRuleCall_12_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_13() { return cRightCurlyBracketKeyword_13; }
	}
	public class EnumValueWithoutCommaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.alma.enumeration.Enumeration.EnumValueWithoutComma");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cDocAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDocML_COMMENTTerminalRuleCall_1_0 = (RuleCall)cDocAssignment_1.eContents().get(0);
		
		//EnumValueWithoutComma:
		//	name=ID doc=ML_COMMENT?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID doc=ML_COMMENT?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//doc=ML_COMMENT?
		public Assignment getDocAssignment_1() { return cDocAssignment_1; }
		
		//ML_COMMENT
		public RuleCall getDocML_COMMENTTerminalRuleCall_1_0() { return cDocML_COMMENTTerminalRuleCall_1_0; }
	}
	public class EnumValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.alma.enumeration.Enumeration.EnumValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommaKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cDocAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDocML_COMMENTTerminalRuleCall_2_0 = (RuleCall)cDocAssignment_2.eContents().get(0);
		
		//EnumValue:
		//	',' name=ID doc=ML_COMMENT?;
		@Override public ParserRule getRule() { return rule; }
		
		//',' name=ID doc=ML_COMMENT?
		public Group getGroup() { return cGroup; }
		
		//','
		public Keyword getCommaKeyword_0() { return cCommaKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//doc=ML_COMMENT?
		public Assignment getDocAssignment_2() { return cDocAssignment_2; }
		
		//ML_COMMENT
		public RuleCall getDocML_COMMENTTerminalRuleCall_2_0() { return cDocML_COMMENTTerminalRuleCall_2_0; }
	}
	
	
	private final EnumTypeElements pEnumType;
	private final EnumValueWithoutCommaElements pEnumValueWithoutComma;
	private final EnumValueElements pEnumValue;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public EnumerationGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pEnumType = new EnumTypeElements();
		this.pEnumValueWithoutComma = new EnumValueWithoutCommaElements();
		this.pEnumValue = new EnumValueElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.alma.enumeration.Enumeration".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//EnumType:
	//	docGlobal=ML_COMMENT?
	//	'version' version=INT
	//	'revision' revision=STRING
	//	'xmlns' xmlns=STRING
	//	docEnum=ML_COMMENT?
	//	'enum' name=ID '{'
	//	values+=EnumValueWithoutComma
	//	values+=EnumValue*
	//	'}';
	public EnumTypeElements getEnumTypeAccess() {
		return pEnumType;
	}
	
	public ParserRule getEnumTypeRule() {
		return getEnumTypeAccess().getRule();
	}
	
	//EnumValueWithoutComma:
	//	name=ID doc=ML_COMMENT?;
	public EnumValueWithoutCommaElements getEnumValueWithoutCommaAccess() {
		return pEnumValueWithoutComma;
	}
	
	public ParserRule getEnumValueWithoutCommaRule() {
		return getEnumValueWithoutCommaAccess().getRule();
	}
	
	//EnumValue:
	//	',' name=ID doc=ML_COMMENT?;
	public EnumValueElements getEnumValueAccess() {
		return pEnumValue;
	}
	
	public ParserRule getEnumValueRule() {
		return getEnumValueAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
