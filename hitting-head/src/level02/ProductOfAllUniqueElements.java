package level02;

import java.util.HashSet;
import java.util.Set;

public class ProductOfAllUniqueElements {

	private int uniqueElementProduct(int[] arr) {

		int sum = arr[0];
		int current = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (current != arr[i]) {
				sum *= arr[i];
			}
			current = arr[i];
		}

		return sum;

	}

	private int uniqueProduct(int[] arr) {
		Set<Integer> prodSet = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (!prodSet.contains(arr[i]))
				prodSet.add(arr[i]);
		}

		return prodSet.stream().reduce(1, (a, b) -> (a * b));

	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 6, 7, 7, 8 };
		ProductOfAllUniqueElements productOfAllUniqueElements = new ProductOfAllUniqueElements();
		int uniqueElementProduct = productOfAllUniqueElements.uniqueElementProduct(arr);
		System.out.println("Product is " + uniqueElementProduct);
		int uniqueProduct = productOfAllUniqueElements.uniqueProduct(arr);
		System.out.println("Product using hash set is = " + uniqueProduct);
	}
}
