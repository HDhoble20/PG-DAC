package question1;
import java.util.Scanner;
public class XYZ {
	public static void main(String[] args) {
		
		
		OneBHK[] ar=new OneBHK[3];
		Scanner sc=new Scanner(System.in);
		for(int i=1; i<=3; i++)
		{
			int r1,h1,pr,r2;
			System.out.println("Enter the Details of Flat:- ");
			System.out.println("Enter Area of Room1:-  ");
			r1=sc.nextInt();
			System.out.println("Enter Area of Hall:-   ");
			h1=sc.nextInt();
			System.out.println("Enter Price of Flat:-  ");
			pr=sc.nextInt();
			System.out.println("Enter Area of Room2:-   ");
	        r2=sc.nextInt();
	        ar[i]=new TwoBHK(r1,h1,pr,r2);
	        ar[i].Show();
		}
				
     
	}
}
