package level01;

public class ArrayPrintRecursive {

	void printRecursive(int[] arr, int index) {
		if (index != -1) {
			printRecursive(arr, index-1);
			System.out.println(arr[index]);
			
			
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 7, 1 };
		ArrayPrintRecursive arrayPrintRecursive = new ArrayPrintRecursive();
		arrayPrintRecursive.printRecursive(arr, arr.length - 1);
	}
}
