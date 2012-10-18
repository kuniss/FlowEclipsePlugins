/**
 * <copyright>
 * </copyright>
 *

 */
package de.grammarcraft.csflow.flow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CS Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.grammarcraft.csflow.flow.CSTypeParameter#getTypeParameter <em>Type Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.grammarcraft.csflow.flow.FlowPackage#getCSTypeParameter()
 * @model
 * @generated
 */
public interface CSTypeParameter extends EObject
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
   * @see de.grammarcraft.csflow.flow.FlowPackage#getCSTypeParameter_TypeParameter()
   * @model containment="true"
   * @generated
   */
  TypeParameter getTypeParameter();

  /**
   * Sets the value of the '{@link de.grammarcraft.csflow.flow.CSTypeParameter#getTypeParameter <em>Type Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Parameter</em>' containment reference.
   * @see #getTypeParameter()
   * @generated
   */
  void setTypeParameter(TypeParameter value);

} // CSTypeParameter
