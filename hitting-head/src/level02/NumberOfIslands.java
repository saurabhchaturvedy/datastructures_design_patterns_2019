package level02;

import java.util.Arrays;

public class NumberOfIslands {

	private static boolean trackingMatrix[][];

	public int numberOfIslands(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		int islandCount = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (trackingMatrix[i][j] || arr[i][j] == 0)
					continue;
				explore(arr, i, j);
				islandCount++;
			}
		}

		return islandCount;

	}

	private void explore(int[][] arr, int i, int j) {
		// TODO Auto-generated method stub
		if (i >= arr.length || i < 0 || j >= arr[0].length || j < 0 || trackingMatrix[i][j] || arr[i][j] == 0)
			return;
		trackingMatrix[i][j] = true;
		explore(arr, i - 1, j);
		explore(arr, i + 1, j);
		explore(arr, i, j - 1);
		explore(arr, i, j + 1);

	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 1, 1, 1, 0 }, { 1, 1, 0, 1, 0 }, { 1, 1, 0, 0, 1 }, { 0, 0, 0, 0, 1 } };
		Arrays.stream(arr).map(Arrays::toString).forEach(System.out::println);
		trackingMatrix = new boolean[arr.length][arr[0].length];
		NumberOfIslands numberOfIslands = new NumberOfIslands();
		int numberOfIslands2 = numberOfIslands.numberOfIslands(arr);
		System.out.println("Number of Islands " + numberOfIslands2);
	}
}
