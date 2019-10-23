package behavioral.visitor.solution;

public class UpgradeCarPartVisitor implements CarPartVisitor {

	@Override
	public void visit(CarPart carPart) {
		// TODO Auto-generated method stub
		System.out.println("Upgrade " + carPart);
	}

}
