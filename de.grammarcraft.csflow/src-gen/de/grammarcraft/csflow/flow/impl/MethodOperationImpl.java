/**
 * <copyright>
 * </copyright>
 *

 */
package de.grammarcraft.csflow.flow.impl;

import de.grammarcraft.csflow.flow.FlowPackage;
import de.grammarcraft.csflow.flow.MethodOperation;
import de.grammarcraft.csflow.flow.NativeMethod;
import de.grammarcraft.csflow.flow.Signature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.grammarcraft.csflow.flow.impl.MethodOperationImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link de.grammarcraft.csflow.flow.impl.MethodOperationImpl#getSignature <em>Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodOperationImpl extends OperationImpl implements MethodOperation
{
  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected NativeMethod method;

  /**
   * The cached value of the '{@link #getSignature() <em>Signature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignature()
   * @generated
   * @ordered
   */
  protected Signature signature;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodOperationImpl()
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
    return FlowPackage.Literals.METHOD_OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NativeMethod getMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethod(NativeMethod newMethod, NotificationChain msgs)
  {
    NativeMethod oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.METHOD_OPERATION__METHOD, oldMethod, newMethod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(NativeMethod newMethod)
  {
    if (newMethod != method)
    {
      NotificationChain msgs = null;
      if (method != null)
        msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.METHOD_OPERATION__METHOD, null, msgs);
      if (newMethod != null)
        msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.METHOD_OPERATION__METHOD, null, msgs);
      msgs = basicSetMethod(newMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.METHOD_OPERATION__METHOD, newMethod, newMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signature getSignature()
  {
    return signature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSignature(Signature newSignature, NotificationChain msgs)
  {
    Signature oldSignature = signature;
    signature = newSignature;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.METHOD_OPERATION__SIGNATURE, oldSignature, newSignature);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSignature(Signature newSignature)
  {
    if (newSignature != signature)
    {
      NotificationChain msgs = null;
      if (signature != null)
        msgs = ((InternalEObject)signature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.METHOD_OPERATION__SIGNATURE, null, msgs);
      if (newSignature != null)
        msgs = ((InternalEObject)newSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.METHOD_OPERATION__SIGNATURE, null, msgs);
      msgs = basicSetSignature(newSignature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.METHOD_OPERATION__SIGNATURE, newSignature, newSignature));
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
      case FlowPackage.METHOD_OPERATION__METHOD:
        return basicSetMethod(null, msgs);
      case FlowPackage.METHOD_OPERATION__SIGNATURE:
        return basicSetSignature(null, msgs);
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
      case FlowPackage.METHOD_OPERATION__METHOD:
        return getMethod();
      case FlowPackage.METHOD_OPERATION__SIGNATURE:
        return getSignature();
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
      case FlowPackage.METHOD_OPERATION__METHOD:
        setMethod((NativeMethod)newValue);
        return;
      case FlowPackage.METHOD_OPERATION__SIGNATURE:
        setSignature((Signature)newValue);
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
      case FlowPackage.METHOD_OPERATION__METHOD:
        setMethod((NativeMethod)null);
        return;
      case FlowPackage.METHOD_OPERATION__SIGNATURE:
        setSignature((Signature)null);
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
      case FlowPackage.METHOD_OPERATION__METHOD:
        return method != null;
      case FlowPackage.METHOD_OPERATION__SIGNATURE:
        return signature != null;
    }
    return super.eIsSet(featureID);
  }

} //MethodOperationImpl
