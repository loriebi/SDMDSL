/*
 * generated by Xtext 2.9.1
 */
package org.xtext.alma.enumeration.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.alma.enumeration.ide.contentassist.antlr.internal.InternalEnumerationParser;
import org.xtext.alma.enumeration.services.EnumerationGrammarAccess;

public class EnumerationParser extends AbstractContentAssistParser {

	@Inject
	private EnumerationGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalEnumerationParser createParser() {
		InternalEnumerationParser result = new InternalEnumerationParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEnumTypeAccess().getGroup(), "rule__EnumType__Group__0");
					put(grammarAccess.getEnumValueWithoutCommaAccess().getGroup(), "rule__EnumValueWithoutComma__Group__0");
					put(grammarAccess.getEnumValueAccess().getGroup(), "rule__EnumValue__Group__0");
					put(grammarAccess.getEnumTypeAccess().getDocGlobalAssignment_0(), "rule__EnumType__DocGlobalAssignment_0");
					put(grammarAccess.getEnumTypeAccess().getVersionAssignment_2(), "rule__EnumType__VersionAssignment_2");
					put(grammarAccess.getEnumTypeAccess().getRevisionAssignment_4(), "rule__EnumType__RevisionAssignment_4");
					put(grammarAccess.getEnumTypeAccess().getXmlnsAssignment_6(), "rule__EnumType__XmlnsAssignment_6");
					put(grammarAccess.getEnumTypeAccess().getDocEnumAssignment_7(), "rule__EnumType__DocEnumAssignment_7");
					put(grammarAccess.getEnumTypeAccess().getNameAssignment_9(), "rule__EnumType__NameAssignment_9");
					put(grammarAccess.getEnumTypeAccess().getValuesAssignment_11(), "rule__EnumType__ValuesAssignment_11");
					put(grammarAccess.getEnumTypeAccess().getValuesAssignment_12(), "rule__EnumType__ValuesAssignment_12");
					put(grammarAccess.getEnumValueWithoutCommaAccess().getNameAssignment_0(), "rule__EnumValueWithoutComma__NameAssignment_0");
					put(grammarAccess.getEnumValueWithoutCommaAccess().getDocAssignment_1(), "rule__EnumValueWithoutComma__DocAssignment_1");
					put(grammarAccess.getEnumValueAccess().getNameAssignment_1(), "rule__EnumValue__NameAssignment_1");
					put(grammarAccess.getEnumValueAccess().getDocAssignment_2(), "rule__EnumValue__DocAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalEnumerationParser typedParser = (InternalEnumerationParser) parser;
			typedParser.entryRuleEnumType();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_SL_COMMENT" };
	}

	public EnumerationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EnumerationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
