package Sorting;

import java.util.Scanner;

public class Sorting {

	
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
//		int arr[]= {10,11,6,2,13,7,32,9,3,23};
		
		
		do {
			System.out.println();
			System.out.println("-------------------------------------------------------------");
			System.out.println("1 -> BUBBLE SORT");
			System.out.println("2 -> SELECTION SORT");
			System.out.println("3 -> INSERTION SORT");
			System.out.println("4 -> MERGE SORT VERSION 2");
			System.out.println("5 -> MERGE SORT");
			System.out.println("6 -> EXIT");
			System.out.println("-------------------------------------------------------------");
			System.out.println("ENTER YOUR CHOICE:- ");
			int ch=sc.nextInt();
			System.out.println("-------------------------------------------------------------");
			
			
			switch(ch)
			{
			case 1:
				System.out.println("ENTER THE LENGTH OF ARRAY");
				int n1=sc.nextInt();
				int arr1[]=new int[n1];
				System.out.println("ENTER ARRAY ELEMENTS:- ");
				for(int i=0;i<n1;i++)
				{
					arr1[i]=sc.nextInt();
				}
				Bubble_Sort bs=new Bubble_Sort();
				bs.bubble_sort(arr1);
			    break;
			case 2:
				System.out.println("ENTER THE LENGTH OF ARRAY");
				int n2=sc.nextInt();
				int arr2[]=new int[n2];
				System.out.println("ENTER ARRAY ELEMENTS:- ");
				for(int i=0;i<n2;i++)
				{
					arr2[i]=sc.nextInt();
				}
				Selection_Sort ss=new Selection_Sort();
				ss.selection_sort(arr2);
				break;
				
			case 3:
				System.out.println("ENTER THE LENGTH OF ARRAY");
				int n3=sc.nextInt();
				int arr3[]=new int[n3];
				System.out.println("ENTER ARRAY ELEMENTS:- ");
				for(int i=0;i<n3;i++)
				{
					arr3[i]=sc.nextInt();
				}
				Insertion_Sort is=new Insertion_Sort();
				is.insertion_sort(arr3);
				break;
			
				
			case 4:
				System.out.println("ENTER THE LENGTH OF ARRAY");
				int n5=sc.nextInt();
				int arr5[]=new int[n5];
				int res[]=new int[arr5.length];
				System.out.println("ENTER ARRAY ELEMENTS:- ");
				for(int i=0;i<n5;i++)
				{
					arr5[i]=sc.nextInt();
				}
				Merge_Sort ms1=new Merge_Sort();
				ms1.merge_ver2(arr5, res, 0, arr5.length/2, (arr5.length/2)+1, arr5.length-1);
				System.out.print("SORTED ARRAY USING MERGE VERSION 2:- ");
				for(int i=0;i<res.length;i++)
				{
					System.out.print(res[i]+" ");
				}
				break;
				
			case 5:
				System.out.println("ENTER THE LENGTH OF ARRAY");
				int n4=sc.nextInt();
				int arr4[]=new int[n4];
//				int res[]=new int[arr4.length];
				System.out.println("ENTER ARRAY ELEMENTS:- ");
				for(int i=0;i<n4;i++)
				{
					arr4[i]=sc.nextInt();
				}
				Merge_Sort ms=new Merge_Sort();
				ms.merge_sort(arr4,0,arr4.length-1);
				for(int i=0;i<arr4.length;i++)
				{
					System.out.print(arr4[i]+" ");
				}
				break;
						
			case 6:
				System.out.println("EXITING.........");
				break;
				
			default:
				System.out.println("Invalid input");
			
			}
		
		}while(true);
		
	}
}
