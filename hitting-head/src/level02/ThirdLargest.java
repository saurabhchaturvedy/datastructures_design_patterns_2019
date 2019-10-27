package level02;

public class ThirdLargest {

	public static void main(String[] args) {
		int[] arr = { 2, 7, 4, 11, 9, 8 };
		int first = 0, second = 0, third = 0;
		for (int i = 0; i < arr.length; i++) {
			int current = arr[i];
			if (first < current) {
				third = second;
				second = first;
				first = current;

			} else if (second < current) {
				second = current;
				third = second;
			} else if (third < current) {
				third = current;
			}
		}
		System.out.println("third largest element is " + third);
	}
}
