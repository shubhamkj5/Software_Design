package polymorphism;
class Name
{
	protected String name;
	public Name(String n) {
		// TODO Auto-generated constructor stub
		this.name=n;
	}
	public String print() {
		// TODO Auto-generated method stub
		return  name;
	}       
    }
class UnderLine extends Name{

	public UnderLine(String n) {
		// TODO Auto-generated constructor stub
		super(n);	
	}
	public String print() {
		// TODO Auto-generated method stub
		return  name+"\n-----";
	}
       
}
class UpperCase extends Name{

	public UpperCase(String n) {
		super(n);
	}
	public String print() {			
	   return  name.toUpperCase();
	}
	
}
public class NameTest {

	public static void main(String[] args) {
        	Name[] list=new Name[4];
        	list[0]= new Name("Athy");
        	list[1]= new UnderLine("Bally");
        	list[2]= new UpperCase("Cork");
        	list[3]= new UnderLine("Derry");
        
		for(int i=0;i<list.length;i++){
			
			System.out.println(list[i].print());
		}  
	}
}
