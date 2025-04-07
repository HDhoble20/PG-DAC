/*4. Explain the importance of toString() and equals() method of the Object class and override them on class Employee(empId,name,salary). 
a. Create class for main method(say XYZ),and accept five employees information and store in an array.
 Also ensure if entered empId already exist or not (use equals method). 
b. Display all employee info using toString method;
*/
package question3;

public class Employee {
	protected int empId;
	protected String name;
	protected int sal;
	
	public Employee(int empId, String name, int sal) {
		super();
		this.empId = empId;
		this.name = name;
		this.sal = sal;
	}
	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", sal=" + sal + "]";
	}
	public boolean equals(Employee e[], Employee obj, int n) 
	{
		boolean ans=false;
		for(int i=0; i<=n; i++)
		{
			if(e[i].empId==obj.empId) {
				ans=true;
				break;
			}
			else
			{
				ans=false;
				continue;
			}
		}
		return ans;
	} 
}
