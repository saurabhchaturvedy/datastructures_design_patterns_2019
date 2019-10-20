package level01;

public class BubbleSort {

	public static int[] bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 7, 4, 1, 5, 3 };
		int[] bubbleSort = bubbleSort(arr);
		for (int x : bubbleSort) {
			System.out.println(x);
		}
	}
}
