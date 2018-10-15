package inheritance.q1_counter;

public class MyCounter extends Counter {
	private int upper_limit;
	public MyCounter(int v, int ul) {
		// TODO Auto-generated constructor stub
		super(v);
		this.upper_limit=ul;
		
	}


	public int readLimit() {
		// TODO Auto-generated method stub
		return upper_limit;
	}

	public boolean increment() {
		if (value<upper_limit)
		{this.value++; return true;}
        else  return false;
	}



}
