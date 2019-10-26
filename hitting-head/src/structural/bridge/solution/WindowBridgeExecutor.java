package structural.bridge.solution;

public class WindowBridgeExecutor {

	public static void main(String[] args) {
		IconWindow iconWindow = new IconWindow();
		iconWindow.setWindowType(new LinuxWindowImpl());
		iconWindow.drawGraphics();
	}
}
