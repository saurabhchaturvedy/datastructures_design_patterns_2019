package level02;

public class FindReversePairsMergeSort {

	private static int reversePairs = 0;

	private void getPairs(int[] arr, int left, int right) {
		if (left <= right) {
			int mid = left + (right - left) / 2;
			getPairs(arr, left, mid);
			getPairs(arr, mid + 1, right);
			sortAndConquer(arr, left, mid, right);
		}
	}

	private void sortAndConquer(int[] arr, int left, int mid, int right) {
		// TODO Auto-generated method stub
		int n1 = mid - left + 1;
		int n2 = right - mid;

		int[] L = new int[n1];
		int[] R = new int[n2];

		for (int i = 0; i < L.length; i++) {
			L[i] = arr[left + i];
		}
		for (int j = 0; j < R.length; j++) {
			R[j] = arr[mid + 1 + j];
		}

		reversePairs += findReversePairs(L, R);

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < L.length && j < R.length) {
			if (L[i] < R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				if (L[i] > R[j]) {
					arr[k] = R[j];
					j++;
				}
			}
			k++;
		}

		while (i < L.length) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < R.length) {
			arr[k] = R[j];
			j++;
			k++;
		}

	}

	public int findReversePairs(int[] left, int[] right) {
		int left_start = 0;
		int left_end = left.length - 1;
		int right_start = 0;
		int right_end = right.length - 1;
		int i = left_start;
		int j = right_start;

		while (i < left_start && j < right_start) {
			if (left[i] < right[j])
				i++;
			if (right[i] > right[j])
				reversePairs += left_end - i + 1;
		}
		return reversePairs;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 3, 4, 2, 5, 7, 9, 11 };
		FindReversePairsMergeSort findReversePairsMergeSort = new FindReversePairsMergeSort();
		findReversePairsMergeSort.getPairs(arr, 0, arr.length - 1);
		System.out.println("Reverse pairs are " + reversePairs);
	}
}
