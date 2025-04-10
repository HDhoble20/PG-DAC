
/*1. Create a following class/package structure in your application.  Filled squares are packages and empty circles are classes.
campus.data
Person (name, age, address)
campus.academics
Student(rollno, branch, semester) inherits Person
Faculty(facultyId, name, salary, branch)  inherits Person
campus
CampusApp- this class contains main method to accept 5 Faculty information and print total of salaries of all faculties.*/
package campus;
import java.util.Scanner;
import campus.data.Person;
import campus.academics.Faculty;
public class CampusApp {
	public static void main(String[] args) {
		  Scanner s= new Scanner(System.in);
		  System.out.println("enter the no of faculty you want to eneter data: ");
		  int n=s.nextInt();
		   Faculty p[]=new Faculty[n];
		   int totalSalary=0;
		   for(int i=0;i<n;i++)
		   {
			   System.out.println("Enter Name: ");
			   String nm=s.next();
			   System.out.println("Age: ");
			   int a=s.nextInt();
			   System.out.println("Address: ");
			   String ad=s.next();    //String name, int age,String address,int facultyId, int salary, String branch
			   System.out.println("Enter the Faculty ID:- ");
			   int fid=s.nextInt();
			   System.out.println("Enter the Salary of Faculty: ");
			   int sal=s.nextInt();
			   System.out.println("Enter Branch name:- ");
			   String br=s.next();
			   
			   p[i]= new Faculty(nm,a, ad, fid, sal, br);
			   totalSalary+=sal;
		   }
		   
		   for(Faculty a:p)
		   {
			   System.out.println(a);
		   }
		   System.out.println("Total Salary:  "+totalSalary);
	}
 
}
