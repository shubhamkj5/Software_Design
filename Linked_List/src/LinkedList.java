

class LinkedList{
        private Node head;
        
	    public  LinkedList(){head=null;}

		public  void insert(String s1,int a)
	        {      Node temp =new Node(s1,a);
			       temp.next=head;
			       head=temp;}


		public  void insert_last(String s1,int a)
	        {   
			 Node temp =new Node(s1,a);
			 Node temphead=head;
			 while(temphead.next!=null) {
					temphead=temphead.next;
			 }
			 temphead.next=temp;
			temp.next=null;
	        }
			 


		public  boolean search(String s1)
	        {     
			Node temp=head;
			while(temp!=null) {
				if(temp.readname().equals(s1)) {
					return true;
				}
				temp=temp.next;
			}
			return false; }



		public  int count(String s1)
	        {    
			int count=0;
			Node temp=head;
			while(temp!=null) {
				if(temp.readname().equals(s1)) {
				count++;
				}
				temp=temp.next;
			}
			
			return count; }


		public String delete_first()
	       {         if (head==null)return null;
		             String res=head.readname();
		             head = head.next;
		             return res;
                  }



	     public void printlist()
	                        {
		               Node temp=head;
		               System.out.println("\nList:");
		               System.out.print("HEAD->");
			           while(temp!=null) {
			               temp.print();
			               temp=temp.next;}
			               
			            System.out.print("NULL");   
			               
			            }
   }


   
