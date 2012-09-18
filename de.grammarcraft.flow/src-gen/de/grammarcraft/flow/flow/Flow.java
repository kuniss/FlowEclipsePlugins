/**
 * <copyright>
 * </copyright>
 *

 */
package de.grammarcraft.flow.flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.grammarcraft.flow.flow.Flow#getStreams <em>Streams</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.grammarcraft.flow.flow.FlowPackage#getFlow()
 * @model
 * @generated
 */
public interface Flow extends FunctionUnit
{
  /**
   * Returns the value of the '<em><b>Streams</b></em>' containment reference list.
   * The list contents are of type {@link de.grammarcraft.flow.flow.Stream}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Streams</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Streams</em>' containment reference list.
   * @see de.grammarcraft.flow.flow.FlowPackage#getFlow_Streams()
   * @model containment="true"
   * @generated
   */
  EList<Stream> getStreams();

} // Flow
