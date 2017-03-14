package com.sii.rental.ui;

import javax.annotation.PostConstruct;

import org.eclipse.e4.core.contexts.IEclipseContext;

import com.opcoach.training.rental.RentalAgency;
import com.sii.rental.core.RentalCoreActivator;

public class RentalAddon {

	@PostConstruct
	public void initContext(IEclipseContext ctx)
	{
		ctx.set(RentalAgency.class, RentalCoreActivator.getAgency());
	}
}
