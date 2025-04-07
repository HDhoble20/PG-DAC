/*3.   Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. create abstract method calcTax().
a. Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax on yearly salary.
b. Create class Product(pid,price,quantity) and implement Taxable to calculate salesTax on unit price of product.
c. Create class for main method(Say XYZ), accept employee information 
and a product information from user and print income tax and sales tax respectively.*/
package question2;

public  class Product implements Taxable{
	protected int pid;
	protected int price;
	protected int quanitity;

	
	public Product(int pid, int price, int quanitity) {
		super();
		this.pid = pid;
		this.price = price;
		this.quanitity = quanitity;
	}

	

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", price=" + price + ", quanitity=" + quanitity + "]";
	}



	@Override
	public void calcTax() {
		float pTax=(float)price*salesTax/100;
		System.out.println("SALES TAX IS "+pTax);
	}

}
