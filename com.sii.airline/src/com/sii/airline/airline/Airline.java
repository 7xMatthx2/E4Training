/**
 */
package com.sii.airline.airline;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Airline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sii.airline.airline.Airline#getAircrafts <em>Aircrafts</em>}</li>
 *   <li>{@link com.sii.airline.airline.Airline#getEmployees <em>Employees</em>}</li>
 *   <li>{@link com.sii.airline.airline.Airline#getName <em>Name</em>}</li>
 *   <li>{@link com.sii.airline.airline.Airline#getFlights <em>Flights</em>}</li>
 * </ul>
 *
 * @see com.sii.airline.airline.AirlinePackage#getAirline()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='checkName'"
 * @generated
 */
public interface Airline extends EObject {
	/**
	 * Returns the value of the '<em><b>Aircrafts</b></em>' containment reference list.
	 * The list contents are of type {@link com.sii.airline.airline.Aircraft}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aircrafts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aircrafts</em>' containment reference list.
	 * @see com.sii.airline.airline.AirlinePackage#getAirline_Aircrafts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Aircraft> getAircrafts();

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' containment reference list.
	 * The list contents are of type {@link com.sii.airline.airline.Employee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employees</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' containment reference list.
	 * @see com.sii.airline.airline.AirlinePackage#getAirline_Employees()
	 * @model containment="true"
	 * @generated
	 */
	EList<Employee> getEmployees();

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
	 * @see com.sii.airline.airline.AirlinePackage#getAirline_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.sii.airline.airline.Airline#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Flights</b></em>' containment reference list.
	 * The list contents are of type {@link com.sii.airline.airline.Flight}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flights</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flights</em>' containment reference list.
	 * @see com.sii.airline.airline.AirlinePackage#getAirline_Flights()
	 * @model containment="true"
	 * @generated
	 */
	EList<Flight> getFlights();

} // Airline
