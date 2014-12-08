package One;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Server {
	public void registerServer() {
		try {
			Registry reg = LocateRegistry.createRegistry(1099);
			reg.rebind("echo", new EchoServer());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
