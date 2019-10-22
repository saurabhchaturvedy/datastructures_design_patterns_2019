package structural.decorator.solution;

public class WindowScrollbarDecorator extends WindowDecorator {

	public WindowScrollbarDecorator(Window window) {
		super(window);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing scroll-bar on the window...");
		window.draw();
	}

}
