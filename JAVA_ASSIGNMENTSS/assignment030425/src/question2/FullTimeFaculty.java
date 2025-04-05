/*2. Create three classes 
	Faculty (facultyid, salary)
	FullTimeFaculty (basic, allowance) inherits class Faculty
	PartTimeFaculty (hour, rate) inherits class Faculty

Create a method for accepting input in FullTimeFaculty and PartTimeFaculty,  but salary should not be accepted. 
Salary is calculated on the basis of  (basic+allowance) for FullTimeFaculty and (hour*rate) for PartTimeFaculty. 
Also create method in above classes to display faculty data.

Create another class(say XYZ) for main method and store 2 fulltime and 2 parttime faculty information. Also print their details.
	*/
package question2;

import java.util.Scanner;

public class FullTimeFaculty extends Faculty {
	private int basic;
	private int allowance;
    
	public  FullTimeFaculty(int fid, int basic, int allowance) {
    	super(fid);
		this.basic = basic;
		this.allowance = allowance;
	}
	@Override
	public String toString() {
		return "FullTimeFaculty [basic=" + basic + ", allowance=" + allowance + "]";
	}
	public void calSal()
	{
	   sal=basic+allowance;
	   System.out.println("Faculty id:- "+fid+" Salary for FullTime Faculty:-  "+sal);
	}
	
	

}


