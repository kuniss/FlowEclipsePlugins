/**
 * <copyright>
 * </copyright>
 *

 */
package de.grammarcraft.csflow.flow;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.grammarcraft.csflow.flow.FlowPackage
 * @generated
 */
public interface FlowFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FlowFactory eINSTANCE = de.grammarcraft.csflow.flow.impl.FlowFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Function Unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Unit</em>'.
   * @generated
   */
  FunctionUnit createFunctionUnit();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Flow</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Flow</em>'.
   * @generated
   */
  Flow createFlow();

  /**
   * Returns a new object of class '<em>Stream</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stream</em>'.
   * @generated
   */
  Stream createStream();

  /**
   * Returns a new object of class '<em>Left Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Left Port</em>'.
   * @generated
   */
  LeftPort createLeftPort();

  /**
   * Returns a new object of class '<em>Global Input Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global Input Port</em>'.
   * @generated
   */
  GlobalInputPort createGlobalInputPort();

  /**
   * Returns a new object of class '<em>Unnamed Sub Flow Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unnamed Sub Flow Port</em>'.
   * @generated
   */
  UnnamedSubFlowPort createUnnamedSubFlowPort();

  /**
   * Returns a new object of class '<em>Right Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Right Port</em>'.
   * @generated
   */
  RightPort createRightPort();

  /**
   * Returns a new object of class '<em>Global Output Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global Output Port</em>'.
   * @generated
   */
  GlobalOutputPort createGlobalOutputPort();

  /**
   * Returns a new object of class '<em>Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Port</em>'.
   * @generated
   */
  Port createPort();

  /**
   * Returns a new object of class '<em>Named Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Port</em>'.
   * @generated
   */
  NamedPort createNamedPort();

  /**
   * Returns a new object of class '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation</em>'.
   * @generated
   */
  Operation createOperation();

  /**
   * Returns a new object of class '<em>Ebc Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ebc Operation</em>'.
   * @generated
   */
  EbcOperation createEbcOperation();

  /**
   * Returns a new object of class '<em>Native Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Native Class</em>'.
   * @generated
   */
  NativeClass createNativeClass();

  /**
   * Returns a new object of class '<em>Method Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Operation</em>'.
   * @generated
   */
  MethodOperation createMethodOperation();

  /**
   * Returns a new object of class '<em>Signature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signature</em>'.
   * @generated
   */
  Signature createSignature();

  /**
   * Returns a new object of class '<em>Generic Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generic Type</em>'.
   * @generated
   */
  GenericType createGenericType();

  /**
   * Returns a new object of class '<em>Operation Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Type</em>'.
   * @generated
   */
  OperationType createOperationType();

  /**
   * Returns a new object of class '<em>Operation Type Parameters</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Type Parameters</em>'.
   * @generated
   */
  OperationTypeParameters createOperationTypeParameters();

  /**
   * Returns a new object of class '<em>Type Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Parameter</em>'.
   * @generated
   */
  TypeParameter createTypeParameter();

  /**
   * Returns a new object of class '<em>CS Type Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CS Type Parameter</em>'.
   * @generated
   */
  CSTypeParameter createCSTypeParameter();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Native Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Native Method</em>'.
   * @generated
   */
  NativeMethod createNativeMethod();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  FlowPackage getFlowPackage();

} //FlowFactory
