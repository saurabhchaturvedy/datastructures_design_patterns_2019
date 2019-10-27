package level02;

public class FindReversePairsNaive {

	public static void main(String[] args) {
		int arr[] = { 10, 3, 4, 2, 5, 7, 9, 11 }; // 1,2,3,4,5
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] > arr[j]) && i < j)
					count++;
			}
		}
		System.out.println("no of reverse pairs are " + count);
	}
}
