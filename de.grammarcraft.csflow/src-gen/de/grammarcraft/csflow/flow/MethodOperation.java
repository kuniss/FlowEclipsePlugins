/**
 * <copyright>
 * </copyright>
 *

 */
package de.grammarcraft.csflow.flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.grammarcraft.csflow.flow.MethodOperation#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.grammarcraft.csflow.flow.FlowPackage#getMethodOperation()
 * @model
 * @generated
 */
public interface MethodOperation extends Operation
{
  /**
   * Returns the value of the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' containment reference.
   * @see #setMethod(NativeMethod)
   * @see de.grammarcraft.csflow.flow.FlowPackage#getMethodOperation_Method()
   * @model containment="true"
   * @generated
   */
  NativeMethod getMethod();

  /**
   * Sets the value of the '{@link de.grammarcraft.csflow.flow.MethodOperation#getMethod <em>Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' containment reference.
   * @see #getMethod()
   * @generated
   */
  void setMethod(NativeMethod value);

} // MethodOperation
