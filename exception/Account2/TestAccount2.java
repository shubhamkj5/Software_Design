package exception.Account2;
class Account{
	public int balance=0;
      public Account(int b){balance = b;}
	public void deposit(int amt){
		this.balance += amt;
	}
	public int  withdraw(int amt){
		int resultCode=0;
		if (amt>100)             { resultCode=1;  }
		else if (amt> balance)   { resultCode=2;  }
		     else                { balance -= amt;}
		return resultCode;
	}
	public int read_balance(){
		return this.balance;
	}
}
public class TestAccount2{
public static void main(String [] args){
        Account a = new Account(150);
        int amt[]={70, 120,85};
        for(int i=0;i<3;i++){
           int resultCode = a.withdraw(amt[i]);
           if (resultCode==0)System.out.println("Success");
           if (resultCode==1)System.out.println("Max withdrawl100");   
           if (resultCode==2)System.out.println("Insuff Funds");
        }
	}}

