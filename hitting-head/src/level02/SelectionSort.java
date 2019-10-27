package level02;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 2, 8, 5, 3, 9, 4, 1 };
		int minimum = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			minimum = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minimum]) {
					minimum = j;
				}
				if (minimum != i) {
					int temp = arr[minimum];
					arr[minimum] = arr[i];
					arr[i] = temp;
				}

			}

		}
		Arrays.stream(arr).boxed().map(x -> x + " ").forEach(System.out::print);
	}
}
