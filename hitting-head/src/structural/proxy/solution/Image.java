package structural.proxy.solution;

public class Image {

	protected String url;

	public Image() {
		// TODO Auto-generated constructor stub
	}

	public Image(String url) {
		super();
		System.out.println("Loading the image...");
		this.url = url;
	}

	public void draw() {
		System.out.println("Image was downloaded from the URL =" + url);
	}

}
