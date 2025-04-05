/*1. Create class Product (pid, price, quantity) with parameterized constructor. 

Create a main function in different class (say XYZ) and perform following task:
Accept five product information from user and store in an array
 Find Pid of product with highest price.
Create method (with array of product’s object as argument) in XYZ class to calculate and return total amount spent on all products. 
 (amount spent on single product=price of product * quantity of product)*/
package assday02;

import java.util.Scanner;

public class XYZ extends Product {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the size of array: ");
		int size=s.nextInt();
		
		Product arr[]=new Product[size];
		System.out.println("Enter Products: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter product id:  " );
			int pid=s.nextInt();
			System.out.println("Enter Product Price: ");
			int price=s.nextInt();
			System.out.println("Enter Quanitity: ");
			int quantity=s.nextInt();
			arr[i]=new Product(pid,price,quantity);
		}
		System.out.println("Products details are: ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("PID: "+arr[i].getPid()+"  Price: "+arr[i].getPrice() +"  Quantity: "+arr[i].getQuantity() );
		}
		Product p= new Product();
		p.Highest(arr);
		p.totalSpent(arr);
	}
}
