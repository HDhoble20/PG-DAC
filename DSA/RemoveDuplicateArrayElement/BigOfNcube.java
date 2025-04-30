package removeDuplicateElementArray;

import java.util.Arrays;
import java.util.Scanner;

public class BigOnCube {
   
	public static void main(String[] args) {
		 int arr[]=new int[]  {12,23,22,12,4,23,4,32,22,3,-999};
		 int i,j;
		 for(i=0;arr[i]!=-999;i++)
		 {
			 for(j=i+1;arr[j]!=-999;j++)
			 {
				 if(arr[i]==arr[j])
				 {
					 for(int k=j;arr[k]!=-999;k++)
					 {
						 arr[k]=arr[k+1];
					 }
				 }
			 }
			 arr[j]=-999;
		 }
		 
		 for(i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]); 
		 }
		
		
		
	}

}
