package recursion;
public class SearchTargetTest {

    public static boolean searchTarget(int value,int t){
    	if(value<10) {
    		if(value==t) {
    			return true;		
    		  }
    		else {
    			return false;
    		}
    	
    		}
    		else {
    			int last=value%10;
    			int rest=value/10;
    			if(last==t) {
    				searchTarget(rest, t);
    				return true;
    			}
    			else {
    				return 	searchTarget(rest, t);
    			}
    		}
	
    		
    }
    public static void main(String[] args) {
	  int number=Console.readInt("Enter Value:");
          int target=Console.readInt("Enter Target:");
      System.out.println("Res= "+ searchTarget(number,target));
    }
}

