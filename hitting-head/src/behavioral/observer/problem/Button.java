package behavioral.observer.problem;

public class Button {

	InputText inputText;
	List list;
	
	

	public void clicked() {
		list.setListItem(5);
		inputText.setInputText("Button has been clicked !!");
	}

	public void setInputText(InputText inputText) {
		this.inputText = inputText;
	}

	public void setList(List list) {
		this.list = list;
	}
}
