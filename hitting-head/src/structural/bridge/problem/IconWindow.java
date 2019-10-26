package structural.bridge.problem;

public class IconWindow implements Window {

	@Override
	public void draw(int x, int y, int width, int height, String color) {
		// TODO Auto-generated method stub

	}

	public void drawIcon() {
		draw(3, 5, 2, 4, "Blue");
		draw(4, 5, 2, 4, "Green");
	}
}
