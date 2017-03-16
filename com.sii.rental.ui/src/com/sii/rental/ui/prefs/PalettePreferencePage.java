package com.sii.rental.ui.prefs;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;

import com.sii.rental.ui.RentalUIConstants;
import com.sii.rental.ui.palette.Palette;

public class PalettePreferencePage extends FieldEditorPreferencePage implements RentalUIConstants {

	@Inject
	@Named(PALETTE_MANAGER) Map<String, Palette> paletteManager;
	
	public PalettePreferencePage() {
		super(GRID);
	}

	@Override
	protected void createFieldEditors() {	
		String[][] comboValues = new String[paletteManager.size()][2];
		int i = 0;
		for (Palette p : paletteManager.values())
		{
			comboValues[i][0] = p.getName(); // Displayed name
			comboValues[i][1] = p.getId(); // Returned value if selected
			i++;
		}

		addField(new ComboFieldEditor(PREF_PALETTE, "Palette :", comboValues, getFieldEditorParent()));
	}
}
