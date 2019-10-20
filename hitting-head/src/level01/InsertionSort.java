package level01;

public class InsertionSort {

	public static int[] insertionSort(int[] arr) {
		int key = 0;
		int j = 0;
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 7, 4, 1, 5, 3 };
		int[] insertionSort = insertionSort(arr);
		for (int x : insertionSort) {
			System.out.println(x);
		}
	}
}
