package com.sii.rental.ui.views;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

import com.opcoach.e4.preferences.ScopedPreferenceStore;
import com.opcoach.training.rental.Customer;
import com.opcoach.training.rental.Rental;
import com.opcoach.training.rental.RentalAgency;
import com.opcoach.training.rental.RentalObject;
import com.sii.rental.ui.RentalUIConstants;
import com.sii.rental.ui.palette.Palette;

public class RentalProvider extends LabelProvider implements ITreeContentProvider, IColorProvider, RentalUIConstants{

	@Inject @Named(RENTAL_UI_IMG_REGISTRY)
	private ImageRegistry registry;
	
	private final IPreferenceStore preferenceStore;
	
	private IColorProvider currentColorProvider;	
	
	public RentalProvider() {
		this.preferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE, "com.sii.rental.ui");
	}
	
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

		private RentalProvider getOuterType() {
			return RentalProvider.this;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + ((a == null) ? 0 : a.hashCode());
			result = prime * result + ((title == null) ? 0 : title.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (a == null) {
				if (other.a != null)
					return false;
			} else if (!a.equals(other.a))
				return false;
			if (title == null) {
				if (other.title != null)
					return false;
			} else if (!title.equals(other.title))
				return false;
			return true;
		}
	}

	@Override
	public Color getForeground(Object element) {
		return currentColorProvider.getForeground(element);
	}
	
	@Override
	public Color getBackground(Object element) {
		return currentColorProvider.getBackground(element);
	}
	
	@Override
	public Image getImage(Object element) {
		if(element instanceof Customer)
		{
			return registry.get(IMG_CUSTOMER);
		}
		else if(element instanceof RentalAgency)
		{
			return registry.get(IMG_AGENCY);
		}
		else if(element instanceof Rental)
		{
			return registry.get(IMG_RENTAL);
		}
		else if(element instanceof RentalObject)
		{
			return registry.get(IMG_RENTAL_OBJECT);
		}
		
		return null;
	}
	
	@Inject
	public void updateValues(@Preference(value=PREF_PALETTE) String paletteId, @Named(PALETTE_MANAGER) Map<String, Palette> paletteManager)
	{
		Palette currentPalette = paletteManager.get(paletteId);
		currentColorProvider = currentPalette.getProvider();		
	}
}
