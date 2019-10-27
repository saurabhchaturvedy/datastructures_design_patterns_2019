package level02;

public class ThreeSmallestElements {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 7, 8, 2, 12, 34 };
		int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE, third = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int current = arr[i];
			if (first < current) {
				third = second;
				second = first;
				first = current;
			} else if (second > current) {
				third = second;
				second = current;
			} else if (third > current) {
				third = current;
			}
		}
		System.out.println("three smallest elemnts are " + first + " " + second + " " + third);
	}
}
