package com.sii.rental.ui.palette;

import org.eclipse.jface.viewers.IColorProvider;

public class Palette {
	private final String id, name;
	private IColorProvider provider;
	
	public Palette(String id, String name, IColorProvider provider)
	{
		this.id = id;
		this.name = name;
		this.provider = provider;
	}
	
	public IColorProvider getProvider() {
		return provider;
	}
	
	public void setProvider(IColorProvider provider) {
		this.provider = provider;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
}
