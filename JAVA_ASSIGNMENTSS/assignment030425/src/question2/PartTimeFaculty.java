/*/*2. Create three classes 
	Faculty (facultyid, salary)
	FullTimeFaculty (basic, allowance) inherits class Faculty
	PartTimeFaculty (hour, rate) inherits class Faculty

Create a method for accepting input in FullTimeFaculty and PartTimeFaculty,  but salary should not be accepted. 
Salary is calculated on the basis of  (basic+allowance) for FullTimeFaculty and (hour*rate) for PartTimeFaculty. 
Also create method in above classes to display faculty data.

Create another class(say XYZ) for main method and store 2 fulltime and 2 parttime faculty information. Also print their details.
	*/
package question2;

public  class PartTimeFaculty extends Faculty{
	private int hour;
	private int rate;
	public PartTimeFaculty(int fid, int hour, int rate) {
		super(fid);
		this.hour = hour;
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "PartTimeFaculty [hour=" + hour + ", rate=" + rate + "]";
	}
	
	@Override
	public void calSal() {
		sal=hour*rate;
		System.out.println("Faculty Id:- "+fid+" Salary:- "+sal);
		
	}
	

}
