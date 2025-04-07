/*3.   Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. create abstract method calcTax().
a. Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax on yearly salary.
b. Create class Product(pid,price,quantity) and implement Taxable to calculate salesTax on unit price of product.
c. Create class for main method(Say XYZ), accept employee information 
and a product information from user and print income tax and sales tax respectively.*/
package question2;

import java.util.Scanner;

public class Xyz {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("PRESS 1 TO ENTER EMPLOYEE DETAILS ");
		System.out.println("PRESS 2 TO ENTER PRODUCT INFORMATION");
		System.out.print("ENTER YOUR CHOICE: ");
		int d=sc.nextInt();
		if(d==1)
		{
			System.out.println("Enter Empid: ");
			int e=sc.nextInt();
			System.out.println("Enter Name: ");
			String n=sc.next();
			System.out.println("Enter salary: ");
			int s=sc.nextInt();
			Taxable t= new Employee(e,n,s);
			t.calcTax();
					
		}
		else if(d==2)
		{
			System.out.println("Enter pid: ");
			int p=sc.nextInt();
			System.out.println("Enter price: ");
			int pr=sc.nextInt();
			System.out.println("Enter quanitity: ");
			int q=sc.nextInt();
			Taxable t1=new Product(p,pr,q);
			t1.calcTax();
		}
		else {
			System.out.println("INVALID INPUT!!!!!");
		}
		
	}
}
