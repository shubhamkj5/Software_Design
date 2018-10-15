package inheritance.q3_outing;
class Outing
	{
		protected int count;
		public Outing(int count)
		{
			this.count = count;
			}

		public boolean cancel()
		{ if (count>0){
			this.count--;
			return true;}
		  else
		    return false;
		}
		public String print_details()
		{
			return "Outing Details:\n Number on Outing: "+count+"\n"; 
			
			
		}
}