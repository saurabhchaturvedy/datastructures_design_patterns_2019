package structural.flyweight.solution;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {

	private Map<String, Letter> letterMap = new HashMap<>();

	public Letter createLetter(String key) {
		Letter letter = letterMap.get(key);
		if (letter == null) {
			Letter letter2 = new Letter(key);
			letterMap.put(key, letter2);
		}
		return letterMap.get(key);
	}
}
