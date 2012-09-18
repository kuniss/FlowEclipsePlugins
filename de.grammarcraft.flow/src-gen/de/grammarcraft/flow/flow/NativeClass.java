/**
 * <copyright>
 * </copyright>
 *

 */
package de.grammarcraft.flow.flow;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Native Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.grammarcraft.flow.flow.NativeClass#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.grammarcraft.flow.flow.FlowPackage#getNativeClass()
 * @model
 * @generated
 */
public interface NativeClass extends EObject
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' containment reference.
   * @see #setReference(JvmTypeReference)
   * @see de.grammarcraft.flow.flow.FlowPackage#getNativeClass_Reference()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getReference();

  /**
   * Sets the value of the '{@link de.grammarcraft.flow.flow.NativeClass#getReference <em>Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' containment reference.
   * @see #getReference()
   * @generated
   */
  void setReference(JvmTypeReference value);

} // NativeClass
