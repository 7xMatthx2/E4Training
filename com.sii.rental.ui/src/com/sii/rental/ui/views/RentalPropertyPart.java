
package com.sii.rental.ui.views;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;

public class RentalPropertyPart {

	private Label rentedObjectLabel, customerNameLabel, startDateLabel, endDateLabel;
	private Group grpDatesDeLocation;
	
	@Inject
	public RentalPropertyPart(Composite parent, RentalAgency a) {
		GridLayout gl_parent = new GridLayout(1, false);
		parent.setLayout(gl_parent);
		
		Group infoGroup = new Group(parent, SWT.NONE);
		infoGroup.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		infoGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		infoGroup.setText("Information");
		infoGroup.setLayout(new GridLayout(2,false));
		
		GridData gd = new GridData();
		gd.grabExcessHorizontalSpace = true;
		gd.horizontalSpan = 2;
		gd.horizontalAlignment = SWT.FILL;
		
		rentedObjectLabel = new Label(infoGroup, SWT.NONE);
		rentedObjectLabel.setLayoutData(gd);
		
		Label preCustomerLabel = new Label(infoGroup, SWT.NONE);
		preCustomerLabel.setText("Lou� � : ");
		
		customerNameLabel = new Label(infoGroup, SWT.NONE);
		customerNameLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		grpDatesDeLocation = new Group(parent, SWT.NONE);
		grpDatesDeLocation.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		grpDatesDeLocation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpDatesDeLocation.setText("Dates de location");
		grpDatesDeLocation.setLayout(new GridLayout(2, false));
		
		Label preStartDateLabel = new Label(grpDatesDeLocation, SWT.NONE);
		preStartDateLabel.setText("du :");
		
		startDateLabel = new Label(grpDatesDeLocation, SWT.NONE);
		startDateLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label preEndDateLabel = new Label(grpDatesDeLocation, SWT.NONE);
		preEndDateLabel.setText("au : ");
		
		endDateLabel = new Label(grpDatesDeLocation, SWT.NONE);
		endDateLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	}
	
	@Inject @Optional
	public void receiveSelection(@Named(IServiceConstants.ACTIVE_SELECTION) Rental r)
	{
		setRental(r);
	}
	
	public void setRental(Rental r)
	{
		if(r != null)
		{
			rentedObjectLabel.setText(r.getRentedObject().getName());
			customerNameLabel.setText(r.getCustomer().getDisplayName());
			startDateLabel.setText(r.getStartDate().toString());
			endDateLabel.setText(r.getEndDate().toString());
		}
	}

	@Focus
	public void onFocus() {
		
	}
}