/**
 */
package com.sii.airline.airline;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aircraft</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sii.airline.airline.Aircraft#getCategory <em>Category</em>}</li>
 *   <li>{@link com.sii.airline.airline.Aircraft#getNbPlaces <em>Nb Places</em>}</li>
 * </ul>
 *
 * @see com.sii.airline.airline.AirlinePackage#getAircraft()
 * @model
 * @generated
 */
public interface Aircraft extends EObject {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(int)
	 * @see com.sii.airline.airline.AirlinePackage#getAircraft_Category()
	 * @model
	 * @generated
	 */
	int getCategory();

	/**
	 * Sets the value of the '{@link com.sii.airline.airline.Aircraft#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(int value);

	/**
	 * Returns the value of the '<em><b>Nb Places</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Places</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Places</em>' attribute.
	 * @see #setNbPlaces(int)
	 * @see com.sii.airline.airline.AirlinePackage#getAircraft_NbPlaces()
	 * @model
	 * @generated
	 */
	int getNbPlaces();

	/**
	 * Sets the value of the '{@link com.sii.airline.airline.Aircraft#getNbPlaces <em>Nb Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Places</em>' attribute.
	 * @see #getNbPlaces()
	 * @generated
	 */
	void setNbPlaces(int value);

} // Aircraft
