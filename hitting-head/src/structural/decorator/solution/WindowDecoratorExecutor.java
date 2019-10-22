package structural.decorator.solution;

public class WindowDecoratorExecutor {

	public static void main(String[] args) {
		Window window = new Window();
		WindowDecorator windowIconDecorator = new WindowIconDecorator(window);
		WindowDecorator windowScrollbarDecorator = new WindowScrollbarDecorator(windowIconDecorator);
		windowScrollbarDecorator.draw();
	}
}
