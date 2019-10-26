package structural.proxy.solution;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		ImageProxy image = new ImageProxy("http://www.proxygifs.net");
		ImageProxy image2 = new ImageProxy("http://www.metadata.edu");

		List<structural.proxy.solution.Image> images = new ArrayList<>();
		images.add(image);
		images.add(image2);

		structural.proxy.solution.Application application = new structural.proxy.solution.Application(images);
		System.out.println("Application is starting up...");
		application.draw();
	}
}
