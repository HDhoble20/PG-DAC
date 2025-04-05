/*2.  Make list of Students having name, roll no., age, score. Write a program to accept 10 students 
 * record and arrange the Students based on the score group [0-50],[50-65],[65-80],[80-100]. */
package question2;

import java.util.Scanner;

public class Student {
	private String name;
	private  int rollNo;
	private int age;
	private int score;
	
	public void GroupbyScore(Student ar[])
	{
		boolean ans=false;
		int res=0;
		for (int i=0;i<ar.length;i++)
		{
			if((ar[i].score>=0)&&(ar[i].score<50))
					{
						System.out.println(ar[i]+" GRADE= D");
					}
			else if((ar[i].score>=50)&&(ar[i].score<65))
			{
				System.out.println(ar[i]+"  GRADE= C");
			}
			else if((ar[i].score>=65)&&(ar[i].score<80))
			{
				System.out.println(ar[i]+"  GRADE= B");
			}
			else if((ar[i].score>=80)&&(ar[i].score<=100))
			{
				System.out.println(ar[i]+"  GRADE= A");
			}
			else 
			{
				System.out.println("INVALID INPUT.....");
			}
		}
	}
	
	
	
	public Student(Student ar[]) {
		super();
	}
	
	public Student(String name, int rollNo, int age, int score) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
		this.score = score;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public int getAge() {
		return age;
	}
	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", age=" + age + ", score=" + score + "]";
	}
	
	
	

}
