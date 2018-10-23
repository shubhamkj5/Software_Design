package exception.Counter;
class MyException extends Exception{
	public MyException(){super();}
}

class TooHighException extends Exception{
	public TooHighException(){super();}
}

class TooLowException extends Exception{
	public TooLowException(){super();}
}

public class Counter {
	private int value;
	private int limit;
    
	public Counter(int lim){value=0;limit=lim;}

	public void increment() throws TooHighException{
		if (value < limit) {this.value++;}
		
		else               { throw new TooHighException();}
	}
	public void decrement() throws TooLowException{
		if (value > 0) {this.value--; }
		else               {throw new TooLowException();}
	}
	public int read_value(){
		return this.value;
	}
}
