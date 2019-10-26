package structural.flyweight.solution;

public class LetterFlyweightExecutor {

	public static void main(String[] args) {
		WordProcessor wordProcessor = new WordProcessor();

		String str = "Hello i'm aaaa wwworddd pprocessorrrr";
		LetterFactory letterFactory = new LetterFactory();
		for (int i = 0; i < str.length(); i++) {
			String letter = str.substring(i, i + 1);
			wordProcessor.addLetter(letterFactory.createLetter(letter));

		}
	}
}
