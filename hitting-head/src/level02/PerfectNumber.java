package level02;

public class PerfectNumber {

	private boolean isPerfectNumber(int num) {
		int temp = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				temp += i;
			}
		}
		if (temp == num)
			return true;

		return false;

	}

	public static void main(String[] args) {
		int x = 28;
		System.out.println(new PerfectNumber().isPerfectNumber(x));
	}
}
