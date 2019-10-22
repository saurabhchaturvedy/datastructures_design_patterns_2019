package structural.adapter;

public class LegacyRectangleAdapter extends NewRectangle {

	LegacyRectangle legacyRectangle;

	public LegacyRectangleAdapter(LegacyRectangle legacyRectangle) {
		// TODO Auto-generated constructor stub
		this.legacyRectangle = legacyRectangle;
	}

	@Override
	public int calculateSize() {
		// TODO Auto-generated method stub
		return legacyRectangle.determineSize();
	}

}
