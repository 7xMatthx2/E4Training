/**
 */
package com.sii.airline.airline.impl;

import com.sii.airline.airline.Aircraft;
import com.sii.airline.airline.AirlinePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aircraft</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sii.airline.airline.impl.AircraftImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link com.sii.airline.airline.impl.AircraftImpl#getNbPlaces <em>Nb Places</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AircraftImpl extends MinimalEObjectImpl.Container implements Aircraft {
	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final int CATEGORY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected int category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbPlaces() <em>Nb Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbPlaces()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_PLACES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbPlaces() <em>Nb Places</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbPlaces()
	 * @generated
	 * @ordered
	 */
	protected int nbPlaces = NB_PLACES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AircraftImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AirlinePackage.Literals.AIRCRAFT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(int newCategory) {
		int oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirlinePackage.AIRCRAFT__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbPlaces() {
		return nbPlaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbPlaces(int newNbPlaces) {
		int oldNbPlaces = nbPlaces;
		nbPlaces = newNbPlaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AirlinePackage.AIRCRAFT__NB_PLACES, oldNbPlaces, nbPlaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AirlinePackage.AIRCRAFT__CATEGORY:
				return getCategory();
			case AirlinePackage.AIRCRAFT__NB_PLACES:
				return getNbPlaces();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AirlinePackage.AIRCRAFT__CATEGORY:
				setCategory((Integer)newValue);
				return;
			case AirlinePackage.AIRCRAFT__NB_PLACES:
				setNbPlaces((Integer)newValue);
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
			case AirlinePackage.AIRCRAFT__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case AirlinePackage.AIRCRAFT__NB_PLACES:
				setNbPlaces(NB_PLACES_EDEFAULT);
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
			case AirlinePackage.AIRCRAFT__CATEGORY:
				return category != CATEGORY_EDEFAULT;
			case AirlinePackage.AIRCRAFT__NB_PLACES:
				return nbPlaces != NB_PLACES_EDEFAULT;
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
		result.append(" (category: ");
		result.append(category);
		result.append(", nbPlaces: ");
		result.append(nbPlaces);
		result.append(')');
		return result.toString();
	}

} //AircraftImpl
