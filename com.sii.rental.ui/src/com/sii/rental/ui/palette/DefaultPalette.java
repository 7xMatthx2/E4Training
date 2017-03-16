package com.sii.rental.ui.palette;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.swt.graphics.Color;

import com.opcoach.e4.preferences.ScopedPreferenceStore;
import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalObject;
import com.sii.rental.ui.RentalUIConstants;

public class DefaultPalette implements IColorProvider, RentalUIConstants{

	private final IPreferenceStore preferenceStore;
	
	public DefaultPalette() {
		this.preferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE, "com.sii.rental.ui");
	}

	@Override
	public Color getForeground(Object element) {
		if(element instanceof Customer)
		{
			return getAColor(preferenceStore.getString(PREF_CUSTOMER_COLOR));
		}
		else if(element instanceof Rental)
		{
			return getAColor(preferenceStore.getString(PREF_RENTAL_COLOR));
		}
		else if(element instanceof RentalObject)
		{
			return getAColor(preferenceStore.getString(PREF_RENTAL_OBJECT_COLOR));
		}
		
		return null;
	}
	
	private Color getAColor(String rgbKey)
	{
		ColorRegistry colorRegistry = JFaceResources.getColorRegistry();
		Color col = colorRegistry.get(rgbKey);
		if(col == null)
		{
			colorRegistry.put(rgbKey, StringConverter.asRGB(rgbKey));
			col = colorRegistry.get(rgbKey);
		}
		return col;
	}

	@Override
	public Color getBackground(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

}
