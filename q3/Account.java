package q3;

public class Account {
	
	private String name;
	private int number;
	private int transactions;
	Money balance;
	public Account(String name, int number) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.number=number;
		balance=new Money(0,0);
		transactions=0;
	}

	public String read_bal() {
		// TODO Auto-generated method stub
		return balance.read_value();
	}

	public int read_transactions() {
		// TODO Auto-generated method stub
		return this.transactions;
	}

	public void deposit(int e1, int c1) {
		// TODO Auto-generated method stub
		balance.add(e1, c1);
		this.transactions++;
	}

	public boolean withdraw(int e1, int c1) {
		// TODO Auto-generated method stub
		
		int b = c1 + (e1 *100);
		if(balance.total_in_cent( )>=b) {
		this.transactions++;
		}
		return balance.sub(e1, c1);
		
		
	}

}
