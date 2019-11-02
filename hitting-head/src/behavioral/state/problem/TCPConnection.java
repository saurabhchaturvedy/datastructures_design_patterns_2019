package behavioral.state.problem;

public class TCPConnection {

	private TCPConnectionState state = TCPConnectionState.CLOSED;

	public void open() {
		if (state == TCPConnectionState.OPEN) {
			System.out.println("Re-initializing the Connection...");
		}
		if (state == TCPConnectionState.CLOSED) {
			state = TCPConnectionState.OPEN;
			System.out.println("Opening the connection");
		}

	}

	public void close() {
		if (state == TCPConnectionState.CLOSED) {
			System.out.println("Connection is already close ...");
		}
		if (state == TCPConnectionState.OPEN) {
			state = TCPConnectionState.CLOSED;
			System.out.println("Closed the connection...");
		}
	}

	public void acknowledge() throws Exception {
		if (state == TCPConnectionState.CLOSED) {
			throw new Exception("ERROR 09XY645 : Can't acknowledge as connection is CLOSED");
		}
		if (state == TCPConnectionState.OPEN) {
			System.out.println("Acknowledged");
		}
	}
}
