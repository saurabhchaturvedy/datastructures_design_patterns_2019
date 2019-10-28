package level02;

import java.util.Arrays;

public class PrintAllDiagonals {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		Arrays.stream(arr).map(Arrays::toString).forEach(System.out::println);
		int rows = arr.length;
		int cols = arr[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(arr[i - j][j] + " ");
			}
		}
		System.out.print(' ');
		int colShift = 0;
		for (int i = rows - 1; i > 0; i--) { // 3 // 14(31) 11(22) 8(13)
			colShift++; // // 3
			for (int j = colShift; j < rows; j++) {
				System.out.print(arr[rows + colShift - j - 1][j] + " ");
			}
		}
	}
}
