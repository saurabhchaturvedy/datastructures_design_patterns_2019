package structural.proxy.solution;

import java.util.ArrayList;
import java.util.List;

public class Application {

	private List<Image> images = new ArrayList<Image>();

	public Application(List<Image> images) {
		super();
		this.images = images;
	}

	public void draw() {
		for (Image image : images)
			image.draw();
	}
}
