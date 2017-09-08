/*
 * generated by Xtext 2.10.0
 */
package org.xtext.alma.container.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.alma.container.ide.contentassist.antlr.internal.InternalContainerParser;
import org.xtext.alma.container.services.ContainerGrammarAccess;

public class ContainerParser extends AbstractContentAssistParser {

	@Inject
	private ContainerGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalContainerParser createParser() {
		InternalContainerParser result = new InternalContainerParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getPrimitiveTypesAccess().getAlternatives(), "rule__PrimitiveTypes__Alternatives");
					put(grammarAccess.getBasicTypeAccess().getAlternatives(), "rule__BasicType__Alternatives");
					put(grammarAccess.getPhysicalTypeAccess().getAlternatives(), "rule__PhysicalType__Alternatives");
					put(grammarAccess.getTechnicalTypeAccess().getAlternatives(), "rule__TechnicalType__Alternatives");
					put(grammarAccess.getTimeTypeAccess().getAlternatives(), "rule__TimeType__Alternatives");
					put(grammarAccess.getContainerAccess().getGroup(), "rule__Container__Group__0");
					put(grammarAccess.getContainerFieldAccess().getGroup(), "rule__ContainerField__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getContainerAccess().getDocAssignment_0(), "rule__Container__DocAssignment_0");
					put(grammarAccess.getContainerAccess().getNameAssignment_2(), "rule__Container__NameAssignment_2");
					put(grammarAccess.getContainerAccess().getDataAssignment_4(), "rule__Container__DataAssignment_4");
					put(grammarAccess.getContainerFieldAccess().getPrimitiveTypeAssignment_0(), "rule__ContainerField__PrimitiveTypeAssignment_0");
					put(grammarAccess.getContainerFieldAccess().getNameAssignment_1(), "rule__ContainerField__NameAssignment_1");
					put(grammarAccess.getContainerFieldAccess().getReadOnlyAssignment_2(), "rule__ContainerField__ReadOnlyAssignment_2");
					put(grammarAccess.getContainerFieldAccess().getInitValueAssignment_3(), "rule__ContainerField__InitValueAssignment_3");
					put(grammarAccess.getContainerFieldAccess().getDocAssignment_4(), "rule__ContainerField__DocAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalContainerParser typedParser = (InternalContainerParser) parser;
			typedParser.entryRuleContainer();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_SL_COMMENT" };
	}

	public ContainerGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ContainerGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}