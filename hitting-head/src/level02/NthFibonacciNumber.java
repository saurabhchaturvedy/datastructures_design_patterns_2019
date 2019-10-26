package level02;

public class NthFibonacciNumber {

	public int getNthFibonacciNumber(int num) {
		if (num <= 1)
			return num;
		return getNthFibonacciNumber(num - 1) + getNthFibonacciNumber(num - 2);

	}

	public int getNthFibonacciNumberNonRecursive(int num) {
		int a = 0;
		int b = 1;
		int c = 0;

		for (int i = 2; i <= num; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}

	public static void main(String[] args) {
		int x = 9;
		NthFibonacciNumber nthFibonacciNumber = new NthFibonacciNumber();
		int nthFibonacciNumber2 = nthFibonacciNumber.getNthFibonacciNumber(x);
		System.out.println("Number is " + nthFibonacciNumber2);
		int nthFibonacciNumberNonRecursive = nthFibonacciNumber.getNthFibonacciNumberNonRecursive(x);
		System.out.println("the num is :" + nthFibonacciNumberNonRecursive);
	}
}
