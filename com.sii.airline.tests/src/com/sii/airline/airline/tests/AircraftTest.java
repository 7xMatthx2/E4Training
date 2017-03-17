/**
 */
package com.sii.airline.airline.tests;

import com.sii.airline.airline.Aircraft;
import com.sii.airline.airline.AirlineFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Aircraft</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AircraftTest extends TestCase {

	/**
	 * The fixture for this Aircraft test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Aircraft fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AircraftTest.class);
	}

	/**
	 * Constructs a new Aircraft test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AircraftTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Aircraft test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Aircraft fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Aircraft test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Aircraft getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AirlineFactory.eINSTANCE.createAircraft());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AircraftTest
