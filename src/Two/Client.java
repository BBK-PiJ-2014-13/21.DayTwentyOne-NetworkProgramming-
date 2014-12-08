package Two;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
	public void ServerLink() {
		try {
			Registry reg = LocateRegistry.getRegistry("localhost", 37);
			DateService date = (DateService) reg.lookup("echo");
			date.dateAndTime();
		} catch (RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}
}
