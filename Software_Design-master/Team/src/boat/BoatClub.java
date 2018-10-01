package boat;
import java.io.Serializable;

public class BoatClub implements Serializable {

	  private int total_boats;
	   private int boats_hired;
	public BoatClub(int i) {
		total_boats=i;
		boats_hired=0;
	}

	public boolean loan() {
		if(boats_hired<total_boats) {
			this.boats_hired+=1;
			return true;
		}
		else {
			return false;
		}
	}

	public boolean bring_back() {
		// TODO Auto-generated method stub
		if(boats_hired!=0 ) {
			this.boats_hired-=1;
			return true;
		}
		else {
			return false;
		}
	}

	public int read_available() {
		// TODO Auto-generated method stub
		return this.total_boats-this.boats_hired;
	}

	public String print_details() {
		// TODO Auto-generated method stub
		return "Total Boats Available: "+read_available()+"\nTotal Boats: "+this.total_boats+"\nBoats Hired: "+this.boats_hired; 
	}

}
