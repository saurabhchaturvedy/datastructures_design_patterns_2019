package level02;

public class FirstTwoLargestElements {

	public static void main(String[] args) {
		int[] arr = { 6, 8, 1, 9, 2, 1, 10 };

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int current = arr[i];
			if (first < current) {
				second = first;
				first = current;
			} else if (second < current) {
				second = current;
			}
		}
		System.out.println("First two largest elements are " + first + " " + second);
	}
}
