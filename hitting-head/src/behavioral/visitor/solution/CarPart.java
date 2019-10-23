package behavioral.visitor.solution;

public abstract class CarPart {

	public void acceptCarPartVisitor(CarPartVisitor carPartVisitor) {
		carPartVisitor.visit(this);
	}
}
