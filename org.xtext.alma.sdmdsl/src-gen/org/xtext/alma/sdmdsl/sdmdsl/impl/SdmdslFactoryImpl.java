/**
 * generated by Xtext 2.9.1
 */
package org.xtext.alma.sdmdsl.sdmdsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.alma.sdmdsl.sdmdsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SdmdslFactoryImpl extends EFactoryImpl implements SdmdslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SdmdslFactory init()
  {
    try
    {
      SdmdslFactory theSdmdslFactory = (SdmdslFactory)EPackage.Registry.INSTANCE.getEFactory(SdmdslPackage.eNS_URI);
      if (theSdmdslFactory != null)
      {
        return theSdmdslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SdmdslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SdmdslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SdmdslPackage.MODEL: return createModel();
      case SdmdslPackage.TABLE: return createTable();
      case SdmdslPackage.FIELD: return createField();
      case SdmdslPackage.GLOBAL_FIELD: return createGlobalField();
      case SdmdslPackage.DIMENSIONS: return createDimensions();
      case SdmdslPackage.NOT_DEFINED: return createNotDefined();
      case SdmdslPackage.DEFINED: return createDefined();
      case SdmdslPackage.FIELD_DIMENSIONS: return createFieldDimensions();
      case SdmdslPackage.OTHER_TABLE_FIELD: return createOtherTableField();
      case SdmdslPackage.INT_DIMENSIONS: return createIntDimensions();
      case SdmdslPackage.ADDITION: return createAddition();
      case SdmdslPackage.MULTIPLICATION: return createMultiplication();
      case SdmdslPackage.PRIMARY: return createPrimary();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Table createTable()
  {
    TableImpl table = new TableImpl();
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalField createGlobalField()
  {
    GlobalFieldImpl globalField = new GlobalFieldImpl();
    return globalField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dimensions createDimensions()
  {
    DimensionsImpl dimensions = new DimensionsImpl();
    return dimensions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotDefined createNotDefined()
  {
    NotDefinedImpl notDefined = new NotDefinedImpl();
    return notDefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Defined createDefined()
  {
    DefinedImpl defined = new DefinedImpl();
    return defined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldDimensions createFieldDimensions()
  {
    FieldDimensionsImpl fieldDimensions = new FieldDimensionsImpl();
    return fieldDimensions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OtherTableField createOtherTableField()
  {
    OtherTableFieldImpl otherTableField = new OtherTableFieldImpl();
    return otherTableField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntDimensions createIntDimensions()
  {
    IntDimensionsImpl intDimensions = new IntDimensionsImpl();
    return intDimensions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Addition createAddition()
  {
    AdditionImpl addition = new AdditionImpl();
    return addition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplication createMultiplication()
  {
    MultiplicationImpl multiplication = new MultiplicationImpl();
    return multiplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Primary createPrimary()
  {
    PrimaryImpl primary = new PrimaryImpl();
    return primary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SdmdslPackage getSdmdslPackage()
  {
    return (SdmdslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SdmdslPackage getPackage()
  {
    return SdmdslPackage.eINSTANCE;
  }

} //SdmdslFactoryImpl
