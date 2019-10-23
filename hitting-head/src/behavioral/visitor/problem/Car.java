package behavioral.visitor.problem;

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
		for (CarPart carPart : carParts)
			carPart.print();
	}

	public void render() {
		for (CarPart carPart : carParts)
			carPart.render();
	}

	public void upgrade() {
		for (CarPart carPart : carParts)
			carPart.upgrade();
	}
}
