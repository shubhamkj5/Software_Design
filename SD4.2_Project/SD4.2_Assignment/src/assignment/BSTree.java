package assignment;


public class BSTree
{   
	Appointment head;
	private      Appointment tail;
	private static BSTree  single;
	private static boolean created = false;
	public BSTree()  {
		tail = new Appointment(0, null, null, null, null, null, null, null, null, null, null, null, null);
		head = new Appointment(-1,null, null, null, null, null, null, null, null, null, null, null, tail);
		created=true;
	}
	
	public int getSize(Appointment root){
		if(root==null){
			return 0;
		}
		return 1 + getSize(root.left) + getSize(root.right);
}
	void  insert(int k, String nm, String acontact,String name,String contact,String h,String m,String d,String mo,String y,String room)
	{
		Appointment  p, x;
		p = head; x = head.right;
		while (x!=tail)
		{ 	p = x;
		x = (k < x.refno) ? x.left : x.right;}
		x = new Appointment(k,nm,acontact,name,contact,h,m,d,mo,y,room,tail,tail);
		if (k < p.refno) p.left = x;
		else           p.right = x;
	}
	
	
	Appointment   search(int k)
	{
		Appointment   x= head.right;
		tail.refno=k;
		boolean found=false;
		while (x!=tail && found==false)
		{ 	if (k==x.refno) found=true;
		else if (k < x.refno)     x= x.left ;
		else               x= x.right;
		}
		if (x==tail)       return null;
		else               return   x;
	}
	
	public static BSTree getInstance(){
	    if (!created){
	                         single=new BSTree();}
	    return single;
	    }
	
	
}