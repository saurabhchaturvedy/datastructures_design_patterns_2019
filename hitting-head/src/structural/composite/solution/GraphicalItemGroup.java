package structural.composite.solution;

import java.util.ArrayList;
import java.util.List;

public class GraphicalItemGroup implements Graphic {

	private List<Graphic> graphics = new ArrayList<>();

	public List<Graphic> getGraphics() {
		return graphics;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for (Graphic graphic : graphics)
			graphic.draw();

	}

}
