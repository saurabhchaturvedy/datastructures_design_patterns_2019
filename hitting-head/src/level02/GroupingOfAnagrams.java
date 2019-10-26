package level02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GroupingOfAnagrams {

	public Map<String, List<String>> groupAnagrams(String[] arr) {
		Map<String, List<String>> anagramMap = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			String str = arr[i];
			char[] charArray = str.toCharArray();
			Arrays.sort(charArray);
			String charKey = String.valueOf(charArray);
			if (anagramMap.containsKey(charKey)) {
				List<String> list = anagramMap.get(charKey);
				list.add(str);
			} else {
				List<String> list = new ArrayList<>();
				list.add(str);
				anagramMap.put(charKey, list);
			}
		}
		return anagramMap;
	}

	public void printAnagrams(Map<String, List<String>> anagramMap) {
		Set<Entry<String, List<String>>> entrySet = anagramMap.entrySet();
		Iterator<Entry<String, List<String>>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Entry<String, List<String>> next = iterator.next();
			System.out.println(next.getValue().toString());
		}
	}

	public static void main(String[] args) {
		String[] input = new String[] { "rat", "art", "cat", "act", "dog", "god", "tar", "pat" };
		GroupingOfAnagrams groupingOfAnagrams = new GroupingOfAnagrams();
		Map<String, List<String>> groupAnagrams = groupingOfAnagrams.groupAnagrams(input);
		groupingOfAnagrams.printAnagrams(groupAnagrams);
	}
}
