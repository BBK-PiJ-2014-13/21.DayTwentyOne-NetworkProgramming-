package Two;



import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DateService extends Remote {
	
	public void dateAndTime() throws RemoteException;
}
