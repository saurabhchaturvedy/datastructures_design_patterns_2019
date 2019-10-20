package level01;

public class BinarySearch {

	public static boolean binarySearch(int[] arr, int start, int end, int num) {
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == num)
				return true;
			if (arr[mid] > num) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 2,4,7,9,11};
		boolean binarySearch = binarySearch(arr, 0, arr.length-1,9);
		System.out.println("Element is present in the array " + binarySearch);

	}
}
