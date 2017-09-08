/**
 * generated by Xtext 2.9.1
 */
package org.xtext.alma.sdmdsl.sdmdsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.alma.sdmdsl.sdmdsl.Addition;
import org.xtext.alma.sdmdsl.sdmdsl.Primary;
import org.xtext.alma.sdmdsl.sdmdsl.SdmdslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.alma.sdmdsl.sdmdsl.impl.PrimaryImpl#getPrimValue <em>Prim Value</em>}</li>
 *   <li>{@link org.xtext.alma.sdmdsl.sdmdsl.impl.PrimaryImpl#getPrimAddValue <em>Prim Add Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimaryImpl extends MinimalEObjectImpl.Container implements Primary
{
  /**
   * The cached value of the '{@link #getPrimValue() <em>Prim Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimValue()
   * @generated
   * @ordered
   */
  protected EObject primValue;

  /**
   * The cached value of the '{@link #getPrimAddValue() <em>Prim Add Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimAddValue()
   * @generated
   * @ordered
   */
  protected Addition primAddValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimaryImpl()
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
    return SdmdslPackage.Literals.PRIMARY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getPrimValue()
  {
    return primValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimValue(EObject newPrimValue, NotificationChain msgs)
  {
    EObject oldPrimValue = primValue;
    primValue = newPrimValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SdmdslPackage.PRIMARY__PRIM_VALUE, oldPrimValue, newPrimValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimValue(EObject newPrimValue)
  {
    if (newPrimValue != primValue)
    {
      NotificationChain msgs = null;
      if (primValue != null)
        msgs = ((InternalEObject)primValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SdmdslPackage.PRIMARY__PRIM_VALUE, null, msgs);
      if (newPrimValue != null)
        msgs = ((InternalEObject)newPrimValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SdmdslPackage.PRIMARY__PRIM_VALUE, null, msgs);
      msgs = basicSetPrimValue(newPrimValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SdmdslPackage.PRIMARY__PRIM_VALUE, newPrimValue, newPrimValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Addition getPrimAddValue()
  {
    return primAddValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimAddValue(Addition newPrimAddValue, NotificationChain msgs)
  {
    Addition oldPrimAddValue = primAddValue;
    primAddValue = newPrimAddValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SdmdslPackage.PRIMARY__PRIM_ADD_VALUE, oldPrimAddValue, newPrimAddValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimAddValue(Addition newPrimAddValue)
  {
    if (newPrimAddValue != primAddValue)
    {
      NotificationChain msgs = null;
      if (primAddValue != null)
        msgs = ((InternalEObject)primAddValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SdmdslPackage.PRIMARY__PRIM_ADD_VALUE, null, msgs);
      if (newPrimAddValue != null)
        msgs = ((InternalEObject)newPrimAddValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SdmdslPackage.PRIMARY__PRIM_ADD_VALUE, null, msgs);
      msgs = basicSetPrimAddValue(newPrimAddValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SdmdslPackage.PRIMARY__PRIM_ADD_VALUE, newPrimAddValue, newPrimAddValue));
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
      case SdmdslPackage.PRIMARY__PRIM_VALUE:
        return basicSetPrimValue(null, msgs);
      case SdmdslPackage.PRIMARY__PRIM_ADD_VALUE:
        return basicSetPrimAddValue(null, msgs);
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
      case SdmdslPackage.PRIMARY__PRIM_VALUE:
        return getPrimValue();
      case SdmdslPackage.PRIMARY__PRIM_ADD_VALUE:
        return getPrimAddValue();
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
      case SdmdslPackage.PRIMARY__PRIM_VALUE:
        setPrimValue((EObject)newValue);
        return;
      case SdmdslPackage.PRIMARY__PRIM_ADD_VALUE:
        setPrimAddValue((Addition)newValue);
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
      case SdmdslPackage.PRIMARY__PRIM_VALUE:
        setPrimValue((EObject)null);
        return;
      case SdmdslPackage.PRIMARY__PRIM_ADD_VALUE:
        setPrimAddValue((Addition)null);
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
      case SdmdslPackage.PRIMARY__PRIM_VALUE:
        return primValue != null;
      case SdmdslPackage.PRIMARY__PRIM_ADD_VALUE:
        return primAddValue != null;
    }
    return super.eIsSet(featureID);
  }

} //PrimaryImpl