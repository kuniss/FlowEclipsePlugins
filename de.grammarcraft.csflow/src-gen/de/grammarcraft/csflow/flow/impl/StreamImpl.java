/**
 * <copyright>
 * </copyright>
 *

 */
package de.grammarcraft.csflow.flow.impl;

import de.grammarcraft.csflow.flow.FlowPackage;
import de.grammarcraft.csflow.flow.LeftPort;
import de.grammarcraft.csflow.flow.RightPort;
import de.grammarcraft.csflow.flow.Stream;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stream</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.grammarcraft.csflow.flow.impl.StreamImpl#getLeftPort <em>Left Port</em>}</li>
 *   <li>{@link de.grammarcraft.csflow.flow.impl.StreamImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link de.grammarcraft.csflow.flow.impl.StreamImpl#getRightPort <em>Right Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StreamImpl extends MinimalEObjectImpl.Container implements Stream
{
  /**
   * The cached value of the '{@link #getLeftPort() <em>Left Port</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftPort()
   * @generated
   * @ordered
   */
  protected LeftPort leftPort;

  /**
   * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
  protected static final String MESSAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
  protected String message = MESSAGE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRightPort() <em>Right Port</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightPort()
   * @generated
   * @ordered
   */
  protected RightPort rightPort;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StreamImpl()
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
    return FlowPackage.Literals.STREAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftPort getLeftPort()
  {
    return leftPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftPort(LeftPort newLeftPort, NotificationChain msgs)
  {
    LeftPort oldLeftPort = leftPort;
    leftPort = newLeftPort;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.STREAM__LEFT_PORT, oldLeftPort, newLeftPort);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftPort(LeftPort newLeftPort)
  {
    if (newLeftPort != leftPort)
    {
      NotificationChain msgs = null;
      if (leftPort != null)
        msgs = ((InternalEObject)leftPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.STREAM__LEFT_PORT, null, msgs);
      if (newLeftPort != null)
        msgs = ((InternalEObject)newLeftPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.STREAM__LEFT_PORT, null, msgs);
      msgs = basicSetLeftPort(newLeftPort, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.STREAM__LEFT_PORT, newLeftPort, newLeftPort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMessage()
  {
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMessage(String newMessage)
  {
    String oldMessage = message;
    message = newMessage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.STREAM__MESSAGE, oldMessage, message));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RightPort getRightPort()
  {
    return rightPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightPort(RightPort newRightPort, NotificationChain msgs)
  {
    RightPort oldRightPort = rightPort;
    rightPort = newRightPort;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.STREAM__RIGHT_PORT, oldRightPort, newRightPort);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightPort(RightPort newRightPort)
  {
    if (newRightPort != rightPort)
    {
      NotificationChain msgs = null;
      if (rightPort != null)
        msgs = ((InternalEObject)rightPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.STREAM__RIGHT_PORT, null, msgs);
      if (newRightPort != null)
        msgs = ((InternalEObject)newRightPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.STREAM__RIGHT_PORT, null, msgs);
      msgs = basicSetRightPort(newRightPort, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.STREAM__RIGHT_PORT, newRightPort, newRightPort));
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
      case FlowPackage.STREAM__LEFT_PORT:
        return basicSetLeftPort(null, msgs);
      case FlowPackage.STREAM__RIGHT_PORT:
        return basicSetRightPort(null, msgs);
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
      case FlowPackage.STREAM__LEFT_PORT:
        return getLeftPort();
      case FlowPackage.STREAM__MESSAGE:
        return getMessage();
      case FlowPackage.STREAM__RIGHT_PORT:
        return getRightPort();
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
      case FlowPackage.STREAM__LEFT_PORT:
        setLeftPort((LeftPort)newValue);
        return;
      case FlowPackage.STREAM__MESSAGE:
        setMessage((String)newValue);
        return;
      case FlowPackage.STREAM__RIGHT_PORT:
        setRightPort((RightPort)newValue);
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
      case FlowPackage.STREAM__LEFT_PORT:
        setLeftPort((LeftPort)null);
        return;
      case FlowPackage.STREAM__MESSAGE:
        setMessage(MESSAGE_EDEFAULT);
        return;
      case FlowPackage.STREAM__RIGHT_PORT:
        setRightPort((RightPort)null);
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
      case FlowPackage.STREAM__LEFT_PORT:
        return leftPort != null;
      case FlowPackage.STREAM__MESSAGE:
        return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
      case FlowPackage.STREAM__RIGHT_PORT:
        return rightPort != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (message: ");
    result.append(message);
    result.append(')');
    return result.toString();
  }

} //StreamImpl
