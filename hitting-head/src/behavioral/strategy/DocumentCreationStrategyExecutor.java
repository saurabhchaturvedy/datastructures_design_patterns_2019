package behavioral.strategy;

import java.util.Scanner;

public class DocumentCreationStrategyExecutor {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the type of document you want to create : ");
		String documentType = scanner.nextLine();
		scanner.close();
		createDocument(documentType);
	}

	private static void createDocument(String documentType) {
		// TODO Auto-generated method stub
		DocumentCreationStrategyHandler documentCreationStrategyHandler = new DocumentCreationStrategyHandler();
		documentCreationStrategyHandler.handleStrategy(documentType);
	}
}
