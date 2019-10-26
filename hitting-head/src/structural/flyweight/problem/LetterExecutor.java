package structural.flyweight.problem;

public class LetterExecutor {

	public static void main(String[] args) {
		WordProcessor wordProcessor = new WordProcessor();

		String str = "I am living in a city called pune";
		for (int i = 0; i < str.length(); i++) {
			String letter = str.substring(i, i + 1);
			wordProcessor.addLetter(new Letter(letter));
		}

		wordProcessor.printLetters();
	}
}
