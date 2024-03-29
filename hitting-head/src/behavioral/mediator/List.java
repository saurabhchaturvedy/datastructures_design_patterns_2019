package behavioral.mediator;

import java.util.ArrayList;

public class List {

	private java.util.List<String> itemList = new ArrayList<>();

	ScreenMediator screenDirector;

	public void setItem(int itemNumber) {
		String text = itemList.get(itemNumber);
		screenDirector.setItemSelected(text);
	}

	public java.util.List<String> getAllItems() {
		return itemList;
	}

	public void setScreenDirector(ScreenMediator screenDirector) {
		this.screenDirector = screenDirector;
	}
}
