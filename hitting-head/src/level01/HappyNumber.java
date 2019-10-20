package level01;

import java.util.HashSet;

public class HappyNumber {

	boolean isHappyNumber(int num) {
		HashSet<Integer> numHolder = new HashSet<>();
		while (num != 1) {
			int current = num;
			int rem = 0;
			int sum = 0;
			while (current > 0) {
				rem = current % 10;
				sum = sum + rem * rem;
				current = current / 10;
			}

			if (numHolder.contains(sum))
				return false;
			numHolder.add(sum);
			num = sum;
		}
		return true;

	}

	public static void main(String[] args) {
		int num = 11;
		HappyNumber happyNumber = new HappyNumber();
		boolean happyNumber2 = happyNumber.isHappyNumber(num);
		System.out.println("The number is happy : " + happyNumber2);
	}
}
