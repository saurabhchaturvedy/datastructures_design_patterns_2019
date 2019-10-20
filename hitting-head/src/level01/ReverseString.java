package level01;

public class ReverseString {

	String reverseString(String str) {
		char[] charArray = str.toCharArray();
		int i = 0;
		int j = charArray.length - 1;
		while (i < j) {
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
			i++;
			j--;
		}
		return new String(charArray);
	}

	String reverseStringRecursion(String str) {
		if (str.length() == 1 || str == null || str.isEmpty())
			return str;
		return reverseStringRecursion(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		String exp = "winter";
		ReverseString reverseString = new ReverseString();
		String reverseString2 = reverseString.reverseString(exp);
		String reverseStringRecursion = reverseString.reverseStringRecursion(reverseString2);
		System.out.println("Reversed string is : " + reverseString2);
		System.out.println("Reversed string using recursion is : " + reverseStringRecursion);
	}
}
