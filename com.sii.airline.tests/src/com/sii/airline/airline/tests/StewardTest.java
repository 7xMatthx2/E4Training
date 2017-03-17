/**
 */
package com.sii.airline.airline.tests;

import com.sii.airline.airline.AirlineFactory;
import com.sii.airline.airline.Steward;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Steward</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StewardTest extends EmployeeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StewardTest.class);
	}

	/**
	 * Constructs a new Steward test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StewardTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Steward test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Steward getFixture() {
		return (Steward)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AirlineFactory.eINSTANCE.createSteward());
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

} //StewardTest
