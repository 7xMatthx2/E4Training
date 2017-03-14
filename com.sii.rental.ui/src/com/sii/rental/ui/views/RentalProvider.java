package com.sii.rental.ui.views;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;

public class RentalProvider extends LabelProvider implements ITreeContentProvider{

	@Override
	public Object[] getElements(Object inputElement) {
		Object[] result = null;
		
		if(inputElement instanceof List<?>)
		{
			result = ((List<?>) inputElement).toArray();
		}
		
		return (result == null) ? new Object[0] : result;
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		Object[] result = null;
		
		if(parentElement instanceof RentalAgency)
		{
			result = ((RentalAgency) parentElement).getCustomers().toArray();
		}
		else if(parentElement instanceof Customer)
		{
			Customer customer = (Customer) parentElement;
			result = getRentedObjects(customer).toArray();
		}
		
		return (result == null) ? new Object[0] : result;
	}

	@Override
	public Object getParent(Object element) {
		if(element instanceof Customer)
		{
			return ((Customer)element).getParentAgency();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if(element instanceof RentalAgency)
		{
			return (((RentalAgency)element).getCustomers().size() > 0);
		}
		else if(element instanceof Customer)
		{
			Customer customer = (Customer) element;
			return getRentedObjects(customer).size() > 0;
		}
		return false;
	}
	
	@Override
	public String getText(Object element) {
		if(element instanceof RentalAgency)
		{
			return ((RentalAgency) element).getName();
		}
		else if(element instanceof Customer)
		{
			return ((Customer)element).getDisplayName();
		}
		return super.getText(element);
	}
	
	private List<Rental> getRentedObjects(Customer customer)
	{
		List<Rental> rentals = customer.getParentAgency().getRentals().stream()
				.filter(rental -> rental.getCustomer().equals(customer))
				.collect(Collectors.toList());
		
		return rentals;
	}
}
