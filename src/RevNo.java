import java.util.Scanner;

public class RevNo {
public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	  System.out.println("Enter number to reverse ");
	  int n=s.nextInt();
	  int digit;
	  int rev=0;
	  while(n!=0)
	  {
		  digit=n%10;
		  rev=rev*10+digit;
		  n=n/10;
	  }
	  System.out.println("reverse no is: "+rev);
}
}
