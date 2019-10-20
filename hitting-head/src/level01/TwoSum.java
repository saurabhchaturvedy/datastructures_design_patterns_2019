package level01;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] twoSum(int[] arr, int targetSum) {
		int[] holderArray = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(targetSum - arr[i])) {
				map.put(arr[i], i);
			} else {
				holderArray[1] = i;
				holderArray[0] = map.get(targetSum - arr[i]);

			}
		}
		return holderArray;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 11, 5, 10, 7, 8 };
		int[] twoSum = twoSum(arr, 9);
		System.out.println("Two sum indexes are " + twoSum[0] + " and " + twoSum[1]);
	}
}
