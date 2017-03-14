
package com.sii.rental.ui.views;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

import com.opcoach.training.rental.RentalAgency;

public class AgencyPart {

	@PostConstruct
	public void initUI(IEclipseContext context, Composite parent, RentalAgency agency) {
		List<RentalAgency> agencies = new ArrayList<RentalAgency>();
		agencies.add(agency);
		TreeViewer tv = new TreeViewer(parent);
		RentalProvider rp = ContextInjectionFactory.make(RentalProvider.class, context);
		tv.setContentProvider(rp);
		tv.setLabelProvider(rp);
		tv.setInput(agencies);
	}

	@Focus
	public void onFocus() {
		
	}

}