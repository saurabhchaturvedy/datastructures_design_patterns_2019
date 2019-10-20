package level01;

public class Factorial {

	public static int factorial(int x) {
		if (x == 0)
			return 1;
		return x * factorial(x - 1);
	}

	public static void main(String[] args) {
		int x = 5;
		int factorial = factorial(x);
		System.out.println(factorial);
	}
}
