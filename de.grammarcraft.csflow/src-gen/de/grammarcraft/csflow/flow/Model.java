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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.grammarcraft.csflow.flow.Model#getName <em>Name</em>}</li>
 *   <li>{@link de.grammarcraft.csflow.flow.Model#getImports <em>Imports</em>}</li>
 *   <li>{@link de.grammarcraft.csflow.flow.Model#getFunctionUnits <em>Function Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.grammarcraft.csflow.flow.FlowPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.grammarcraft.csflow.flow.FlowPackage#getModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.grammarcraft.csflow.flow.Model#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link de.grammarcraft.csflow.flow.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see de.grammarcraft.csflow.flow.FlowPackage#getModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Function Units</b></em>' containment reference list.
   * The list contents are of type {@link de.grammarcraft.csflow.flow.FunctionUnit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Units</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Units</em>' containment reference list.
   * @see de.grammarcraft.csflow.flow.FlowPackage#getModel_FunctionUnits()
   * @model containment="true"
   * @generated
   */
  EList<FunctionUnit> getFunctionUnits();

} // Model
