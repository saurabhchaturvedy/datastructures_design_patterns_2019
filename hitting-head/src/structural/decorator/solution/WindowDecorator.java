package structural.decorator.solution;

public class WindowDecorator extends Window {

	Window window;

	public WindowDecorator(Window window) {
		// TODO Auto-generated constructor stub
		this.window = window;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing window ...");
		window.draw();
	}
}
