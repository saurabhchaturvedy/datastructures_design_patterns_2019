package behavioral.visitor.solution;

import java.util.ArrayList;
import java.util.List;

public class Car {

	private List<CarPart> carParts = new ArrayList<>();

	public List<CarPart> getCarParts() {
		return carParts;
	}

	public void setCarParts(List<CarPart> carParts) {
		this.carParts = carParts;
	}

	public void print() {
		PrintCarPartVisitor printCarPartVisitor = new PrintCarPartVisitor();
		for (CarPart carPart : carParts)
			carPart.acceptCarPartVisitor(printCarPartVisitor);
	}

	public void render() {
		RenderCarPartVisitor renderCarPartVisitor = new RenderCarPartVisitor();
		for (CarPart carPart : carParts)
			carPart.acceptCarPartVisitor(renderCarPartVisitor);
	}

	public void upgrade() {
		UpgradeCarPartVisitor upgradeCarPartVisitor = new UpgradeCarPartVisitor();
		for (CarPart carPart : carParts)
			carPart.acceptCarPartVisitor(upgradeCarPartVisitor);
	}
}
