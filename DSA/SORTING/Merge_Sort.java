package Sorting;

public class Merge_Sort {
	

		public void merge_ver2(int arr[], int res[], int low1, int high1, int low2, int high2) {
			int i, j, k, tar;
			i = low1;
			j = low2;
			tar = low1;

			while (i <= high1 && j <= high2) {
				if (arr[i] < arr[j]) {
					res[tar] = arr[i];
					tar++;
					i++;
				} else if (arr[j] < arr[i]) {
					res[tar] = arr[j];
					tar++;
					j++;
				} else {
					res[tar] = arr[i];
					tar++;
					i++;
					j++;
				}
			}
			while (i <= high1) {
				res[tar] = arr[i];
				tar++;
				i++;
			}
			while (j <=high2) {
				res[tar] = arr[j];
				tar++;
				j++;
			}

		}

		public void copy(int[] arr, int[] temp, int low, int high) {
			int i = low;
			while (i <= high) {
				arr[i] = temp[i];
				i++;
			}
		}

	public void merge_sort(int[] arr, int low, int high) {

		int mid;
		int temp[] = new int[arr.length];
		mid = (low + high) / 2;

		if (low < high) {
			mid = (low + high) / 2;
			merge_sort(arr, low, mid);
			merge_sort(arr, mid + 1, high);
			merge_ver2(arr, temp, low, mid, mid + 1, high);
			copy(arr, temp, low, high);
		}
	}
}
