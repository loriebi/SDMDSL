/**
 * generated by Xtext 2.10.0
 */
package org.xtext.alma.container.container;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.alma.container.container.ContainerField#getPrimitiveType <em>Primitive Type</em>}</li>
 *   <li>{@link org.xtext.alma.container.container.ContainerField#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.alma.container.container.ContainerField#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.xtext.alma.container.container.ContainerField#getInitValue <em>Init Value</em>}</li>
 *   <li>{@link org.xtext.alma.container.container.ContainerField#getDoc <em>Doc</em>}</li>
 * </ul>
 *
 * @see org.xtext.alma.container.container.ContainerPackage#getContainerField()
 * @model
 * @generated
 */
public interface ContainerField extends EObject
{
  /**
   * Returns the value of the '<em><b>Primitive Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primitive Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primitive Type</em>' attribute.
   * @see #setPrimitiveType(String)
   * @see org.xtext.alma.container.container.ContainerPackage#getContainerField_PrimitiveType()
   * @model
   * @generated
   */
  String getPrimitiveType();

  /**
   * Sets the value of the '{@link org.xtext.alma.container.container.ContainerField#getPrimitiveType <em>Primitive Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primitive Type</em>' attribute.
   * @see #getPrimitiveType()
   * @generated
   */
  void setPrimitiveType(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.alma.container.container.ContainerPackage#getContainerField_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.alma.container.container.ContainerField#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Read Only</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Read Only</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Read Only</em>' attribute.
   * @see #setReadOnly(boolean)
   * @see org.xtext.alma.container.container.ContainerPackage#getContainerField_ReadOnly()
   * @model
   * @generated
   */
  boolean isReadOnly();

  /**
   * Sets the value of the '{@link org.xtext.alma.container.container.ContainerField#isReadOnly <em>Read Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Read Only</em>' attribute.
   * @see #isReadOnly()
   * @generated
   */
  void setReadOnly(boolean value);

  /**
   * Returns the value of the '<em><b>Init Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init Value</em>' attribute.
   * @see #setInitValue(String)
   * @see org.xtext.alma.container.container.ContainerPackage#getContainerField_InitValue()
   * @model
   * @generated
   */
  String getInitValue();

  /**
   * Sets the value of the '{@link org.xtext.alma.container.container.ContainerField#getInitValue <em>Init Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init Value</em>' attribute.
   * @see #getInitValue()
   * @generated
   */
  void setInitValue(String value);

  /**
   * Returns the value of the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Doc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Doc</em>' attribute.
   * @see #setDoc(String)
   * @see org.xtext.alma.container.container.ContainerPackage#getContainerField_Doc()
   * @model
   * @generated
   */
  String getDoc();

  /**
   * Sets the value of the '{@link org.xtext.alma.container.container.ContainerField#getDoc <em>Doc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Doc</em>' attribute.
   * @see #getDoc()
   * @generated
   */
  void setDoc(String value);

} // ContainerField
