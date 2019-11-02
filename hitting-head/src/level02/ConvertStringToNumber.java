package level02;

public class ConvertStringToNumber {

	private int stringToNumber(String str) {
		char[] charArray = str.toCharArray();
		int zeroAscii = (int) '0';
		int sum = 0;
		for (char c : charArray) {
			int numChar = (int) c;
			sum = sum * 10 + (numChar - zeroAscii);

		}
		return sum;
	}

	public static void main(String[] args) {
		String str = "4647";
		ConvertStringToNumber convertStringToNumber = new ConvertStringToNumber();
		System.out.println(convertStringToNumber.stringToNumber(str));
	}
}
