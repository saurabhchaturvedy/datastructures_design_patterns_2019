package level01;

public class CheckArraySorted {

	boolean isArraySorted(int[] arr, int start) {
		if (start == arr.length - 1)
			return true;
		if (arr[start] <= arr[start + 1])
			return isArraySorted(arr, start + 1);
		return false;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 7, 3, 4 };
		CheckArraySorted checkArraySorted = new CheckArraySorted();
		System.out.println("Is following array sorted ? " + checkArraySorted.isArraySorted(arr, 0));
	}
}
