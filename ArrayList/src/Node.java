class Node{
	private String name;
	private int age; 
      public  Node(String nm,int a)
	              {name = new String(nm);
			   age=a;}
	public  String readname()  {return name;}
	public  int readage()      {return age;}
	public void print(){
		System.out.print("["+name+":"+age+"]-->");
	}
}


