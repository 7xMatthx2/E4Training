package com.sii.rental.ui.views;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;

public class RentalProvider extends LabelProvider implements ITreeContentProvider, IColorProvider{

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
			RentalAgency agency = (RentalAgency) parentElement;
			return new Node[] {new Node(Node.CUSTOMERS, agency), new Node(Node.LOCATIONS, agency), new Node(Node.RENTAL_OBJECTS, agency)};			
		}
		else if(parentElement instanceof Customer)
		{
			Customer customer = (Customer) parentElement;
			result = getRentedObjects(customer).toArray();
		}
		else if(parentElement instanceof Node)
		{
			result = ((Node) parentElement).getChildrens();
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
		else if(element instanceof Node)
		{
			return ((Node) element).getChildrens().length > 0;
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
		else if(element instanceof Node)
		{
			return element.toString();
		}
		else if(element instanceof RentalObject)
		{
			return ((RentalObject) element).getName();
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
	
	private class Node
	{
		private static final String CUSTOMERS = "Customers";
		private static final String LOCATIONS = "Locations";
		private static final String RENTAL_OBJECTS = "Objets à louer";
		
		private String title;
		private RentalAgency a;
		
		public Node(String title, RentalAgency a)
		{
			super();
			this.title = title;
			this.a = a;
		}
		
		public Object[] getChildrens()
		{
			switch(title)
			{
			case CUSTOMERS:
				return a.getCustomers().toArray();
			case LOCATIONS:
				return a.getRentals().toArray();
			case RENTAL_OBJECTS:
				return a.getObjectsToRent().toArray();
				default :
					return new Object[0];
			}
		}
		
		@Override
		public String toString() {
			return title;
		}
	}

	@Override
	public Color getForeground(Object element) {
		if(element instanceof Customer)
		{
			return Display.getCurrent().getSystemColor(SWT.COLOR_DARK_BLUE);
		}
		else if(element instanceof Rental)
		{
			return Display.getCurrent().getSystemColor(SWT.COLOR_BLUE);
		}
		else if(element instanceof RentalObject)
		{
			return Display.getCurrent().getSystemColor(SWT.COLOR_DARK_GREEN);
		}
		
		return null;
	}

	@Override
	public Color getBackground(Object element) {
		// TODO Auto-generated method stub
		return null;
	}
}
