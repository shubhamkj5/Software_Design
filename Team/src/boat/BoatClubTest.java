package boat;
//package Ex16;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BoatClubTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BoatClub  b = new   BoatClub(10);
                Scanner sc = new Scanner(System.in);

		try{
			ObjectInputStream in=new ObjectInputStream(
			new FileInputStream("test.dat"));
			b=(BoatClub)in.readObject();
			in.close();}
		catch(Exception e){}


		int choice = 1;

		while(choice!=5)
		{
         System.out.println();
		 System.out.println("1.Hire Boat");
		 System.out.println("2.Return Boat");
		 System.out.println("3.Check Number of boats available");
		 System.out.println("4.Print Details");
		 System.out.println("5.Exit");



		 System.out.print("Please enter a value-->");
			choice =sc.nextInt();
			if(choice==1)
			{
				boolean res= b.loan();
				if (res==false) System.out.println("Sorry - No boats Available");

			}

			else if(choice==2)
			{
				boolean res= b.bring_back();
				if (res==false) System.out.println("Sorry - No boats Hired");

			}

			else if(choice==3)
			{
				int res= b.read_available();
				System.out.println("No of boats available "+ res);
			}

			else if(choice==4)
			{
				
				System.out.println(b.print_details());
			}



		}  // end while


			try{
				ObjectOutputStream out=new ObjectOutputStream(
					  new FileOutputStream("test.dat"));
				out.writeObject(b);
			    out.close();}
			catch(Exception e){}
	}

	}


