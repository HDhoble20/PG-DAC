/*1. Create class Product (pid, price, quantity) with parameterized constructor. 

Create a main function in different class (say XYZ) and perform following task:
Accept five product information from user and store in an array
 Find Pid of product with highest price.
Create method (with array of product’s object as argument) in XYZ class to calculate and return total amount spent on all products. 
 (amount spent on single product=price of product * quantity of product)*/


package assday02;

import java.util.Scanner;

public class Product {
	private int pid=0;
	private int price=0;
	private int quantity=0;
	private  int total=0;
	public Product()
	{}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public  int getTotal() {
		return total;
	}
	public  void setTotal(int total) {
		this.total = total;
	}
	public Product(int pid, int price, int quantity) {
		super();
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	public void Highest(Product arr[])
	{
		Product temp=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(temp.price<arr[i].price)
			{
				temp.price=arr[i].price;
			}
		}
		System.out.println("Product Id:  "+temp.getPid()+ "     Price :"+temp.getPrice());
	}
	public void totalSpent(Product arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i].total=arr[i].getPrice()*arr[i].getQuantity();
			

		}
		for(int j=0; j<arr.length; j++)
		{
			sum+=arr[j].getTotal();
		}
		
			
		
		System.out.println(sum);
	
	}
	

	
}
