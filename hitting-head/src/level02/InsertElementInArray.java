package level02;

import java.util.Scanner;

public class InsertElementInArray {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 7, 9 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the element you want to insert");
		int element = scanner.nextInt();
		System.out.println("Enter the position at which you want the element");
		int position = scanner.nextInt();
		for (int i = arr.length - 1; i >= position - 1; i--) {
			arr[i] = arr[i - 1];
		}
		arr[position - 1] = element;
		for (int x : arr) {
			System.out.println(x);
		}
	}

}
