package structural.composite.solution;

public class GraphicalCompositionExecutor {

	public static void main(String[] args) {

		GraphicalItemGroup graphicalItemGroup = new GraphicalItemGroup();

		Circle circle = new Circle();
		Line line = new Line();

		graphicalItemGroup.getGraphics().add(circle);
		graphicalItemGroup.getGraphics().add(line);

		graphicalItemGroup.draw();
		System.out.println();

		Line line2 = new Line();
		GraphicalItemGroup graphicalItemGroup2 = new GraphicalItemGroup();
		graphicalItemGroup2.getGraphics().add(graphicalItemGroup);
		graphicalItemGroup2.getGraphics().add(line2);
		graphicalItemGroup2.draw();

		line2.draw();
	}
}
