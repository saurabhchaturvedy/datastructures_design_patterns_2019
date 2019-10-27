package level02;

public class ThreeLargestElements {

	public static void main(String[] args) {
		int[] arr = { 2, 6, 4, 8, 11, 20, 1, 19, 17 };

		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int current = arr[i];
			if (first < current) {
				third = second;
				second = first;
				first = current;
				
				
			} else if (second < current) {
				third = second;
				second = current;
				
			} else if (third < current) {
				third = current;
			}
		}
		System.out.println("Three largest elements are " + first + " " + second + " " + third);

	}
}

