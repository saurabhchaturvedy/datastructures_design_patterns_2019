package structural.composite.problem;

import java.util.ArrayList;
import java.util.List;

public class GraphicalItemGroup {

	private List<Line> lines = new ArrayList<>();
	private List<Circle> circles = new ArrayList<>();

	public List<Line> getLines() {
		return lines;
	}

	public List<Circle> getCircles() {
		return circles;
	}

	public void draw() {
		for (Line line : lines)
			line.draw();
		for (Circle circle : circles)
			circle.draw();
	}

}
