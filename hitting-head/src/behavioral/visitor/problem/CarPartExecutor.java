package behavioral.visitor.problem;

public class CarPartExecutor {

	public static void main(String[] args) {

		Car car = new Car();

		car.getCarParts().add(new Wheels());
		car.getCarParts().add(new Wheels());
		car.getCarParts().add(new Wheels());
		car.getCarParts().add(new Wheels());

		car.getCarParts().add(new Light());
		car.getCarParts().add(new Light());

		car.getCarParts().add(new Engine());

		car.render();
		car.print();
		car.upgrade();
	}
}
