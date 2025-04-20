/*11. Program to convert temperature from Fahrenheit  to Celsius as C= 5*(f-32)/9 */
package question07;

import java.util.Scanner;

public class Question11 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Temperature in Fehrenheit: ");
	float f=sc.nextFloat();
	float c= 5*(f-32)/9;
	
	System.out.println("Fehrenheit to Celsius: "+c);
	
}
}
