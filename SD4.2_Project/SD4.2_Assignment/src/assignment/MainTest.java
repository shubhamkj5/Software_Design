package assignment;

public class MainTest {
	
	public static BSTree bstree=BSTree.getInstance();
	public static HashTable htable=HashTable.getInstance();
	
	public static void init_list(){
		bstree.insert(12345678,"Shubham", "8855082050", "Ericsson", "9876543210", "09","15", "02", "11", "18", "V205");
		bstree.insert(12345679,"Meet", "8855082050", "Ericsson", "9876543210", "09","15", "02", "11", "18", "V205");
		bstree.insert(12345680,"Meet", "8855082050", "Amazon", "9876543210", "09","15", "02", "11", "18", "V205");
		bstree.insert(12345681,"Shubham", "8855082050", "Ericsson", "9876543210", "09","15", "02", "11", "18", "V205");
		
		htable.insert(12345678,"Shubham", "8855082050", "Ericsson", "9876543210", "09","15", "02", "11", "18", "V205");
		htable.insert(12345679,"Shubham", "8855082050", "Ericsson", "9876543210", "09","15", "02", "11", "18", "V205");
		htable.insert(12345680,"Shubham", "8855082050", "Ericsson", "9876543210", "09","15", "02", "11", "18", "V205");
		htable.insert(12345681,"Shubham", "8855082050", "Ericsson", "9876543210", "09","15", "02", "11", "18", "V205");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init_list();
		
		LandingFrame window = new LandingFrame();
		
	}

}
