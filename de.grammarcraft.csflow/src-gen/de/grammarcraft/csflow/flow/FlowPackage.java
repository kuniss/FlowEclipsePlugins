/**
 * <copyright>
 * </copyright>
 *

 */
package de.grammarcraft.csflow.flow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.grammarcraft.csflow.flow.FlowFactory
 * @model kind="package"
 * @generated
 */
public interface FlowPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "flow";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.grammarcraft.de/csflow/Flow";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "flow";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FlowPackage eINSTANCE = de.grammarcraft.csflow.flow.impl.FlowPackageImpl.init();

  /**
   * The meta object id for the '{@link de.grammarcraft.csflow.flow.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.csflow.flow.impl.ModelImpl
   * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Function Units</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__FUNCTION_UNITS = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.grammarcraft.csflow.flow.impl.FunctionUnitImpl <em>Function Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.csflow.flow.impl.FunctionUnitImpl
   * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getFunctionUnit()
   * @generated
   */
  int FUNCTION_UNIT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_UNIT__NAME = 0;

  /**
   * The number of structural features of the '<em>Function Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_UNIT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.grammarcraft.csflow.flow.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.csflow.flow.impl.ImportImpl
   * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.grammarcraft.csflow.flow.impl.FlowImpl <em>Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.csflow.flow.impl.FlowImpl
   * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getFlow()
   * @generated
   */
  int FLOW = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__NAME = FUNCTION_UNIT__NAME;

  /**
   * The feature id for the '<em><b>Streams</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__STREAMS = FUNCTION_UNIT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_FEATURE_COUNT = FUNCTION_UNIT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.grammarcraft.csflow.flow.impl.StreamImpl <em>Stream</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.csflow.flow.impl.StreamImpl
   * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getStream()
   * @generated
   */
  int STREAM = 4;

  /**
   * The feature id for the '<em><b>Left Port</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM__LEFT_PORT = 0;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM__MESSAGE = 1;

  /**
   * The feature id for the '<em><b>Right Port</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM__RIGHT_PORT = 2;

  /**
   * The number of structural features of the '<em>Stream</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.grammarcraft.csflow.flow.impl.LeftPortImpl <em>Left Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.csflow.flow.impl.LeftPortImpl
   * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getLeftPort()
   * @generated
   */
  int LEFT_PORT = 5;

  /**
   * The number of structural features of the '<em>Left Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_PORT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.grammarcraft.csflow.flow.impl.GlobalInputPortImpl <em>Global Input Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.csflow.flow.impl.GlobalInputPortImpl
   * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getGlobalInputPort()
   * @generated
   */
  int GLOBAL_INPUT_PORT = 6;

  /**
   * The number of structural features of the '<em>Global Input Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_INPUT_PORT_FEATURE_COUNT = LEFT_PORT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.grammarcraft.csflow.flow.impl.UnnamedSubFlowPortImpl <em>Unnamed Sub Flow Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.csflow.flow.impl.UnnamedSubFlowPortImpl
   * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getUnnamedSubFlowPort()
   * @generated
   */
  int UNNAMED_SUB_FLOW_PORT = 7;

  /**
   * The number of structural features of the '<em>Unnamed Sub Flow Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNNAMED_SUB_FLOW_PORT_FEATURE_COUNT = LEFT_PORT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.grammarcraft.csflow.flow.impl.RightPortImpl <em>Right Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.csflow.flow.impl.RightPortImpl
   * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getRightPort()
   * @generated
   */
  int RIGHT_PORT = 8;

  /**
   * The number of structural features of the '<em>Right Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_PORT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.grammarcraft.csflow.flow.impl.GlobalOutputPortImpl <em>Global Output Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.csflow.flow.impl.GlobalOutputPortImpl
   * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getGlobalOutputPort()
   * @generated
   */
  int GLOBAL_OUTPUT_PORT = 9;

  /**
   * The number of structural features of the '<em>Global Output Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_OUTPUT_PORT_FEATURE_COUNT = RIGHT_PORT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.grammarcraft.csflow.flow.impl.PortImpl <em>Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.csflow.flow.impl.PortImpl
   * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getPort()
   * @generated
   */
  int PORT = 10;

  /**
   * The feature id for the '<em><b>Function Unit</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__FUNCTION_UNIT = LEFT_PORT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Port</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__PORT = LEFT_PORT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_FEATURE_COUNT = LEFT_PORT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.grammarcraft.csflow.flow.impl.NamedPortImpl <em>Named Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.csflow.flow.impl.NamedPortImpl
   * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getNamedPort()
   * @generated
   */
  int NAMED_PORT = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_PORT__NAME = 0;

  /**
   * The number of structural features of the '<em>Named Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_PORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.grammarcraft.csflow.flow.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.csflow.flow.impl.OperationImpl
   * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__NAME = FUNCTION_UNIT__NAME;

  /**
   * The feature id for the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__CLASS = FUNCTION_UNIT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = FUNCTION_UNIT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.grammarcraft.csflow.flow.impl.EbcOperationImpl <em>Ebc Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.csflow.flow.impl.EbcOperationImpl
   * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getEbcOperation()
   * @generated
   */
  int EBC_OPERATION = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EBC_OPERATION__NAME = OPERATION__NAME;

  /**
   * The feature id for the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EBC_OPERATION__CLASS = OPERATION__CLASS;

  /**
   * The number of structural features of the '<em>Ebc Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EBC_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.grammarcraft.csflow.flow.impl.NativeClassImpl <em>Native Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.csflow.flow.impl.NativeClassImpl
   * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getNativeClass()
   * @generated
   */
  int NATIVE_CLASS = 14;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATIVE_CLASS__REFERENCE = 0;

  /**
   * The number of structural features of the '<em>Native Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATIVE_CLASS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.grammarcraft.csflow.flow.impl.MethodOperationImpl <em>Method Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.csflow.flow.impl.MethodOperationImpl
   * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getMethodOperation()
   * @generated
   */
  int METHOD_OPERATION = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_OPERATION__NAME = OPERATION__NAME;

  /**
   * The feature id for the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_OPERATION__CLASS = OPERATION__CLASS;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_OPERATION__METHOD = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_OPERATION__SIGNATURE = OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Method Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.grammarcraft.csflow.flow.impl.SignatureImpl <em>Signature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.csflow.flow.impl.SignatureImpl
   * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getSignature()
   * @generated
   */
  int SIGNATURE = 16;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE__TYPE = 0;

  /**
   * The number of structural features of the '<em>Signature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.grammarcraft.csflow.flow.impl.TypeParameterImpl <em>Type Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.csflow.flow.impl.TypeParameterImpl
   * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getTypeParameter()
   * @generated
   */
  int TYPE_PARAMETER = 20;

  /**
   * The number of structural features of the '<em>Type Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PARAMETER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.grammarcraft.csflow.flow.impl.GenericTypeImpl <em>Generic Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.csflow.flow.impl.GenericTypeImpl
   * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getGenericType()
   * @generated
   */
  int GENERIC_TYPE = 17;

  /**
   * The feature id for the '<em><b>Operation Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_TYPE__OPERATION_TYPE = TYPE_PARAMETER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operation Type Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_TYPE__OPERATION_TYPE_PARAMETERS = TYPE_PARAMETER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Generic Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_TYPE_FEATURE_COUNT = TYPE_PARAMETER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.grammarcraft.csflow.flow.impl.OperationTypeImpl <em>Operation Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.csflow.flow.impl.OperationTypeImpl
   * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getOperationType()
   * @generated
   */
  int OPERATION_TYPE = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Operation Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.grammarcraft.csflow.flow.impl.OperationTypeParametersImpl <em>Operation Type Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.csflow.flow.impl.OperationTypeParametersImpl
   * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getOperationTypeParameters()
   * @generated
   */
  int OPERATION_TYPE_PARAMETERS = 19;

  /**
   * The feature id for the '<em><b>Type Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_TYPE_PARAMETERS__TYPE_PARAMETER = 0;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_TYPE_PARAMETERS__TYPE_PARAMETERS = 1;

  /**
   * The number of structural features of the '<em>Operation Type Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_TYPE_PARAMETERS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.grammarcraft.csflow.flow.impl.CSTypeParameterImpl <em>CS Type Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.csflow.flow.impl.CSTypeParameterImpl
   * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getCSTypeParameter()
   * @generated
   */
  int CS_TYPE_PARAMETER = 21;

  /**
   * The feature id for the '<em><b>Type Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CS_TYPE_PARAMETER__TYPE_PARAMETER = 0;

  /**
   * The number of structural features of the '<em>CS Type Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CS_TYPE_PARAMETER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.grammarcraft.csflow.flow.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.csflow.flow.impl.TypeImpl
   * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getType()
   * @generated
   */
  int TYPE = 22;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__REFERENCE = TYPE_PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = TYPE_PARAMETER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.grammarcraft.csflow.flow.impl.NativeMethodImpl <em>Native Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.csflow.flow.impl.NativeMethodImpl
   * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getNativeMethod()
   * @generated
   */
  int NATIVE_METHOD = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATIVE_METHOD__NAME = 0;

  /**
   * The number of structural features of the '<em>Native Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATIVE_METHOD_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link de.grammarcraft.csflow.flow.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.grammarcraft.csflow.flow.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link de.grammarcraft.csflow.flow.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.grammarcraft.csflow.flow.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.grammarcraft.csflow.flow.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see de.grammarcraft.csflow.flow.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link de.grammarcraft.csflow.flow.Model#getFunctionUnits <em>Function Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Function Units</em>'.
   * @see de.grammarcraft.csflow.flow.Model#getFunctionUnits()
   * @see #getModel()
   * @generated
   */
  EReference getModel_FunctionUnits();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.csflow.flow.FunctionUnit <em>Function Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Unit</em>'.
   * @see de.grammarcraft.csflow.flow.FunctionUnit
   * @generated
   */
  EClass getFunctionUnit();

  /**
   * Returns the meta object for the attribute '{@link de.grammarcraft.csflow.flow.FunctionUnit#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.grammarcraft.csflow.flow.FunctionUnit#getName()
   * @see #getFunctionUnit()
   * @generated
   */
  EAttribute getFunctionUnit_Name();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.csflow.flow.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see de.grammarcraft.csflow.flow.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link de.grammarcraft.csflow.flow.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see de.grammarcraft.csflow.flow.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.csflow.flow.Flow <em>Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow</em>'.
   * @see de.grammarcraft.csflow.flow.Flow
   * @generated
   */
  EClass getFlow();

  /**
   * Returns the meta object for the containment reference list '{@link de.grammarcraft.csflow.flow.Flow#getStreams <em>Streams</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Streams</em>'.
   * @see de.grammarcraft.csflow.flow.Flow#getStreams()
   * @see #getFlow()
   * @generated
   */
  EReference getFlow_Streams();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.csflow.flow.Stream <em>Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stream</em>'.
   * @see de.grammarcraft.csflow.flow.Stream
   * @generated
   */
  EClass getStream();

  /**
   * Returns the meta object for the containment reference '{@link de.grammarcraft.csflow.flow.Stream#getLeftPort <em>Left Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Port</em>'.
   * @see de.grammarcraft.csflow.flow.Stream#getLeftPort()
   * @see #getStream()
   * @generated
   */
  EReference getStream_LeftPort();

  /**
   * Returns the meta object for the attribute '{@link de.grammarcraft.csflow.flow.Stream#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see de.grammarcraft.csflow.flow.Stream#getMessage()
   * @see #getStream()
   * @generated
   */
  EAttribute getStream_Message();

  /**
   * Returns the meta object for the containment reference '{@link de.grammarcraft.csflow.flow.Stream#getRightPort <em>Right Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Port</em>'.
   * @see de.grammarcraft.csflow.flow.Stream#getRightPort()
   * @see #getStream()
   * @generated
   */
  EReference getStream_RightPort();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.csflow.flow.LeftPort <em>Left Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Left Port</em>'.
   * @see de.grammarcraft.csflow.flow.LeftPort
   * @generated
   */
  EClass getLeftPort();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.csflow.flow.GlobalInputPort <em>Global Input Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Input Port</em>'.
   * @see de.grammarcraft.csflow.flow.GlobalInputPort
   * @generated
   */
  EClass getGlobalInputPort();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.csflow.flow.UnnamedSubFlowPort <em>Unnamed Sub Flow Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unnamed Sub Flow Port</em>'.
   * @see de.grammarcraft.csflow.flow.UnnamedSubFlowPort
   * @generated
   */
  EClass getUnnamedSubFlowPort();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.csflow.flow.RightPort <em>Right Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Right Port</em>'.
   * @see de.grammarcraft.csflow.flow.RightPort
   * @generated
   */
  EClass getRightPort();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.csflow.flow.GlobalOutputPort <em>Global Output Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Output Port</em>'.
   * @see de.grammarcraft.csflow.flow.GlobalOutputPort
   * @generated
   */
  EClass getGlobalOutputPort();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.csflow.flow.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Port</em>'.
   * @see de.grammarcraft.csflow.flow.Port
   * @generated
   */
  EClass getPort();

  /**
   * Returns the meta object for the reference '{@link de.grammarcraft.csflow.flow.Port#getFunctionUnit <em>Function Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Function Unit</em>'.
   * @see de.grammarcraft.csflow.flow.Port#getFunctionUnit()
   * @see #getPort()
   * @generated
   */
  EReference getPort_FunctionUnit();

  /**
   * Returns the meta object for the containment reference '{@link de.grammarcraft.csflow.flow.Port#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Port</em>'.
   * @see de.grammarcraft.csflow.flow.Port#getPort()
   * @see #getPort()
   * @generated
   */
  EReference getPort_Port();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.csflow.flow.NamedPort <em>Named Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Port</em>'.
   * @see de.grammarcraft.csflow.flow.NamedPort
   * @generated
   */
  EClass getNamedPort();

  /**
   * Returns the meta object for the attribute '{@link de.grammarcraft.csflow.flow.NamedPort#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.grammarcraft.csflow.flow.NamedPort#getName()
   * @see #getNamedPort()
   * @generated
   */
  EAttribute getNamedPort_Name();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.csflow.flow.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see de.grammarcraft.csflow.flow.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the containment reference '{@link de.grammarcraft.csflow.flow.Operation#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class</em>'.
   * @see de.grammarcraft.csflow.flow.Operation#getClass_()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Class();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.csflow.flow.EbcOperation <em>Ebc Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ebc Operation</em>'.
   * @see de.grammarcraft.csflow.flow.EbcOperation
   * @generated
   */
  EClass getEbcOperation();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.csflow.flow.NativeClass <em>Native Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Native Class</em>'.
   * @see de.grammarcraft.csflow.flow.NativeClass
   * @generated
   */
  EClass getNativeClass();

  /**
   * Returns the meta object for the attribute '{@link de.grammarcraft.csflow.flow.NativeClass#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference</em>'.
   * @see de.grammarcraft.csflow.flow.NativeClass#getReference()
   * @see #getNativeClass()
   * @generated
   */
  EAttribute getNativeClass_Reference();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.csflow.flow.MethodOperation <em>Method Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Operation</em>'.
   * @see de.grammarcraft.csflow.flow.MethodOperation
   * @generated
   */
  EClass getMethodOperation();

  /**
   * Returns the meta object for the containment reference '{@link de.grammarcraft.csflow.flow.MethodOperation#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method</em>'.
   * @see de.grammarcraft.csflow.flow.MethodOperation#getMethod()
   * @see #getMethodOperation()
   * @generated
   */
  EReference getMethodOperation_Method();

  /**
   * Returns the meta object for the containment reference '{@link de.grammarcraft.csflow.flow.MethodOperation#getSignature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Signature</em>'.
   * @see de.grammarcraft.csflow.flow.MethodOperation#getSignature()
   * @see #getMethodOperation()
   * @generated
   */
  EReference getMethodOperation_Signature();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.csflow.flow.Signature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signature</em>'.
   * @see de.grammarcraft.csflow.flow.Signature
   * @generated
   */
  EClass getSignature();

  /**
   * Returns the meta object for the containment reference '{@link de.grammarcraft.csflow.flow.Signature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.grammarcraft.csflow.flow.Signature#getType()
   * @see #getSignature()
   * @generated
   */
  EReference getSignature_Type();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.csflow.flow.GenericType <em>Generic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generic Type</em>'.
   * @see de.grammarcraft.csflow.flow.GenericType
   * @generated
   */
  EClass getGenericType();

  /**
   * Returns the meta object for the containment reference '{@link de.grammarcraft.csflow.flow.GenericType#getOperationType <em>Operation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation Type</em>'.
   * @see de.grammarcraft.csflow.flow.GenericType#getOperationType()
   * @see #getGenericType()
   * @generated
   */
  EReference getGenericType_OperationType();

  /**
   * Returns the meta object for the containment reference '{@link de.grammarcraft.csflow.flow.GenericType#getOperationTypeParameters <em>Operation Type Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation Type Parameters</em>'.
   * @see de.grammarcraft.csflow.flow.GenericType#getOperationTypeParameters()
   * @see #getGenericType()
   * @generated
   */
  EReference getGenericType_OperationTypeParameters();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.csflow.flow.OperationType <em>Operation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Type</em>'.
   * @see de.grammarcraft.csflow.flow.OperationType
   * @generated
   */
  EClass getOperationType();

  /**
   * Returns the meta object for the attribute '{@link de.grammarcraft.csflow.flow.OperationType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.grammarcraft.csflow.flow.OperationType#getName()
   * @see #getOperationType()
   * @generated
   */
  EAttribute getOperationType_Name();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.csflow.flow.OperationTypeParameters <em>Operation Type Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Type Parameters</em>'.
   * @see de.grammarcraft.csflow.flow.OperationTypeParameters
   * @generated
   */
  EClass getOperationTypeParameters();

  /**
   * Returns the meta object for the containment reference '{@link de.grammarcraft.csflow.flow.OperationTypeParameters#getTypeParameter <em>Type Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Parameter</em>'.
   * @see de.grammarcraft.csflow.flow.OperationTypeParameters#getTypeParameter()
   * @see #getOperationTypeParameters()
   * @generated
   */
  EReference getOperationTypeParameters_TypeParameter();

  /**
   * Returns the meta object for the containment reference list '{@link de.grammarcraft.csflow.flow.OperationTypeParameters#getTypeParameters <em>Type Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
   * @see de.grammarcraft.csflow.flow.OperationTypeParameters#getTypeParameters()
   * @see #getOperationTypeParameters()
   * @generated
   */
  EReference getOperationTypeParameters_TypeParameters();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.csflow.flow.TypeParameter <em>Type Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Parameter</em>'.
   * @see de.grammarcraft.csflow.flow.TypeParameter
   * @generated
   */
  EClass getTypeParameter();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.csflow.flow.CSTypeParameter <em>CS Type Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CS Type Parameter</em>'.
   * @see de.grammarcraft.csflow.flow.CSTypeParameter
   * @generated
   */
  EClass getCSTypeParameter();

  /**
   * Returns the meta object for the containment reference '{@link de.grammarcraft.csflow.flow.CSTypeParameter#getTypeParameter <em>Type Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Parameter</em>'.
   * @see de.grammarcraft.csflow.flow.CSTypeParameter#getTypeParameter()
   * @see #getCSTypeParameter()
   * @generated
   */
  EReference getCSTypeParameter_TypeParameter();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.csflow.flow.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see de.grammarcraft.csflow.flow.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link de.grammarcraft.csflow.flow.Type#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference</em>'.
   * @see de.grammarcraft.csflow.flow.Type#getReference()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Reference();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.csflow.flow.NativeMethod <em>Native Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Native Method</em>'.
   * @see de.grammarcraft.csflow.flow.NativeMethod
   * @generated
   */
  EClass getNativeMethod();

  /**
   * Returns the meta object for the attribute '{@link de.grammarcraft.csflow.flow.NativeMethod#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.grammarcraft.csflow.flow.NativeMethod#getName()
   * @see #getNativeMethod()
   * @generated
   */
  EAttribute getNativeMethod_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FlowFactory getFlowFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.grammarcraft.csflow.flow.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.csflow.flow.impl.ModelImpl
     * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Function Units</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__FUNCTION_UNITS = eINSTANCE.getModel_FunctionUnits();

    /**
     * The meta object literal for the '{@link de.grammarcraft.csflow.flow.impl.FunctionUnitImpl <em>Function Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.csflow.flow.impl.FunctionUnitImpl
     * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getFunctionUnit()
     * @generated
     */
    EClass FUNCTION_UNIT = eINSTANCE.getFunctionUnit();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_UNIT__NAME = eINSTANCE.getFunctionUnit_Name();

    /**
     * The meta object literal for the '{@link de.grammarcraft.csflow.flow.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.csflow.flow.impl.ImportImpl
     * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link de.grammarcraft.csflow.flow.impl.FlowImpl <em>Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.csflow.flow.impl.FlowImpl
     * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getFlow()
     * @generated
     */
    EClass FLOW = eINSTANCE.getFlow();

    /**
     * The meta object literal for the '<em><b>Streams</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW__STREAMS = eINSTANCE.getFlow_Streams();

    /**
     * The meta object literal for the '{@link de.grammarcraft.csflow.flow.impl.StreamImpl <em>Stream</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.csflow.flow.impl.StreamImpl
     * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getStream()
     * @generated
     */
    EClass STREAM = eINSTANCE.getStream();

    /**
     * The meta object literal for the '<em><b>Left Port</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STREAM__LEFT_PORT = eINSTANCE.getStream_LeftPort();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STREAM__MESSAGE = eINSTANCE.getStream_Message();

    /**
     * The meta object literal for the '<em><b>Right Port</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STREAM__RIGHT_PORT = eINSTANCE.getStream_RightPort();

    /**
     * The meta object literal for the '{@link de.grammarcraft.csflow.flow.impl.LeftPortImpl <em>Left Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.csflow.flow.impl.LeftPortImpl
     * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getLeftPort()
     * @generated
     */
    EClass LEFT_PORT = eINSTANCE.getLeftPort();

    /**
     * The meta object literal for the '{@link de.grammarcraft.csflow.flow.impl.GlobalInputPortImpl <em>Global Input Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.csflow.flow.impl.GlobalInputPortImpl
     * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getGlobalInputPort()
     * @generated
     */
    EClass GLOBAL_INPUT_PORT = eINSTANCE.getGlobalInputPort();

    /**
     * The meta object literal for the '{@link de.grammarcraft.csflow.flow.impl.UnnamedSubFlowPortImpl <em>Unnamed Sub Flow Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.csflow.flow.impl.UnnamedSubFlowPortImpl
     * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getUnnamedSubFlowPort()
     * @generated
     */
    EClass UNNAMED_SUB_FLOW_PORT = eINSTANCE.getUnnamedSubFlowPort();

    /**
     * The meta object literal for the '{@link de.grammarcraft.csflow.flow.impl.RightPortImpl <em>Right Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.csflow.flow.impl.RightPortImpl
     * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getRightPort()
     * @generated
     */
    EClass RIGHT_PORT = eINSTANCE.getRightPort();

    /**
     * The meta object literal for the '{@link de.grammarcraft.csflow.flow.impl.GlobalOutputPortImpl <em>Global Output Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.csflow.flow.impl.GlobalOutputPortImpl
     * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getGlobalOutputPort()
     * @generated
     */
    EClass GLOBAL_OUTPUT_PORT = eINSTANCE.getGlobalOutputPort();

    /**
     * The meta object literal for the '{@link de.grammarcraft.csflow.flow.impl.PortImpl <em>Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.csflow.flow.impl.PortImpl
     * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getPort()
     * @generated
     */
    EClass PORT = eINSTANCE.getPort();

    /**
     * The meta object literal for the '<em><b>Function Unit</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PORT__FUNCTION_UNIT = eINSTANCE.getPort_FunctionUnit();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PORT__PORT = eINSTANCE.getPort_Port();

    /**
     * The meta object literal for the '{@link de.grammarcraft.csflow.flow.impl.NamedPortImpl <em>Named Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.csflow.flow.impl.NamedPortImpl
     * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getNamedPort()
     * @generated
     */
    EClass NAMED_PORT = eINSTANCE.getNamedPort();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_PORT__NAME = eINSTANCE.getNamedPort_Name();

    /**
     * The meta object literal for the '{@link de.grammarcraft.csflow.flow.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.csflow.flow.impl.OperationImpl
     * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__CLASS = eINSTANCE.getOperation_Class();

    /**
     * The meta object literal for the '{@link de.grammarcraft.csflow.flow.impl.EbcOperationImpl <em>Ebc Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.csflow.flow.impl.EbcOperationImpl
     * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getEbcOperation()
     * @generated
     */
    EClass EBC_OPERATION = eINSTANCE.getEbcOperation();

    /**
     * The meta object literal for the '{@link de.grammarcraft.csflow.flow.impl.NativeClassImpl <em>Native Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.csflow.flow.impl.NativeClassImpl
     * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getNativeClass()
     * @generated
     */
    EClass NATIVE_CLASS = eINSTANCE.getNativeClass();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NATIVE_CLASS__REFERENCE = eINSTANCE.getNativeClass_Reference();

    /**
     * The meta object literal for the '{@link de.grammarcraft.csflow.flow.impl.MethodOperationImpl <em>Method Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.csflow.flow.impl.MethodOperationImpl
     * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getMethodOperation()
     * @generated
     */
    EClass METHOD_OPERATION = eINSTANCE.getMethodOperation();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_OPERATION__METHOD = eINSTANCE.getMethodOperation_Method();

    /**
     * The meta object literal for the '<em><b>Signature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_OPERATION__SIGNATURE = eINSTANCE.getMethodOperation_Signature();

    /**
     * The meta object literal for the '{@link de.grammarcraft.csflow.flow.impl.SignatureImpl <em>Signature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.csflow.flow.impl.SignatureImpl
     * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getSignature()
     * @generated
     */
    EClass SIGNATURE = eINSTANCE.getSignature();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNATURE__TYPE = eINSTANCE.getSignature_Type();

    /**
     * The meta object literal for the '{@link de.grammarcraft.csflow.flow.impl.GenericTypeImpl <em>Generic Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.csflow.flow.impl.GenericTypeImpl
     * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getGenericType()
     * @generated
     */
    EClass GENERIC_TYPE = eINSTANCE.getGenericType();

    /**
     * The meta object literal for the '<em><b>Operation Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERIC_TYPE__OPERATION_TYPE = eINSTANCE.getGenericType_OperationType();

    /**
     * The meta object literal for the '<em><b>Operation Type Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERIC_TYPE__OPERATION_TYPE_PARAMETERS = eINSTANCE.getGenericType_OperationTypeParameters();

    /**
     * The meta object literal for the '{@link de.grammarcraft.csflow.flow.impl.OperationTypeImpl <em>Operation Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.csflow.flow.impl.OperationTypeImpl
     * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getOperationType()
     * @generated
     */
    EClass OPERATION_TYPE = eINSTANCE.getOperationType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION_TYPE__NAME = eINSTANCE.getOperationType_Name();

    /**
     * The meta object literal for the '{@link de.grammarcraft.csflow.flow.impl.OperationTypeParametersImpl <em>Operation Type Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.csflow.flow.impl.OperationTypeParametersImpl
     * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getOperationTypeParameters()
     * @generated
     */
    EClass OPERATION_TYPE_PARAMETERS = eINSTANCE.getOperationTypeParameters();

    /**
     * The meta object literal for the '<em><b>Type Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_TYPE_PARAMETERS__TYPE_PARAMETER = eINSTANCE.getOperationTypeParameters_TypeParameter();

    /**
     * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_TYPE_PARAMETERS__TYPE_PARAMETERS = eINSTANCE.getOperationTypeParameters_TypeParameters();

    /**
     * The meta object literal for the '{@link de.grammarcraft.csflow.flow.impl.TypeParameterImpl <em>Type Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.csflow.flow.impl.TypeParameterImpl
     * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getTypeParameter()
     * @generated
     */
    EClass TYPE_PARAMETER = eINSTANCE.getTypeParameter();

    /**
     * The meta object literal for the '{@link de.grammarcraft.csflow.flow.impl.CSTypeParameterImpl <em>CS Type Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.csflow.flow.impl.CSTypeParameterImpl
     * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getCSTypeParameter()
     * @generated
     */
    EClass CS_TYPE_PARAMETER = eINSTANCE.getCSTypeParameter();

    /**
     * The meta object literal for the '<em><b>Type Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CS_TYPE_PARAMETER__TYPE_PARAMETER = eINSTANCE.getCSTypeParameter_TypeParameter();

    /**
     * The meta object literal for the '{@link de.grammarcraft.csflow.flow.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.csflow.flow.impl.TypeImpl
     * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__REFERENCE = eINSTANCE.getType_Reference();

    /**
     * The meta object literal for the '{@link de.grammarcraft.csflow.flow.impl.NativeMethodImpl <em>Native Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.csflow.flow.impl.NativeMethodImpl
     * @see de.grammarcraft.csflow.flow.impl.FlowPackageImpl#getNativeMethod()
     * @generated
     */
    EClass NATIVE_METHOD = eINSTANCE.getNativeMethod();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NATIVE_METHOD__NAME = eINSTANCE.getNativeMethod_Name();

  }

} //FlowPackage
