package inheritance.q3_outing;

public class RestrictedOuting extends Outing {
	private int max;
	public RestrictedOuting(int c, int m) {
		// TODO Auto-generated constructor stub
		super(c);
		this.max=m;
	}

	public int readCount() {
		// TODO Auto-generated method stub
		return count;
	}

	public boolean add() {
		// TODO Auto-generated method stub
		if (count<max){
			this.count++;
			return true;}
		  else
		    return false;
	}
	public String print_details()
	{
		return "Outing Details:\n Number on Outing: "+count+"\n"+"Available Places: "+(max-count)+"\n"; 
		
		
	}
}
