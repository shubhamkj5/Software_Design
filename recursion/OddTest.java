package recursion;

public class OddTest {
	static int count=0;
    public static int countOdd(int value){
    	int rest=value/10;
    	int last=value%10;
    
    	if(value<10) {
    		if(value%2!=0) {
    			count=count+1;
    			return value;
    		}
    		else {
    			return 0;
    		}
    	
    	}
    	else {
 
		    	if(last%2!=0) {
		    		count=count+1;
		    		return last+countOdd(rest);
		    	}
		    	else
		    	{
		    		return 0+countOdd(rest);
		    	}
    	}
    }
    public static void main(String[] args) {
	  int number=Console.readInt("Enter Value:");
      System.out.println("Res= "+ countOdd(number)+ " Count: "+count);
    }
}

