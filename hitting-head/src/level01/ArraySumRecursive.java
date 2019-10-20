package level01;

public class ArraySumRecursive {

	int arraySum(int[] arr, int n) {
		if (n <= 0)
			return 0;
		return arraySum(arr, n - 1) + arr[n - 1];
	}

	public static void main(String[] args) {
		int[] arr = { 2, 7, 4, 3 };
		ArraySumRecursive arraySumRecursive = new ArraySumRecursive();
		System.out.println("Sum is " + arraySumRecursive.arraySum(arr, arr.length));
	}
}
