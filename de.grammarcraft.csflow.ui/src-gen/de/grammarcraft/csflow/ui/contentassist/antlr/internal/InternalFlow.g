/*
* generated by Xtext
*/
grammar InternalFlow;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package de.grammarcraft.csflow.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package de.grammarcraft.csflow.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.grammarcraft.csflow.services.FlowGrammarAccess;

}

@parser::members {
 
 	private FlowGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(FlowGrammarAccess grammarAccess) {
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

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getGroup()); }
(rule__Model__Group__0)
{ after(grammarAccess.getModelAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleQualifiedName
entryRuleQualifiedName 
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
(rule__QualifiedName__Group__0)
{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFunctionUnit
entryRuleFunctionUnit 
:
{ before(grammarAccess.getFunctionUnitRule()); }
	 ruleFunctionUnit
{ after(grammarAccess.getFunctionUnitRule()); } 
	 EOF 
;

// Rule FunctionUnit
ruleFunctionUnit
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFunctionUnitAccess().getAlternatives()); }
(rule__FunctionUnit__Alternatives)
{ after(grammarAccess.getFunctionUnitAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleImport
entryRuleImport 
:
{ before(grammarAccess.getImportRule()); }
	 ruleImport
{ after(grammarAccess.getImportRule()); } 
	 EOF 
;

// Rule Import
ruleImport
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getImportAccess().getGroup()); }
(rule__Import__Group__0)
{ after(grammarAccess.getImportAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFlow
entryRuleFlow 
:
{ before(grammarAccess.getFlowRule()); }
	 ruleFlow
{ after(grammarAccess.getFlowRule()); } 
	 EOF 
;

// Rule Flow
ruleFlow
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFlowAccess().getGroup()); }
(rule__Flow__Group__0)
{ after(grammarAccess.getFlowAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleStream
entryRuleStream 
:
{ before(grammarAccess.getStreamRule()); }
	 ruleStream
{ after(grammarAccess.getStreamRule()); } 
	 EOF 
;

// Rule Stream
ruleStream
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getStreamAccess().getGroup()); }
(rule__Stream__Group__0)
{ after(grammarAccess.getStreamAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleLeftPort
entryRuleLeftPort 
:
{ before(grammarAccess.getLeftPortRule()); }
	 ruleLeftPort
{ after(grammarAccess.getLeftPortRule()); } 
	 EOF 
;

// Rule LeftPort
ruleLeftPort
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getLeftPortAccess().getAlternatives()); }
(rule__LeftPort__Alternatives)
{ after(grammarAccess.getLeftPortAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleGlobalInputPort
entryRuleGlobalInputPort 
:
{ before(grammarAccess.getGlobalInputPortRule()); }
	 ruleGlobalInputPort
{ after(grammarAccess.getGlobalInputPortRule()); } 
	 EOF 
;

// Rule GlobalInputPort
ruleGlobalInputPort
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getGlobalInputPortAccess().getGroup()); }
(rule__GlobalInputPort__Group__0)
{ after(grammarAccess.getGlobalInputPortAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleUnnamedSubFlowPort
entryRuleUnnamedSubFlowPort 
:
{ before(grammarAccess.getUnnamedSubFlowPortRule()); }
	 ruleUnnamedSubFlowPort
{ after(grammarAccess.getUnnamedSubFlowPortRule()); } 
	 EOF 
;

// Rule UnnamedSubFlowPort
ruleUnnamedSubFlowPort
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getUnnamedSubFlowPortAccess().getGroup()); }
(rule__UnnamedSubFlowPort__Group__0)
{ after(grammarAccess.getUnnamedSubFlowPortAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleRightPort
entryRuleRightPort 
:
{ before(grammarAccess.getRightPortRule()); }
	 ruleRightPort
{ after(grammarAccess.getRightPortRule()); } 
	 EOF 
;

// Rule RightPort
ruleRightPort
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getRightPortAccess().getAlternatives()); }
(rule__RightPort__Alternatives)
{ after(grammarAccess.getRightPortAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleGlobalOutputPort
entryRuleGlobalOutputPort 
:
{ before(grammarAccess.getGlobalOutputPortRule()); }
	 ruleGlobalOutputPort
{ after(grammarAccess.getGlobalOutputPortRule()); } 
	 EOF 
;

// Rule GlobalOutputPort
ruleGlobalOutputPort
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getGlobalOutputPortAccess().getGroup()); }
(rule__GlobalOutputPort__Group__0)
{ after(grammarAccess.getGlobalOutputPortAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePort
entryRulePort 
:
{ before(grammarAccess.getPortRule()); }
	 rulePort
{ after(grammarAccess.getPortRule()); } 
	 EOF 
;

// Rule Port
rulePort
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPortAccess().getGroup()); }
(rule__Port__Group__0)
{ after(grammarAccess.getPortAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNamedPort
entryRuleNamedPort 
:
{ before(grammarAccess.getNamedPortRule()); }
	 ruleNamedPort
{ after(grammarAccess.getNamedPortRule()); } 
	 EOF 
;

// Rule NamedPort
ruleNamedPort
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNamedPortAccess().getGroup()); }
(rule__NamedPort__Group__0)
{ after(grammarAccess.getNamedPortAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleOperation
entryRuleOperation 
:
{ before(grammarAccess.getOperationRule()); }
	 ruleOperation
{ after(grammarAccess.getOperationRule()); } 
	 EOF 
;

// Rule Operation
ruleOperation
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getOperationAccess().getAlternatives()); }
(rule__Operation__Alternatives)
{ after(grammarAccess.getOperationAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEbcOperation
entryRuleEbcOperation 
:
{ before(grammarAccess.getEbcOperationRule()); }
	 ruleEbcOperation
{ after(grammarAccess.getEbcOperationRule()); } 
	 EOF 
;

// Rule EbcOperation
ruleEbcOperation
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEbcOperationAccess().getGroup()); }
(rule__EbcOperation__Group__0)
{ after(grammarAccess.getEbcOperationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNativeClass
entryRuleNativeClass 
:
{ before(grammarAccess.getNativeClassRule()); }
	 ruleNativeClass
{ after(grammarAccess.getNativeClassRule()); } 
	 EOF 
;

// Rule NativeClass
ruleNativeClass
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNativeClassAccess().getReferenceAssignment()); }
(rule__NativeClass__ReferenceAssignment)
{ after(grammarAccess.getNativeClassAccess().getReferenceAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMethodOperation
entryRuleMethodOperation 
:
{ before(grammarAccess.getMethodOperationRule()); }
	 ruleMethodOperation
{ after(grammarAccess.getMethodOperationRule()); } 
	 EOF 
;

// Rule MethodOperation
ruleMethodOperation
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMethodOperationAccess().getGroup()); }
(rule__MethodOperation__Group__0)
{ after(grammarAccess.getMethodOperationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNativeMethod
entryRuleNativeMethod 
:
{ before(grammarAccess.getNativeMethodRule()); }
	 ruleNativeMethod
{ after(grammarAccess.getNativeMethodRule()); } 
	 EOF 
;

// Rule NativeMethod
ruleNativeMethod
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNativeMethodAccess().getNameAssignment()); }
(rule__NativeMethod__NameAssignment)
{ after(grammarAccess.getNativeMethodAccess().getNameAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__FunctionUnit__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFunctionUnitAccess().getFlowParserRuleCall_0()); }
	ruleFlow
{ after(grammarAccess.getFunctionUnitAccess().getFlowParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getFunctionUnitAccess().getOperationParserRuleCall_1()); }
	ruleOperation
{ after(grammarAccess.getFunctionUnitAccess().getOperationParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LeftPort__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLeftPortAccess().getGlobalInputPortParserRuleCall_0()); }
	ruleGlobalInputPort
{ after(grammarAccess.getLeftPortAccess().getGlobalInputPortParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getLeftPortAccess().getUnnamedSubFlowPortParserRuleCall_1()); }
	ruleUnnamedSubFlowPort
{ after(grammarAccess.getLeftPortAccess().getUnnamedSubFlowPortParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getLeftPortAccess().getPortParserRuleCall_2()); }
	rulePort
{ after(grammarAccess.getLeftPortAccess().getPortParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RightPort__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRightPortAccess().getGlobalOutputPortParserRuleCall_0()); }
	ruleGlobalOutputPort
{ after(grammarAccess.getRightPortAccess().getGlobalOutputPortParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getRightPortAccess().getUnnamedSubFlowPortParserRuleCall_1()); }
	ruleUnnamedSubFlowPort
{ after(grammarAccess.getRightPortAccess().getUnnamedSubFlowPortParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getRightPortAccess().getPortParserRuleCall_2()); }
	rulePort
{ after(grammarAccess.getRightPortAccess().getPortParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Operation__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperationAccess().getEbcOperationParserRuleCall_0()); }
	ruleEbcOperation
{ after(grammarAccess.getOperationAccess().getEbcOperationParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getOperationAccess().getMethodOperationParserRuleCall_1()); }
	ruleMethodOperation
{ after(grammarAccess.getOperationAccess().getMethodOperationParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Model__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getGroup_0()); }
(rule__Model__Group_0__0)?
{ after(grammarAccess.getModelAccess().getGroup_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__1__Impl
	rule__Model__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getImportsAssignment_1()); }
(rule__Model__ImportsAssignment_1)*
{ after(grammarAccess.getModelAccess().getImportsAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getFunctionUnitsAssignment_2()); }
(rule__Model__FunctionUnitsAssignment_2)*
{ after(grammarAccess.getModelAccess().getFunctionUnitsAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Model__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group_0__0__Impl
	rule__Model__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getPackageKeyword_0_0()); }

	'package' 

{ after(grammarAccess.getModelAccess().getPackageKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getNameAssignment_0_1()); }
(rule__Model__NameAssignment_0_1)
{ after(grammarAccess.getModelAccess().getNameAssignment_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QualifiedName__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
(rule__QualifiedName__Group_1__0)*
{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QualifiedName__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }

	'.' 

{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Import__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Import__Group__0__Impl
	rule__Import__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportAccess().getImportKeyword_0()); }

	'import' 

{ after(grammarAccess.getImportAccess().getImportKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Import__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Import__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); }
(rule__Import__ImportedNamespaceAssignment_1)
{ after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Flow__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Flow__Group__0__Impl
	rule__Flow__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Flow__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFlowAccess().getFlowKeyword_0()); }

	'flow' 

{ after(grammarAccess.getFlowAccess().getFlowKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Flow__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Flow__Group__1__Impl
	rule__Flow__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Flow__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFlowAccess().getNameAssignment_1()); }
(rule__Flow__NameAssignment_1)
{ after(grammarAccess.getFlowAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Flow__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Flow__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Flow__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFlowAccess().getStreamsAssignment_2()); }
(rule__Flow__StreamsAssignment_2)*
{ after(grammarAccess.getFlowAccess().getStreamsAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Stream__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stream__Group__0__Impl
	rule__Stream__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStreamAccess().getLeftPortAssignment_0()); }
(rule__Stream__LeftPortAssignment_0)
{ after(grammarAccess.getStreamAccess().getLeftPortAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Stream__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stream__Group__1__Impl
	rule__Stream__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStreamAccess().getGreaterThanSignKeyword_1()); }

	'>' 

{ after(grammarAccess.getStreamAccess().getGreaterThanSignKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Stream__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stream__Group__2__Impl
	rule__Stream__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStreamAccess().getMessageAssignment_2()); }
(rule__Stream__MessageAssignment_2)
{ after(grammarAccess.getStreamAccess().getMessageAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Stream__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stream__Group__3__Impl
	rule__Stream__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStreamAccess().getGreaterThanSignKeyword_3()); }

	'>' 

{ after(grammarAccess.getStreamAccess().getGreaterThanSignKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Stream__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stream__Group__4__Impl
	rule__Stream__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStreamAccess().getRightPortAssignment_4()); }
(rule__Stream__RightPortAssignment_4)
{ after(grammarAccess.getStreamAccess().getRightPortAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Stream__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stream__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStreamAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getStreamAccess().getSemicolonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__GlobalInputPort__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__GlobalInputPort__Group__0__Impl
	rule__GlobalInputPort__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GlobalInputPort__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGlobalInputPortAccess().getFullStopKeyword_0()); }

	'.' 

{ after(grammarAccess.getGlobalInputPortAccess().getFullStopKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__GlobalInputPort__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__GlobalInputPort__Group__1__Impl
	rule__GlobalInputPort__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GlobalInputPort__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGlobalInputPortAccess().getInKeyword_1()); }

	'in' 

{ after(grammarAccess.getGlobalInputPortAccess().getInKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__GlobalInputPort__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__GlobalInputPort__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GlobalInputPort__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGlobalInputPortAccess().getGlobalInputPortAction_2()); }
(

)
{ after(grammarAccess.getGlobalInputPortAccess().getGlobalInputPortAction_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__UnnamedSubFlowPort__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UnnamedSubFlowPort__Group__0__Impl
	rule__UnnamedSubFlowPort__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UnnamedSubFlowPort__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUnnamedSubFlowPortAccess().getFullStopKeyword_0()); }

	'.' 

{ after(grammarAccess.getUnnamedSubFlowPortAccess().getFullStopKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UnnamedSubFlowPort__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UnnamedSubFlowPort__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UnnamedSubFlowPort__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUnnamedSubFlowPortAccess().getUnnamedSubFlowPortAction_1()); }
(

)
{ after(grammarAccess.getUnnamedSubFlowPortAccess().getUnnamedSubFlowPortAction_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__GlobalOutputPort__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__GlobalOutputPort__Group__0__Impl
	rule__GlobalOutputPort__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GlobalOutputPort__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGlobalOutputPortAccess().getFullStopKeyword_0()); }

	'.' 

{ after(grammarAccess.getGlobalOutputPortAccess().getFullStopKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__GlobalOutputPort__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__GlobalOutputPort__Group__1__Impl
	rule__GlobalOutputPort__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GlobalOutputPort__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGlobalOutputPortAccess().getOutKeyword_1()); }

	'out' 

{ after(grammarAccess.getGlobalOutputPortAccess().getOutKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__GlobalOutputPort__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__GlobalOutputPort__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GlobalOutputPort__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGlobalOutputPortAccess().getGlobalOutputPortAction_2()); }
(

)
{ after(grammarAccess.getGlobalOutputPortAccess().getGlobalOutputPortAction_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Port__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Port__Group__0__Impl
	rule__Port__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getFunctionUnitAssignment_0()); }
(rule__Port__FunctionUnitAssignment_0)
{ after(grammarAccess.getPortAccess().getFunctionUnitAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Port__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Port__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getPortAssignment_1()); }
(rule__Port__PortAssignment_1)?
{ after(grammarAccess.getPortAccess().getPortAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__NamedPort__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NamedPort__Group__0__Impl
	rule__NamedPort__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedPort__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNamedPortAccess().getFullStopKeyword_0()); }

	'.' 

{ after(grammarAccess.getNamedPortAccess().getFullStopKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NamedPort__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NamedPort__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NamedPort__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNamedPortAccess().getNameAssignment_1()); }
(rule__NamedPort__NameAssignment_1)
{ after(grammarAccess.getNamedPortAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__EbcOperation__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EbcOperation__Group__0__Impl
	rule__EbcOperation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EbcOperation__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEbcOperationAccess().getEbcKeyword_0()); }

	'ebc' 

{ after(grammarAccess.getEbcOperationAccess().getEbcKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EbcOperation__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EbcOperation__Group__1__Impl
	rule__EbcOperation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EbcOperation__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEbcOperationAccess().getNameAssignment_1()); }
(rule__EbcOperation__NameAssignment_1)
{ after(grammarAccess.getEbcOperationAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EbcOperation__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EbcOperation__Group__2__Impl
	rule__EbcOperation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EbcOperation__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEbcOperationAccess().getEqualsSignKeyword_2()); }

	'=' 

{ after(grammarAccess.getEbcOperationAccess().getEqualsSignKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EbcOperation__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EbcOperation__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EbcOperation__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEbcOperationAccess().getClassAssignment_3()); }
(rule__EbcOperation__ClassAssignment_3)
{ after(grammarAccess.getEbcOperationAccess().getClassAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__MethodOperation__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MethodOperation__Group__0__Impl
	rule__MethodOperation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodOperation__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodOperationAccess().getMethodKeyword_0()); }

	'method' 

{ after(grammarAccess.getMethodOperationAccess().getMethodKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MethodOperation__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MethodOperation__Group__1__Impl
	rule__MethodOperation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodOperation__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodOperationAccess().getNameAssignment_1()); }
(rule__MethodOperation__NameAssignment_1)
{ after(grammarAccess.getMethodOperationAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MethodOperation__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MethodOperation__Group__2__Impl
	rule__MethodOperation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodOperation__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodOperationAccess().getEqualsSignKeyword_2()); }

	'=' 

{ after(grammarAccess.getMethodOperationAccess().getEqualsSignKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MethodOperation__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MethodOperation__Group__3__Impl
	rule__MethodOperation__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodOperation__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodOperationAccess().getClassAssignment_3()); }
(rule__MethodOperation__ClassAssignment_3)
{ after(grammarAccess.getMethodOperationAccess().getClassAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MethodOperation__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MethodOperation__Group__4__Impl
	rule__MethodOperation__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodOperation__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodOperationAccess().getNumberSignKeyword_4()); }

	'#' 

{ after(grammarAccess.getMethodOperationAccess().getNumberSignKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__MethodOperation__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__MethodOperation__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MethodOperation__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodOperationAccess().getMethodAssignment_5()); }
(rule__MethodOperation__MethodAssignment_5)
{ after(grammarAccess.getMethodOperationAccess().getMethodAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}















rule__Model__NameAssignment_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_0_1_0()); }
	ruleQualifiedName{ after(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Model__ImportsAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_1_0()); }
	ruleImport{ after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Model__FunctionUnitsAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getFunctionUnitsFunctionUnitParserRuleCall_2_0()); }
	ruleFunctionUnit{ after(grammarAccess.getModelAccess().getFunctionUnitsFunctionUnitParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Import__ImportedNamespaceAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); }
	ruleQualifiedName{ after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Flow__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFlowAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getFlowAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Flow__StreamsAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFlowAccess().getStreamsStreamParserRuleCall_2_0()); }
	ruleStream{ after(grammarAccess.getFlowAccess().getStreamsStreamParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__LeftPortAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStreamAccess().getLeftPortLeftPortParserRuleCall_0_0()); }
	ruleLeftPort{ after(grammarAccess.getStreamAccess().getLeftPortLeftPortParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__MessageAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStreamAccess().getMessageQualifiedNameParserRuleCall_2_0()); }
	ruleQualifiedName{ after(grammarAccess.getStreamAccess().getMessageQualifiedNameParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Stream__RightPortAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStreamAccess().getRightPortRightPortParserRuleCall_4_0()); }
	ruleRightPort{ after(grammarAccess.getStreamAccess().getRightPortRightPortParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Port__FunctionUnitAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getFunctionUnitFunctionUnitCrossReference_0_0()); }
