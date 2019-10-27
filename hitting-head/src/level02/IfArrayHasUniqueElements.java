package level02;

import java.util.HashSet;
import java.util.Set;

public class IfArrayHasUniqueElements {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 6, 7, 8 };
		Set<Integer> intSet = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			intSet.add(arr[i]);
		}

		if (intSet.size() == arr.length)
			System.out.println("elements are unique");
		else
			System.out.println("elemnts are not unique");
	}
}
