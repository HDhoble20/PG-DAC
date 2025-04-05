/*1. Create class OneBHK with instance variable roomArea ,hallArea and price
a. Create default and parameterized constructor;
b. Method show(): to print OneBHK data member information;
Create another class TwoBHK which has all the properties and behaviour of OneBHK and a new instance variable room2Area.
a. Create default and parameterized constructor;
b. Method show(): to print all data member information;
Write main function in another class(Say XYZ) and store three TwoBHK flat’s information  and print  
information using show method. Also print total amount of all flats.*/
package question1;

public class TwoBHK extends OneBHK {
	private int room2Area;

	public TwoBHK() {
		super();
	}

	public TwoBHK(int roomArea,int hallAreaa,int price,int room2Area) {
		super(roomArea,hallAreaa,price);
		this.room2Area = room2Area;
	}
	
	public void Show()
	{
		super.Show();
		System.out.println("[ room2Area=" + room2Area +"]");
	}
	
}
