package level01;

public class SelectionSort {

	public static int[] selectionSort(int[] arr) {
		int length = arr.length;
		for (int i = 0; i < length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 7, 4, 1, 5, 3 };
		int[] selectionSort = selectionSort(arr);
		for (int x : selectionSort) {
			System.out.println(x);
		}
	}
}
