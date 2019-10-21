package behavioral.memento;

import java.awt.geom.Point2D;

public class ConnectionSolver {

	private Point2D firstPoint;
	private Point2D secondPoint;

	void connectLine() {
		System.out.println("Conneccting between points => " + firstPoint + " and " + secondPoint);
	}

	public void setFirstPoint(Point2D firstPoint) {
		this.firstPoint = firstPoint;
	}

	public void setSecondPoint(Point2D secondPoint) {
		this.secondPoint = secondPoint;
	}

	public ConnectionSolverMemento createMemento() {
		// TODO Auto-generated method stub
		return new ConnectionSolverMemento(firstPoint, secondPoint);
	}

	public void setMemento(ConnectionSolverMemento connectionSolverMemento) {
		this.firstPoint = connectionSolverMemento.getFirstPoint();
		this.secondPoint = connectionSolverMemento.getSecondPoint();
	}

}
