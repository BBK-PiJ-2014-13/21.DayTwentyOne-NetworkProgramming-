package One;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
	public void ServerLink() {
		try {
			Registry reg = LocateRegistry.getRegistry("localhost", 1099);
			EchoService echo = (EchoService) reg.lookup("echo");
			echo.echo("string");
		} catch (RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}
}
