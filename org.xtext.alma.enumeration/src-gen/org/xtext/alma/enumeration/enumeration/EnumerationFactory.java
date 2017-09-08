/**
 * generated by Xtext 2.9.1
 */
package org.xtext.alma.enumeration.enumeration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.alma.enumeration.enumeration.EnumerationPackage
 * @generated
 */
public interface EnumerationFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EnumerationFactory eINSTANCE = org.xtext.alma.enumeration.enumeration.impl.EnumerationFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Enum Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Type</em>'.
   * @generated
   */
  EnumType createEnumType();

  /**
   * Returns a new object of class '<em>Enum Value Without Comma</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Value Without Comma</em>'.
   * @generated
   */
  EnumValueWithoutComma createEnumValueWithoutComma();

  /**
   * Returns a new object of class '<em>Enum Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Value</em>'.
   * @generated
   */
  EnumValue createEnumValue();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EnumerationPackage getEnumerationPackage();

} //EnumerationFactory