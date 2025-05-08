package Sorting;

public class Bubble_Sort {
	
	public  void bubble_sort(int[] arr)
	{
		int n=arr.length;
		int i,j,temp, flag=0;
		
		for(i=n-1;i>=0;i--)
		{
			for(j=0;j<i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					flag = 1;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
		
		System.out.print("SORTED ARRAY USING BUBBLE SORT:- ");
		
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
	}

}
