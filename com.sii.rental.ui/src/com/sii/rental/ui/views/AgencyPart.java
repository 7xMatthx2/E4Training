
package com.sii.rental.ui.views;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

import com.opcoach.training.rental.RentalAgency;

public class AgencyPart {

	@Inject
	private ESelectionService selectionService;
	
	@PostConstruct
	public void initUI(IEclipseContext context, Composite parent, RentalAgency agency) {
		List<RentalAgency> agencies = new ArrayList<RentalAgency>();
		agencies.add(agency);
		TreeViewer tv = new TreeViewer(parent);
		RentalProvider rp = ContextInjectionFactory.make(RentalProvider.class, context);
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
	}

	@Focus
	public void onFocus() {
		
	}

}