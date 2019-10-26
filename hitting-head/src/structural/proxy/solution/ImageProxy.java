package structural.proxy.solution;

public class ImageProxy extends Image {

	structural.proxy.solution.Image image;

	public ImageProxy(String url) {
		super();
		this.url = url;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		if (image == null) {
			image = new structural.proxy.solution.Image(this.url);
		}
		image.draw();
	}

}
