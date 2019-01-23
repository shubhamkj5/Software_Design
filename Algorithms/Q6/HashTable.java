package Q6;

class HashTable{
	    public int hash(int id){ return id%10;}
	
        private HNode[] head=new HNode[10];
        
	    public  HashTable(){for(int i=0;i<10;i++)head[i]=null;}

		public  void insert(int k, String nm, int a)
	        {      HNode temp =new HNode(k,nm,a);
	               int index=hash(k);
	               temp.next=head[index];
			       head[index]=temp;}


		public  HNode search(int k)
	        {     
			int index=hash(k);
			HNode temp=head[index];	 
			boolean found=false;
			while(temp!=null&&found==false) {
				   if (temp.key==k){found=true; break;}
	               temp=temp.next;
	        }
            return temp;}


		
		public void printTable()	                        {
            for(int i=0;i<10;i++){
            	HNode temp=head[i];
            
            System.out.println("\n");
            System.out.print("[ "+i +"]->");
	           while(temp!=null) {
	               temp.print();
	               temp=temp.next;}
	               
	            System.out.print("NULL"); }  
	               
	            }
		
		public static void main(String[] args) {
			HashTable ht= new HashTable();
			ht.insert(9, "Jain", 18);
			ht.insert(9, "Jains", 22);
			ht.insert(9, "Jaina", 33);
			
			//ht.printTable();
		System.out.println(	ht.search(9));
		}
   }


   