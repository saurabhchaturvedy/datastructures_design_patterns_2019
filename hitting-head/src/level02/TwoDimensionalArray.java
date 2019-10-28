package level02;

import java.util.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		System.out.println("No of rows " + arr.length);
		System.out.println("no of columns " + arr[0].length);
		System.out.println("is element valid " + isValid(arr, 2, 3));
		Arrays.stream(arr).map(Arrays::toString).forEach(System.out::println);
		System.out.println("sum around position arr[1][1] is " + sumAround(arr, 1, 1));
	}

	public static boolean isValid(int[][] arr, int rows, int cols) {
		if (rows < 0)
			return false;
		if (cols < 0)
			return false;
		if (rows < arr.length && cols < arr[0].length)
			return true;
		return false;

	}

	public static int valueIn(int[][] arr, int rows, int cols) {
		if (isValid(arr, rows, cols))
			return arr[rows][cols];
		return 0;
	}

	public static int sumAround(int[][] arr, int rows, int cols) {

		return valueIn(arr, rows - 1, cols) + valueIn(arr, rows, cols - 1) + valueIn(arr, rows + 1, cols)
				+ valueIn(arr, rows, cols + 1);

	}
	

}
