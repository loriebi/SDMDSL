/**
 * generated by Xtext 2.9.1
 */
package org.xtext.alma.sdmdsl.sdmdsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.alma.sdmdsl.sdmdsl.NotDefined;
import org.xtext.alma.sdmdsl.sdmdsl.SdmdslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Defined</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.alma.sdmdsl.sdmdsl.impl.NotDefinedImpl#getObj <em>Obj</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotDefinedImpl extends DimensionsImpl implements NotDefined
{
  /**
   * The default value of the '{@link #getObj() <em>Obj</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObj()
   * @generated
   * @ordered
   */
  protected static final String OBJ_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObj() <em>Obj</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObj()
   * @generated
   * @ordered
   */
  protected String obj = OBJ_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NotDefinedImpl()
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
    return SdmdslPackage.Literals.NOT_DEFINED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getObj()
  {
    return obj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObj(String newObj)
  {
    String oldObj = obj;
    obj = newObj;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SdmdslPackage.NOT_DEFINED__OBJ, oldObj, obj));
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
      case SdmdslPackage.NOT_DEFINED__OBJ:
        return getObj();
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
      case SdmdslPackage.NOT_DEFINED__OBJ:
        setObj((String)newValue);
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
      case SdmdslPackage.NOT_DEFINED__OBJ:
        setObj(OBJ_EDEFAULT);
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
      case SdmdslPackage.NOT_DEFINED__OBJ:
        return OBJ_EDEFAULT == null ? obj != null : !OBJ_EDEFAULT.equals(obj);
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
    result.append(" (obj: ");
    result.append(obj);
    result.append(')');
    return result.toString();
  }

} //NotDefinedImpl
