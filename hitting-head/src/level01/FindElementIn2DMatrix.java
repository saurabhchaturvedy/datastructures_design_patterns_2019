package level01;

public class FindElementIn2DMatrix {

	boolean isElementInMatrix(int[][] arr, int num) {
		int row = 0;
		int column = arr[0].length - 1;
		boolean isFound = false;
		while (isFound == false) {
			int key = arr[row][column];
			if (key == num)
				return true;
			else if (key > num) {
				column--;
			} else if (key < num) {
				row++;
			}
			if (row > arr.length - 1 || column < 0)
				return false;
		}
		return false;

	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 6, 7, 8, 9 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 }, { 22, 23, 24, 26 } };
		FindElementIn2DMatrix findElementIn2DMatrix = new FindElementIn2DMatrix();
		boolean elementInMatrix = findElementIn2DMatrix.isElementInMatrix(arr, 83);
		System.out.println("is element present in the matrix ? " + elementInMatrix);
	}
}
