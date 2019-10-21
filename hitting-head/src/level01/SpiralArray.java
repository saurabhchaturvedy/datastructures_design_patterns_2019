package level01;

public class SpiralArray {

	void printSpiralArray(int[][] arr, int m, int n) {
		int t = 0;
		int b = m - 1;
		int l = 0;
		int r = n - 1;
		int dir = 0;

		while (t < b && l < r) {
			if (dir == 0) {
				for (int k = l; k <= r; k++) {
					System.out.println(arr[t][k]);
					
				}
				t++;
			} else if (dir == 1) {
				for (int k = t; k <= b; k++) {
					System.out.println(arr[k][r]);
					
				}
				r--;
				
			} else if (dir == 2) {
				for (int k = r; k >= l; k--) {
					System.out.println(arr[b][k]);
					
				}
				b--;
			} else if (dir == 3) {
				for (int k = b; k >= t; k--) {
					System.out.println(arr[k][l]);
				}
				l++;
			}

			dir = (dir + 1) % 4;
		}

	}

	public static void main(String[] args) {
		int[][] arr = { { 2, 4, 6, 8 }, { 5, 9, 12, 16 }, { 2, 11, 5, 9 }, { 3, 2, 1, 8 } };
		SpiralArray spiralArray = new SpiralArray();
		spiralArray.printSpiralArray(arr, arr.length, arr[0].length);
	}
}
