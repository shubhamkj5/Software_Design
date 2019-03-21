

class  LinkedList{
        private  Appointment head;
        
	    public  LinkedList(){head=null;}

		public   void insert(String ref,String n1,String c1,String n2,String c2,String h, String m,String d,String mo, String y,String r)
	        {      Appointment temp =new Appointment(ref,n1,c1, n2, c2, h,m, d, mo, y, r);
			       temp.next=head;
			       head=temp;}
       
		public  Appointment readAppointment(int el)
        {      if (head==null|| this.count()<el)
        	                 return null;
			   Appointment temp=head;
               int current=1;
               while(current!=el) {
                       current++;
                       temp=temp.next;}
               return temp; } 
		public  String delAppointment(int el)
        {      if (head==null|| this.count()<el)
        	                 return null;
			   Appointment temp=head;
               int current=1;
               while(current!=el) {
                       current++;
                       temp=temp.next;}
               String res=temp.getName();
               Appointment next = temp.next.next; 
               
               temp.next = next; 
               return res;
               
        } 


		public  int count()
	        {      Appointment temp=head;
                   int res=0;
	               while(temp!=null) {
                          res++;
	                      temp=temp.next;}
	               
	               return res; }


		public String delete_first()
	       {         if (head==null)return null;
		             String res=head.getName();
		             head = head.next;
		             return res;
                  }
		public void delete_all()
	       {         head=null;
               }


	     public void printlist()
	                        {
		               Appointment temp=head;
		              
			           while(temp!=null) {
			               temp.print();
			               temp=temp.next;
			              
			           }
			               
			            
			               
			            }
   }


   