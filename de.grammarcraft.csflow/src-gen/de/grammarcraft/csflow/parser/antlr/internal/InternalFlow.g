/*
* generated by Xtext
*/
grammar InternalFlow;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package de.grammarcraft.csflow.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package de.grammarcraft.csflow.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.grammarcraft.csflow.services.FlowGrammarAccess;

}

@parser::members {

 	private FlowGrammarAccess grammarAccess;
 	
    public InternalFlowParser(TokenStream input, FlowGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected FlowGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='package' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
	    }
		lv_name_1_0=ruleQualifiedName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"QualifiedName");
	        afterParserOrEnumRuleCall();
	    }

)
))?(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_1_0()); 
	    }
		lv_imports_2_0=ruleImport		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"imports",
        		lv_imports_2_0, 
        		"Import");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getFunctionUnitsFunctionUnitParserRuleCall_2_0()); 
	    }
		lv_functionUnits_3_0=ruleFunctionUnit		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"functionUnits",
        		lv_functionUnits_3_0, 
        		"FunctionUnit");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); } 
	 iv_ruleQualifiedName=ruleQualifiedName 
	 { $current=$iv_ruleQualifiedName.current.getText(); }  
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;





// Entry rule entryRuleFunctionUnit
entryRuleFunctionUnit returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFunctionUnitRule()); }
	 iv_ruleFunctionUnit=ruleFunctionUnit 
	 { $current=$iv_ruleFunctionUnit.current; } 
	 EOF 
;

// Rule FunctionUnit
ruleFunctionUnit returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getFunctionUnitAccess().getFlowParserRuleCall_0()); 
    }
    this_Flow_0=ruleFlow
    { 
        $current = $this_Flow_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getFunctionUnitAccess().getOperationParserRuleCall_1()); 
    }
    this_Operation_1=ruleOperation
    { 
        $current = $this_Operation_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	 iv_ruleImport=ruleImport 
	 { $current=$iv_ruleImport.current; } 
	 EOF 
;

// Rule Import
ruleImport returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='import' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); 
	    }
		lv_importedNamespace_1_0=ruleQualifiedName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getImportRule());
	        }
       		set(
       			$current, 
       			"importedNamespace",
        		lv_importedNamespace_1_0, 
        		"QualifiedName");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleFlow
entryRuleFlow returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFlowRule()); }
	 iv_ruleFlow=ruleFlow 
	 { $current=$iv_ruleFlow.current; } 
	 EOF 
;

// Rule Flow
ruleFlow returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='flow' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getFlowAccess().getFlowKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getFlowAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFlowRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getFlowAccess().getStreamsStreamParserRuleCall_2_0()); 
	    }
		lv_streams_2_0=ruleStream		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFlowRule());
	        }
       		add(
       			$current, 
       			"streams",
        		lv_streams_2_0, 
        		"Stream");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleStream
entryRuleStream returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStreamRule()); }
	 iv_ruleStream=ruleStream 
	 { $current=$iv_ruleStream.current; } 
	 EOF 
;

// Rule Stream
ruleStream returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getStreamAccess().getLeftPortLeftPortParserRuleCall_0_0()); 
	    }
		lv_leftPort_0_0=ruleLeftPort		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStreamRule());
	        }
       		set(
       			$current, 
       			"leftPort",
        		lv_leftPort_0_0, 
        		"LeftPort");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='>' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getStreamAccess().getGreaterThanSignKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStreamAccess().getMessageQualifiedNameParserRuleCall_2_0()); 
	    }
		lv_message_2_0=ruleQualifiedName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStreamRule());
	        }
       		set(
       			$current, 
       			"message",
        		lv_message_2_0, 
        		"QualifiedName");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='>' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getStreamAccess().getGreaterThanSignKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStreamAccess().getRightPortRightPortParserRuleCall_4_0()); 
	    }
		lv_rightPort_4_0=ruleRightPort		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStreamRule());
	        }
       		set(
       			$current, 
       			"rightPort",
        		lv_rightPort_4_0, 
        		"RightPort");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getStreamAccess().getSemicolonKeyword_5());
    }
)
;





// Entry rule entryRuleLeftPort
entryRuleLeftPort returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLeftPortRule()); }
	 iv_ruleLeftPort=ruleLeftPort 
	 { $current=$iv_ruleLeftPort.current; } 
	 EOF 
;

