package structural.proxy.problem;

import java.util.ArrayList;
import java.util.List;

public class Application {

	private List<structural.proxy.problem.Image> images = new ArrayList<>();

	public Application(List<structural.proxy.problem.Image> images2) {
		// TODO Auto-generated constructor stub
		super();
		this.images = images2;
	}

	public void draw() {
		for (structural.proxy.problem.Image image : images)
			image.draw();
	}
}
