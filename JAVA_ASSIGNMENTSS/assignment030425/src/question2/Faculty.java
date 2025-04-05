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
public abstract class Faculty {
	protected int fid;
	protected int sal;
	
	
	
	public Faculty() {
		super();
	}
	public Faculty(int fid) {
		
		this.fid = fid;
	}
	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", sal=" + sal + "]";
	}
	public abstract void calSal();
	
}
