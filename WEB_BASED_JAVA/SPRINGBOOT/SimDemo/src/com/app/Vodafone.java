package com.app;

public class Vodafone implements Sim{
	public Vodafone()
	{
		System.out.println("Vodafone Created");
	}
	@Override
	public void calling()
	{
		System.out.println("Calling with Vodafone");
	}
	@Override
	public void data() {
		
		System.out.println("Browsing with Vodafone");
	}
}

