package behavioral.state.solution;

public class TCPConnectionStateExecutor {

	public static void main(String[] args) throws Exception {
		TCPConnection tcpConnection = new TCPConnection();
		tcpConnection.open();
		tcpConnection.open();
		tcpConnection.close();
		tcpConnection.open();
		tcpConnection.close();
		tcpConnection.close();
		tcpConnection.open();
		tcpConnection.acknowdledge();
		tcpConnection.close();
		tcpConnection.acknowdledge();
	}
}
