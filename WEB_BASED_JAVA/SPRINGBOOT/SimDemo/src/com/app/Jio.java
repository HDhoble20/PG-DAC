package com.app;

public class Jio implements Sim{
	public Jio()
	{
		System.out.println("Jio Created");
	}
	@Override
	public void calling()
	{
		System.out.println("Calling with Jio");
	}
	@Override
	public void data() {
		
		System.out.println("Browsing with Jio");
	}
}

