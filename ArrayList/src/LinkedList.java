

class MyArrayList{
        private Node[] head;
        private int max;
        private int count;
	  public  MyArrayList(int max){
	    	 this.max=max;
	    	 count=0;
	    	 head=new Node[max];}
        public  boolean insert(String s1,int a)
	        {      if (count<max){
	        	        Node temp =new Node(s1,a);
	                    head[count]=temp;
	                    count++;
	                    return true;}
	               else  return false;}	
       public  String youngest()
        {     int res=900;
              String name="BLANK";
              for(int i=0;i<count;i++){
      	           Node temp=head[i];
      	           if (temp.readage()<res){
                            name=temp.readname();
      		                res=temp.readage();}
                   }
              return name  ; 
        }                                              

       		public  boolean search(String s1)
	        {     boolean res=false;
	              for(int i=0;i<count;i++){
	            	  Node temp=head[i];
	            	  if (temp.readname().equals(s1)){
	            		  res=true;
	            	  }
	              }
                     return res; 
	             }                                 

       	     public void printlist()
	                        {
		               Node temp;;
		               System.out.println("\nList:");
		               System.out.print("HEAD->");
			         for(int i=0;i<count;i++) {
			        	   temp = head[i];
			               temp.print();}
			               
			          System.out.print("NULL");   
			               
           }
			public int count(String name) {
				// TODO Auto-generated method stub
				int countname=0;
	              for(int i=0;i<count;i++){
	            	  Node temp=head[i];
	            	  if (temp.readname().equals(name)){
	            		  countname++;
	            	  }
	              }
                   return countname; 
			}
			public String oldest() {
				  int res=0;
	              String name="BLANK";
	              for(int i=0;i<count;i++){
	      	           Node temp=head[i];
	      	           if (temp.readage()>res){
	                            name=temp.readname();
	      		                res=temp.readage();}
	                   }
	              return name  ;
			}
			public String olderThan(int age) {
					int t=0;
	              String val="";
	              for(int i=0;i<count;i++){
	      	           Node temp=head[i];
	      	           if (temp.readage()>age){
	                          String  name=temp.readname();
	      		               int res=temp.readage();
	      		             val+="\n"+name+" "+res;
	      		             t++;
	      	           }
	      	           		
	                   }
	              return val + "\n Total Count: "+t ;
			}
			public String delete_last() {
				int c= count-1;
				String res=head[c].readname();
				head[c]=null;
				count--;
				return res;
				 
			}
		
			public int seachAgeFirst(String name) {
				 int age=0;
	              for(int i=0;i<count;i++){
	            	  Node temp=head[i];
	            	  if (temp.readname().equals(name)){
	            		  age=temp.readage();
	            		  break;
	            	  }
	              }
                    return age; 
			}
			public boolean isoldest(int age) {
				 boolean res=true;
	            
	              for(int i=0;i<count;i++){
	      	           Node temp=head[i];
	      	           if (temp.readage()<age){  
	      		                res=false;
	      		                }
	                   }
	              
	              return res  ;
			}                                                 

}

   
