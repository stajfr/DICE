/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.services.MyjsonGrammarAccess;

public class MyjsonParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private MyjsonGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.example.mydsl.parser.antlr.internal.InternalMyjsonParser createParser(XtextTokenStream stream) {
		return new org.xtext.example.mydsl.parser.antlr.internal.InternalMyjsonParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "TServiceTemplate";
	}
	
	public MyjsonGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MyjsonGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}