/**
 * <copyright>
 * </copyright>
 *

 */
package de.grammarcraft.csflow.flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.grammarcraft.csflow.flow.Port#getFunctionUnit <em>Function Unit</em>}</li>
 *   <li>{@link de.grammarcraft.csflow.flow.Port#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.grammarcraft.csflow.flow.FlowPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends LeftPort, RightPort
{
  /**
   * Returns the value of the '<em><b>Function Unit</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Unit</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Unit</em>' reference.
   * @see #setFunctionUnit(FunctionUnit)
   * @see de.grammarcraft.csflow.flow.FlowPackage#getPort_FunctionUnit()
   * @model
   * @generated
   */
  FunctionUnit getFunctionUnit();

  /**
   * Sets the value of the '{@link de.grammarcraft.csflow.flow.Port#getFunctionUnit <em>Function Unit</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Unit</em>' reference.
   * @see #getFunctionUnit()
   * @generated
   */
  void setFunctionUnit(FunctionUnit value);

  /**
   * Returns the value of the '<em><b>Port</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' containment reference.
   * @see #setPort(NamedPort)
   * @see de.grammarcraft.csflow.flow.FlowPackage#getPort_Port()
   * @model containment="true"
   * @generated
   */
  NamedPort getPort();

  /**
   * Sets the value of the '{@link de.grammarcraft.csflow.flow.Port#getPort <em>Port</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' containment reference.
   * @see #getPort()
   * @generated
   */
  void setPort(NamedPort value);

} // Port
