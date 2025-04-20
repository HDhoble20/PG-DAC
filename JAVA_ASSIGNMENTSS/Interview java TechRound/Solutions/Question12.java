/*12. Program to swap  two no’s without using third variable.*/
package question07;

import java.util.Scanner;

public class Question12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("After Swapping: "+a+" "+b);
		//swapping two Number
		b=a+b;
		a=b-a;
		System.out.println("After Swapping: "+a+" "+b);
	}

}
