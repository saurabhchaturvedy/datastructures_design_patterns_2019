package level01;

import java.util.Arrays;

public class SeparateZeroAndOnes {

	public int[] separate0and1(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			if (arr[start] == 1)
				start++;
			else if (arr[end] == 0)
				end--;
			else {
				arr[start] = 1;
				arr[end] = 0;
				start++;
				end--;
			}
		}
		return arr;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1 };
		SeparateZeroAndOnes separateZeroAndOnes = new SeparateZeroAndOnes();
		int[] separate0and1 = separateZeroAndOnes.separate0and1(arr);
		Arrays.stream(separate0and1).forEach(System.out::println);
	}
}
