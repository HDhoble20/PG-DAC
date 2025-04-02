/*8. Program to swap two no’s without using third variable*/
import java.util.Scanner;

public class SwapNo {
public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	  System.out.println("Enter two numbers ");
	  int a=s.nextInt();
	  int b=s.nextInt();
	  System.out.println("number before swap"+a+" "+b);
	  a=a+b;
	  b=a-b;
	  a=a-b;
	  System.out.println("number is swapped "+a+" "+b);
}
}
