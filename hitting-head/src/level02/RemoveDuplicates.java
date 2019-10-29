package level02;

public class RemoveDuplicates {
	public static int removeDuplicates(int[] arr) {
		int i = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != arr[i]) {
				i++;
				arr[i] = arr[j];
			}
		}
		return i + 1;

	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 4, 6, 7, 8 };
		int removeDuplicates = removeDuplicates(arr);
		for (int i = 0; i < removeDuplicates; i++) {
			System.out.println(arr[i]);
		}
	}
}