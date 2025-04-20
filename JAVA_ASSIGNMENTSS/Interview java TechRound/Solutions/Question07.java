package question07;

public class Question07 {
	private float pi=3.14f;
	private float r;
	private float Areaa;
	private float circum;
	
	public void AreaC(float ra)
	{
		r=ra;
		Areaa=pi*r*r;
		circum=2*pi*r;
	}
	public void display()
	{
		System.out.println("Area of circle : "+Areaa);
		System.out.println("Circumference of circle : "+circum);
	}
	
	public static void main(String args[])
	{
		 Question07 Ac=new  Question07();
		 Ac.AreaC(5);
		 Ac.display();
		 
		
	}
}
