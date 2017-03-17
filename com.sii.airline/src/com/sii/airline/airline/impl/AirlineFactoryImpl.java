/**
 */
package com.sii.airline.airline.impl;

import com.sii.airline.airline.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AirlineFactoryImpl extends EFactoryImpl implements AirlineFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AirlineFactory init() {
		try {
			AirlineFactory theAirlineFactory = (AirlineFactory)EPackage.Registry.INSTANCE.getEFactory(AirlinePackage.eNS_URI);
			if (theAirlineFactory != null) {
				return theAirlineFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AirlineFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirlineFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AirlinePackage.AIRLINE: return createAirline();
			case AirlinePackage.FLIGHT: return createFlight();
			case AirlinePackage.STEWARD: return createSteward();
			case AirlinePackage.PILOT: return createPilot();
			case AirlinePackage.AIRCRAFT: return createAircraft();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Airline createAirline() {
		AirlineImpl airline = new AirlineImpl();
		return airline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flight createFlight() {
		FlightImpl flight = new FlightImpl();
		return flight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Steward createSteward() {
		StewardImpl steward = new StewardImpl();
		return steward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pilot createPilot() {
		PilotImpl pilot = new PilotImpl();
		return pilot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aircraft createAircraft() {
		AircraftImpl aircraft = new AircraftImpl();
		return aircraft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AirlinePackage getAirlinePackage() {
		return (AirlinePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AirlinePackage getPackage() {
		return AirlinePackage.eINSTANCE;
	}

} //AirlineFactoryImpl
