package structural.composite.problem;

public class GraphicalItemExecutor {

	public static void main(String[] args) {

		Circle circle = new Circle();
		GraphicalItemGroup graphicalItemGroup = new GraphicalItemGroup();
		graphicalItemGroup.getCircles().add(circle);
		Line line = new Line();
		graphicalItemGroup.getLines().add(line);
		graphicalItemGroup.draw();
	}
}
