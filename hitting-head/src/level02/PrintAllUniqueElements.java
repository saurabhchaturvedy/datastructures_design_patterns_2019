package level02;

public class PrintAllUniqueElements {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 5, 6, 7, 8 };
		int current = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (current != arr[i])
				System.out.println(current + " ");
			current = arr[i];
		}
	}
}
