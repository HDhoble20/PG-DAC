/*1. Create a class to calculate Area of circle with one data member to store the radius and another to store area value.
Create method members
  1. init - to input radius from user
  2. calc - to calculate area
  3. display- to display area */
public class CalcAOC {
private int r;
private float area;
private float pi=3.14f;

 	CalcAOC()
 	{
 		r=0;
 		area=0;
 	}
 	CalcAOC(int r)
 	{
 		this.r=r;
 	}
 	void init(int a)
 	{
 		this.r=a;
 	}
 	void calc()
 	{
 		area=pi*r*r;
 	}
 	void display()
 	{
 		System.out.println("AREA OF CIRCLE "+area);
 	}
 	public static void main(String[] args) {
		CalcAOC c= new CalcAOC();
		c.init(5);
		c.calc();
		c.display();
		
	}
}
