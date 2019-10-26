package structural.proxy.problem;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		Image image = new Image("http://www.proxygifs.net");
		Image image2 = new Image("http://www.metadata.edu");

		List<Image> images = new ArrayList<>();
		images.add(image);
		images.add(image2);

		Application application = new Application(images);
		System.out.println("Application is starting up...");
		application.draw();
	}
}
