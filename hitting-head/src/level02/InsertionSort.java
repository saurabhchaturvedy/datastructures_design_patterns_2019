package level02;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 2, 8, 5, 3, 9, 4, 1 };
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			while (j > 0 && arr[j - 1] > arr[j]) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				j = j - 1;
			}
		}
		Arrays.stream(arr).boxed().map(x -> x + " ").forEach(System.out::print);
	}
}
