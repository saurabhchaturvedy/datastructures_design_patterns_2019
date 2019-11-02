package behavioral.state.problem;

public class TCPConnectionExecutor {
	
	public static void main(String[] args) throws Exception {
		TCPConnection tcpConnection = new TCPConnection();
		tcpConnection.open();
		tcpConnection.open();
		tcpConnection.close();
		tcpConnection.open();
		tcpConnection.close();
		tcpConnection.close();
		tcpConnection.open();
		tcpConnection.acknowledge();
		tcpConnection.close();
		tcpConnection.acknowledge();
	}

}
