package com.sii.rental.ui;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.swt.graphics.RGB;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

public class RentalPreferenceInitializer extends AbstractPreferenceInitializer implements RentalUIConstants {

	public RentalPreferenceInitializer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore ps = new ScopedPreferenceStore(InstanceScope.INSTANCE, "com.sii.rental.ui");
		ps.setDefault(PREF_CUSTOMER_COLOR, StringConverter.asString(new RGB(20,200,100)));
		ps.setDefault(PREF_RENTAL_COLOR, StringConverter.asString(new RGB(50,20,60)));
		ps.setDefault(PREF_RENTAL_OBJECT_COLOR, StringConverter.asString(new RGB(200,50,90)));
	}
}
