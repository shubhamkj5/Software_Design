import java.rmi.Naming;
import java.util.Scanner;

public class CounterClient {
	  public static void main( String args[] ) {
			Scanner sc = new Scanner(System.in);
	         //String url =  "rmi:///";
	         try {
	      String url= "rmi://192.168.23.139/";      // if object located remotely
	         Counter c = ( Counter ) Naming.lookup( url + "toaster" );
	         System.out.println("Counter Application");
	 		System.out.println("===================");
	 		System.out.println("1.Increment");
	 		System.out.println("2.Decrement");
	 		System.out.println("3.Read Value");
	 		System.out.println("4.Reset Counter");
	 		System.out.println("5.Exit");
	 		System.out.print("\nPlease enter a value-->");
	 		int choice=sc.nextInt();

	 		while(choice!=5){
	 			if(choice==1){ c.increment();}
	 			if(choice==2){c.decrement();}
	 			if(choice==3){
	 				int res=c.read_value();
	 				System.out.println("Value = "+res);
	 				}
	 			if(choice==4){c.reset();}
	 			System.out.println("\nCounter Application");
	 			System.out.println("===================");
	 			System.out.println("1.Increment");
	 			System.out.println("2.Decrement");
	 			System.out.println("3.Read Value");
	 			System.out.println("4.Reset Counter");
		 		System.out.println("5.Exit");
	 			System.out.print("\nPlease enter a value-->");
	 			choice=sc.nextInt();
	 			}
	 		}catch(Exception e){ System.out.println("Error "+e);}
	 		}
	    }

