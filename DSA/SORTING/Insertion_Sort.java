package Sorting;

public class Insertion_Sort {

	public void insertion_sort(int [] arr)
	{
		int n=arr.length;
		int i,j,k;
		for(i=1;i<=n-1;i++)
		{
			k=arr[i];
			for(j=i-1;j>=0 && k<=arr[j]; j--)
			{
				arr[j+1]=arr[j];
			}
			arr[j+1]=k;
		}
		
		System.out.print("SORTED ARRAY USING INSERTION SORT:- ");

		for (i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");

		}
	}
}
