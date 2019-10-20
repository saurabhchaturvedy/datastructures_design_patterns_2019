package level01;

public class LastOccurence {

	public int lastOccurence(int[] arr, int start, int end, int num) {
		int result = -1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == num) {
				result = mid;
				start = mid + 1;
			} else if (arr[mid] > num) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return result;

	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 8, 8, 8, 10, 12 };
		LastOccurence lastOccurence = new LastOccurence();
		int lastOccurence2 = lastOccurence.lastOccurence(arr, 0, arr.length, 8);
		System.out.println("Last occurence is at index " + lastOccurence2);
	}
}
