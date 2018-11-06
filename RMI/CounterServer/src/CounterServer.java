import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

public class CounterServer {
	 public static  void main( String args[] ) {
	 		Scanner sc = new Scanner(System.in);
	 		
	    	 try { 
	             LocateRegistry.createRegistry(1099); 
	             System.out.println("java RMI registry created.");
	         } catch (RemoteException e) {}
	    	 
	         try {
	              CounterImpl c1 = new CounterImpl(1);
	              Naming.rebind( "toaster", c1 );
	         }
	         catch( Exception e ) { System.out.println( "Error: " + e ); }
	     }
}
