package behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

public class DocumentCreationStrategyHandler {

	ExcelDocCreationStrategy excelDocCreationStrategy = new ExcelDocCreationStrategy();
	PPTCreationStrategy pptCreationStrategy = new PPTCreationStrategy();
	WordDocCreationStrategy wordDocCreationStrategy = new WordDocCreationStrategy();

	public void handleStrategy(String docType) {
		Map<String, DocumentCreationStrategy> strategyMap = new HashMap<>();
		strategyMap.put("Excel", excelDocCreationStrategy);
		strategyMap.put("PPT", pptCreationStrategy);
		strategyMap.put("Word", wordDocCreationStrategy);

		strategyMap.get(docType).createDocument();
	}
}
