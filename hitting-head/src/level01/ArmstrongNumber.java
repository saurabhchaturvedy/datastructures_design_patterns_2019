package level01;

public class ArmstrongNumber {

	boolean isArmstrongNumber(int num) {
		int current = num;
		int rem = 0;
		int sum = 0;
		int length = String.valueOf(num).length();
		while (current > 0) {
			rem = current % 10;
			int powerToTheNumberOfDigits = 1;
			for (int i = 0; i < length; i++) {
				powerToTheNumberOfDigits = powerToTheNumberOfDigits * rem;
			}
			sum += powerToTheNumberOfDigits;
			current /= 10;

		}
		if (sum == num)
			return true;
		return false;

	}

	public static void main(String[] args) {
		int num = 9474;
		ArmstrongNumber armstrongNumber = new ArmstrongNumber();
		boolean armstrongNumber2 = armstrongNumber.isArmstrongNumber(num);
		System.out.println("The number is armstrong ? " + armstrongNumber2);
	}
}
