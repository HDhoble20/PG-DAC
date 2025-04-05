/*3.  Create a class Student with two members  :rollno and percentage.

Create default and parameterized constructors. Create method show() to display information.
Create another class CollegeStudent inherits  Student class. Add a new member semester to it. Create default and parameterized
 constructors. Also override show() method.

Create another class SchoolStudentinherits  Student class. Add a new member classname(eg 12th ,10th  etc.)  to it.
 Create default and parameterized constructors. Also override show() method.

Create a class(say XYZ) with main method that carries out the operation of the project :
-- has array to store objects of any class(Student or CollegeStudent, SchoolStudent)
--create two CollegeStudent  and three SchoolStudent record objects and store them inside the array
-- display all record from the array
-- search record on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent.
--count how many students are having A grade,  if for A grade percentage >75
*/

package question3;

public  class CollegeStudent extends Student{
		protected int semister;

		public CollegeStudent() {
			super();
		}

		public CollegeStudent(int rollNo,float percentage,int semister) {
			super(rollNo,percentage);
			this.semister = semister;
		}
		public void show()
		{
			System.out.println("COLLEGE STUDENT RolNo:"+rollNo+"  Prcentage: "+percentage+"  Semister: "+semister);
		}
}
