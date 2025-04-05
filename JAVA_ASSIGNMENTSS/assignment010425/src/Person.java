/*4. Create a class Person with properties (name and age) with following features.
a. Default  age of person should be 18;
b. A person object can be initialized with name and age;
c. Method to display name and age of person */
public class Person {
	private int age;
	private String name;
	
	Person()
	{
		this("Pawan");
		age=18;
	}
	Person(String nm)
	{
		this.name=nm;
		age=18;
	}
	Person(String nmm,int ag)
	{
		this.name=nmm;
		this.age=ag;
	}
	public void display()
	{
		System.out.println("NAME: "+name+"AGE: "+age);
	}
	public static void main(String[] args) {
		Person p=new Person();
		p.display();
		Person p1=new Person("Yash");
		p1.display();
		
	}
}
