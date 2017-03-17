/**
 */
package com.sii.airline.airline.impl;

import com.sii.airline.airline.AirlinePackage;
import com.sii.airline.airline.Flight;
import com.sii.airline.airline.Pilot;
import com.sii.airline.airline.Steward;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sii.airline.airline.impl.FlightImpl#getDepartureICAO <em>Departure ICAO</em>}</li>
 *   <li>{@link com.sii.airline.airline.impl.FlightImpl#getArrivalICAO <em>Arrival ICAO</em>}</li>
 *   <li>{@link com.sii.airline.airline.impl.FlightImpl#getDepartureDate <em>Departure Date</em>}</li>
 *   <li>{@link com.sii.airline.airline.impl.FlightImpl#getEstimatedArrivalDate <em>Estimated Arrival Date</em>}</li>
 *   <li>{@link com.sii.airline.airline.impl.FlightImpl#getPilots <em>Pilots</em>}</li>
 *   <li>{@link com.sii.airline.airline.impl.FlightImpl#getStewards <em>Stewards</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightImpl extends MinimalEObjectImpl.Container implements Flight {
	/**
	 * The default value of the '{@link #getDepartureICAO() <em>Departure ICAO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureICAO()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPARTURE_ICAO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepartureICAO() <em>Departure ICAO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureICAO()
	 * @generated
	 * @ordered
	 */
	protected String departureICAO = DEPARTURE_ICAO_EDEFAULT;

	/**
	 * The default value of the '{@link #getArrivalICAO() <em>Arrival ICAO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalICAO()
	 * @generated
	 * @ordered
	 */
	protected static final String ARRIVAL_ICAO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArrivalICAO() <em>Arrival ICAO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalICAO()
	 * @generated
	 * @ordered
	 */
	protected String arrivalICAO = ARRIVAL_ICAO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepartureDate() <em>Departure Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DEPARTURE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepartureDate() <em>Departure Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureDate()
	 * @generated
	 * @ordered
	 */
	protected Date departureDate = DEPARTURE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedArrivalDate() <em>Estimated Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedArrivalDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ESTIMATED_ARRIVAL_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedArrivalDate() <em>Estimated Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedArrivalDate()
	 * @generated
	 * @ordered
	 */
	protected Date estimatedArrivalDate = ESTIMATED_ARRIVAL_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPilots() <em>Pilots</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPilots()
	 * @generated
	 * @ordered
	 */
	protected EList<Pilot> pilots;

	/**
	 * The cached value of the '{@link #getStewards() <em>Stewards</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStewards()
	 * @generated
	 * @ordered
	 */
	protected EList<Steward> stewards;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AirlinePackage.Literals.FLIGHT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDepartureICAO() {
		return departureICAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepartureICAO(String newDepartureICAO) {
		String oldDepartureICAO = departureICAO;
		departureICAO = newDepartureICAO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirlinePackage.FLIGHT__DEPARTURE_ICAO, oldDepartureICAO, departureICAO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArrivalICAO() {
		return arrivalICAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrivalICAO(String newArrivalICAO) {
		String oldArrivalICAO = arrivalICAO;
		arrivalICAO = newArrivalICAO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirlinePackage.FLIGHT__ARRIVAL_ICAO, oldArrivalICAO, arrivalICAO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDepartureDate() {
		return departureDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepartureDate(Date newDepartureDate) {
		Date oldDepartureDate = departureDate;
		departureDate = newDepartureDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirlinePackage.FLIGHT__DEPARTURE_DATE, oldDepartureDate, departureDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEstimatedArrivalDate() {
		return estimatedArrivalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimatedArrivalDate(Date newEstimatedArrivalDate) {
		Date oldEstimatedArrivalDate = estimatedArrivalDate;
		estimatedArrivalDate = newEstimatedArrivalDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirlinePackage.FLIGHT__ESTIMATED_ARRIVAL_DATE, oldEstimatedArrivalDate, estimatedArrivalDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pilot> getPilots() {
		if (pilots == null) {
			pilots = new EObjectResolvingEList<Pilot>(Pilot.class, this, AirlinePackage.FLIGHT__PILOTS);
		}
		return pilots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Steward> getStewards() {
		if (stewards == null) {
			stewards = new EObjectResolvingEList<Steward>(Steward.class, this, AirlinePackage.FLIGHT__STEWARDS);
		}
		return stewards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AirlinePackage.FLIGHT__DEPARTURE_ICAO:
				return getDepartureICAO();
			case AirlinePackage.FLIGHT__ARRIVAL_ICAO:
				return getArrivalICAO();
			case AirlinePackage.FLIGHT__DEPARTURE_DATE:
				return getDepartureDate();
			case AirlinePackage.FLIGHT__ESTIMATED_ARRIVAL_DATE:
				return getEstimatedArrivalDate();
			case AirlinePackage.FLIGHT__PILOTS:
				return getPilots();
			case AirlinePackage.FLIGHT__STEWARDS:
				return getStewards();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AirlinePackage.FLIGHT__DEPARTURE_ICAO:
				setDepartureICAO((String)newValue);
				return;
			case AirlinePackage.FLIGHT__ARRIVAL_ICAO:
				setArrivalICAO((String)newValue);
				return;
			case AirlinePackage.FLIGHT__DEPARTURE_DATE:
				setDepartureDate((Date)newValue);
				return;
			case AirlinePackage.FLIGHT__ESTIMATED_ARRIVAL_DATE:
				setEstimatedArrivalDate((Date)newValue);
				return;
			case AirlinePackage.FLIGHT__PILOTS:
				getPilots().clear();
				getPilots().addAll((Collection<? extends Pilot>)newValue);
				return;
			case AirlinePackage.FLIGHT__STEWARDS:
				getStewards().clear();
				getStewards().addAll((Collection<? extends Steward>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AirlinePackage.FLIGHT__DEPARTURE_ICAO:
				setDepartureICAO(DEPARTURE_ICAO_EDEFAULT);
				return;
			case AirlinePackage.FLIGHT__ARRIVAL_ICAO:
				setArrivalICAO(ARRIVAL_ICAO_EDEFAULT);
				return;
			case AirlinePackage.FLIGHT__DEPARTURE_DATE:
				setDepartureDate(DEPARTURE_DATE_EDEFAULT);
				return;
			case AirlinePackage.FLIGHT__ESTIMATED_ARRIVAL_DATE:
				setEstimatedArrivalDate(ESTIMATED_ARRIVAL_DATE_EDEFAULT);
				return;
			case AirlinePackage.FLIGHT__PILOTS:
				getPilots().clear();
				return;
			case AirlinePackage.FLIGHT__STEWARDS:
				getStewards().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AirlinePackage.FLIGHT__DEPARTURE_ICAO:
				return DEPARTURE_ICAO_EDEFAULT == null ? departureICAO != null : !DEPARTURE_ICAO_EDEFAULT.equals(departureICAO);
			case AirlinePackage.FLIGHT__ARRIVAL_ICAO:
				return ARRIVAL_ICAO_EDEFAULT == null ? arrivalICAO != null : !ARRIVAL_ICAO_EDEFAULT.equals(arrivalICAO);
			case AirlinePackage.FLIGHT__DEPARTURE_DATE:
				return DEPARTURE_DATE_EDEFAULT == null ? departureDate != null : !DEPARTURE_DATE_EDEFAULT.equals(departureDate);
			case AirlinePackage.FLIGHT__ESTIMATED_ARRIVAL_DATE:
				return ESTIMATED_ARRIVAL_DATE_EDEFAULT == null ? estimatedArrivalDate != null : !ESTIMATED_ARRIVAL_DATE_EDEFAULT.equals(estimatedArrivalDate);
			case AirlinePackage.FLIGHT__PILOTS:
				return pilots != null && !pilots.isEmpty();
			case AirlinePackage.FLIGHT__STEWARDS:
				return stewards != null && !stewards.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (departureICAO: ");
		result.append(departureICAO);
		result.append(", arrivalICAO: ");
		result.append(arrivalICAO);
		result.append(", departureDate: ");
		result.append(departureDate);
		result.append(", estimatedArrivalDate: ");
		result.append(estimatedArrivalDate);
		result.append(')');
		return result.toString();
	}

} //FlightImpl