// Rule LeftPort
ruleLeftPort returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getLeftPortAccess().getGlobalInputPortParserRuleCall_0()); 
    }
    this_GlobalInputPort_0=ruleGlobalInputPort
    { 
        $current = $this_GlobalInputPort_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getLeftPortAccess().getUnnamedSubFlowPortParserRuleCall_1()); 
    }
    this_UnnamedSubFlowPort_1=ruleUnnamedSubFlowPort
    { 
        $current = $this_UnnamedSubFlowPort_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getLeftPortAccess().getPortParserRuleCall_2()); 
    }
    this_Port_2=rulePort
    { 
        $current = $this_Port_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleGlobalInputPort
entryRuleGlobalInputPort returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGlobalInputPortRule()); }
	 iv_ruleGlobalInputPort=ruleGlobalInputPort 
	 { $current=$iv_ruleGlobalInputPort.current; } 
	 EOF 
;

// Rule GlobalInputPort
ruleGlobalInputPort returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='.' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getGlobalInputPortAccess().getFullStopKeyword_0());
    }
	otherlv_1='in' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getGlobalInputPortAccess().getInKeyword_1());
    }
(
    {
        $current = forceCreateModelElement(
            grammarAccess.getGlobalInputPortAccess().getGlobalInputPortAction_2(),
            $current);
    }
))
;





// Entry rule entryRuleUnnamedSubFlowPort
entryRuleUnnamedSubFlowPort returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getUnnamedSubFlowPortRule()); }
	 iv_ruleUnnamedSubFlowPort=ruleUnnamedSubFlowPort 
	 { $current=$iv_ruleUnnamedSubFlowPort.current; } 
	 EOF 
;

// Rule UnnamedSubFlowPort
ruleUnnamedSubFlowPort returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='.' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getUnnamedSubFlowPortAccess().getFullStopKeyword_0());
    }
(
    {
        $current = forceCreateModelElement(
            grammarAccess.getUnnamedSubFlowPortAccess().getUnnamedSubFlowPortAction_1(),
            $current);
    }
))
;





// Entry rule entryRuleRightPort
entryRuleRightPort returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRightPortRule()); }
	 iv_ruleRightPort=ruleRightPort 
	 { $current=$iv_ruleRightPort.current; } 
	 EOF 
;

// Rule RightPort
ruleRightPort returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getRightPortAccess().getGlobalOutputPortParserRuleCall_0()); 
    }
    this_GlobalOutputPort_0=ruleGlobalOutputPort
    { 
        $current = $this_GlobalOutputPort_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getRightPortAccess().getUnnamedSubFlowPortParserRuleCall_1()); 
    }
    this_UnnamedSubFlowPort_1=ruleUnnamedSubFlowPort
    { 
        $current = $this_UnnamedSubFlowPort_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getRightPortAccess().getPortParserRuleCall_2()); 
    }
    this_Port_2=rulePort
    { 
        $current = $this_Port_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleGlobalOutputPort
entryRuleGlobalOutputPort returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGlobalOutputPortRule()); }
	 iv_ruleGlobalOutputPort=ruleGlobalOutputPort 
	 { $current=$iv_ruleGlobalOutputPort.current; } 
	 EOF 
;

// Rule GlobalOutputPort
ruleGlobalOutputPort returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='.' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getGlobalOutputPortAccess().getFullStopKeyword_0());
    }
	otherlv_1='out' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getGlobalOutputPortAccess().getOutKeyword_1());
    }
(
    {
        $current = forceCreateModelElement(
            grammarAccess.getGlobalOutputPortAccess().getGlobalOutputPortAction_2(),
            $current);
    }
))
;





// Entry rule entryRulePort
entryRulePort returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPortRule()); }
	 iv_rulePort=rulePort 
	 { $current=$iv_rulePort.current; } 
	 EOF 
;

// Rule Port
rulePort returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getPortRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getPortAccess().getFunctionUnitFunctionUnitCrossReference_0_0()); 
	}

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getPortAccess().getPortNamedPortParserRuleCall_1_0()); 
	    }
		lv_port_1_0=ruleNamedPort		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPortRule());
	        }
       		set(
       			$current, 
       			"port",
        		lv_port_1_0, 
        		"NamedPort");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleNamedPort
entryRuleNamedPort returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNamedPortRule()); }
	 iv_ruleNamedPort=ruleNamedPort 
	 { $current=$iv_ruleNamedPort.current; } 
	 EOF 
;

// Rule NamedPort
ruleNamedPort returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='.' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getNamedPortAccess().getFullStopKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getNamedPortAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNamedPortRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleOperation
entryRuleOperation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOperationRule()); }
	 iv_ruleOperation=ruleOperation 
	 { $current=$iv_ruleOperation.current; } 
	 EOF 
;

