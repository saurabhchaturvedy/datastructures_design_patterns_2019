package behavioral.mediator;

public class ScreenDirectorOne implements ScreenDirector {

	InputText inputText;
	
	public void setInputText(InputText inputText) {
		this.inputText = inputText;
	}

	@Override
	public void setItemSelected(String item) {
		// TODO Auto-generated method stub
		inputText.setText(item);

	}

}
