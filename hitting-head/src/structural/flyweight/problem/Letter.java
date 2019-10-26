package structural.flyweight.problem;

public class Letter {

	private String letter;

	public Letter(String letter) {
		super();
		System.out.println("New letter created with the value : " + letter);
		this.letter = letter;
	}

	public String getValue() {
		return letter;
	}

}
