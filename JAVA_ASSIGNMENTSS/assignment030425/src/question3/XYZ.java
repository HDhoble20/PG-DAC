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

import java.util.Scanner;

public class XYZ {
	public void acceptClgStudents(CollegeStudent a) {

	}

	public void acceptSclStudents(CollegeStudent a) {

	}

	public static void main(String[] args) {

		Student s[] = new Student[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			if (i < 2) {

				System.out.println("Enter ClgStudent RollNo: ");
				int r = sc.nextInt();
				System.out.println("Enter percentage of ClgStudent: ");
				float p = sc.nextFloat();
				System.out.println("Enter semister of ClgStudent: ");
				int sem = sc.nextInt();
				s[i] = new CollegeStudent(r, p, sem);
			} else if (i >= 2) {

				System.out.println("Enter SclStudent RollNo: ");
				int r = sc.nextInt();
				System.out.println("Enter percentage of SclStudent: ");
				float p = sc.nextFloat();
				System.out.println("Enter Class of SclStudent: ");
				int c = sc.nextInt();
				s[i] = new SchoolStudent(r, p, c);
			}
		}
		for (int i = 0; i < 5; i++) {
			s[i].show();
		}
		System.out.println("Enter Roll No: ");
		int x = sc.nextInt();

		boolean ck = false;
		int cnt = 0;
		;
		for (int i = 0; i < 5; i++) {
			if (s[i].percentage > 75.0f) {
				cnt++;
			}
			if (x == s[i].rollNo) {
				if (s[i] instanceof CollegeStudent) {
					System.out.println("COLLEGE STUDENT ...");
				} else if (s[i] instanceof SchoolStudent) {
					System.out.println("SCHOOL STUDENT");
				} else {
					ck = true;
				}

			}

		}
				if (ck) 
				{
					System.out.println("ROLL NO NOT FOUND........");
				}

		System.out.println("THERE ARE TOTAL " + cnt + " NO OF STUDENT HAVING GRADE A ");
	}

}
