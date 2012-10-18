/**
 * <copyright>
 * </copyright>
 *

 */
package de.grammarcraft.csflow.flow.impl;

import de.grammarcraft.csflow.flow.CSTypeParameter;
import de.grammarcraft.csflow.flow.FlowPackage;
import de.grammarcraft.csflow.flow.TypeParameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CS Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.grammarcraft.csflow.flow.impl.CSTypeParameterImpl#getTypeParameter <em>Type Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSTypeParameterImpl extends MinimalEObjectImpl.Container implements CSTypeParameter
{
  /**
   * The cached value of the '{@link #getTypeParameter() <em>Type Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeParameter()
   * @generated
   * @ordered
   */
  protected TypeParameter typeParameter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CSTypeParameterImpl()
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
    return FlowPackage.Literals.CS_TYPE_PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeParameter getTypeParameter()
  {
    return typeParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeParameter(TypeParameter newTypeParameter, NotificationChain msgs)
  {
    TypeParameter oldTypeParameter = typeParameter;
    typeParameter = newTypeParameter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.CS_TYPE_PARAMETER__TYPE_PARAMETER, oldTypeParameter, newTypeParameter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeParameter(TypeParameter newTypeParameter)
  {
    if (newTypeParameter != typeParameter)
    {
      NotificationChain msgs = null;
      if (typeParameter != null)
        msgs = ((InternalEObject)typeParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.CS_TYPE_PARAMETER__TYPE_PARAMETER, null, msgs);
      if (newTypeParameter != null)
        msgs = ((InternalEObject)newTypeParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.CS_TYPE_PARAMETER__TYPE_PARAMETER, null, msgs);
      msgs = basicSetTypeParameter(newTypeParameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.CS_TYPE_PARAMETER__TYPE_PARAMETER, newTypeParameter, newTypeParameter));
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
      case FlowPackage.CS_TYPE_PARAMETER__TYPE_PARAMETER:
        return basicSetTypeParameter(null, msgs);
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
      case FlowPackage.CS_TYPE_PARAMETER__TYPE_PARAMETER:
        return getTypeParameter();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FlowPackage.CS_TYPE_PARAMETER__TYPE_PARAMETER:
        setTypeParameter((TypeParameter)newValue);
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
      case FlowPackage.CS_TYPE_PARAMETER__TYPE_PARAMETER:
        setTypeParameter((TypeParameter)null);
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
      case FlowPackage.CS_TYPE_PARAMETER__TYPE_PARAMETER:
        return typeParameter != null;
    }
    return super.eIsSet(featureID);
  }

} //CSTypeParameterImpl
