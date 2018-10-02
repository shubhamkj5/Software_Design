package die;

public class Die {

	private int value;

	public Die(int i) {
		// TODO Auto-generated constructor stub
		this.value=i;
	}

	public void roll() {
		// TODO Auto-generated method stub
		double res=Math.random();
		value=1+(int)(res*1000)%6;
	}

	public int getValue() {
		// TODO Auto-generated method stub
		return this.value;
	}

}
