import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class MatchServer {
	 public static  void main( String args[] ) {
	 		
	 		
    	 try { 
             LocateRegistry.createRegistry(1099); 
             System.out.println("java RMI registry created.");
         } catch (RemoteException e) {}
    	
         try {
              MatchImpl m1 = new MatchImpl("Manu", "Chelsea");
              Naming.rebind( "toaster",m1 );
         }
         catch( Exception e ) { System.out.println( "Error: " + e ); }
     }
}
