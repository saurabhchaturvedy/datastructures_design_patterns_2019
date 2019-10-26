package level02;

import java.util.Arrays;

public class TwoStringsAnagram {

	private boolean areAnagrams(String s1, String s2) {
	    char[] s1Array = s1.toCharArray();
		char[] s2Array = s2.toCharArray();
		Arrays.sort(s1Array);
		Arrays.sort(s2Array);
		return Arrays.equals(s1Array, s2Array);

	}

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "avaj";
		TwoStringsAnagram twoStringsAnagram = new TwoStringsAnagram();
		boolean areAnagrams = twoStringsAnagram.areAnagrams(str1, str2);
		System.out.println("Are both strings anagrams ? " + areAnagrams);
	}
}
