/*9. Program to find the simple interest. */
package question07;

import java.util.Scanner;

public class Question09 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Loan Amount: ");
	int principal=sc.nextInt();
	System.out.println("Enter Rate of Interest: ");
	int rate=sc.nextInt();
	System.out.println("Time of loan in uyear: ");
	int time=sc.nextInt();
	
	float ans= calculateInterest(principal, rate, time);
	System.out.println("Interest: "+ans);
	System.out.println("Total Amount to pay including interest "+ (principal+ans));
}
public static float calculateInterest(int p, int r, int t)
{
	float ans;
	ans=(float)(p*r*t)/100;
	
	return ans;
}
}
