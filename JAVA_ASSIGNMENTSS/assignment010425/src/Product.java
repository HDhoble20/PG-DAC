/*
Create class Product (pid, price, quantity) with parameterized constructor. 

Create a main function in different class (say XYZ) and perform following task:
Accept five product information from user and store in an array
 Find Pid of product with highest price.
Create method (with array of product’s object as argument) in XYZ class to calculate and return total amount spent on all products.  (amount spent on single product=price of product * quantity of product)
*/

public class Product {
private int pid;
private int price;
private int quantity;

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

}
