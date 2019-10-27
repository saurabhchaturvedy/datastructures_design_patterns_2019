package behavioral.mediator;

public class ScreenMediatorExecutor {

	public static void main(String[] args) {
		List list = new List();
		InputText inputText = new InputText();

		InputTextMediator screenDirectorOne = new InputTextMediator();
		screenDirectorOne.setInputText(inputText);

		list.getAllItems().add("India");
		list.getAllItems().add("Mexico");
		list.getAllItems().add("Spain");

		list.setScreenDirector(screenDirectorOne);
		list.setItem(1);

		System.out.println("Selected value from the List is : " + inputText.getText());
	}
}
