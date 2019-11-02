package behavioral.state.solution;

public class TCPConnection {

	private TCPConnectionState tcpConnectionState = new ClosedTCPConnectionState(this);

	public void open() {
		tcpConnectionState.open();
	}

	public void close() {
		tcpConnectionState.close();
	}

	public void acknowdledge() throws Exception {
		tcpConnectionState.acknowledge();
	}

	public void setTCPConnectionState(TCPConnectionState tcpConnectionState) {
		this.tcpConnectionState = tcpConnectionState;
	}
}
