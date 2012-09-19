/**
 * <copyright>
 * </copyright>
 *

 */
package de.grammarcraft.csflow.flow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Native Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.grammarcraft.csflow.flow.NativeClass#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.grammarcraft.csflow.flow.FlowPackage#getNativeClass()
 * @model
 * @generated
 */
public interface NativeClass extends EObject
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' attribute.
   * @see #setReference(String)
   * @see de.grammarcraft.csflow.flow.FlowPackage#getNativeClass_Reference()
   * @model
   * @generated
   */
  String getReference();

  /**
   * Sets the value of the '{@link de.grammarcraft.csflow.flow.NativeClass#getReference <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' attribute.
   * @see #getReference()
   * @generated
   */
  void setReference(String value);

} // NativeClass
