/**
 */
package com.sii.airline.airline.impl;

import com.sii.airline.airline.Aircraft;
import com.sii.airline.airline.Airline;
import com.sii.airline.airline.AirlinePackage;
import com.sii.airline.airline.Employee;
import com.sii.airline.airline.Flight;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Airline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sii.airline.airline.impl.AirlineImpl#getAircrafts <em>Aircrafts</em>}</li>
 *   <li>{@link com.sii.airline.airline.impl.AirlineImpl#getEmployees <em>Employees</em>}</li>
 *   <li>{@link com.sii.airline.airline.impl.AirlineImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.sii.airline.airline.impl.AirlineImpl#getFlights <em>Flights</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AirlineImpl extends MinimalEObjectImpl.Container implements Airline {
	/**
	 * The cached value of the '{@link #getAircrafts() <em>Aircrafts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAircrafts()
	 * @generated
	 * @ordered
	 */
	protected EList<Aircraft> aircrafts;

	/**
	 * The cached value of the '{@link #getEmployees() <em>Employees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployees()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> employees;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFlights() <em>Flights</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlights()
	 * @generated
	 * @ordered
	 */
	protected EList<Flight> flights;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AirlineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AirlinePackage.Literals.AIRLINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Aircraft> getAircrafts() {
		if (aircrafts == null) {
			aircrafts = new EObjectContainmentEList<Aircraft>(Aircraft.class, this, AirlinePackage.AIRLINE__AIRCRAFTS);
		}
		return aircrafts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getEmployees() {
		if (employees == null) {
			employees = new EObjectContainmentEList<Employee>(Employee.class, this, AirlinePackage.AIRLINE__EMPLOYEES);
		}
		return employees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirlinePackage.AIRLINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flight> getFlights() {
		if (flights == null) {
			flights = new EObjectContainmentEList<Flight>(Flight.class, this, AirlinePackage.AIRLINE__FLIGHTS);
		}
		return flights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AirlinePackage.AIRLINE__AIRCRAFTS:
				return ((InternalEList<?>)getAircrafts()).basicRemove(otherEnd, msgs);
			case AirlinePackage.AIRLINE__EMPLOYEES:
				return ((InternalEList<?>)getEmployees()).basicRemove(otherEnd, msgs);
			case AirlinePackage.AIRLINE__FLIGHTS:
				return ((InternalEList<?>)getFlights()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AirlinePackage.AIRLINE__AIRCRAFTS:
				return getAircrafts();
			case AirlinePackage.AIRLINE__EMPLOYEES:
				return getEmployees();
			case AirlinePackage.AIRLINE__NAME:
				return getName();
			case AirlinePackage.AIRLINE__FLIGHTS:
				return getFlights();
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
			case AirlinePackage.AIRLINE__AIRCRAFTS:
				getAircrafts().clear();
				getAircrafts().addAll((Collection<? extends Aircraft>)newValue);
				return;
			case AirlinePackage.AIRLINE__EMPLOYEES:
				getEmployees().clear();
				getEmployees().addAll((Collection<? extends Employee>)newValue);
				return;
			case AirlinePackage.AIRLINE__NAME:
				setName((String)newValue);
				return;
			case AirlinePackage.AIRLINE__FLIGHTS:
				getFlights().clear();
				getFlights().addAll((Collection<? extends Flight>)newValue);
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
			case AirlinePackage.AIRLINE__AIRCRAFTS:
				getAircrafts().clear();
				return;
			case AirlinePackage.AIRLINE__EMPLOYEES:
				getEmployees().clear();
				return;
			case AirlinePackage.AIRLINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AirlinePackage.AIRLINE__FLIGHTS:
				getFlights().clear();
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
			case AirlinePackage.AIRLINE__AIRCRAFTS:
				return aircrafts != null && !aircrafts.isEmpty();
			case AirlinePackage.AIRLINE__EMPLOYEES:
				return employees != null && !employees.isEmpty();
			case AirlinePackage.AIRLINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AirlinePackage.AIRLINE__FLIGHTS:
				return flights != null && !flights.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AirlineImpl
