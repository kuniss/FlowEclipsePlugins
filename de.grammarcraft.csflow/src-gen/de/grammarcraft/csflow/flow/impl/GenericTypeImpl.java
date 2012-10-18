/**
 * <copyright>
 * </copyright>
 *

 */
package de.grammarcraft.csflow.flow.impl;

import de.grammarcraft.csflow.flow.FlowPackage;
import de.grammarcraft.csflow.flow.GenericType;
import de.grammarcraft.csflow.flow.OperationType;
import de.grammarcraft.csflow.flow.OperationTypeParameters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.grammarcraft.csflow.flow.impl.GenericTypeImpl#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link de.grammarcraft.csflow.flow.impl.GenericTypeImpl#getOperationTypeParameters <em>Operation Type Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenericTypeImpl extends TypeParameterImpl implements GenericType
{
  /**
   * The cached value of the '{@link #getOperationType() <em>Operation Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperationType()
   * @generated
   * @ordered
   */
  protected OperationType operationType;

  /**
   * The cached value of the '{@link #getOperationTypeParameters() <em>Operation Type Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperationTypeParameters()
   * @generated
   * @ordered
   */
  protected OperationTypeParameters operationTypeParameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenericTypeImpl()
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
    return FlowPackage.Literals.GENERIC_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationType getOperationType()
  {
    return operationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperationType(OperationType newOperationType, NotificationChain msgs)
  {
    OperationType oldOperationType = operationType;
    operationType = newOperationType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.GENERIC_TYPE__OPERATION_TYPE, oldOperationType, newOperationType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperationType(OperationType newOperationType)
  {
    if (newOperationType != operationType)
    {
      NotificationChain msgs = null;
      if (operationType != null)
        msgs = ((InternalEObject)operationType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.GENERIC_TYPE__OPERATION_TYPE, null, msgs);
      if (newOperationType != null)
        msgs = ((InternalEObject)newOperationType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.GENERIC_TYPE__OPERATION_TYPE, null, msgs);
      msgs = basicSetOperationType(newOperationType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.GENERIC_TYPE__OPERATION_TYPE, newOperationType, newOperationType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationTypeParameters getOperationTypeParameters()
  {
    return operationTypeParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperationTypeParameters(OperationTypeParameters newOperationTypeParameters, NotificationChain msgs)
  {
    OperationTypeParameters oldOperationTypeParameters = operationTypeParameters;
    operationTypeParameters = newOperationTypeParameters;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.GENERIC_TYPE__OPERATION_TYPE_PARAMETERS, oldOperationTypeParameters, newOperationTypeParameters);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperationTypeParameters(OperationTypeParameters newOperationTypeParameters)
  {
    if (newOperationTypeParameters != operationTypeParameters)
    {
      NotificationChain msgs = null;
      if (operationTypeParameters != null)
        msgs = ((InternalEObject)operationTypeParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.GENERIC_TYPE__OPERATION_TYPE_PARAMETERS, null, msgs);
      if (newOperationTypeParameters != null)
        msgs = ((InternalEObject)newOperationTypeParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.GENERIC_TYPE__OPERATION_TYPE_PARAMETERS, null, msgs);
      msgs = basicSetOperationTypeParameters(newOperationTypeParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.GENERIC_TYPE__OPERATION_TYPE_PARAMETERS, newOperationTypeParameters, newOperationTypeParameters));
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
      case FlowPackage.GENERIC_TYPE__OPERATION_TYPE:
        return basicSetOperationType(null, msgs);
      case FlowPackage.GENERIC_TYPE__OPERATION_TYPE_PARAMETERS:
        return basicSetOperationTypeParameters(null, msgs);
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
      case FlowPackage.GENERIC_TYPE__OPERATION_TYPE:
        return getOperationType();
      case FlowPackage.GENERIC_TYPE__OPERATION_TYPE_PARAMETERS:
        return getOperationTypeParameters();
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
      case FlowPackage.GENERIC_TYPE__OPERATION_TYPE:
        setOperationType((OperationType)newValue);
        return;
      case FlowPackage.GENERIC_TYPE__OPERATION_TYPE_PARAMETERS:
        setOperationTypeParameters((OperationTypeParameters)newValue);
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
      case FlowPackage.GENERIC_TYPE__OPERATION_TYPE:
        setOperationType((OperationType)null);
        return;
      case FlowPackage.GENERIC_TYPE__OPERATION_TYPE_PARAMETERS:
        setOperationTypeParameters((OperationTypeParameters)null);
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
      case FlowPackage.GENERIC_TYPE__OPERATION_TYPE:
        return operationType != null;
      case FlowPackage.GENERIC_TYPE__OPERATION_TYPE_PARAMETERS:
        return operationTypeParameters != null;
    }
    return super.eIsSet(featureID);
  }

} //GenericTypeImpl
