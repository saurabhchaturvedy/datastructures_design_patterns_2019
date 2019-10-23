package behavioral.visitor.solution;

public class RenderCarPartVisitor implements CarPartVisitor {

	@Override
	public void visit(CarPart carPart) {
		// TODO Auto-generated method stub
		System.out.println("Render " + carPart);
	}

}
