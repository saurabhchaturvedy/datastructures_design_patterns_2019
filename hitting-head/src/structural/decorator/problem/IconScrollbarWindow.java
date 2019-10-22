package structural.decorator.problem;

public class IconScrollbarWindow extends Window {

	@Override
	public void draw(String windowItem) {
		// TODO Auto-generated method stub
		System.out.println("Icon is getting added ...");
		System.out.println("adding scroll-bar to the screen ...");
		super.draw(windowItem);
	}

}
