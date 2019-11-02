package behavioral.state.solution;

public class ClosedTCPConnectionState implements TCPConnectionState {

	private TCPConnection connection;

	public ClosedTCPConnectionState(TCPConnection connection) {
		// TODO Auto-generated constructor stub
		this.connection = connection;
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Opening a new connection");
		connection.setTCPConnectionState(new OpenTCPConnectionState(connection));
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Connection is already closed...");
	}

	@Override
	public void acknowledge() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("ERROR 09XY645 : Can't acknowledge as connection is CLOSED");
	}

}
