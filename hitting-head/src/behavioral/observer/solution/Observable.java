package behavioral.observer.solution;

public interface Observable {

	void attachObserver(Observer observer);

	void detachObserver(Observer observer);

	void change();

}
