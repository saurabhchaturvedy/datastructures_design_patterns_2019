package level01;

public class FirstOccurence {

	public int firstOccurence(int[] arr, int start, int end, int num) {
		int result = -1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == num) {
				result = mid;
				end = mid - 1;
			} else if (arr[mid] > num) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return result;

	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 8, 8, 12, 12,12};
		FirstOccurence firstOccurence = new FirstOccurence();
		int firstOccurence2 = firstOccurence.firstOccurence(arr, 0, arr.length-1,12);
		System.out.println("First occurence is at index " + firstOccurence2);
	}
}
