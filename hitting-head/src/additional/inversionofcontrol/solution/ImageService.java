package additional.inversionofcontrol.solution;

public class ImageService {

	private FileSystem fileSystem;

	public String readImage() {
		return fileSystem.readFile();
	}

	public void setFileSystem(FileSystem fileSystem) {
		this.fileSystem = fileSystem;
	}
}
