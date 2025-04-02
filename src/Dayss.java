/*6. Write a program which accepts days(eg. 670 days) as integer and display 
 * total number of years, months and days in it.*/

import java.util.Scanner;

public class Dayss {
	private int days;
	private int month;
	private int year;
	
	 Dayss(int days)
	{
		this.days=days;
	}
	 public void cal()
	 {
		 year=days/365;
		 days=days%365;
		 month=days/30;
		 days=days%30;
		 System.out.println(year+"year"+month+"month"+days+"days");
	 }
	 public static void main(String[] args) {
		 Scanner s= new Scanner(System.in);
		 System.out.println("Enter days: ");
		 int day=s.nextInt();
		Dayss d= new Dayss(day);
		d.cal();
		
	}
	 
	

}
