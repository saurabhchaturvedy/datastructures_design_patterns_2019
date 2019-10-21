package behavioral.memento;

public class ConnectionSolverCareTaker {

	private ConnectionSolverMemento connectionSolverMemento;

	public void saveState(ConnectionSolver connectionSolver) {
		connectionSolverMemento = connectionSolver.createMemento();
	}

	public void restoreState(ConnectionSolver connectionSolver) {
		connectionSolver.setMemento(connectionSolverMemento);
	}
}
