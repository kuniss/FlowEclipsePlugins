/**
 * <copyright>
 * </copyright>
 *

 */
package de.grammarcraft.csflow.flow.impl;

import de.grammarcraft.csflow.flow.Flow;
import de.grammarcraft.csflow.flow.FlowPackage;
import de.grammarcraft.csflow.flow.Stream;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.grammarcraft.csflow.flow.impl.FlowImpl#getStreams <em>Streams</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowImpl extends FunctionUnitImpl implements Flow
{
  /**
   * The cached value of the '{@link #getStreams() <em>Streams</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStreams()
   * @generated
   * @ordered
   */
  protected EList<Stream> streams;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FlowImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FlowPackage.Literals.FLOW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Stream> getStreams()
  {
    if (streams == null)
    {
      streams = new EObjectContainmentEList<Stream>(Stream.class, this, FlowPackage.FLOW__STREAMS);
    }
    return streams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FlowPackage.FLOW__STREAMS:
        return ((InternalEList<?>)getStreams()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FlowPackage.FLOW__STREAMS:
        return getStreams();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FlowPackage.FLOW__STREAMS:
        getStreams().clear();
        getStreams().addAll((Collection<? extends Stream>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FlowPackage.FLOW__STREAMS:
        getStreams().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FlowPackage.FLOW__STREAMS:
        return streams != null && !streams.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FlowImpl