(
{ before(grammarAccess.getPortAccess().getFunctionUnitFunctionUnitIDTerminalRuleCall_0_0_1()); }
	RULE_ID{ after(grammarAccess.getPortAccess().getFunctionUnitFunctionUnitIDTerminalRuleCall_0_0_1()); }
)
{ after(grammarAccess.getPortAccess().getFunctionUnitFunctionUnitCrossReference_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Port__PortAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getPortNamedPortParserRuleCall_1_0()); }
	ruleNamedPort{ after(grammarAccess.getPortAccess().getPortNamedPortParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__NamedPort__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNamedPortAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getNamedPortAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EbcOperation__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEbcOperationAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getEbcOperationAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EbcOperation__ClassAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEbcOperationAccess().getClassNativeClassParserRuleCall_3_0()); }
	ruleNativeClass{ after(grammarAccess.getEbcOperationAccess().getClassNativeClassParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__NativeClass__ReferenceAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNativeClassAccess().getReferenceQualifiedNameParserRuleCall_0()); }
	ruleQualifiedName{ after(grammarAccess.getNativeClassAccess().getReferenceQualifiedNameParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MethodOperation__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodOperationAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getMethodOperationAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MethodOperation__ClassAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodOperationAccess().getClassNativeClassParserRuleCall_3_0()); }
	ruleNativeClass{ after(grammarAccess.getMethodOperationAccess().getClassNativeClassParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MethodOperation__MethodAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMethodOperationAccess().getMethodNativeMethodParserRuleCall_5_0()); }
	ruleNativeMethod{ after(grammarAccess.getMethodOperationAccess().getMethodNativeMethodParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__NativeMethod__NameAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNativeMethodAccess().getNameIDTerminalRuleCall_0()); }
	RULE_ID{ after(grammarAccess.getNativeMethodAccess().getNameIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

