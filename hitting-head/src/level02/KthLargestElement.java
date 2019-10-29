package level02;

public class KthLargestElement {

	public void quickSort(int[] arr, int start, int end) {
		if (start < end) {
			int partition = partition(arr, start, end);
			quickSort(arr, start, partition - 1);
			quickSort(arr, partition + 1, end);
		}
	}

	private int partition(int[] arr, int start, int end) {
		// TODO Auto-generated method stub

		int pivot = arr[end];
		int pIndex = start;

		for (int i = start; i < end; i++) {
			if (arr[i] < pivot)
				swap(arr, i, pIndex);
			pIndex++;
		}
		swap(arr, pIndex, end);
		return pIndex;

	}

	private void swap(int[] arr, int i, int pIndex) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[pIndex];
		arr[pIndex] = temp;
	}
	
	void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(" " + arr[i]);
	}

	public static void main(String[] args) {
		int[] arr = { 7, 2, 3, 9, 6, 5 };
		KthLargestElement kthLargestElement = new KthLargestElement();
		kthLargestElement.quickSort(arr, 0, arr.length - 1);
		kthLargestElement.printArray(arr);
		//Arrays.stream(arr).forEach(System.out::print);
	}
}