// Rule Operation
ruleOperation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getOperationAccess().getEbcOperationParserRuleCall_0()); 
    }
    this_EbcOperation_0=ruleEbcOperation
    { 
        $current = $this_EbcOperation_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getOperationAccess().getMethodOperationParserRuleCall_1()); 
    }
    this_MethodOperation_1=ruleMethodOperation
    { 
        $current = $this_MethodOperation_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getOperationAccess().getClassOperationParserRuleCall_2()); 
    }
    this_ClassOperation_2=ruleClassOperation
    { 
        $current = $this_ClassOperation_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleEbcOperation
entryRuleEbcOperation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEbcOperationRule()); }
	 iv_ruleEbcOperation=ruleEbcOperation 
	 { $current=$iv_ruleEbcOperation.current; } 
	 EOF 
;

// Rule EbcOperation
ruleEbcOperation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='ebc' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEbcOperationAccess().getEbcKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getEbcOperationAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEbcOperationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='=' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEbcOperationAccess().getEqualsSignKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEbcOperationAccess().getClassNativeClassParserRuleCall_3_0()); 
	    }
		lv_class_3_0=ruleNativeClass		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEbcOperationRule());
	        }
       		set(
       			$current, 
       			"class",
        		lv_class_3_0, 
        		"NativeClass");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleNativeClass
entryRuleNativeClass returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNativeClassRule()); }
	 iv_ruleNativeClass=ruleNativeClass 
	 { $current=$iv_ruleNativeClass.current; } 
	 EOF 
;

// Rule NativeClass
ruleNativeClass returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getNativeClassAccess().getReferenceQualifiedNameParserRuleCall_0()); 
	    }
		lv_reference_0_0=ruleQualifiedName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNativeClassRule());
	        }
       		set(
       			$current, 
       			"reference",
        		lv_reference_0_0, 
        		"QualifiedName");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleClassOperation
entryRuleClassOperation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getClassOperationRule()); }
	 iv_ruleClassOperation=ruleClassOperation 
	 { $current=$iv_ruleClassOperation.current; } 
	 EOF 
;

// Rule ClassOperation
ruleClassOperation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='operation' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getClassOperationAccess().getOperationKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getClassOperationAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getClassOperationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='=' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getClassOperationAccess().getEqualsSignKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getClassOperationAccess().getClassNativeClassParserRuleCall_3_0()); 
	    }
		lv_class_3_0=ruleNativeClass		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClassOperationRule());
	        }
       		set(
       			$current, 
       			"class",
        		lv_class_3_0, 
        		"NativeClass");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleMethodOperation
entryRuleMethodOperation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMethodOperationRule()); }
	 iv_ruleMethodOperation=ruleMethodOperation 
	 { $current=$iv_ruleMethodOperation.current; } 
	 EOF 
;

// Rule MethodOperation
ruleMethodOperation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='method' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMethodOperationAccess().getMethodKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMethodOperationAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMethodOperationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='=' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMethodOperationAccess().getEqualsSignKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMethodOperationAccess().getClassNativeClassParserRuleCall_3_0()); 
	    }
		lv_class_3_0=ruleNativeClass		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMethodOperationRule());
	        }
       		set(
       			$current, 
       			"class",
        		lv_class_3_0, 
        		"NativeClass");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4='#' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMethodOperationAccess().getNumberSignKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMethodOperationAccess().getMethodNativeMethodParserRuleCall_5_0()); 
	    }
		lv_method_5_0=ruleNativeMethod		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMethodOperationRule());
	        }
       		set(
       			$current, 
       			"method",
        		lv_method_5_0, 
        		"NativeMethod");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getMethodOperationAccess().getSignatureSignatureParserRuleCall_6_0()); 
	    }
		lv_signature_6_0=ruleSignature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMethodOperationRule());
	        }
       		set(
       			$current, 
       			"signature",
        		lv_signature_6_0, 
        		"Signature");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleSignature
entryRuleSignature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSignatureRule()); }
	 iv_ruleSignature=ruleSignature 
	 { $current=$iv_ruleSignature.current; } 
	 EOF 
;

// Rule Signature
ruleSignature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='as' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSignatureAccess().getAsKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSignatureAccess().getTypeGenericTypeParserRuleCall_1_0()); 
	    }
		lv_type_1_0=ruleGenericType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSignatureRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_1_0, 
        		"GenericType");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleGenericType
entryRuleGenericType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGenericTypeRule()); }
	 iv_ruleGenericType=ruleGenericType 
	 { $current=$iv_ruleGenericType.current; } 
	 EOF 
;

