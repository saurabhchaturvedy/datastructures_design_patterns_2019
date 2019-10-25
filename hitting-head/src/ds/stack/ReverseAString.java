package ds.stack;

import java.util.Stack;

public class ReverseAString {

	public static void main(String[] args) {
		String str = "Saurabh";
		Stack<Character> charStack = new Stack<>();
		char[] charArray = str.toCharArray();
		for (char c : charArray)
			charStack.push(c);
		for (int i = 0; i < str.length(); i++) {
			charArray[i] = charStack.pop();
		}

		String reverseStr = new String(charArray);
		System.out.println("Reversed String is " + reverseStr);
	}
}
