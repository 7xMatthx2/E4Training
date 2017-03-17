/**
 */
package com.sii.airline.airline.util;

import com.sii.airline.airline.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.sii.airline.airline.AirlinePackage
 * @generated
 */
public class AirlineAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AirlinePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirlineAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AirlinePackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
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
	protected AirlineSwitch<Adapter> modelSwitch =
		new AirlineSwitch<Adapter>() {
			@Override
			public Adapter caseAirline(Airline object) {
				return createAirlineAdapter();
			}
			@Override
			public Adapter caseFlight(Flight object) {
				return createFlightAdapter();
			}
			@Override
			public Adapter caseSteward(Steward object) {
				return createStewardAdapter();
			}
			@Override
			public Adapter casePilot(Pilot object) {
				return createPilotAdapter();
			}
			@Override
			public Adapter caseAircraft(Aircraft object) {
				return createAircraftAdapter();
			}
			@Override
			public Adapter caseEmployee(Employee object) {
				return createEmployeeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.sii.airline.airline.Airline <em>Airline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sii.airline.airline.Airline
	 * @generated
	 */
	public Adapter createAirlineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sii.airline.airline.Flight <em>Flight</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sii.airline.airline.Flight
	 * @generated
	 */
	public Adapter createFlightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sii.airline.airline.Steward <em>Steward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sii.airline.airline.Steward
	 * @generated
	 */
	public Adapter createStewardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sii.airline.airline.Pilot <em>Pilot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sii.airline.airline.Pilot
	 * @generated
	 */
	public Adapter createPilotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sii.airline.airline.Aircraft <em>Aircraft</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sii.airline.airline.Aircraft
	 * @generated
	 */
	public Adapter createAircraftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sii.airline.airline.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sii.airline.airline.Employee
	 * @generated
	 */
	public Adapter createEmployeeAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AirlineAdapterFactory
