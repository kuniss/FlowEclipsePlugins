/**
 * <copyright>
 * </copyright>
 *

 */
package de.grammarcraft.flow.flow;

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
 * @see de.grammarcraft.flow.flow.FlowFactory
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
  String eNS_URI = "http://www.grammarcraft.de/flow/Flow";

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
  FlowPackage eINSTANCE = de.grammarcraft.flow.flow.impl.FlowPackageImpl.init();

  /**
   * The meta object id for the '{@link de.grammarcraft.flow.flow.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.flow.flow.impl.ModelImpl
   * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getModel()
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
   * The meta object id for the '{@link de.grammarcraft.flow.flow.impl.FunctionUnitImpl <em>Function Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.flow.flow.impl.FunctionUnitImpl
   * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getFunctionUnit()
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
   * The meta object id for the '{@link de.grammarcraft.flow.flow.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.flow.flow.impl.ImportImpl
   * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getImport()
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
   * The meta object id for the '{@link de.grammarcraft.flow.flow.impl.FlowImpl <em>Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.flow.flow.impl.FlowImpl
   * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getFlow()
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
   * The meta object id for the '{@link de.grammarcraft.flow.flow.impl.StreamImpl <em>Stream</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.flow.flow.impl.StreamImpl
   * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getStream()
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
   * The feature id for the '<em><b>Message</b></em>' containment reference.
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
   * The meta object id for the '{@link de.grammarcraft.flow.flow.impl.LeftPortImpl <em>Left Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.flow.flow.impl.LeftPortImpl
   * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getLeftPort()
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
   * The meta object id for the '{@link de.grammarcraft.flow.flow.impl.GlobalInputPortImpl <em>Global Input Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.flow.flow.impl.GlobalInputPortImpl
   * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getGlobalInputPort()
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
   * The meta object id for the '{@link de.grammarcraft.flow.flow.impl.UnnamedSubFlowPortImpl <em>Unnamed Sub Flow Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.flow.flow.impl.UnnamedSubFlowPortImpl
   * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getUnnamedSubFlowPort()
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
   * The meta object id for the '{@link de.grammarcraft.flow.flow.impl.RightPortImpl <em>Right Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.flow.flow.impl.RightPortImpl
   * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getRightPort()
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
   * The meta object id for the '{@link de.grammarcraft.flow.flow.impl.GlobalOutputPortImpl <em>Global Output Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.flow.flow.impl.GlobalOutputPortImpl
   * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getGlobalOutputPort()
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
   * The meta object id for the '{@link de.grammarcraft.flow.flow.impl.PortImpl <em>Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.flow.flow.impl.PortImpl
   * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getPort()
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
   * The meta object id for the '{@link de.grammarcraft.flow.flow.impl.NamedPortImpl <em>Named Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.flow.flow.impl.NamedPortImpl
   * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getNamedPort()
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
   * The meta object id for the '{@link de.grammarcraft.flow.flow.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.flow.flow.impl.OperationImpl
   * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getOperation()
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
   * The meta object id for the '{@link de.grammarcraft.flow.flow.impl.EbcOperationImpl <em>Ebc Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.flow.flow.impl.EbcOperationImpl
   * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getEbcOperation()
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
   * The meta object id for the '{@link de.grammarcraft.flow.flow.impl.NativeClassImpl <em>Native Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.flow.flow.impl.NativeClassImpl
   * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getNativeClass()
   * @generated
   */
  int NATIVE_CLASS = 14;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference.
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
   * The meta object id for the '{@link de.grammarcraft.flow.flow.impl.MethodOperationImpl <em>Method Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.flow.flow.impl.MethodOperationImpl
   * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getMethodOperation()
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
   * The number of structural features of the '<em>Method Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.grammarcraft.flow.flow.impl.NativeMethodImpl <em>Native Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.grammarcraft.flow.flow.impl.NativeMethodImpl
   * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getNativeMethod()
   * @generated
   */
  int NATIVE_METHOD = 16;

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
   * Returns the meta object for class '{@link de.grammarcraft.flow.flow.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.grammarcraft.flow.flow.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link de.grammarcraft.flow.flow.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.grammarcraft.flow.flow.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.grammarcraft.flow.flow.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see de.grammarcraft.flow.flow.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link de.grammarcraft.flow.flow.Model#getFunctionUnits <em>Function Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Function Units</em>'.
   * @see de.grammarcraft.flow.flow.Model#getFunctionUnits()
   * @see #getModel()
   * @generated
   */
  EReference getModel_FunctionUnits();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.flow.flow.FunctionUnit <em>Function Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Unit</em>'.
   * @see de.grammarcraft.flow.flow.FunctionUnit
   * @generated
   */
  EClass getFunctionUnit();

  /**
   * Returns the meta object for the attribute '{@link de.grammarcraft.flow.flow.FunctionUnit#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.grammarcraft.flow.flow.FunctionUnit#getName()
   * @see #getFunctionUnit()
   * @generated
   */
  EAttribute getFunctionUnit_Name();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.flow.flow.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see de.grammarcraft.flow.flow.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link de.grammarcraft.flow.flow.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see de.grammarcraft.flow.flow.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.flow.flow.Flow <em>Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow</em>'.
   * @see de.grammarcraft.flow.flow.Flow
   * @generated
   */
  EClass getFlow();

  /**
   * Returns the meta object for the containment reference list '{@link de.grammarcraft.flow.flow.Flow#getStreams <em>Streams</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Streams</em>'.
   * @see de.grammarcraft.flow.flow.Flow#getStreams()
   * @see #getFlow()
   * @generated
   */
  EReference getFlow_Streams();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.flow.flow.Stream <em>Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stream</em>'.
   * @see de.grammarcraft.flow.flow.Stream
   * @generated
   */
  EClass getStream();

  /**
   * Returns the meta object for the containment reference '{@link de.grammarcraft.flow.flow.Stream#getLeftPort <em>Left Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Port</em>'.
   * @see de.grammarcraft.flow.flow.Stream#getLeftPort()
   * @see #getStream()
   * @generated
   */
  EReference getStream_LeftPort();

  /**
   * Returns the meta object for the containment reference '{@link de.grammarcraft.flow.flow.Stream#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Message</em>'.
   * @see de.grammarcraft.flow.flow.Stream#getMessage()
   * @see #getStream()
   * @generated
   */
  EReference getStream_Message();

  /**
   * Returns the meta object for the containment reference '{@link de.grammarcraft.flow.flow.Stream#getRightPort <em>Right Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Port</em>'.
   * @see de.grammarcraft.flow.flow.Stream#getRightPort()
   * @see #getStream()
   * @generated
   */
  EReference getStream_RightPort();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.flow.flow.LeftPort <em>Left Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Left Port</em>'.
   * @see de.grammarcraft.flow.flow.LeftPort
   * @generated
   */
  EClass getLeftPort();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.flow.flow.GlobalInputPort <em>Global Input Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Input Port</em>'.
   * @see de.grammarcraft.flow.flow.GlobalInputPort
   * @generated
   */
  EClass getGlobalInputPort();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.flow.flow.UnnamedSubFlowPort <em>Unnamed Sub Flow Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unnamed Sub Flow Port</em>'.
   * @see de.grammarcraft.flow.flow.UnnamedSubFlowPort
   * @generated
   */
  EClass getUnnamedSubFlowPort();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.flow.flow.RightPort <em>Right Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Right Port</em>'.
   * @see de.grammarcraft.flow.flow.RightPort
   * @generated
   */
  EClass getRightPort();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.flow.flow.GlobalOutputPort <em>Global Output Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Output Port</em>'.
   * @see de.grammarcraft.flow.flow.GlobalOutputPort
   * @generated
   */
  EClass getGlobalOutputPort();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.flow.flow.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Port</em>'.
   * @see de.grammarcraft.flow.flow.Port
   * @generated
   */
  EClass getPort();

  /**
   * Returns the meta object for the reference '{@link de.grammarcraft.flow.flow.Port#getFunctionUnit <em>Function Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Function Unit</em>'.
   * @see de.grammarcraft.flow.flow.Port#getFunctionUnit()
   * @see #getPort()
   * @generated
   */
  EReference getPort_FunctionUnit();

  /**
   * Returns the meta object for the containment reference '{@link de.grammarcraft.flow.flow.Port#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Port</em>'.
   * @see de.grammarcraft.flow.flow.Port#getPort()
   * @see #getPort()
   * @generated
   */
  EReference getPort_Port();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.flow.flow.NamedPort <em>Named Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Port</em>'.
   * @see de.grammarcraft.flow.flow.NamedPort
   * @generated
   */
  EClass getNamedPort();

  /**
   * Returns the meta object for the attribute '{@link de.grammarcraft.flow.flow.NamedPort#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.grammarcraft.flow.flow.NamedPort#getName()
   * @see #getNamedPort()
   * @generated
   */
  EAttribute getNamedPort_Name();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.flow.flow.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see de.grammarcraft.flow.flow.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the containment reference '{@link de.grammarcraft.flow.flow.Operation#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class</em>'.
   * @see de.grammarcraft.flow.flow.Operation#getClass_()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Class();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.flow.flow.EbcOperation <em>Ebc Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ebc Operation</em>'.
   * @see de.grammarcraft.flow.flow.EbcOperation
   * @generated
   */
  EClass getEbcOperation();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.flow.flow.NativeClass <em>Native Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Native Class</em>'.
   * @see de.grammarcraft.flow.flow.NativeClass
   * @generated
   */
  EClass getNativeClass();

  /**
   * Returns the meta object for the containment reference '{@link de.grammarcraft.flow.flow.NativeClass#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reference</em>'.
   * @see de.grammarcraft.flow.flow.NativeClass#getReference()
   * @see #getNativeClass()
   * @generated
   */
  EReference getNativeClass_Reference();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.flow.flow.MethodOperation <em>Method Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Operation</em>'.
   * @see de.grammarcraft.flow.flow.MethodOperation
   * @generated
   */
  EClass getMethodOperation();

  /**
   * Returns the meta object for the containment reference '{@link de.grammarcraft.flow.flow.MethodOperation#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method</em>'.
   * @see de.grammarcraft.flow.flow.MethodOperation#getMethod()
   * @see #getMethodOperation()
   * @generated
   */
  EReference getMethodOperation_Method();

  /**
   * Returns the meta object for class '{@link de.grammarcraft.flow.flow.NativeMethod <em>Native Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Native Method</em>'.
   * @see de.grammarcraft.flow.flow.NativeMethod
   * @generated
   */
  EClass getNativeMethod();

  /**
   * Returns the meta object for the attribute '{@link de.grammarcraft.flow.flow.NativeMethod#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.grammarcraft.flow.flow.NativeMethod#getName()
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
     * The meta object literal for the '{@link de.grammarcraft.flow.flow.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.flow.flow.impl.ModelImpl
     * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getModel()
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
     * The meta object literal for the '{@link de.grammarcraft.flow.flow.impl.FunctionUnitImpl <em>Function Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.flow.flow.impl.FunctionUnitImpl
     * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getFunctionUnit()
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
     * The meta object literal for the '{@link de.grammarcraft.flow.flow.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.flow.flow.impl.ImportImpl
     * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getImport()
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
     * The meta object literal for the '{@link de.grammarcraft.flow.flow.impl.FlowImpl <em>Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.flow.flow.impl.FlowImpl
     * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getFlow()
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
     * The meta object literal for the '{@link de.grammarcraft.flow.flow.impl.StreamImpl <em>Stream</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.flow.flow.impl.StreamImpl
     * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getStream()
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
     * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STREAM__MESSAGE = eINSTANCE.getStream_Message();

    /**
     * The meta object literal for the '<em><b>Right Port</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STREAM__RIGHT_PORT = eINSTANCE.getStream_RightPort();

    /**
     * The meta object literal for the '{@link de.grammarcraft.flow.flow.impl.LeftPortImpl <em>Left Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.flow.flow.impl.LeftPortImpl
     * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getLeftPort()
     * @generated
     */
    EClass LEFT_PORT = eINSTANCE.getLeftPort();

    /**
     * The meta object literal for the '{@link de.grammarcraft.flow.flow.impl.GlobalInputPortImpl <em>Global Input Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.flow.flow.impl.GlobalInputPortImpl
     * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getGlobalInputPort()
     * @generated
     */
    EClass GLOBAL_INPUT_PORT = eINSTANCE.getGlobalInputPort();

    /**
     * The meta object literal for the '{@link de.grammarcraft.flow.flow.impl.UnnamedSubFlowPortImpl <em>Unnamed Sub Flow Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.flow.flow.impl.UnnamedSubFlowPortImpl
     * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getUnnamedSubFlowPort()
     * @generated
     */
    EClass UNNAMED_SUB_FLOW_PORT = eINSTANCE.getUnnamedSubFlowPort();

    /**
     * The meta object literal for the '{@link de.grammarcraft.flow.flow.impl.RightPortImpl <em>Right Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.flow.flow.impl.RightPortImpl
     * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getRightPort()
     * @generated
     */
    EClass RIGHT_PORT = eINSTANCE.getRightPort();

    /**
     * The meta object literal for the '{@link de.grammarcraft.flow.flow.impl.GlobalOutputPortImpl <em>Global Output Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.flow.flow.impl.GlobalOutputPortImpl
     * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getGlobalOutputPort()
     * @generated
     */
    EClass GLOBAL_OUTPUT_PORT = eINSTANCE.getGlobalOutputPort();

    /**
     * The meta object literal for the '{@link de.grammarcraft.flow.flow.impl.PortImpl <em>Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.flow.flow.impl.PortImpl
     * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getPort()
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
     * The meta object literal for the '{@link de.grammarcraft.flow.flow.impl.NamedPortImpl <em>Named Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.flow.flow.impl.NamedPortImpl
     * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getNamedPort()
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
     * The meta object literal for the '{@link de.grammarcraft.flow.flow.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.flow.flow.impl.OperationImpl
     * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getOperation()
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
     * The meta object literal for the '{@link de.grammarcraft.flow.flow.impl.EbcOperationImpl <em>Ebc Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.flow.flow.impl.EbcOperationImpl
     * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getEbcOperation()
     * @generated
     */
    EClass EBC_OPERATION = eINSTANCE.getEbcOperation();

    /**
     * The meta object literal for the '{@link de.grammarcraft.flow.flow.impl.NativeClassImpl <em>Native Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.flow.flow.impl.NativeClassImpl
     * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getNativeClass()
     * @generated
     */
    EClass NATIVE_CLASS = eINSTANCE.getNativeClass();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NATIVE_CLASS__REFERENCE = eINSTANCE.getNativeClass_Reference();

    /**
     * The meta object literal for the '{@link de.grammarcraft.flow.flow.impl.MethodOperationImpl <em>Method Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.flow.flow.impl.MethodOperationImpl
     * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getMethodOperation()
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
     * The meta object literal for the '{@link de.grammarcraft.flow.flow.impl.NativeMethodImpl <em>Native Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.grammarcraft.flow.flow.impl.NativeMethodImpl
     * @see de.grammarcraft.flow.flow.impl.FlowPackageImpl#getNativeMethod()
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
