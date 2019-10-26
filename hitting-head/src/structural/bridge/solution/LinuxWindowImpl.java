package structural.bridge.solution;

public class LinuxWindowImpl extends WindowImpl {

	@Override
	public void draw(int x, int y, int width, int height, String color) {
		// TODO Auto-generated method stub
		System.out.println("Drawing on Linux = " + x + " y =" + y + "width =" + width + " height =" + height
				+ " color =" + color);
	}

}
