/**
 * generated by Xtext 2.9.1
 */
package org.xtext.alma.sdmdsl.sdmdsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.alma.sdmdsl.sdmdsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.alma.sdmdsl.sdmdsl.SdmdslPackage
 * @generated
 */
public class SdmdslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SdmdslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SdmdslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SdmdslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SdmdslSwitch<Adapter> modelSwitch =
    new SdmdslSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseTable(Table object)
      {
        return createTableAdapter();
      }
      @Override
      public Adapter caseField(Field object)
      {
        return createFieldAdapter();
      }
      @Override
      public Adapter caseGlobalField(GlobalField object)
      {
        return createGlobalFieldAdapter();
      }
      @Override
      public Adapter caseDimensions(Dimensions object)
      {
        return createDimensionsAdapter();
      }
      @Override
      public Adapter caseNotDefined(NotDefined object)
      {
        return createNotDefinedAdapter();
      }
      @Override
      public Adapter caseDefined(Defined object)
      {
        return createDefinedAdapter();
      }
      @Override
      public Adapter caseFieldDimensions(FieldDimensions object)
      {
        return createFieldDimensionsAdapter();
      }
      @Override
      public Adapter caseOtherTableField(OtherTableField object)
      {
        return createOtherTableFieldAdapter();
      }
      @Override
      public Adapter caseIntDimensions(IntDimensions object)
      {
        return createIntDimensionsAdapter();
      }
      @Override
      public Adapter caseAddition(Addition object)
      {
        return createAdditionAdapter();
      }
      @Override
      public Adapter caseMultiplication(Multiplication object)
      {
        return createMultiplicationAdapter();
      }
      @Override
      public Adapter casePrimary(Primary object)
      {
        return createPrimaryAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.alma.sdmdsl.sdmdsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.alma.sdmdsl.sdmdsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.alma.sdmdsl.sdmdsl.Table <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.alma.sdmdsl.sdmdsl.Table
   * @generated
   */
  public Adapter createTableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.alma.sdmdsl.sdmdsl.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.alma.sdmdsl.sdmdsl.Field
   * @generated
   */
  public Adapter createFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.alma.sdmdsl.sdmdsl.GlobalField <em>Global Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.alma.sdmdsl.sdmdsl.GlobalField
   * @generated
   */
  public Adapter createGlobalFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.alma.sdmdsl.sdmdsl.Dimensions <em>Dimensions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.alma.sdmdsl.sdmdsl.Dimensions
   * @generated
   */
  public Adapter createDimensionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.alma.sdmdsl.sdmdsl.NotDefined <em>Not Defined</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.alma.sdmdsl.sdmdsl.NotDefined
   * @generated
   */
  public Adapter createNotDefinedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.alma.sdmdsl.sdmdsl.Defined <em>Defined</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.alma.sdmdsl.sdmdsl.Defined
   * @generated
   */
  public Adapter createDefinedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.alma.sdmdsl.sdmdsl.FieldDimensions <em>Field Dimensions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.alma.sdmdsl.sdmdsl.FieldDimensions
   * @generated
   */
  public Adapter createFieldDimensionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.alma.sdmdsl.sdmdsl.OtherTableField <em>Other Table Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.alma.sdmdsl.sdmdsl.OtherTableField
   * @generated
   */
  public Adapter createOtherTableFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.alma.sdmdsl.sdmdsl.IntDimensions <em>Int Dimensions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.alma.sdmdsl.sdmdsl.IntDimensions
   * @generated
   */
  public Adapter createIntDimensionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.alma.sdmdsl.sdmdsl.Addition <em>Addition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.alma.sdmdsl.sdmdsl.Addition
   * @generated
   */
  public Adapter createAdditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.alma.sdmdsl.sdmdsl.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.alma.sdmdsl.sdmdsl.Multiplication
   * @generated
   */
  public Adapter createMultiplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.alma.sdmdsl.sdmdsl.Primary <em>Primary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.alma.sdmdsl.sdmdsl.Primary
   * @generated
   */
  public Adapter createPrimaryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SdmdslAdapterFactory
