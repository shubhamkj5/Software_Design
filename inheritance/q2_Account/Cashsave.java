package inheritance.q2_Account;

public class Cashsave extends Account {
	private int max;
	public Cashsave(int n, int b, int m) {
		// TODO Auto-generated constructor stub
		super(n,b);
		this.max=m;
	}

	public boolean deposit(int amt) {
		// TODO Auto-generated method stub
		if ((balance+amt)>max) return false;
	    else {   balance +=amt;
	             return true;}
	}
	

}
