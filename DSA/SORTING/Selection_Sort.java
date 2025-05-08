package Sorting;

public class Selection_Sort {

	public void selection_sort(int[] arr) {
		int n = arr.length;
		int i, j, temp, min;

		for (i = 0; i <= n - 1; i++) {
			min = i;
			for (j = i + 1; j <= n - 1; j++) {
				if (arr[j] < arr[min]) 
				{
					min = j;
				}

				if (min != i) 
				{
					temp = arr[i];
					arr[i] = arr[min];
					arr[min] = temp;
				}
			}
		}
		System.out.print("SORTED ARRAY USING SELECTION SORT:- ");

		for (i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");

		}
	}
}
