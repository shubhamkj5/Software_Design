import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

public class AccountServer {
	 public static  void main( String args[] ) {
	 		
	 		
	    	 try { 
	             LocateRegistry.createRegistry(1099); 
	             System.out.println("java RMI registry created.");
	         } catch (RemoteException e) {}
	    	
	         try {
	              AccountImpl a1 = new AccountImpl("J.Smith",23456);
	              Naming.rebind( "toaster",a1 );
	         }
	         catch( Exception e ) { System.out.println( "Error: " + e ); }
	     }
}
