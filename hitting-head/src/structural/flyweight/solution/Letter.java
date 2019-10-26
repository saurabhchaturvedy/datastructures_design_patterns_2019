package structural.flyweight.solution;

public class Letter {

	private String letter;

	public Letter(String letter) {
		super();
		System.out.println("Letter created with the value : " + letter);
		this.letter = letter;
	}

	public String getValue() {
		return letter;
	}
}
