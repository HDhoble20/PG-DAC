package question2;

import java.util.Scanner;

public class XYZ {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Faculty[] fr=new FullTimeFaculty[2];
		Faculty[] pr=new PartTimeFaculty[2];
		for(int i=0; i<2; i++)
		{
			int k, j;
			System.out.println("Enter  ID for  Full time Faculty  ");
			k=sc.nextInt();
			System.out.println("Enter the Basic Salary for FullTime Employee  ");
			j=sc.nextInt();
			System.out.println("Enter the Allowance for FullTime Faculty   ");
			int a=sc.nextInt();
			
			fr[i]= new FullTimeFaculty(k,j,a);
		}
		
		for(int i=0; i<2; i++)
		{
			System.out.println("Enter  ID for  Part time Faculty  ");
			int d=sc.nextInt();
			System.out.println("Enter the Hour of PartTime Faculty ");
			int f=sc.nextInt();
			System.out.println("Enter the Rate  of Hour for PartTime Faculty   ");
			int g=sc.nextInt();
			
	         pr[i]=new PartTimeFaculty(d,f,g);
		}
		
		for(int i=0; i<2; i++)
		{
			
			fr[i].calSal();
		}
		for(int i=0; i<2; i++)
		{
			pr[i].calSal();
		}
		
		
	}
}
