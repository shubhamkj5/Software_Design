package polymorphism.PolyData;
class Data
    {
        protected int value1,value2;
        public Data(int v1,int v2) {
			// TODO Auto-generated constructor stub
        	this.value1=v1;
        	this.value2=v2;
		}
		public int Add() {
			// TODO Auto-generated method stub
			return value1+value2;
		}
		public boolean All_Even() {
			// TODO Auto-generated method stub
			if(value1 %2==0 && value2 % 2 == 0) return true;
			return false;
		}
    }
class Pair extends Data
{
   
    public Pair(int v1,int v2) {
		// TODO Auto-generated constructor stub
    	super(v1,v2);
	}
    public int Add() {
		// TODO Auto-generated method stub
		return super.Add();
	}
	public boolean All_Even() {
		// TODO Auto-generated method stub
		return super.All_Even();
	}
}
class Treble extends Data
{
   private int value3;
    public Treble(int v1,int v2,int v3) {
		// TODO Auto-generated constructor stub
    	super(v1,v2);
    	this.value3=v3;
	}
    public int Add() {
		// TODO Auto-generated method stub
		return  super.Add()+value3;
	}
	public boolean All_Even() {
		// TODO Auto-generated method stub
		if(super.All_Even() && value3 %2 ==0) {
			return true;
		}
		return false;
	}
}
public class Q3bAns
{
  public static void main(String[] args)
  {
     Data []d = new Data[2];
     d[0] = new Pair(5,6);
     d[1] = new Treble(2, 4, 6);
     for (int i = 0; i < 2; i++)
     {   System.out.println();
         System.out.println("Sum of Values "+(i+1)+" :" +  d[i].Add());
         System.out.println("All Even "+(i+1)+ " :" +  d[i].All_Even());
     }
  }
}
