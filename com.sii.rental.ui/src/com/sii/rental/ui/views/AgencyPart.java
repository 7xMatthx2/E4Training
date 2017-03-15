
package com.sii.rental.ui.views;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

import com.opcoach.training.rental.RentalAgency;
import com.sii.rental.ui.RentalUIConstants;

public class AgencyPart implements RentalUIConstants{

	@Inject
	private ESelectionService selectionService;
	
	private TreeViewer tv;
	private RentalProvider rp;
	
	@Inject
	public AgencyPart(IEclipseContext context, Composite parent, RentalAgency agency, EMenuService menuService) {
		List<RentalAgency> agencies = new ArrayList<RentalAgency>();
		agencies.add(agency);
		tv = new TreeViewer(parent);
		rp = ContextInjectionFactory.make(RentalProvider.class, context);
		tv.setContentProvider(rp);
		tv.setLabelProvider(rp);
		tv.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection sel = (IStructuredSelection) event.getSelection();
				selectionService.setSelection(sel.size() == 1 ? sel.getFirstElement() : sel.toArray());
			}
		});
		tv.setInput(agencies);
		tv.expandAll();
		menuService.registerContextMenu(tv.getControl(), "com.sii.rental.eap.popupmenu.0");
	}
	
	@Inject
	public void updateValues(@Preference(value=PREF_CUSTOMER_COLOR) String custCol, 
			@Preference(value=PREF_RENTAL_COLOR) String rentalCol,
			@Preference(value=PREF_RENTAL_OBJECT_COLOR) String rentalObjectCol)
	{
		if(!tv.getControl().isDisposed())
		{
			tv.refresh();
		}
	}

	@Focus
	public void onFocus() {
		
	}

}