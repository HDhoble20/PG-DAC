/*10. Write a program which accepts days(eg. 670 days) as integer and display 
 * total number of years, months and days in it.*/
package question07;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Days: ");
		int days=sc.nextInt();
		int year=days/(365);
		int month=days-(year*365);
		month=month/30;
		int day=days-((year*365)+(month*30));
		
		System.out.println("Year: "+year+" Month: "+month+" Day: "+day);
	}
}
