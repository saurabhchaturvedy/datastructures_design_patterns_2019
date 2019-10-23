package additional.inversionofcontrol.problem;

public class ImageService {

	private FileSystem unixFileSystem = new UnixFileSystem();

	String readImage() {
		return unixFileSystem.readFile();
	}

	public static void main(String[] args) {
		ImageService imageService = new ImageService();
		System.out.println(imageService.readImage());
	}
}
