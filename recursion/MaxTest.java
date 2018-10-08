package recursion;
public class MaxTest {
	
    public static int max(int value){
    	if(value<10)
    	{
    		return value;
    	}
    	
    	else {
    		int last=value%10;
			int rest=value/10;
			if(last>max(rest)) {
				return last;
			}
			else {
				return max(rest);
			}
    	}
    	
    }
    public static void main(String[] args) {
	  int number=Console.readInt("Enter Value:");
          System.out.println("Res= "+ max(number));
    }
}

