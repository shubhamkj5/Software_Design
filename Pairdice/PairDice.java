package Pairdice;

public class PairDice {
	private Die die1,die2;


	public PairDice(int i, int j) {
		// TODO Auto-generated constructor stub
		die1=new Die(i);
		die2=new Die(j);
		
	}

	public void rollDice() {
		// TODO Auto-generated method stub
		die1.roll();
		die2.roll();
	}

	public int readValue1() {
		// TODO Auto-generated method stub
		return die1.getValue();
	}

	public int readValue2() {
		// TODO Auto-generated method stub
		return die2.getValue();
	}

	public String sumDiceValues() {
		// TODO Auto-generated method stub
		
		int sum=die1.getValue()+die2.getValue();
		return ""+sum;
	}

	public boolean valuesEqual() {
		// TODO Auto-generated method stub
		if(die1.getValue()==die2.getValue()) {
			return true;
		}
		else {
		return false;
		}
	}

}
