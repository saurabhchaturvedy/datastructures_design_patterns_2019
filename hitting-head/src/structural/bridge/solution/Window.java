package structural.bridge.solution;

public class Window {

	WindowImpl window;

	public void draw(int x, int y, int width, int height, String color) {
		window.draw(x, y, width, height, color);
	}

	public void setWindowType(WindowImpl window) {
		this.window = window;
	}
}
