package inheritance.q4_discount;

public class DiscountTicket extends Ticket{
	private int discount;
	public DiscountTicket(int p, String s, String e, int d) {
		// TODO Auto-generated constructor stub
		super(p,s,e);
	}

	public void setDiscount(int d) {
		// TODO Auto-generated method stub
		this.discount=d;
	}

	public int grossPrice() {
		// TODO Auto-generated method stub
		return price-(price/discount);
	}

}
