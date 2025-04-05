/*10. In a company an employee is paid as under:
If his basic salary is less than Rs. 1500, then HRA = 10% of basic salary 
and DA = 90% of basic salary.
If his salary is either equal to or above Rs. 1500, then HRA = Rs. 500
and DA = 98% of basic salary.
If the employee's salary is input by the user write a program to find his gross salary. GS=Basic+DA+HRA
*/

import java.util.Scanner;

public class Company {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		  System.out.println("Enter salary ");
		  int bsal=s.nextInt();
		  double gsal,da,hra;
		  if(bsal<1500)
		  {
			  hra=bsal * 0.10;
			  da=bsal * 0.90;
		  }
		  else
		  {
			  hra=500;
			  da=bsal * 0.98;
		  }
		  gsal=bsal+hra+da;
		  System.out.println("Gross Salary is "+gsal);
	}
}
