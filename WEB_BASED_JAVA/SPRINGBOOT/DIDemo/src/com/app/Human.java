package com.app;

public class Human {
	Heart heart;
	public Human()
	{
		System.out.println("In Constructor");
	}
	public Human(Heart heart)
	{
		super();
		System.out.println("In Param Constructor");
		this.heart=heart;
	}
	public void setHeart(Heart heart)
	{
		System.out.println("In Setter");
		this.heart=heart;
	}
	public void pump()
	{
		if(heart!=null)
		heart.pumping();
		else
		System.out.println("You Are Dead!!!");
	}
}
