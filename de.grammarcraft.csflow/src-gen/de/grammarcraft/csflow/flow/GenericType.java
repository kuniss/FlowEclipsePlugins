/**
 * <copyright>
 * </copyright>
 *

 */
package de.grammarcraft.csflow.flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.grammarcraft.csflow.flow.GenericType#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link de.grammarcraft.csflow.flow.GenericType#getOperationTypeParameters <em>Operation Type Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.grammarcraft.csflow.flow.FlowPackage#getGenericType()
 * @model
 * @generated
 */
public interface GenericType extends TypeParameter
{
  /**
   * Returns the value of the '<em><b>Operation Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation Type</em>' containment reference.
   * @see #setOperationType(OperationType)
   * @see de.grammarcraft.csflow.flow.FlowPackage#getGenericType_OperationType()
   * @model containment="true"
   * @generated
   */
  OperationType getOperationType();

  /**
   * Sets the value of the '{@link de.grammarcraft.csflow.flow.GenericType#getOperationType <em>Operation Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation Type</em>' containment reference.
   * @see #getOperationType()
   * @generated
   */
  void setOperationType(OperationType value);

  /**
   * Returns the value of the '<em><b>Operation Type Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation Type Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation Type Parameters</em>' containment reference.
   * @see #setOperationTypeParameters(OperationTypeParameters)
   * @see de.grammarcraft.csflow.flow.FlowPackage#getGenericType_OperationTypeParameters()
   * @model containment="true"
   * @generated
   */
  OperationTypeParameters getOperationTypeParameters();

  /**
   * Sets the value of the '{@link de.grammarcraft.csflow.flow.GenericType#getOperationTypeParameters <em>Operation Type Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation Type Parameters</em>' containment reference.
   * @see #getOperationTypeParameters()
   * @generated
   */
  void setOperationTypeParameters(OperationTypeParameters value);

} // GenericType
