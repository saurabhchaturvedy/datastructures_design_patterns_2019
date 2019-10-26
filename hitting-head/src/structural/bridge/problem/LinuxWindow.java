package structural.bridge.problem;

public class LinuxWindow implements Window {

	@Override
	public void draw(int x, int y, int width, int height, String color) {
		// TODO Auto-generated method stub
		System.out.println("Drawing on Linux x = " + x + " y =" + y + "width =" + width + " height =" + height
				+ " color =" + color);
	}

}
