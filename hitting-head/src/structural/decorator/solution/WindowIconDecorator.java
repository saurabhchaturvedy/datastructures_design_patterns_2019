package structural.decorator.solution;

public class WindowIconDecorator extends WindowDecorator {

	public WindowIconDecorator(Window window) {
		super(window);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing an icon on the window ...");
		window.draw();
	}

}
