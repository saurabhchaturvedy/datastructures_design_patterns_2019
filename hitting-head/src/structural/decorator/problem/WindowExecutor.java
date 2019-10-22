package structural.decorator.problem;

public class WindowExecutor {

	public static void main(String[] args) {
		IconWindow iconWindow = new IconWindow();
		iconWindow.draw("docker-icon");
		ScrollbarWindow scrollbarWindow = new ScrollbarWindow();
		scrollbarWindow.draw("horizontal-scroll-bar");
		IconScrollbarWindow iconScrollbarWindow = new IconScrollbarWindow();
		iconScrollbarWindow.draw("docker-icon AND horizontal-scroll-bar");
	}
}
