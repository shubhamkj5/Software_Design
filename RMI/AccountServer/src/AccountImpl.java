import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AccountImpl extends UnicastRemoteObject implements Account {
	 private String name;
		private int number;
		private int transactions;
		private int balance;
	protected AccountImpl(String n,int no) throws RemoteException {
		  name=n;
		    number=no;    transactions=0;
		    balance=0;
	}

	@Override
	public String read_bal() throws RemoteException {
		// TODO Auto-generated method stub
		return ""+balance;
	}

	@Override
	public String read_name() throws RemoteException {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int read_number() throws RemoteException {
		// TODO Auto-generated method stub
		return number;
	}

	@Override
	public int read_transactions() throws RemoteException {
		// TODO Auto-generated method stub
		return transactions;
	}

	@Override
	public void deposit(int a) throws RemoteException {
		 transactions++;
			balance+=a;
	}

	@Override
	public boolean withdraw(int a) throws RemoteException {
		// TODO Auto-generated method stub
		 transactions++;
			balance-=a;
			return  true;
	}

}
