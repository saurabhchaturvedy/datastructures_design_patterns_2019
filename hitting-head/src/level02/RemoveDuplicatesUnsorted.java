package level02;

public class RemoveDuplicatesUnsorted {

	public static void removeDuplicateUnsorted(int[] arr) {
		int[] temp = new int[arr.length];
		int k = 0;
		boolean found = false;
		for (int i = 0; i <=arr.length-1; i++) {
			if (i == 0) {
				temp[k++] = arr[i];
			} else {
				for (int j = 0; j < k; j++) {
					if (temp[j] == arr[i]) {
						found = true;
					}
				}
				if (!found) {
					temp[k++] = arr[i];
				}
			}
		}
		for (int c = 0; c < k; c++) {
			System.out.println(temp[c]);
		}
	}

	public static void main(String[] args) {
		int[] unsortedArray = { 7,8,3,2,8,5};
		removeDuplicateUnsorted(unsortedArray);
	}
}
