/**
 */
package com.sii.airline.airline.tests;

import com.sii.airline.airline.AirlineFactory;
import com.sii.airline.airline.Pilot;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pilot</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PilotTest extends EmployeeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PilotTest.class);
	}

	/**
	 * Constructs a new Pilot test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PilotTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pilot test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Pilot getFixture() {
		return (Pilot)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AirlineFactory.eINSTANCE.createPilot());
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

} //PilotTest
