/**
 * generated by Xtext 2.9.1
 */
package org.xtext.alma.sdmdsl.sdmdsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.alma.sdmdsl.sdmdsl.Field;
import org.xtext.alma.sdmdsl.sdmdsl.FieldDimensions;
import org.xtext.alma.sdmdsl.sdmdsl.SdmdslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Dimensions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.alma.sdmdsl.sdmdsl.impl.FieldDimensionsImpl#getDimValue <em>Dim Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldDimensionsImpl extends MinimalEObjectImpl.Container implements FieldDimensions
{
  /**
   * The cached value of the '{@link #getDimValue() <em>Dim Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDimValue()
   * @generated
   * @ordered
   */
  protected Field dimValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FieldDimensionsImpl()
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
    return SdmdslPackage.Literals.FIELD_DIMENSIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field getDimValue()
  {
    if (dimValue != null && dimValue.eIsProxy())
    {
      InternalEObject oldDimValue = (InternalEObject)dimValue;
      dimValue = (Field)eResolveProxy(oldDimValue);
      if (dimValue != oldDimValue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SdmdslPackage.FIELD_DIMENSIONS__DIM_VALUE, oldDimValue, dimValue));
      }
    }
    return dimValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field basicGetDimValue()
  {
    return dimValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDimValue(Field newDimValue)
  {
    Field oldDimValue = dimValue;
    dimValue = newDimValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SdmdslPackage.FIELD_DIMENSIONS__DIM_VALUE, oldDimValue, dimValue));
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
      case SdmdslPackage.FIELD_DIMENSIONS__DIM_VALUE:
        if (resolve) return getDimValue();
        return basicGetDimValue();
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
      case SdmdslPackage.FIELD_DIMENSIONS__DIM_VALUE:
        setDimValue((Field)newValue);
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
      case SdmdslPackage.FIELD_DIMENSIONS__DIM_VALUE:
        setDimValue((Field)null);
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
      case SdmdslPackage.FIELD_DIMENSIONS__DIM_VALUE:
        return dimValue != null;
    }
    return super.eIsSet(featureID);
  }

} //FieldDimensionsImpl
