package Sorting;

public class Merge_Ver1 {

	int i=0, j=0,tar=0;
	public void merge_ver1(int arr1[],int arr2[],int res[])
	{
		while ((i<arr1.length) && (j<arr2.length))
		{
			if(arr1[i]<arr2[j])
			{
				res[tar]=arr1[i];
				tar=tar+1;
				i=i+1;
			}
			else if(arr2[j]<arr1[i])
			{
				res[tar]=arr2[j];
				tar=tar+1;
				j=j+1;
			}
			else
			{
				res[tar]=arr1[i];
				tar=tar+1;
				i=i+1;
				j=j+1;
			}
		}
		while(i<arr1.length)
		{
			res[tar]=arr1[i];
			tar=tar+1;
			i=i+1;
		}
		while(j<arr2.length)
		{
			res[tar]=arr2[j];
			tar=tar+1;
			j=j+1;
			
		}
	}
}
