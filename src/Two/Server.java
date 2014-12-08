package Two;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Server {
	public void registerServer() {
		try {
			Registry reg = LocateRegistry.createRegistry(37);
			reg.rebind("echo", new DateServer());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
