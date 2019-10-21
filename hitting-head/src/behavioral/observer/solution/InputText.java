package behavioral.observer.solution;
public class InputText implements Observer {

	public void setInputText(String text) {
		System.out.println("Input text value >> " + text);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.setInputText("Button has been clicked >> !! ");
	}
}
