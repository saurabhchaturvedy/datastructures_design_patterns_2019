package level02;

public class LongestCommonStringPrefix {

	public String longestCommonPrefix(String[] str) {
		int index = 0;
		String longestCommonPrefix = "";
		for (char c : str[0].toCharArray()) {
			for (int i = 1; i < str.length; i++) {
				if (index > str[i].length() || c != str[i].charAt(index))
					return longestCommonPrefix;
			}
			longestCommonPrefix += c;
			index++;
		}
		return longestCommonPrefix;
	}

	public static void main(String[] args) {
		String[] str = { "Rajaaaama", "Rajaaaamahal", "Rajaaaamata" };
		LongestCommonStringPrefix longestCommonStringPrefix = new LongestCommonStringPrefix();
		String longestCommonPrefix = longestCommonStringPrefix.longestCommonPrefix(str);
		System.out.println("longest common prefix is " + longestCommonPrefix);
	}
}