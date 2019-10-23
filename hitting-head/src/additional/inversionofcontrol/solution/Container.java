package additional.inversionofcontrol.solution;

import additional.inversionofcontrol.solution.ImageService;

public class Container {

	ImageService imageService;

	public void init() {
		imageService = new ImageService();
		imageService.setFileSystem(new WindowsFileSystem());
	}

	public ImageService getImageService() {
		return imageService;
	}

	public static void main(String[] args) {
		Container container = new Container();
		container.init();
		ImageService imageService = container.getImageService();
		String readImage = imageService.readImage();
		System.out.println(readImage);
	}

}
