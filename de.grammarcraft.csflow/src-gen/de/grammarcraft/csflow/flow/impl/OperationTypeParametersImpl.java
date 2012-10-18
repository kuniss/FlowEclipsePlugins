/**
 * <copyright>
 * </copyright>
 *

 */
package de.grammarcraft.csflow.flow.impl;

import de.grammarcraft.csflow.flow.CSTypeParameter;
import de.grammarcraft.csflow.flow.FlowPackage;
import de.grammarcraft.csflow.flow.OperationTypeParameters;
import de.grammarcraft.csflow.flow.TypeParameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Type Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.grammarcraft.csflow.flow.impl.OperationTypeParametersImpl#getTypeParameter <em>Type Parameter</em>}</li>
 *   <li>{@link de.grammarcraft.csflow.flow.impl.OperationTypeParametersImpl#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationTypeParametersImpl extends MinimalEObjectImpl.Container implements OperationTypeParameters
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
   * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeParameters()
   * @generated
   * @ordered
   */
  protected EList<CSTypeParameter> typeParameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationTypeParametersImpl()
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
    return FlowPackage.Literals.OPERATION_TYPE_PARAMETERS;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.OPERATION_TYPE_PARAMETERS__TYPE_PARAMETER, oldTypeParameter, newTypeParameter);
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
        msgs = ((InternalEObject)typeParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.OPERATION_TYPE_PARAMETERS__TYPE_PARAMETER, null, msgs);
      if (newTypeParameter != null)
        msgs = ((InternalEObject)newTypeParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.OPERATION_TYPE_PARAMETERS__TYPE_PARAMETER, null, msgs);
      msgs = basicSetTypeParameter(newTypeParameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.OPERATION_TYPE_PARAMETERS__TYPE_PARAMETER, newTypeParameter, newTypeParameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CSTypeParameter> getTypeParameters()
  {
    if (typeParameters == null)
    {
      typeParameters = new EObjectContainmentEList<CSTypeParameter>(CSTypeParameter.class, this, FlowPackage.OPERATION_TYPE_PARAMETERS__TYPE_PARAMETERS);
    }
    return typeParameters;
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
      case FlowPackage.OPERATION_TYPE_PARAMETERS__TYPE_PARAMETER:
        return basicSetTypeParameter(null, msgs);
      case FlowPackage.OPERATION_TYPE_PARAMETERS__TYPE_PARAMETERS:
        return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
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
      case FlowPackage.OPERATION_TYPE_PARAMETERS__TYPE_PARAMETER:
        return getTypeParameter();
      case FlowPackage.OPERATION_TYPE_PARAMETERS__TYPE_PARAMETERS:
        return getTypeParameters();
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
      case FlowPackage.OPERATION_TYPE_PARAMETERS__TYPE_PARAMETER:
        setTypeParameter((TypeParameter)newValue);
        return;
      case FlowPackage.OPERATION_TYPE_PARAMETERS__TYPE_PARAMETERS:
        getTypeParameters().clear();
        getTypeParameters().addAll((Collection<? extends CSTypeParameter>)newValue);
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
      case FlowPackage.OPERATION_TYPE_PARAMETERS__TYPE_PARAMETER:
        setTypeParameter((TypeParameter)null);
        return;
      case FlowPackage.OPERATION_TYPE_PARAMETERS__TYPE_PARAMETERS:
        getTypeParameters().clear();
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
      case FlowPackage.OPERATION_TYPE_PARAMETERS__TYPE_PARAMETER:
        return typeParameter != null;
      case FlowPackage.OPERATION_TYPE_PARAMETERS__TYPE_PARAMETERS:
        return typeParameters != null && !typeParameters.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OperationTypeParametersImpl
