package structural.adapter;

public class AdapterExecutor {

	public static void main(String[] args) {
		LegacyRectangle legacyRectangle = new LegacyRectangle();
		LegacyRectangleAdapter legacyRectangleAdapter = new LegacyRectangleAdapter(legacyRectangle);
		int calculateSize = legacyRectangleAdapter.calculateSize();
		System.out.println("The rectangle size is : " + calculateSize);

	}

	public int getRectangleSize(NewRectangle newRectangle) {
		return newRectangle.calculateSize();
	}
}
