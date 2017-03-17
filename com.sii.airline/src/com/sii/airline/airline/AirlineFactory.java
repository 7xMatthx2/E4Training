/**
 */
package com.sii.airline.airline;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.sii.airline.airline.AirlinePackage
 * @generated
 */
public interface AirlineFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AirlineFactory eINSTANCE = com.sii.airline.airline.impl.AirlineFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Airline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Airline</em>'.
	 * @generated
	 */
	Airline createAirline();

	/**
	 * Returns a new object of class '<em>Flight</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flight</em>'.
	 * @generated
	 */
	Flight createFlight();

	/**
	 * Returns a new object of class '<em>Steward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Steward</em>'.
	 * @generated
	 */
	Steward createSteward();

	/**
	 * Returns a new object of class '<em>Pilot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pilot</em>'.
	 * @generated
	 */
	Pilot createPilot();

	/**
	 * Returns a new object of class '<em>Aircraft</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aircraft</em>'.
	 * @generated
	 */
	Aircraft createAircraft();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AirlinePackage getAirlinePackage();

} //AirlineFactory
