package exception.Account;



	class Account{
		private int number;
		protected int balance;
		private int upperLimit;

        public Account(int n, int b,int l){number=n;
                                     balance=b;
                                     upperLimit=l;}
                
        public boolean withdraw(int amt){
			if (amt>balance) return false;
		    else {   balance -=amt;
		             return true;}
		 }
        public boolean deposit(int amt){
			if (amt+balance>upperLimit) return false;
		    else {   balance +=amt;
		             return true;}
		 }
		public int read_balance()
		{
			return balance;
		}

	}

