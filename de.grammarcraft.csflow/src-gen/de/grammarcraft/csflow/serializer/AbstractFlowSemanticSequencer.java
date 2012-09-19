package de.grammarcraft.csflow.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.grammarcraft.csflow.flow.EbcOperation;
import de.grammarcraft.csflow.flow.Flow;
import de.grammarcraft.csflow.flow.FlowPackage;
import de.grammarcraft.csflow.flow.GlobalInputPort;
import de.grammarcraft.csflow.flow.GlobalOutputPort;
import de.grammarcraft.csflow.flow.Import;
import de.grammarcraft.csflow.flow.MethodOperation;
import de.grammarcraft.csflow.flow.Model;
import de.grammarcraft.csflow.flow.NamedPort;
import de.grammarcraft.csflow.flow.NativeClass;
import de.grammarcraft.csflow.flow.NativeMethod;
import de.grammarcraft.csflow.flow.Port;
import de.grammarcraft.csflow.flow.Stream;
import de.grammarcraft.csflow.flow.UnnamedSubFlowPort;
import de.grammarcraft.csflow.services.FlowGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractFlowSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected FlowGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == FlowPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case FlowPackage.EBC_OPERATION:
				if(context == grammarAccess.getEbcOperationRule() ||
				   context == grammarAccess.getFunctionUnitRule() ||
				   context == grammarAccess.getOperationRule()) {
					sequence_EbcOperation(context, (EbcOperation) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.FLOW:
				if(context == grammarAccess.getFlowRule() ||
				   context == grammarAccess.getFunctionUnitRule()) {
					sequence_Flow(context, (Flow) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.GLOBAL_INPUT_PORT:
				if(context == grammarAccess.getGlobalInputPortRule() ||
				   context == grammarAccess.getLeftPortRule()) {
					sequence_LeftPort(context, (GlobalInputPort) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.GLOBAL_OUTPUT_PORT:
				if(context == grammarAccess.getGlobalOutputPortRule() ||
				   context == grammarAccess.getRightPortRule()) {
					sequence_RightPort(context, (GlobalOutputPort) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.METHOD_OPERATION:
				if(context == grammarAccess.getFunctionUnitRule() ||
				   context == grammarAccess.getMethodOperationRule() ||
				   context == grammarAccess.getOperationRule()) {
					sequence_MethodOperation(context, (MethodOperation) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.NAMED_PORT:
				if(context == grammarAccess.getNamedPortRule()) {
					sequence_NamedPort(context, (NamedPort) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.NATIVE_CLASS:
				if(context == grammarAccess.getNativeClassRule()) {
					sequence_NativeClass(context, (NativeClass) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.NATIVE_METHOD:
				if(context == grammarAccess.getNativeMethodRule()) {
					sequence_NativeMethod(context, (NativeMethod) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.PORT:
				if(context == grammarAccess.getLeftPortRule() ||
				   context == grammarAccess.getPortRule() ||
				   context == grammarAccess.getRightPortRule()) {
					sequence_Port(context, (Port) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.STREAM:
				if(context == grammarAccess.getStreamRule()) {
					sequence_Stream(context, (Stream) semanticObject); 
					return; 
				}
				else break;
			case FlowPackage.UNNAMED_SUB_FLOW_PORT:
				if(context == grammarAccess.getLeftPortRule() ||
				   context == grammarAccess.getRightPortRule() ||
				   context == grammarAccess.getUnnamedSubFlowPortRule()) {
					sequence_LeftPort(context, (UnnamedSubFlowPort) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID class=NativeClass)
	 */
	protected void sequence_EbcOperation(EObject context, EbcOperation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.FUNCTION_UNIT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.FUNCTION_UNIT__NAME));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.OPERATION__CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.OPERATION__CLASS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEbcOperationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEbcOperationAccess().getClassNativeClassParserRuleCall_3_0(), semanticObject.getClass_());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID streams+=Stream*)
	 */
	protected void sequence_Flow(EObject context, Flow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedName
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {GlobalInputPort}
	 */
	protected void sequence_LeftPort(EObject context, GlobalInputPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {UnnamedSubFlowPort}
	 */
	protected void sequence_LeftPort(EObject context, UnnamedSubFlowPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID class=NativeClass method=NativeMethod)
	 */
	protected void sequence_MethodOperation(EObject context, MethodOperation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.FUNCTION_UNIT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.FUNCTION_UNIT__NAME));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.OPERATION__CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.OPERATION__CLASS));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.METHOD_OPERATION__METHOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.METHOD_OPERATION__METHOD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMethodOperationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMethodOperationAccess().getClassNativeClassParserRuleCall_3_0(), semanticObject.getClass_());
		feeder.accept(grammarAccess.getMethodOperationAccess().getMethodNativeMethodParserRuleCall_5_0(), semanticObject.getMethod());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName? imports+=Import* functionUnits+=FunctionUnit*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_NamedPort(EObject context, NamedPort semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.NAMED_PORT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.NAMED_PORT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNamedPortAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     reference=QualifiedName
	 */
	protected void sequence_NativeClass(EObject context, NativeClass semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.NATIVE_CLASS__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.NATIVE_CLASS__REFERENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNativeClassAccess().getReferenceQualifiedNameParserRuleCall_0(), semanticObject.getReference());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_NativeMethod(EObject context, NativeMethod semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.NATIVE_METHOD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.NATIVE_METHOD__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNativeMethodAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (functionUnit=[FunctionUnit|ID] port=NamedPort?)
	 */
	protected void sequence_Port(EObject context, Port semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {GlobalOutputPort}
	 */
	protected void sequence_RightPort(EObject context, GlobalOutputPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftPort=LeftPort message=QualifiedName rightPort=RightPort)
	 */
	protected void sequence_Stream(EObject context, Stream semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.STREAM__LEFT_PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.STREAM__LEFT_PORT));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.STREAM__MESSAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.STREAM__MESSAGE));
			if(transientValues.isValueTransient(semanticObject, FlowPackage.Literals.STREAM__RIGHT_PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowPackage.Literals.STREAM__RIGHT_PORT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStreamAccess().getLeftPortLeftPortParserRuleCall_0_0(), semanticObject.getLeftPort());
		feeder.accept(grammarAccess.getStreamAccess().getMessageQualifiedNameParserRuleCall_2_0(), semanticObject.getMessage());
		feeder.accept(grammarAccess.getStreamAccess().getRightPortRightPortParserRuleCall_4_0(), semanticObject.getRightPort());
		feeder.finish();
	}
}
