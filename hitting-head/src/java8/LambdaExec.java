package java8;

public class LambdaExec {

	public static void main(String[] args) {
		Testable testable = () -> System.out.println("test");
		testable.testIt();
	}
}