// Rule GenericType
ruleGenericType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getGenericTypeAccess().getOperationTypeOperationTypeParserRuleCall_0_0()); 
	    }
		lv_operationType_0_0=ruleOperationType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGenericTypeRule());
	        }
       		set(
       			$current, 
       			"operationType",
        		lv_operationType_0_0, 
        		"OperationType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getGenericTypeAccess().getOperationTypeParametersOperationTypeParametersParserRuleCall_1_0()); 
	    }
		lv_operationTypeParameters_1_0=ruleOperationTypeParameters		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGenericTypeRule());
	        }
       		set(
       			$current, 
       			"operationTypeParameters",
        		lv_operationTypeParameters_1_0, 
        		"OperationTypeParameters");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleOperationType
entryRuleOperationType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOperationTypeRule()); }
	 iv_ruleOperationType=ruleOperationType 
	 { $current=$iv_ruleOperationType.current; } 
	 EOF 
;

// Rule OperationType
ruleOperationType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
(
		lv_name_0_1=	'Action' 
    {
        newLeafNode(lv_name_0_1, grammarAccess.getOperationTypeAccess().getNameActionKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOperationTypeRule());
	        }
       		setWithLastConsumed($current, "name", lv_name_0_1, null);
	    }

    |		lv_name_0_2=	'Func' 
    {
        newLeafNode(lv_name_0_2, grammarAccess.getOperationTypeAccess().getNameFuncKeyword_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOperationTypeRule());
	        }
       		setWithLastConsumed($current, "name", lv_name_0_2, null);
	    }

)

)
)
;





// Entry rule entryRuleOperationTypeParameters
entryRuleOperationTypeParameters returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOperationTypeParametersRule()); }
	 iv_ruleOperationTypeParameters=ruleOperationTypeParameters 
	 { $current=$iv_ruleOperationTypeParameters.current; } 
	 EOF 
;

// Rule OperationTypeParameters
ruleOperationTypeParameters returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='<' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getOperationTypeParametersAccess().getLessThanSignKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOperationTypeParametersAccess().getTypeParameterTypeParameterParserRuleCall_1_0()); 
	    }
		lv_typeParameter_1_0=ruleTypeParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOperationTypeParametersRule());
	        }
       		set(
       			$current, 
       			"typeParameter",
        		lv_typeParameter_1_0, 
        		"TypeParameter");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getOperationTypeParametersAccess().getTypeParametersCSTypeParameterParserRuleCall_2_0()); 
	    }
		lv_typeParameters_2_0=ruleCSTypeParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOperationTypeParametersRule());
	        }
       		add(
       			$current, 
       			"typeParameters",
        		lv_typeParameters_2_0, 
        		"CSTypeParameter");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_3='>' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getOperationTypeParametersAccess().getGreaterThanSignKeyword_3());
    }
)
;





// Entry rule entryRuleTypeParameter
entryRuleTypeParameter returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeParameterRule()); }
	 iv_ruleTypeParameter=ruleTypeParameter 
	 { $current=$iv_ruleTypeParameter.current; } 
	 EOF 
;

// Rule TypeParameter
ruleTypeParameter returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getTypeParameterAccess().getGenericTypeParserRuleCall_0()); 
    }
    this_GenericType_0=ruleGenericType
    { 
        $current = $this_GenericType_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getTypeParameterAccess().getTypeParserRuleCall_1()); 
    }
    this_Type_1=ruleType
    { 
        $current = $this_Type_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleCSTypeParameter
entryRuleCSTypeParameter returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCSTypeParameterRule()); }
	 iv_ruleCSTypeParameter=ruleCSTypeParameter 
	 { $current=$iv_ruleCSTypeParameter.current; } 
	 EOF 
;

// Rule CSTypeParameter
ruleCSTypeParameter returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0=',' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getCSTypeParameterAccess().getCommaKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCSTypeParameterAccess().getTypeParameterTypeParameterParserRuleCall_1_0()); 
	    }
		lv_typeParameter_1_0=ruleTypeParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCSTypeParameterRule());
	        }
       		set(
       			$current, 
       			"typeParameter",
        		lv_typeParameter_1_0, 
        		"TypeParameter");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleType
entryRuleType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	 iv_ruleType=ruleType 
	 { $current=$iv_ruleType.current; } 
	 EOF 
;

// Rule Type
ruleType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getTypeAccess().getReferenceQualifiedNameParserRuleCall_0()); 
	    }
		lv_reference_0_0=ruleQualifiedName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTypeRule());
	        }
       		set(
       			$current, 
       			"reference",
        		lv_reference_0_0, 
        		"QualifiedName");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleNativeMethod
entryRuleNativeMethod returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNativeMethodRule()); }
	 iv_ruleNativeMethod=ruleNativeMethod 
	 { $current=$iv_ruleNativeMethod.current; } 
	 EOF 
;

// Rule NativeMethod
ruleNativeMethod returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getNativeMethodAccess().getNameIDTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNativeMethodRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


