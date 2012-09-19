/**
 * <copyright>
 * </copyright>
 *

 */
package de.grammarcraft.csflow.flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.grammarcraft.csflow.flow.Operation#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.grammarcraft.csflow.flow.FlowPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends FunctionUnit
{
  /**
   * Returns the value of the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' containment reference.
   * @see #setClass(NativeClass)
   * @see de.grammarcraft.csflow.flow.FlowPackage#getOperation_Class()
   * @model containment="true"
   * @generated
   */
  NativeClass getClass_();

  /**
   * Sets the value of the '{@link de.grammarcraft.csflow.flow.Operation#getClass_ <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' containment reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(NativeClass value);

} // Operation
