/*4. Explain the importance of toString() and equals() method of the Object class and override them on class Employee(empId,name,salary). 
a. Create class for main method(say XYZ),and accept five employees information and store in an array.
 Also ensure if entered empId already exist or not (use equals method). 
b. Display all employee info using toString method;
*/
package question3;

import java.util.Scanner;

public class Xyz {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of employee you want to insert: ");
		int n=s.nextInt();
		Employee e[]=new Employee[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Employee id: ");
			int eid=s.nextInt();
			System.out.println("Enteer name: ");
			String nm=s.next();
			System.out.println("Enter salary: ");
			int sl=s.nextInt();
			
			e[i]=new Employee(eid,nm,sl);
			
			
				if(i>=1 && i<=n)
				{
					if(equals(e, e[i], i))
					{
						System.out.println("Employee Already Exists!!");
						System.out.println("Please Enter Qnique Employee Id: ");
						int k=s.nextInt();
						System.out.println("Enter Emp Name: ");
						String nam=s.next();
						System.out.println("Enter Salary: ");
						int sala=s.nextInt();
					    e[i]=new Employee(k,nam,sala);
						continue;
					}
				}
			
	
		}
		
		for(int k=0;k<n;k++)
		{
			System.out.println(e[k]);
		}
		
	}

	private static boolean equals(Employee[] e, Employee obj, int j) {
		boolean ans=false;
		for(int i=0; i<j; i++)
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


/*if(i>=1 && i<=n)
			{
				if(equals(e,e[i], i))
				{
					System.out.println("Employee Already Exists!!");
					System.out.println("Please Enter Qnique Employee Id: ");
					int k=s.nextInt();
					System.out.println("Enter Emp Name: ");
					String nam=s.next();
					System.out.println("Enter Salary: ");
					int sala=s.nextInt();
				    e[i]=new Employee(k,nam,sala);
				    
					continue;
					
				}
			}
			else 
			{
				continue;
			}*/
