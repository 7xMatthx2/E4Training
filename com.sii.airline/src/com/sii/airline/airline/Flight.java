/**
 */
package com.sii.airline.airline;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sii.airline.airline.Flight#getDepartureICAO <em>Departure ICAO</em>}</li>
 *   <li>{@link com.sii.airline.airline.Flight#getArrivalICAO <em>Arrival ICAO</em>}</li>
 *   <li>{@link com.sii.airline.airline.Flight#getDepartureDate <em>Departure Date</em>}</li>
 *   <li>{@link com.sii.airline.airline.Flight#getEstimatedArrivalDate <em>Estimated Arrival Date</em>}</li>
 *   <li>{@link com.sii.airline.airline.Flight#getPilots <em>Pilots</em>}</li>
 *   <li>{@link com.sii.airline.airline.Flight#getStewards <em>Stewards</em>}</li>
 * </ul>
 *
 * @see com.sii.airline.airline.AirlinePackage#getFlight()
 * @model
 * @generated
 */
public interface Flight extends EObject {
	/**
	 * Returns the value of the '<em><b>Departure ICAO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Departure ICAO</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departure ICAO</em>' attribute.
	 * @see #setDepartureICAO(String)
	 * @see com.sii.airline.airline.AirlinePackage#getFlight_DepartureICAO()
	 * @model
	 * @generated
	 */
	String getDepartureICAO();

	/**
	 * Sets the value of the '{@link com.sii.airline.airline.Flight#getDepartureICAO <em>Departure ICAO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departure ICAO</em>' attribute.
	 * @see #getDepartureICAO()
	 * @generated
	 */
	void setDepartureICAO(String value);

	/**
	 * Returns the value of the '<em><b>Arrival ICAO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrival ICAO</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival ICAO</em>' attribute.
	 * @see #setArrivalICAO(String)
	 * @see com.sii.airline.airline.AirlinePackage#getFlight_ArrivalICAO()
	 * @model
	 * @generated
	 */
	String getArrivalICAO();

	/**
	 * Sets the value of the '{@link com.sii.airline.airline.Flight#getArrivalICAO <em>Arrival ICAO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival ICAO</em>' attribute.
	 * @see #getArrivalICAO()
	 * @generated
	 */
	void setArrivalICAO(String value);

	/**
	 * Returns the value of the '<em><b>Departure Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Departure Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departure Date</em>' attribute.
	 * @see #setDepartureDate(Date)
	 * @see com.sii.airline.airline.AirlinePackage#getFlight_DepartureDate()
	 * @model
	 * @generated
	 */
	Date getDepartureDate();

	/**
	 * Sets the value of the '{@link com.sii.airline.airline.Flight#getDepartureDate <em>Departure Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departure Date</em>' attribute.
	 * @see #getDepartureDate()
	 * @generated
	 */
	void setDepartureDate(Date value);

	/**
	 * Returns the value of the '<em><b>Estimated Arrival Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Arrival Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Arrival Date</em>' attribute.
	 * @see #setEstimatedArrivalDate(Date)
	 * @see com.sii.airline.airline.AirlinePackage#getFlight_EstimatedArrivalDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedArrivalDate();

	/**
	 * Sets the value of the '{@link com.sii.airline.airline.Flight#getEstimatedArrivalDate <em>Estimated Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Arrival Date</em>' attribute.
	 * @see #getEstimatedArrivalDate()
	 * @generated
	 */
	void setEstimatedArrivalDate(Date value);

	/**
	 * Returns the value of the '<em><b>Pilots</b></em>' reference list.
	 * The list contents are of type {@link com.sii.airline.airline.Pilot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pilots</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pilots</em>' reference list.
	 * @see com.sii.airline.airline.AirlinePackage#getFlight_Pilots()
	 * @model lower="2"
	 * @generated
	 */
	EList<Pilot> getPilots();

	/**
	 * Returns the value of the '<em><b>Stewards</b></em>' reference list.
	 * The list contents are of type {@link com.sii.airline.airline.Steward}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stewards</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stewards</em>' reference list.
	 * @see com.sii.airline.airline.AirlinePackage#getFlight_Stewards()
	 * @model
	 * @generated
	 */
	EList<Steward> getStewards();

} // Flight
