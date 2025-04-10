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


public class Student extends Person{
	private int rollNo;
	private String branch;
	private String semester;
	
	public Student(String name,int age, String Address,int rollNo, String branch, String semester) {
		super(name,age,Address);
		this.rollNo = rollNo;
		this.branch = branch;
		this.semester = semester;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", branch=" + branch + ", semester=" + semester + "]";
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getBranch() {
		return branch;
	}

	public String getSemester() {
		return semester;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}
	


}