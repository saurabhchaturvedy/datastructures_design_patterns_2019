package level02;

public class PeakElement {

	private int peakElementBinarySearch(int[] arr) {
		int n = arr.length;
		int start = 0;
		int end = n - 1;
		while (start < end) {
			int mid = (start + end) / 2;

			if (((mid == 0) || (arr[mid - 1] < arr[mid])) && (((mid == n - 1) || arr[mid + 1] < arr[mid]))) {
				return arr[mid];
			} else if (arr[mid - 1] > arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 7, 5 };
		PeakElement peakElement = new PeakElement();
		int peak = peakElement.peakElementBinarySearch(arr);
		System.out.println("peak element is " + peak);

//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
//				System.out.println("peak element is " + arr[i]);
//			}
//		}
	}
}
