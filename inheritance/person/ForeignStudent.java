package inheritance.person;

public class ForeignStudent extends Student {
	private String coo;
	public ForeignStudent(String n, int a, String coo) {
		// TODO Auto-generated constructor stub
		super(n,a);
		this.coo=coo;	
	}
	public int readAge() {
		// TODO Auto-generated method stub
		return age;
	}
	public String readCountry() {
		// TODO Auto-generated method stub
		return coo;
	}
	public boolean matureStudent() {
		// TODO Auto-generated method stub
		if(age>22) return true;
		return false;
	}
	public boolean changeAge(int newage) {
		// TODO Auto-generated method stub
		if(newage>age) {
			this.age=newage;
			return true;
		}
		return false;
	}
	public void printDetails(){
      super.printDetails();
        System.out.println("Country Of Origin : " + coo);
}

}
