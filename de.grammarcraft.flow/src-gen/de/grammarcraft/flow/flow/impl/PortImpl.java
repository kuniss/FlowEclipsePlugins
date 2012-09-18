/**
 * <copyright>
 * </copyright>
 *

 */
package de.grammarcraft.flow.flow.impl;

import de.grammarcraft.flow.flow.FlowPackage;
import de.grammarcraft.flow.flow.FunctionUnit;
import de.grammarcraft.flow.flow.NamedPort;
import de.grammarcraft.flow.flow.Port;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.grammarcraft.flow.flow.impl.PortImpl#getFunctionUnit <em>Function Unit</em>}</li>
 *   <li>{@link de.grammarcraft.flow.flow.impl.PortImpl#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortImpl extends LeftPortImpl implements Port
{
  /**
   * The cached value of the '{@link #getFunctionUnit() <em>Function Unit</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionUnit()
   * @generated
   * @ordered
   */
  protected FunctionUnit functionUnit;

  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected NamedPort port;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PortImpl()
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
    return FlowPackage.Literals.PORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionUnit getFunctionUnit()
  {
    if (functionUnit != null && functionUnit.eIsProxy())
    {
      InternalEObject oldFunctionUnit = (InternalEObject)functionUnit;
      functionUnit = (FunctionUnit)eResolveProxy(oldFunctionUnit);
      if (functionUnit != oldFunctionUnit)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlowPackage.PORT__FUNCTION_UNIT, oldFunctionUnit, functionUnit));
      }
    }
    return functionUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionUnit basicGetFunctionUnit()
  {
    return functionUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctionUnit(FunctionUnit newFunctionUnit)
  {
    FunctionUnit oldFunctionUnit = functionUnit;
    functionUnit = newFunctionUnit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.PORT__FUNCTION_UNIT, oldFunctionUnit, functionUnit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedPort getPort()
  {
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPort(NamedPort newPort, NotificationChain msgs)
  {
    NamedPort oldPort = port;
    port = newPort;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlowPackage.PORT__PORT, oldPort, newPort);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPort(NamedPort newPort)
  {
    if (newPort != port)
    {
      NotificationChain msgs = null;
      if (port != null)
        msgs = ((InternalEObject)port).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlowPackage.PORT__PORT, null, msgs);
      if (newPort != null)
        msgs = ((InternalEObject)newPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlowPackage.PORT__PORT, null, msgs);
      msgs = basicSetPort(newPort, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.PORT__PORT, newPort, newPort));
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
      case FlowPackage.PORT__PORT:
        return basicSetPort(null, msgs);
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
      case FlowPackage.PORT__FUNCTION_UNIT:
        if (resolve) return getFunctionUnit();
        return basicGetFunctionUnit();
      case FlowPackage.PORT__PORT:
        return getPort();
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
      case FlowPackage.PORT__FUNCTION_UNIT:
        setFunctionUnit((FunctionUnit)newValue);
        return;
      case FlowPackage.PORT__PORT:
        setPort((NamedPort)newValue);
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
      case FlowPackage.PORT__FUNCTION_UNIT:
        setFunctionUnit((FunctionUnit)null);
        return;
      case FlowPackage.PORT__PORT:
        setPort((NamedPort)null);
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
      case FlowPackage.PORT__FUNCTION_UNIT:
        return functionUnit != null;
      case FlowPackage.PORT__PORT:
        return port != null;
    }
    return super.eIsSet(featureID);
  }

} //PortImpl
