import java.rmi.Naming;
import java.util.Scanner;

public class MatchClient {
	public static void main( String args[] ) {
		Scanner sc = new Scanner(System.in);
         //String url =  "rmi:///";
         try {
      String url= "rmi://192.168.24.69/";      // if object located remotely
         Match m= ( Match) Naming.lookup( url + "toaster" );
         int choice = 1;
 		
 		while(choice!=4)
 		{
          System.out.println();
 		 System.out.println("1.Team 1 Score");
 		 System.out.println("2.Team 2 Score");
 		 System.out.println("3.Print_Score");
 		 System.out.println("4.Exit");

 			System.out.print("\nPlease enter a value-->");
 			choice=sc.nextInt();
 		 if(choice==1)
 			{
 				m.team1_goal();
 			}

 			else if(choice==2)
 			{
 				m.team2_goal();

 			}

 			else if(choice==3)
 			{
 				String res=m.read_result();
 				System.out.println(res);
 			}

 		}  // end while
 		}catch(Exception e){ System.out.println("Error "+e);}
 		}
}
