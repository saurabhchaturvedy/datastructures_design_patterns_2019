package level02;

import java.util.Arrays;

public class SumOfElementsOfArray {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 7, 9, 11 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum is " + sum);
		int sum2 = Arrays.stream(arr).sum();
		System.out.println("the sum is " + sum2);
	}
}
