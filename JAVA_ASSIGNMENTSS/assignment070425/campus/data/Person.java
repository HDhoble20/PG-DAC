package campus.data;

/*1. Create a following class/package structure in your application.  Filled squares are packages and empty circles are classes.
campus.data
Person (name, age, address)
campus.academics
Student(rollno, branch, semester) inherits Person
Faculty(facultyId, name, salary, branch)  inherits Person
campus
CampusApp- this class contains main method to accept 5 Faculty information and print total of salaries of all faculties.*/


public class Person {
	protected String name;
	protected int age;
	protected String adress;
	
	
	public Person() {
		
	}


	public Person(String name, int age, String adress) {
	
		this.name = name;
		this.age = age;
		this.adress = adress;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", adress=" + adress + "]";
	}
	


	
	
	

}