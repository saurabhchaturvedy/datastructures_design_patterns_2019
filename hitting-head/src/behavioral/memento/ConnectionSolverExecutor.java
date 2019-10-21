package behavioral.memento;

import java.awt.geom.Point2D;

public class ConnectionSolverExecutor {

	public static void main(String[] args) {
		ConnectionSolver connectionSolver = new ConnectionSolver();
		ConnectionSolverCareTaker connectionSolverCareTaker = new ConnectionSolverCareTaker();
		connectionSolver.setFirstPoint(new Point2D.Double(1.0, 1.0));
		connectionSolver.setSecondPoint(new Point2D.Double(5.0, 1.0));
		connectionSolverCareTaker.saveState(connectionSolver);
		connectionSolver.connectLine();
		connectionSolver.setFirstPoint(new Point2D.Double(3.0, 9.0));
		connectionSolver.setSecondPoint(new Point2D.Double(15.0, 12.0));
		connectionSolver.connectLine();
		ConnectionSolver newConnectionSolver = new ConnectionSolver();
		connectionSolverCareTaker.restoreState(newConnectionSolver);
		newConnectionSolver.connectLine();
		connectionSolverCareTaker.restoreState(connectionSolver);
		newConnectionSolver.connectLine();

	}
}
