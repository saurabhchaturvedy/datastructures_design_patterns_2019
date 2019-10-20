package level01;

import java.util.Stack;

public class BalancedParantheses {

	// (){}[]

	boolean isBalancedParantheses(String expression) {
		char[] charArray = expression.toCharArray();
		Stack<Character> charHolder = new Stack<>();
		for (char c : charArray) {
			if (c == '(' || c == '{' || c == '[') {
				charHolder.push(c);
			} else {
				if (c == ')' || c == '}' || c == ']') {
					if (!charHolder.isEmpty() && isAMatchingPair(charHolder.peek().charValue(), c))
						;
					charHolder.pop();
				}
			}
		}
		return charHolder.isEmpty();

	}

	static boolean isAMatchingPair(char char1, char char2) {
		if (char1 == '(' && char2 == ')')
			return true;
		if (char1 == '{' && char2 == '}')
			return true;
		if (char1 == '[' && char2 == ']')
			return true;
		return false;

	}

	public static void main(String[] args) {
		String expression = "[()()][";
		BalancedParantheses balancedParantheses = new BalancedParantheses();
		boolean balancedParantheses2 = balancedParantheses.isBalancedParantheses(expression);
		System.out.println("Given String has balanced paranthesis : " + balancedParantheses2);
	}
}
