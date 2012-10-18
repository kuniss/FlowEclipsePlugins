/**
 * <copyright>
 * </copyright>
 *

 */
package de.grammarcraft.csflow.flow.util;

import de.grammarcraft.csflow.flow.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.grammarcraft.csflow.flow.FlowPackage
 * @generated
 */
public class FlowSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FlowPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = FlowPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case FlowPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.FUNCTION_UNIT:
      {
        FunctionUnit functionUnit = (FunctionUnit)theEObject;
        T result = caseFunctionUnit(functionUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.FLOW:
      {
        Flow flow = (Flow)theEObject;
        T result = caseFlow(flow);
        if (result == null) result = caseFunctionUnit(flow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.STREAM:
      {
        Stream stream = (Stream)theEObject;
        T result = caseStream(stream);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.LEFT_PORT:
      {
        LeftPort leftPort = (LeftPort)theEObject;
        T result = caseLeftPort(leftPort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.GLOBAL_INPUT_PORT:
      {
        GlobalInputPort globalInputPort = (GlobalInputPort)theEObject;
        T result = caseGlobalInputPort(globalInputPort);
        if (result == null) result = caseLeftPort(globalInputPort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.UNNAMED_SUB_FLOW_PORT:
      {
        UnnamedSubFlowPort unnamedSubFlowPort = (UnnamedSubFlowPort)theEObject;
        T result = caseUnnamedSubFlowPort(unnamedSubFlowPort);
        if (result == null) result = caseLeftPort(unnamedSubFlowPort);
        if (result == null) result = caseRightPort(unnamedSubFlowPort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.RIGHT_PORT:
      {
        RightPort rightPort = (RightPort)theEObject;
        T result = caseRightPort(rightPort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.GLOBAL_OUTPUT_PORT:
      {
        GlobalOutputPort globalOutputPort = (GlobalOutputPort)theEObject;
        T result = caseGlobalOutputPort(globalOutputPort);
        if (result == null) result = caseRightPort(globalOutputPort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.PORT:
      {
        Port port = (Port)theEObject;
        T result = casePort(port);
        if (result == null) result = caseLeftPort(port);
        if (result == null) result = caseRightPort(port);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.NAMED_PORT:
      {
        NamedPort namedPort = (NamedPort)theEObject;
        T result = caseNamedPort(namedPort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.OPERATION:
      {
        Operation operation = (Operation)theEObject;
        T result = caseOperation(operation);
        if (result == null) result = caseFunctionUnit(operation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.EBC_OPERATION:
      {
        EbcOperation ebcOperation = (EbcOperation)theEObject;
        T result = caseEbcOperation(ebcOperation);
        if (result == null) result = caseOperation(ebcOperation);
        if (result == null) result = caseFunctionUnit(ebcOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.NATIVE_CLASS:
      {
        NativeClass nativeClass = (NativeClass)theEObject;
        T result = caseNativeClass(nativeClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.METHOD_OPERATION:
      {
        MethodOperation methodOperation = (MethodOperation)theEObject;
        T result = caseMethodOperation(methodOperation);
        if (result == null) result = caseOperation(methodOperation);
        if (result == null) result = caseFunctionUnit(methodOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.SIGNATURE:
      {
        Signature signature = (Signature)theEObject;
        T result = caseSignature(signature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.GENERIC_TYPE:
      {
        GenericType genericType = (GenericType)theEObject;
        T result = caseGenericType(genericType);
        if (result == null) result = caseTypeParameter(genericType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.OPERATION_TYPE:
      {
        OperationType operationType = (OperationType)theEObject;
        T result = caseOperationType(operationType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.OPERATION_TYPE_PARAMETERS:
      {
        OperationTypeParameters operationTypeParameters = (OperationTypeParameters)theEObject;
        T result = caseOperationTypeParameters(operationTypeParameters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.TYPE_PARAMETER:
      {
        TypeParameter typeParameter = (TypeParameter)theEObject;
        T result = caseTypeParameter(typeParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.CS_TYPE_PARAMETER:
      {
        CSTypeParameter csTypeParameter = (CSTypeParameter)theEObject;
        T result = caseCSTypeParameter(csTypeParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = caseTypeParameter(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FlowPackage.NATIVE_METHOD:
      {
        NativeMethod nativeMethod = (NativeMethod)theEObject;
        T result = caseNativeMethod(nativeMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionUnit(FunctionUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Flow</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flow</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlow(Flow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stream</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stream</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStream(Stream object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Left Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Left Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeftPort(LeftPort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Global Input Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Global Input Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlobalInputPort(GlobalInputPort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unnamed Sub Flow Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unnamed Sub Flow Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnnamedSubFlowPort(UnnamedSubFlowPort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Right Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Right Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRightPort(RightPort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Global Output Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Global Output Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlobalOutputPort(GlobalOutputPort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePort(Port object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedPort(NamedPort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperation(Operation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ebc Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ebc Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEbcOperation(EbcOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Native Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Native Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNativeClass(NativeClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodOperation(MethodOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignature(Signature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generic Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generic Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenericType(GenericType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationType(OperationType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Type Parameters</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Type Parameters</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationTypeParameters(OperationTypeParameters object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeParameter(TypeParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CS Type Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CS Type Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSTypeParameter(CSTypeParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Native Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Native Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNativeMethod(NativeMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //FlowSwitch
