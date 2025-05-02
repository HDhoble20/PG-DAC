package StackAndQueue;
import java.util.Scanner;
public class myQueue {

public static void main(String[] args) {
	 Scanner sc =new Scanner(System.in);
	intQueue q= new intQueue(15);
	
	do {
		
		System.out.println("\nMENU");
		System.out.println("1.Insert");
		System.out.println("2.Remove");
		System.out.println("3.Peek");
		System.out.println("4.Exit");
		System.out.println("Enter Your choice");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter Element to Push");
			int val=sc.nextInt();
			q.insert(val);
			break;
		case 2:
			 int removed=q.remove();
			 if(removed != -1)
				 System.out.println("Removed: "+removed);
			 break;
			 
		case 3:
			int peeked=q.peek();
			if(peeked != -1)
				System.out.println("Element: "+peeked);
			break;
			
		case 4:
			System.out.println("EXITING.....");
			 sc.close();
			 return;
			 
		default:
			System.out.println("Invalid input");
		}
		
	   }while(true);

}
}
