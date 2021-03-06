/**
 * generated by Xtext 2.9.1
 */
package org.xtext.alma.sdmdsl.sdmdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Addition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.alma.sdmdsl.sdmdsl.Addition#getAddValue <em>Add Value</em>}</li>
 *   <li>{@link org.xtext.alma.sdmdsl.sdmdsl.Addition#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see org.xtext.alma.sdmdsl.sdmdsl.SdmdslPackage#getAddition()
 * @model
 * @generated
 */
public interface Addition extends EObject
{
  /**
   * Returns the value of the '<em><b>Add Value</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.alma.sdmdsl.sdmdsl.Multiplication}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Add Value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Add Value</em>' containment reference list.
   * @see org.xtext.alma.sdmdsl.sdmdsl.SdmdslPackage#getAddition_AddValue()
   * @model containment="true"
   * @generated
   */
  EList<Multiplication> getAddValue();

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute list.
   * @see org.xtext.alma.sdmdsl.sdmdsl.SdmdslPackage#getAddition_Op()
   * @model unique="false"
   * @generated
   */
  EList<String> getOp();

} // Addition
