package level01;

public class QuickSort {

	int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int pIndex = start;
		for (int i = start; i < end; i++) {
			if (arr[i] < pivot) {
				swap(arr, i, pIndex);
				pIndex++;
			}
		}
		swap(arr, pIndex, end);
		return pIndex;

	}

	void quickSort(int[] arr, int start, int end) {
		if (start < end) {
			int pIndex = partition(arr, start, end);
			quickSort(arr, start, pIndex - 1);
			quickSort(arr, pIndex + 1, end);
		}
	}

	void swap(int[] arr, int x, int y) {
		int temp = arr[y];
		arr[y] = arr[x];
		arr[x] = temp;
	}

	void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(" " + arr[i]);
	}

	int findLargest(int[] arr, int length, int k) {
		int start = 0;
		int end = arr.length - 1;
		int pIndex = partition(arr, start, end);
		while (pIndex != length - k) {
			if (pIndex < length - k)
				return partition(arr, pIndex + 1, end);
			else
				return partition(arr, 0, pIndex - 1);
		}
		return pIndex;
	}

	public static void main(String[] args) {
		int[] arr = { 7, 2, 1, 6, 8, 5, 3, 4 };
		QuickSort quickSort = new QuickSort();
		quickSort.quickSort(arr, 0, arr.length - 1);
		int findLargest = quickSort.findLargest(arr, arr.length, 2);
		System.out.println("largest is " + arr[findLargest]);
		quickSort.printArray(arr);
	}
}
