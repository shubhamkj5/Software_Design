import javax.naming.InitialContext;

public class MainTest {
	static LinkedList list=new LinkedList();
	public static void init_list(){
		list.insert("jvjh","Shubham", "8855082050", "Ericsson", "9876543210", "09","15", "02", "11", "18", "V205");
		list.insert("sdf","Shubham", "8855082050", "Ericsson", "9876543210", "09","15", "02", "11", "18", "V205");
		list.insert("jvsdfjh","Shubham", "8855082050", "Ericsson", "9876543210", "09","15", "02", "11", "18", "V205");
		list.insert("sdf","Shubham", "8855082050", "Ericsson", "9876543210", "09","15", "02", "11", "18", "V205");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init_list();
		LandingFrame window = new LandingFrame(list);
		
	}

}
