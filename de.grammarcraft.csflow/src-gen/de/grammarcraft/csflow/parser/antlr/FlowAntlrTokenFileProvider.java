/*
* generated by Xtext
*/
package de.grammarcraft.csflow.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class FlowAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("de/grammarcraft/csflow/parser/antlr/internal/InternalFlow.tokens");
	}
}
