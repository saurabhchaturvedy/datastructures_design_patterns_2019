package behavioral.state.solution;

public class OpenTCPConnectionState implements TCPConnectionState {

	private TCPConnection connection;

	public OpenTCPConnectionState(TCPConnection connection) {
		// TODO Auto-generated constructor stub
		this.connection = connection;
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
     System.out.println("Re-initializing the Connection...");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		connection.setTCPConnectionState(new ClosedTCPConnectionState(connection));
		System.out.println("Closed the connection...");

	}

	@Override
	public void acknowledge() throws Exception {
		// TODO Auto-generated method stub
      System.out.println("acknowledged");
	}

}
