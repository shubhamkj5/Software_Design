import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Match extends Remote {
	public void team1_goal() throws RemoteException;
	

	public void team2_goal() throws RemoteException;
	


	public String read_result() throws RemoteException;
	
}
