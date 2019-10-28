package level02;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PrintAllDiagonalsQueue {

	private static boolean[][] trackingMatrix;
	private static List<Integer> traversalPath;

//	[1, 2, 3, 4]
//	[5, 6, 7, 8]
//  [9, 10, 11, 12]  // 23
//  [13, 14, 15, 16] // 33

	public void traverseMatrix(int[][] arr, int initialElement) {
		Queue<Integer> matrixQueue = new LinkedList<>();
		matrixQueue.offer(initialElement);
		int passes = 0;
		while (!matrixQueue.isEmpty()) {
			Integer topElement = matrixQueue.poll();
			traversalPath.add(topElement);
			// System.out.println("Element removed from Queue " + topElement);
			// System.out.println("Current queue " + matrixQueue);
			System.out.print("Current Traversed path ( Pass # )" + passes++ + " : ");
			traversalPath.stream().map(x -> x + " ").forEach(System.out::print);
			System.out.println();
			// System.out.println("Finding coordinates & neighbours for " + topElement);
			int[] coordinates = getCoordinates(arr, arr.length, arr[0].length, topElement);
			trackingMatrix[coordinates[0]][coordinates[1]] = true;
			boolean isFirstNeighbourValid = isValid(arr, coordinates[0] + 1, coordinates[1]);
			boolean isSecondNeighbourValid = isValid(arr, coordinates[0], coordinates[1] + 1);
			if (isFirstNeighbourValid) {
				// System.out.println("First neighbour " + arr[coordinates[0] +
				// 1][coordinates[1]]);
				if (!matrixQueue.contains(getValue(arr, coordinates[0] + 1, coordinates[1]))) {
					matrixQueue.offer(getValue(arr, coordinates[0] + 1, coordinates[1]));
				}
			}
			if (isSecondNeighbourValid) {
				// System.out.println("Second neighbour " + arr[coordinates[0]][coordinates[1] +
				// 1]);
				if (!matrixQueue.contains(getValue(arr, coordinates[0], coordinates[1] + 1))) {
					matrixQueue.offer(getValue(arr, coordinates[0], coordinates[1] + 1));
				}
			}

		}
	}

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		trackingMatrix = new boolean[arr.length][arr.length];
		traversalPath = new LinkedList<>();
		// getCoordinates(arr, arr.length, arr[0].length,13);
		// Arrays.stream(arr).map(Arrays::toString).forEach(System.out::println);

		PrintAllDiagonalsQueue printAllDiagonalsQueue = new PrintAllDiagonalsQueue();
		printAllDiagonalsQueue.traverseMatrix(arr, arr[0][0]);

	}

	private static boolean isValid(int arr[][], int rows, int cols) {
		return rows < arr.length && cols < arr[0].length && rows >= 0 && cols >= 0;

	}

	private static int getValue(int[][] arr, int rows, int cols) {
		return arr[rows][cols];
	}

	private static int[] getCoordinates(int[][] arr, int rows, int cols, int element) {
		int i = 0;
		int j = arr[0].length - 1;

		while (i <= arr.length - 1 && j >= 0 && j <= arr[0].length - 1) {
			int startingElement = arr[i][j];
			if (startingElement == element)
				return new int[] { i, j };
			else if (startingElement > element) {
				j--;
			} else {
				if (startingElement < element) {
					i++;
				}
			}
		}
		return null;
	}
}
