/*1. Create class OneBHK with instance variable roomArea ,hallArea and price
a. Create default and parameterized constructor;
b. Method show(): to print OneBHK data member information;
Create another class TwoBHK which has all the properties and behaviour of OneBHK and a new instance variable room2Area.
a. Create default and parameterized constructor;
b. Method show(): to print all data member information;
Write main function in another class(Say XYZ) and store three TwoBHK flat’s information  and print  
information using show method. Also print total amount of all flats.*/
package question1;

public class OneBHK {
	protected int roomArea;
	protected int hallAreaa;
	protected int price;
	
	
	public OneBHK() {
		super();
	}
	
	public OneBHK(int roomArea, int hallAreaa, int price) {
		super();
		this.roomArea = roomArea;
		this.hallAreaa = hallAreaa;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "OneBHK [roomArea=" + roomArea + ", hallAreaa=" + hallAreaa + ", price=" + price + "]";
	}

	public void Show()
	{
		System.out.println("OneBHK [roomArea=" + roomArea + ", hallAreaa=" + hallAreaa + ", price=" + price + "]    ");
		System.out.println();
	}

	
}
