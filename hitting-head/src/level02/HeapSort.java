package level02;

import java.util.Arrays;

public class HeapSort {

	public void heapSort(int[] arr) {
		int length = arr.length;
		for (int i = length / 2 - 1; i >= 0; i--) {
			heapify(arr, length, i);
		}

		for (int i = length - 1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);
		}
	}

	private void heapify(int[] arr, int length, int i) {
		// TODO Auto-generated method stub
		int largest = i;
		int leftNodeIndex = 2 * i + 1;
		int rightNodeIndex = 2 * i + 2;

		if (leftNodeIndex < length && arr[leftNodeIndex] > arr[largest]) {
			largest = leftNodeIndex;
		}
		if (rightNodeIndex < length && arr[rightNodeIndex] > arr[largest]) {
			largest = rightNodeIndex;
		}

		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			heapify(arr, length, largest);
		}

	}

	public static void main(String[] args) {
		int[] arr = { 9, 10, 5, 3, 1, 2, 6 };
		HeapSort heapSort = new HeapSort();
		heapSort.heapSort(arr);
		System.out.println("Elements after heap sort : ");
		System.out.println();
		Arrays.stream(arr).boxed().map(x -> x + " ").forEach(System.out::print);
	}
}
