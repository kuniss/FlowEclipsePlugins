/**
 * <copyright>
 * </copyright>
 *

 */
package de.grammarcraft.csflow.flow.impl;

import de.grammarcraft.csflow.flow.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowFactoryImpl extends EFactoryImpl implements FlowFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FlowFactory init()
  {
    try
    {
      FlowFactory theFlowFactory = (FlowFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.grammarcraft.de/csflow/Flow"); 
      if (theFlowFactory != null)
      {
        return theFlowFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FlowFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FlowPackage.MODEL: return createModel();
      case FlowPackage.FUNCTION_UNIT: return createFunctionUnit();
      case FlowPackage.IMPORT: return createImport();
      case FlowPackage.FLOW: return createFlow();
      case FlowPackage.STREAM: return createStream();
      case FlowPackage.LEFT_PORT: return createLeftPort();
      case FlowPackage.GLOBAL_INPUT_PORT: return createGlobalInputPort();
      case FlowPackage.UNNAMED_SUB_FLOW_PORT: return createUnnamedSubFlowPort();
      case FlowPackage.RIGHT_PORT: return createRightPort();
      case FlowPackage.GLOBAL_OUTPUT_PORT: return createGlobalOutputPort();
      case FlowPackage.PORT: return createPort();
      case FlowPackage.NAMED_PORT: return createNamedPort();
      case FlowPackage.OPERATION: return createOperation();
      case FlowPackage.EBC_OPERATION: return createEbcOperation();
      case FlowPackage.NATIVE_CLASS: return createNativeClass();
      case FlowPackage.CLASS_OPERATION: return createClassOperation();
      case FlowPackage.METHOD_OPERATION: return createMethodOperation();
      case FlowPackage.SIGNATURE: return createSignature();
      case FlowPackage.GENERIC_TYPE: return createGenericType();
      case FlowPackage.OPERATION_TYPE: return createOperationType();
      case FlowPackage.OPERATION_TYPE_PARAMETERS: return createOperationTypeParameters();
      case FlowPackage.TYPE_PARAMETER: return createTypeParameter();
      case FlowPackage.CS_TYPE_PARAMETER: return createCSTypeParameter();
      case FlowPackage.TYPE: return createType();
      case FlowPackage.NATIVE_METHOD: return createNativeMethod();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionUnit createFunctionUnit()
  {
    FunctionUnitImpl functionUnit = new FunctionUnitImpl();
    return functionUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Flow createFlow()
  {
    FlowImpl flow = new FlowImpl();
    return flow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stream createStream()
  {
    StreamImpl stream = new StreamImpl();
    return stream;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftPort createLeftPort()
  {
    LeftPortImpl leftPort = new LeftPortImpl();
    return leftPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalInputPort createGlobalInputPort()
  {
    GlobalInputPortImpl globalInputPort = new GlobalInputPortImpl();
    return globalInputPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnnamedSubFlowPort createUnnamedSubFlowPort()
  {
    UnnamedSubFlowPortImpl unnamedSubFlowPort = new UnnamedSubFlowPortImpl();
    return unnamedSubFlowPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RightPort createRightPort()
  {
    RightPortImpl rightPort = new RightPortImpl();
    return rightPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalOutputPort createGlobalOutputPort()
  {
    GlobalOutputPortImpl globalOutputPort = new GlobalOutputPortImpl();
    return globalOutputPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port createPort()
  {
    PortImpl port = new PortImpl();
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedPort createNamedPort()
  {
    NamedPortImpl namedPort = new NamedPortImpl();
    return namedPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EbcOperation createEbcOperation()
  {
    EbcOperationImpl ebcOperation = new EbcOperationImpl();
    return ebcOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NativeClass createNativeClass()
  {
    NativeClassImpl nativeClass = new NativeClassImpl();
    return nativeClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassOperation createClassOperation()
  {
    ClassOperationImpl classOperation = new ClassOperationImpl();
    return classOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodOperation createMethodOperation()
  {
    MethodOperationImpl methodOperation = new MethodOperationImpl();
    return methodOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signature createSignature()
  {
    SignatureImpl signature = new SignatureImpl();
    return signature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericType createGenericType()
  {
    GenericTypeImpl genericType = new GenericTypeImpl();
    return genericType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationType createOperationType()
  {
    OperationTypeImpl operationType = new OperationTypeImpl();
    return operationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationTypeParameters createOperationTypeParameters()
  {
    OperationTypeParametersImpl operationTypeParameters = new OperationTypeParametersImpl();
    return operationTypeParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeParameter createTypeParameter()
  {
    TypeParameterImpl typeParameter = new TypeParameterImpl();
    return typeParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSTypeParameter createCSTypeParameter()
  {
    CSTypeParameterImpl csTypeParameter = new CSTypeParameterImpl();
    return csTypeParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NativeMethod createNativeMethod()
  {
    NativeMethodImpl nativeMethod = new NativeMethodImpl();
    return nativeMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowPackage getFlowPackage()
  {
    return (FlowPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FlowPackage getPackage()
  {
    return FlowPackage.eINSTANCE;
  }

} //FlowFactoryImpl
