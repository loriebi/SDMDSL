/**
 * generated by Xtext 2.10.0
 */
package org.xtext.alma.container.container;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.alma.container.container.ContainerFactory
 * @model kind="package"
 * @generated
 */
public interface ContainerPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "container";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/alma/container/Container";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "container";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ContainerPackage eINSTANCE = org.xtext.alma.container.container.impl.ContainerPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.alma.container.container.impl.ContainerImpl <em>Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alma.container.container.impl.ContainerImpl
   * @see org.xtext.alma.container.container.impl.ContainerPackageImpl#getContainer()
   * @generated
   */
  int CONTAINER = 0;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__DOC = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__NAME = 1;

  /**
   * The feature id for the '<em><b>Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__DATA = 2;

  /**
   * The number of structural features of the '<em>Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.alma.container.container.impl.ContainerFieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.alma.container.container.impl.ContainerFieldImpl
   * @see org.xtext.alma.container.container.impl.ContainerPackageImpl#getContainerField()
   * @generated
   */
  int CONTAINER_FIELD = 1;

  /**
   * The feature id for the '<em><b>Primitive Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_FIELD__PRIMITIVE_TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_FIELD__NAME = 1;

  /**
   * The feature id for the '<em><b>Read Only</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_FIELD__READ_ONLY = 2;

  /**
   * The feature id for the '<em><b>Init Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_FIELD__INIT_VALUE = 3;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_FIELD__DOC = 4;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_FIELD_FEATURE_COUNT = 5;


  /**
   * Returns the meta object for class '{@link org.xtext.alma.container.container.Container <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container</em>'.
   * @see org.xtext.alma.container.container.Container
   * @generated
   */
  EClass getContainer();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alma.container.container.Container#getDoc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Doc</em>'.
   * @see org.xtext.alma.container.container.Container#getDoc()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_Doc();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alma.container.container.Container#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.alma.container.container.Container#getName()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.alma.container.container.Container#getData <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data</em>'.
   * @see org.xtext.alma.container.container.Container#getData()
   * @see #getContainer()
   * @generated
   */
  EReference getContainer_Data();

  /**
   * Returns the meta object for class '{@link org.xtext.alma.container.container.ContainerField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see org.xtext.alma.container.container.ContainerField
   * @generated
   */
  EClass getContainerField();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alma.container.container.ContainerField#getPrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Primitive Type</em>'.
   * @see org.xtext.alma.container.container.ContainerField#getPrimitiveType()
   * @see #getContainerField()
   * @generated
   */
  EAttribute getContainerField_PrimitiveType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alma.container.container.ContainerField#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.alma.container.container.ContainerField#getName()
   * @see #getContainerField()
   * @generated
   */
  EAttribute getContainerField_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alma.container.container.ContainerField#isReadOnly <em>Read Only</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Read Only</em>'.
   * @see org.xtext.alma.container.container.ContainerField#isReadOnly()
   * @see #getContainerField()
   * @generated
   */
  EAttribute getContainerField_ReadOnly();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alma.container.container.ContainerField#getInitValue <em>Init Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Init Value</em>'.
   * @see org.xtext.alma.container.container.ContainerField#getInitValue()
   * @see #getContainerField()
   * @generated
   */
  EAttribute getContainerField_InitValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.alma.container.container.ContainerField#getDoc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Doc</em>'.
   * @see org.xtext.alma.container.container.ContainerField#getDoc()
   * @see #getContainerField()
   * @generated
   */
  EAttribute getContainerField_Doc();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ContainerFactory getContainerFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.alma.container.container.impl.ContainerImpl <em>Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alma.container.container.impl.ContainerImpl
     * @see org.xtext.alma.container.container.impl.ContainerPackageImpl#getContainer()
     * @generated
     */
    EClass CONTAINER = eINSTANCE.getContainer();

    /**
     * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__DOC = eINSTANCE.getContainer_Doc();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__NAME = eINSTANCE.getContainer_Name();

    /**
     * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__DATA = eINSTANCE.getContainer_Data();

    /**
     * The meta object literal for the '{@link org.xtext.alma.container.container.impl.ContainerFieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.alma.container.container.impl.ContainerFieldImpl
     * @see org.xtext.alma.container.container.impl.ContainerPackageImpl#getContainerField()
     * @generated
     */
    EClass CONTAINER_FIELD = eINSTANCE.getContainerField();

    /**
     * The meta object literal for the '<em><b>Primitive Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER_FIELD__PRIMITIVE_TYPE = eINSTANCE.getContainerField_PrimitiveType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER_FIELD__NAME = eINSTANCE.getContainerField_Name();

    /**
     * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER_FIELD__READ_ONLY = eINSTANCE.getContainerField_ReadOnly();

    /**
     * The meta object literal for the '<em><b>Init Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER_FIELD__INIT_VALUE = eINSTANCE.getContainerField_InitValue();

    /**
     * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER_FIELD__DOC = eINSTANCE.getContainerField_Doc();

  }

} //ContainerPackage
