/*7. Program to convert temperature from Fahrenheit  to Celsius as C= 5*(f-32)/9 */

import java.util.Scanner;

public class TempConverter {
  public static void main(String[] args) {
	
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter temperature in fahrenheit: ");
	  float f=s.nextFloat();
	  float c;
	  c= 5*(f-32)/9; 
	  System.out.println("Converted temperature from Fahrenheit  to Celsius is "+c);
	  s.close();
}
	
}
