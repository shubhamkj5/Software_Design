import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CounterImpl extends UnicastRemoteObject
implements Counter  {
	 public int value=0;
	protected CounterImpl(int v) throws RemoteException {
		this.value=v;
		
	}

	@Override
	public void increment() throws RemoteException {
		// TODO Auto-generated method stub
		this.value++;
	}

	@Override
	public void decrement() throws RemoteException {
		// TODO Auto-generated method stub
		this.value--;
	}

	@Override
	public int read_value() throws RemoteException {
		// TODO Auto-generated method stub
		return this.value;
	}

	@Override
	public void reset() throws RemoteException {
		// TODO Auto-generated method stub
		this.value=0;
	}

}
