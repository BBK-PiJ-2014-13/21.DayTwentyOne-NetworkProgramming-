package Two;



import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class DateServer extends UnicastRemoteObject implements DateService {

	public DateServer() throws RemoteException {
	}
	
	@Override
	public void dateAndTime() {
		Date date = new Date();
		System.out.println("Current date and time is: " + date);
	}
	
}
