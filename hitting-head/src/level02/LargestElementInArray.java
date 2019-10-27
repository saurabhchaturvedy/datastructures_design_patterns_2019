package level02;

public class LargestElementInArray {

	public static void main(String[] args) {
		int[] arr = { 3, 6, 5, 2, 8, 1, 21, 13, 17, 9 };

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("Largest element in the array is " + max);
	}
}
