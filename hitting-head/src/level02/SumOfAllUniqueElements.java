package level02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class SumOfAllUniqueElements {

	private int sumOfUniqueElements(int[] arr) {

		Arrays.sort(arr);

		int current = arr[0];
		int sum = arr[0];
		for (int i = 0; i <= arr.length - 1; i++) {
			if (current != arr[i])
				sum += arr[i];
			current = arr[i];
		}
		return sum;
		// TODO Auto-generated method stub

	}

	private int uniqueSum(int[] arr) {
		HashSet<Integer> sum = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (!sum.contains(arr[i]))
				sum.add(arr[i]);
		}
		return sum.stream().collect(Collectors.summingInt(x -> x)).intValue();
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 2, 5 }; // 2235
		SumOfAllUniqueElements sumOfAllUniqueElements = new SumOfAllUniqueElements();
		int sumOfUniqueElements = sumOfAllUniqueElements.sumOfUniqueElements(arr);
		System.out.println("The sum is " + sumOfUniqueElements);
		int uniqueSum = sumOfAllUniqueElements.uniqueSum(arr);
		System.out.println("sum of all unique elements via hash set " + uniqueSum);
	}
}
