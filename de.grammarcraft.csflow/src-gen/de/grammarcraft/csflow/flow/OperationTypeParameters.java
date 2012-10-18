/**
 * <copyright>
 * </copyright>
 *

 */
package de.grammarcraft.csflow.flow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Type Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.grammarcraft.csflow.flow.OperationTypeParameters#getTypeParameter <em>Type Parameter</em>}</li>
 *   <li>{@link de.grammarcraft.csflow.flow.OperationTypeParameters#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.grammarcraft.csflow.flow.FlowPackage#getOperationTypeParameters()
 * @model
 * @generated
 */
public interface OperationTypeParameters extends EObject
{
  /**
   * Returns the value of the '<em><b>Type Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Parameter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Parameter</em>' containment reference.
   * @see #setTypeParameter(TypeParameter)
   * @see de.grammarcraft.csflow.flow.FlowPackage#getOperationTypeParameters_TypeParameter()
   * @model containment="true"
   * @generated
   */
  TypeParameter getTypeParameter();

  /**
   * Sets the value of the '{@link de.grammarcraft.csflow.flow.OperationTypeParameters#getTypeParameter <em>Type Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Parameter</em>' containment reference.
   * @see #getTypeParameter()
   * @generated
   */
  void setTypeParameter(TypeParameter value);

  /**
   * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
   * The list contents are of type {@link de.grammarcraft.csflow.flow.CSTypeParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Parameters</em>' containment reference list.
   * @see de.grammarcraft.csflow.flow.FlowPackage#getOperationTypeParameters_TypeParameters()
   * @model containment="true"
   * @generated
   */
  EList<CSTypeParameter> getTypeParameters();

} // OperationTypeParameters
