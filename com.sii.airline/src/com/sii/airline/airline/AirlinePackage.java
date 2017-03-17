/**
 */
package com.sii.airline.airline;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.sii.airline.airline.AirlineFactory
 * @model kind="package"
 * @generated
 */
public interface AirlinePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "airline";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.sii.airline/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "airline";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AirlinePackage eINSTANCE = com.sii.airline.airline.impl.AirlinePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.sii.airline.airline.impl.AirlineImpl <em>Airline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.airline.airline.impl.AirlineImpl
	 * @see com.sii.airline.airline.impl.AirlinePackageImpl#getAirline()
	 * @generated
	 */
	int AIRLINE = 0;

	/**
	 * The feature id for the '<em><b>Aircrafts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRLINE__AIRCRAFTS = 0;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRLINE__EMPLOYEES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRLINE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Flights</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRLINE__FLIGHTS = 3;

	/**
	 * The number of structural features of the '<em>Airline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRLINE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Airline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRLINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.airline.airline.impl.FlightImpl <em>Flight</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.airline.airline.impl.FlightImpl
	 * @see com.sii.airline.airline.impl.AirlinePackageImpl#getFlight()
	 * @generated
	 */
	int FLIGHT = 1;

	/**
	 * The feature id for the '<em><b>Departure ICAO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__DEPARTURE_ICAO = 0;

	/**
	 * The feature id for the '<em><b>Arrival ICAO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__ARRIVAL_ICAO = 1;

	/**
	 * The feature id for the '<em><b>Departure Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__DEPARTURE_DATE = 2;

	/**
	 * The feature id for the '<em><b>Estimated Arrival Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__ESTIMATED_ARRIVAL_DATE = 3;

	/**
	 * The feature id for the '<em><b>Pilots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__PILOTS = 4;

	/**
	 * The feature id for the '<em><b>Stewards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT__STEWARDS = 5;

	/**
	 * The number of structural features of the '<em>Flight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Flight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIGHT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.airline.airline.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.airline.airline.impl.EmployeeImpl
	 * @see com.sii.airline.airline.impl.AirlinePackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__ADRESS = 1;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.sii.airline.airline.impl.StewardImpl <em>Steward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.airline.airline.impl.StewardImpl
	 * @see com.sii.airline.airline.impl.AirlinePackageImpl#getSteward()
	 * @generated
	 */
	int STEWARD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEWARD__NAME = EMPLOYEE__NAME;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEWARD__ADRESS = EMPLOYEE__ADRESS;

	/**
	 * The number of structural features of the '<em>Steward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEWARD_FEATURE_COUNT = EMPLOYEE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Steward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEWARD_OPERATION_COUNT = EMPLOYEE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.sii.airline.airline.impl.PilotImpl <em>Pilot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.airline.airline.impl.PilotImpl
	 * @see com.sii.airline.airline.impl.AirlinePackageImpl#getPilot()
	 * @generated
	 */
	int PILOT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PILOT__NAME = EMPLOYEE__NAME;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PILOT__ADRESS = EMPLOYEE__ADRESS;

	/**
	 * The number of structural features of the '<em>Pilot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PILOT_FEATURE_COUNT = EMPLOYEE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pilot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PILOT_OPERATION_COUNT = EMPLOYEE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.sii.airline.airline.impl.AircraftImpl <em>Aircraft</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sii.airline.airline.impl.AircraftImpl
	 * @see com.sii.airline.airline.impl.AirlinePackageImpl#getAircraft()
	 * @generated
	 */
	int AIRCRAFT = 4;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRCRAFT__CATEGORY = 0;

	/**
	 * The feature id for the '<em><b>Nb Places</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRCRAFT__NB_PLACES = 1;

	/**
	 * The number of structural features of the '<em>Aircraft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRCRAFT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Aircraft</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRCRAFT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.sii.airline.airline.Airline <em>Airline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Airline</em>'.
	 * @see com.sii.airline.airline.Airline
	 * @generated
	 */
	EClass getAirline();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.airline.airline.Airline#getAircrafts <em>Aircrafts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aircrafts</em>'.
	 * @see com.sii.airline.airline.Airline#getAircrafts()
	 * @see #getAirline()
	 * @generated
	 */
	EReference getAirline_Aircrafts();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.airline.airline.Airline#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employees</em>'.
	 * @see com.sii.airline.airline.Airline#getEmployees()
	 * @see #getAirline()
	 * @generated
	 */
	EReference getAirline_Employees();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.airline.airline.Airline#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sii.airline.airline.Airline#getName()
	 * @see #getAirline()
	 * @generated
	 */
	EAttribute getAirline_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.sii.airline.airline.Airline#getFlights <em>Flights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flights</em>'.
	 * @see com.sii.airline.airline.Airline#getFlights()
	 * @see #getAirline()
	 * @generated
	 */
	EReference getAirline_Flights();

	/**
	 * Returns the meta object for class '{@link com.sii.airline.airline.Flight <em>Flight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flight</em>'.
	 * @see com.sii.airline.airline.Flight
	 * @generated
	 */
	EClass getFlight();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.airline.airline.Flight#getDepartureICAO <em>Departure ICAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Departure ICAO</em>'.
	 * @see com.sii.airline.airline.Flight#getDepartureICAO()
	 * @see #getFlight()
	 * @generated
	 */
	EAttribute getFlight_DepartureICAO();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.airline.airline.Flight#getArrivalICAO <em>Arrival ICAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrival ICAO</em>'.
	 * @see com.sii.airline.airline.Flight#getArrivalICAO()
	 * @see #getFlight()
	 * @generated
	 */
	EAttribute getFlight_ArrivalICAO();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.airline.airline.Flight#getDepartureDate <em>Departure Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Departure Date</em>'.
	 * @see com.sii.airline.airline.Flight#getDepartureDate()
	 * @see #getFlight()
	 * @generated
	 */
	EAttribute getFlight_DepartureDate();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.airline.airline.Flight#getEstimatedArrivalDate <em>Estimated Arrival Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Arrival Date</em>'.
	 * @see com.sii.airline.airline.Flight#getEstimatedArrivalDate()
	 * @see #getFlight()
	 * @generated
	 */
	EAttribute getFlight_EstimatedArrivalDate();

	/**
	 * Returns the meta object for the reference list '{@link com.sii.airline.airline.Flight#getPilots <em>Pilots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pilots</em>'.
	 * @see com.sii.airline.airline.Flight#getPilots()
	 * @see #getFlight()
	 * @generated
	 */
	EReference getFlight_Pilots();

	/**
	 * Returns the meta object for the reference list '{@link com.sii.airline.airline.Flight#getStewards <em>Stewards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stewards</em>'.
	 * @see com.sii.airline.airline.Flight#getStewards()
	 * @see #getFlight()
	 * @generated
	 */
	EReference getFlight_Stewards();

	/**
	 * Returns the meta object for class '{@link com.sii.airline.airline.Steward <em>Steward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Steward</em>'.
	 * @see com.sii.airline.airline.Steward
	 * @generated
	 */
	EClass getSteward();

	/**
	 * Returns the meta object for class '{@link com.sii.airline.airline.Pilot <em>Pilot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pilot</em>'.
	 * @see com.sii.airline.airline.Pilot
	 * @generated
	 */
	EClass getPilot();

	/**
	 * Returns the meta object for class '{@link com.sii.airline.airline.Aircraft <em>Aircraft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aircraft</em>'.
	 * @see com.sii.airline.airline.Aircraft
	 * @generated
	 */
	EClass getAircraft();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.airline.airline.Aircraft#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see com.sii.airline.airline.Aircraft#getCategory()
	 * @see #getAircraft()
	 * @generated
	 */
	EAttribute getAircraft_Category();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.airline.airline.Aircraft#getNbPlaces <em>Nb Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Places</em>'.
	 * @see com.sii.airline.airline.Aircraft#getNbPlaces()
	 * @see #getAircraft()
	 * @generated
	 */
	EAttribute getAircraft_NbPlaces();

	/**
	 * Returns the meta object for class '{@link com.sii.airline.airline.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see com.sii.airline.airline.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.airline.airline.Employee#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.sii.airline.airline.Employee#getName()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.sii.airline.airline.Employee#getAdress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adress</em>'.
	 * @see com.sii.airline.airline.Employee#getAdress()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Adress();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AirlineFactory getAirlineFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.sii.airline.airline.impl.AirlineImpl <em>Airline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.airline.airline.impl.AirlineImpl
		 * @see com.sii.airline.airline.impl.AirlinePackageImpl#getAirline()
		 * @generated
		 */
		EClass AIRLINE = eINSTANCE.getAirline();

		/**
		 * The meta object literal for the '<em><b>Aircrafts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AIRLINE__AIRCRAFTS = eINSTANCE.getAirline_Aircrafts();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AIRLINE__EMPLOYEES = eINSTANCE.getAirline_Employees();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIRLINE__NAME = eINSTANCE.getAirline_Name();

		/**
		 * The meta object literal for the '<em><b>Flights</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AIRLINE__FLIGHTS = eINSTANCE.getAirline_Flights();

		/**
		 * The meta object literal for the '{@link com.sii.airline.airline.impl.FlightImpl <em>Flight</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.airline.airline.impl.FlightImpl
		 * @see com.sii.airline.airline.impl.AirlinePackageImpl#getFlight()
		 * @generated
		 */
		EClass FLIGHT = eINSTANCE.getFlight();

		/**
		 * The meta object literal for the '<em><b>Departure ICAO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT__DEPARTURE_ICAO = eINSTANCE.getFlight_DepartureICAO();

		/**
		 * The meta object literal for the '<em><b>Arrival ICAO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT__ARRIVAL_ICAO = eINSTANCE.getFlight_ArrivalICAO();

		/**
		 * The meta object literal for the '<em><b>Departure Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT__DEPARTURE_DATE = eINSTANCE.getFlight_DepartureDate();

		/**
		 * The meta object literal for the '<em><b>Estimated Arrival Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLIGHT__ESTIMATED_ARRIVAL_DATE = eINSTANCE.getFlight_EstimatedArrivalDate();

		/**
		 * The meta object literal for the '<em><b>Pilots</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT__PILOTS = eINSTANCE.getFlight_Pilots();

		/**
		 * The meta object literal for the '<em><b>Stewards</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIGHT__STEWARDS = eINSTANCE.getFlight_Stewards();

		/**
		 * The meta object literal for the '{@link com.sii.airline.airline.impl.StewardImpl <em>Steward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.airline.airline.impl.StewardImpl
		 * @see com.sii.airline.airline.impl.AirlinePackageImpl#getSteward()
		 * @generated
		 */
		EClass STEWARD = eINSTANCE.getSteward();

		/**
		 * The meta object literal for the '{@link com.sii.airline.airline.impl.PilotImpl <em>Pilot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.airline.airline.impl.PilotImpl
		 * @see com.sii.airline.airline.impl.AirlinePackageImpl#getPilot()
		 * @generated
		 */
		EClass PILOT = eINSTANCE.getPilot();

		/**
		 * The meta object literal for the '{@link com.sii.airline.airline.impl.AircraftImpl <em>Aircraft</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.airline.airline.impl.AircraftImpl
		 * @see com.sii.airline.airline.impl.AirlinePackageImpl#getAircraft()
		 * @generated
		 */
		EClass AIRCRAFT = eINSTANCE.getAircraft();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIRCRAFT__CATEGORY = eINSTANCE.getAircraft_Category();

		/**
		 * The meta object literal for the '<em><b>Nb Places</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIRCRAFT__NB_PLACES = eINSTANCE.getAircraft_NbPlaces();

		/**
		 * The meta object literal for the '{@link com.sii.airline.airline.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sii.airline.airline.impl.EmployeeImpl
		 * @see com.sii.airline.airline.impl.AirlinePackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__NAME = eINSTANCE.getEmployee_Name();

		/**
		 * The meta object literal for the '<em><b>Adress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__ADRESS = eINSTANCE.getEmployee_Adress();

	}

} //AirlinePackage
