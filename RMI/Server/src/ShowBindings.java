import java.rmi.Naming;
import java.rmi.RMISecurityManager;

public class ShowBindings {

	public static void main(String[] args) {
		 System.setSecurityManager(new RMISecurityManager());
		 try {
			 String[] b = Naming.list("");
			 System.out.println(b[0]);
		 }catch (Exception e) {
			System.out.println("Error"+e);
		}

	}

}
