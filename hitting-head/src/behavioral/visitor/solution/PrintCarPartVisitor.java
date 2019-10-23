package behavioral.visitor.solution;

public class PrintCarPartVisitor implements CarPartVisitor {

	@Override
	public void visit(behavioral.visitor.solution.CarPart carPart) {
		// TODO Auto-generated method stub
		System.out.println("Print " + carPart);
	}


}
