package campus.academics;

/*1. Create a following class/package structure in your application.  Filled squares are packages and empty circles are classes.
campus.data
Person (name, age, address)
campus.academics
Student(rollno, branch, semester) inherits Person
Faculty(facultyId, name, salary, branch)  inherits Person
campus
CampusApp- this class contains main method to accept 5 Faculty information and print total of salaries of all faculties.*/

import campus.data.Person;

public class Faculty extends Person {
	private int facultyId;
	private int salary;
	private String branch;
	
	
	public Faculty() {
		super();
	}
	public Faculty(int facultyId, int salary, String branch) {
		super();
		this.facultyId = facultyId;
		this.salary = salary;
		this.branch = branch;
	}
	public Faculty(String name, int age,String address,int facultyId, int salary, String branch) {
		super(name,age,address);
		this.facultyId = facultyId;
		this.salary = salary;
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Faculty [facultyId=" + facultyId + ", salary=" + salary + ", branch=" + branch + ", name=" + name
				+ ", age=" + age + ", adress=" + adress + "]";
	}
	public int getFacultyId() {
		return facultyId;
	}
	public int getSalary() {
		return salary;
	}
	public String getBranch() {
		return branch;
	}
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

	
	
}

