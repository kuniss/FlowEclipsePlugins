/*
* generated by Xtext
*/
package de.grammarcraft.csflow.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import de.grammarcraft.csflow.services.FlowGrammarAccess;

public class FlowParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private FlowGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected de.grammarcraft.csflow.parser.antlr.internal.InternalFlowParser createParser(XtextTokenStream stream) {
		return new de.grammarcraft.csflow.parser.antlr.internal.InternalFlowParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public FlowGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FlowGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
