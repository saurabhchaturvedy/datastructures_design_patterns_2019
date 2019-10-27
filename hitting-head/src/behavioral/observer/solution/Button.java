package behavioral.observer.solution;

import java.util.ArrayList;
import java.util.List;

public class Button implements Observable {

	List<Observer> listOfObservers = new ArrayList<>();

	public void clicked() {
		change();
	}

	@Override
	public void attachObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.listOfObservers.add(observer);

	}

	@Override
	public void detachObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.listOfObservers.remove(observer);

	}

	@Override
	public void change() {
		// TODO Auto-generated method stub
		for (Observer observer : listOfObservers) {
			observer.update();
		}

	}
}
