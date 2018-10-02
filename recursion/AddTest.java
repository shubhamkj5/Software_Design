package recursion;

import Pairdice.Console;

public class AddTest {
	private static int res=0;
    public static int add(int value){
    	if(value<10) return value;
    	
    	return value%10+ add(value/10);
    }
    public static void main(String[] args) {
	  int number=Console.readInt("Enter Value:");
          System.out.println("Res= "+ add(number));
    }
}

