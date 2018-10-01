package q3;
class Money
     {
	private int  euro,cent;
	public Money( ) {euro=0; cent=0;}
	public Money(int e, int c)	 {euro=e; cent=c;}
	public Money(Money  m)  {euro=m.euro; cent=m.cent;}
	
	public String read_value( )
	{	return   "E: "+ euro + "."+cent;
	}
	public void  increment_cent ( ) {         
	        cent++;
			if (cent ==100) {euro++;
	                         cent=0;}
	}
	public int  total_in_cent( )  { return (cent + (euro *100));}
	
	public void add(int e, int c){
	            euro+=e;
				cent+=c;
				if (cent>=100){ cent-=100;
								euro++;}
	}
	public boolean sub(int e, int c){
	            int t1=this.total_in_cent();
				int t2=c + (e *100);
	if (t2>t1){return false;}
	else {
	int t3=t1-t2;
	this.euro=t3/100;
	this.cent=t3%100;
	return true;}
	}
} 



