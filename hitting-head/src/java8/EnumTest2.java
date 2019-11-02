package java8;

public class EnumTest2 {

	enum Voice {
		HIGH, MEDIUM, LOW
	}

	public static void main(String[] args) {
		EnumTest2.Voice enDepartment = Voice.HIGH;
		System.out.println(enDepartment);
		for (Voice v : Voice.values()) {
			System.out.println("Enum value " + v + " Enum position " + v.ordinal());
		}
	}
}
