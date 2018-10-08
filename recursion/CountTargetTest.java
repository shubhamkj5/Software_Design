package recursion;

public class CountTargetTest {
	
    public static int countTarget(int value,int t){
    	if(value<10) {
    		if(value==t) {
    			return 1;		
    		  }
    		else {
    			return 0;
    		}
    	
    		}
    		else {
    			int last=value%10;
    			int rest=value/10;
    			if(last==t) {
    			
    				return 1+countTarget(rest, t);
    			}
    			else {
    				return countTarget(rest, t);
    			}
    		}
	
    		
    	
    	
    }
    public static void main(String[] args) {
	  int number=Console.readInt("Enter Value:");
          int target=Console.readInt("Enter Target:");
      System.out.println("Res= "+ countTarget(number,target));
    }
}

