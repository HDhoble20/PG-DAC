package Sorting;

public class Quick_Sort {

		public int partition(int [] arr, int low, int high)
		{
			int left,right,pivot,t;
			pivot=arr[low];
			left=low;
			right=high;
			
			while(left<=right)
			{
				while((arr[left]<=pivot) && (left<high))
					left++;
				
				while((arr[right]>pivot))
					right--;
				
				if(left<right)
				{
					t=arr[left];
					arr[low]=arr[right];
					arr[right]=t;
					left++;
					right--;
				}
				else 
					left++;
			}//end of while
			arr[low]=arr[right];
			arr[right]=pivot;
			return right;
		}
		
		public void QuickSort(int [] arr,int low, int high)
		{
			int pivloc;
			if(low>=high) return;
			pivloc=partition(arr,low,high);
			QuickSort(arr,low,pivloc-1);
			QuickSort(arr,pivloc+1,high);
		}
}
