package level02;

public class TwoSmallestElements {

	public static void main(String[] args) {
		int[] arr = { 2, 6, 3, 8, 5 };
		int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
		for (int i = 0; i <arr.length ; i++) {
            int current = arr[i];
            if(first>current){
                second = first;
                first = current;
            }else if(second>current){
                second = current;
            }
        }

		System.out.println("min is " + first + " " + second);
	}
}
