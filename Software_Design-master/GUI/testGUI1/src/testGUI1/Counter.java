package testGUI1;

public class Counter {
	private int value;
	public Counter(int v){
		value=v;
	}
	public int readValue() {
		return value;
	}
public void setValue(int value) {
	this.value = value;
}
	public void step() {
		value++;
	}
	public void decr() {
		value--;
	}

}
