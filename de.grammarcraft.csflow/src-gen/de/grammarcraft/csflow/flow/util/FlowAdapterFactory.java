/**
 * <copyright>
 * </copyright>
 *

 */
package de.grammarcraft.csflow.flow.util;

import de.grammarcraft.csflow.flow.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.grammarcraft.csflow.flow.FlowPackage
 * @generated
 */
public class FlowAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FlowPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = FlowPackage.eINSTANCE;
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
  protected FlowSwitch<Adapter> modelSwitch =
    new FlowSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseFunctionUnit(FunctionUnit object)
      {
        return createFunctionUnitAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseFlow(Flow object)
      {
        return createFlowAdapter();
      }
      @Override
      public Adapter caseStream(Stream object)
      {
        return createStreamAdapter();
      }
      @Override
      public Adapter caseLeftPort(LeftPort object)
      {
        return createLeftPortAdapter();
      }
      @Override
      public Adapter caseGlobalInputPort(GlobalInputPort object)
      {
        return createGlobalInputPortAdapter();
      }
      @Override
      public Adapter caseUnnamedSubFlowPort(UnnamedSubFlowPort object)
      {
        return createUnnamedSubFlowPortAdapter();
      }
      @Override
      public Adapter caseRightPort(RightPort object)
      {
        return createRightPortAdapter();
      }
      @Override
      public Adapter caseGlobalOutputPort(GlobalOutputPort object)
      {
        return createGlobalOutputPortAdapter();
      }
      @Override
      public Adapter casePort(Port object)
      {
        return createPortAdapter();
      }
      @Override
      public Adapter caseNamedPort(NamedPort object)
      {
        return createNamedPortAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseEbcOperation(EbcOperation object)
      {
        return createEbcOperationAdapter();
      }
      @Override
      public Adapter caseNativeClass(NativeClass object)
      {
        return createNativeClassAdapter();
      }
      @Override
      public Adapter caseMethodOperation(MethodOperation object)
      {
        return createMethodOperationAdapter();
      }
      @Override
      public Adapter caseNativeMethod(NativeMethod object)
      {
        return createNativeMethodAdapter();
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
   * Creates a new adapter for an object of class '{@link de.grammarcraft.csflow.flow.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.grammarcraft.csflow.flow.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.grammarcraft.csflow.flow.FunctionUnit <em>Function Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.grammarcraft.csflow.flow.FunctionUnit
   * @generated
   */
  public Adapter createFunctionUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.grammarcraft.csflow.flow.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.grammarcraft.csflow.flow.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.grammarcraft.csflow.flow.Flow <em>Flow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.grammarcraft.csflow.flow.Flow
   * @generated
   */
  public Adapter createFlowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.grammarcraft.csflow.flow.Stream <em>Stream</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.grammarcraft.csflow.flow.Stream
   * @generated
   */
  public Adapter createStreamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.grammarcraft.csflow.flow.LeftPort <em>Left Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.grammarcraft.csflow.flow.LeftPort
   * @generated
   */
  public Adapter createLeftPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.grammarcraft.csflow.flow.GlobalInputPort <em>Global Input Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.grammarcraft.csflow.flow.GlobalInputPort
   * @generated
   */
  public Adapter createGlobalInputPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.grammarcraft.csflow.flow.UnnamedSubFlowPort <em>Unnamed Sub Flow Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.grammarcraft.csflow.flow.UnnamedSubFlowPort
   * @generated
   */
  public Adapter createUnnamedSubFlowPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.grammarcraft.csflow.flow.RightPort <em>Right Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.grammarcraft.csflow.flow.RightPort
   * @generated
   */
  public Adapter createRightPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.grammarcraft.csflow.flow.GlobalOutputPort <em>Global Output Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.grammarcraft.csflow.flow.GlobalOutputPort
   * @generated
   */
  public Adapter createGlobalOutputPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.grammarcraft.csflow.flow.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.grammarcraft.csflow.flow.Port
   * @generated
   */
  public Adapter createPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.grammarcraft.csflow.flow.NamedPort <em>Named Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.grammarcraft.csflow.flow.NamedPort
   * @generated
   */
  public Adapter createNamedPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.grammarcraft.csflow.flow.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.grammarcraft.csflow.flow.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.grammarcraft.csflow.flow.EbcOperation <em>Ebc Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.grammarcraft.csflow.flow.EbcOperation
   * @generated
   */
  public Adapter createEbcOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.grammarcraft.csflow.flow.NativeClass <em>Native Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.grammarcraft.csflow.flow.NativeClass
   * @generated
   */
  public Adapter createNativeClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.grammarcraft.csflow.flow.MethodOperation <em>Method Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.grammarcraft.csflow.flow.MethodOperation
   * @generated
   */
  public Adapter createMethodOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.grammarcraft.csflow.flow.NativeMethod <em>Native Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.grammarcraft.csflow.flow.NativeMethod
   * @generated
   */
  public Adapter createNativeMethodAdapter()
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

} //FlowAdapterFactory
