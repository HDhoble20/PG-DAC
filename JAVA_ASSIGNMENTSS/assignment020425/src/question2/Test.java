package question2;

import java.util.Scanner;

public class Test {

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of student want to insert data:-  ");
		int size=sc.nextInt();
		Student[] ar=new Student[size];
		System.out.print("Enter Details of Students: ");
		System.out.println();
		for(int i=0; i<size; i++)
		{
			System.out.println("********************************************");
			  System.out.println("Enter Name of "+(i+1)+" Student:-  ");
		      String name=sc.next();
			  System.out.println("Enter Roll Number of "+(i+1)+" Student:-  ");
		      int rollNo=sc.nextInt();
		      System.out.println("Enter Age of "+(i+1)+" Student:-  ");
		      int age=sc.nextInt();
		      System.out.println("Enter Score of "+(i+1)+" Student:-  ");
		      int score=sc.nextInt();
		   
		      ar[i]= new Student(name, rollNo, age, score);
		}
		
		Student a=new Student(ar);
		a.GroupbyScore(ar);
				
	}
}
