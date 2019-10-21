package behavioral.observer.solution;

public class List implements Observer {

	public void setListItem(int item) {
		System.out.println("List item has been set as >> " + item);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.setListItem(5);
	}
}
