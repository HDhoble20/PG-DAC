/*5. Create a class Employee  with(empNo ,salary and totalSalary) ) with following features.
a. Only parameterized constructor;
b. totalSalary always represent total of all the salaries of all employees created.
c. empNo should be auto incremented. 
d. display total employees and totalSalary using class method.
*/
public class Employee {
              private int empNo;
              private int sal;
              private static int cnt;
              private static int totalSal;
              
              public Employee(int s)
              {
            	  this.sal=s;
            	  cnt++;
            	  empNo=cnt;
            	  totalSal+=sal;
            	  
              }
              
              public String toString()
              {
            	  return "Employee Id: "+empNo+" Salary: "+sal;
              }
              public static void main(String args[])
              {
            	  Employee e1=new Employee(25000);
            	  Employee e2=new Employee(13000);
            	  Employee e3=new Employee(90000);
            	  Employee e4=new Employee(44000);
            	  Employee e5=new Employee(65000);
            	  System.out.println(e1);
            	  System.out.println(e2);
            	  System.out.println(e3);
            	  System.out.println(e4);
            	  System.out.println(e5);
            	  
            	  System.out.println("Total Salary :- "+Employee.totalSal);
            	  
            	  
              }
              
              
}
