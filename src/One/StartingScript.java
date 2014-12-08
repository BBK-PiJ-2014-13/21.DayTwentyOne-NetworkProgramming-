package One;

public class StartingScript {
	public static void main(String[] args) {
		Server server = new Server();
		Client client = new Client();
		
		server.registerServer();
		client.ServerLink();
	}
}
