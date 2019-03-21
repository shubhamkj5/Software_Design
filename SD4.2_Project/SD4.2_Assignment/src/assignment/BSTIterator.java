package assignment;
import java.util.Stack;

public class BSTIterator {
	Stack<Appointment> stack;
 
	public BSTIterator(Appointment root) {
		stack = new Stack<Appointment>();
		while (root != null) {
			stack.push(root);
			root = root.left;
		}
	}
 
	public boolean hasNext() {
		return !stack.isEmpty();
	}
 
	public int next() {
		Appointment node = stack.pop();
		int result = 0;
		if(node!=null) {
		 result= node.refno;
		}
		if (node.right != null) {
			node = node.right;
			while (node != null) {
				stack.push(node);
				node = node.left;
			}
		}
		return result;
	}
	
	/*public static BSTree bstree=BSTree.getInstance();
	public static HashTable htable=HashTable.getInstance();
	
	public static void init_list(){
		bstree.insert(12345678,"Shubham", "8855082050", "Ericsson", "9876543210", "09","15", "02", "11", "18", "V205");
		bstree.insert(12345679,"Shubham", "8855082050", "Ericsson", "9876543210", "09","15", "02", "11", "18", "V205");
		bstree.insert(12345680,"Shubham", "8855082050", "Ericsson", "9876543210", "09","15", "02", "11", "18", "V205");
		bstree.insert(12345681,"Shubham", "8855082050", "Ericsson", "9876543210", "09","15", "02", "11", "18", "V205");
		
		htable.insert(12345678,"Shubham", "8855082050", "Ericsson", "9876543210", "09","15", "02", "11", "18", "V205");
		htable.insert(12345679,"Shubham", "8855082050", "Ericsson", "9876543210", "09","15", "02", "11", "18", "V205");
		htable.insert(12345680,"Shubham", "8855082050", "Ericsson", "9876543210", "09","15", "02", "11", "18", "V205");
		htable.insert(12345681,"Shubham", "8855082050", "Ericsson", "9876543210", "09","15", "02", "11", "18", "V205");
	}
	public static void main(String[] args) {
		init_list();
		BSTIterator bite=new BSTIterator(bstree.head);
		
		while(bite.hasNext()){
			
			if(bite.next()!=0 && bite.next()!=1) {
			 String aname=bstree.search(bite.next()).getaname();
			 String acontact=bstree.search(bite.next()).getacontact();
			 String name=bstree.search(bite.next()).getName();
			 String contact=bstree.search(bite.next()).getContact();
			 int ref=bstree.search(bite.next()).getRefno();
			 String room=bstree.search(bite.next()).getRoom();
			 String time=bstree.search(bite.next()).getTime();
			 String date=bstree.search(bite.next()).getDate();
			
			System.out.println(ref);
			}
	}
}	*/
}