package Thread_Ex;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//class Display extends Thread {
class Display implements Runnable {

	public String name;
	public Display(String nm){
		        name=nm;
	}     
      public void run(){
		for(int i=0; i<4;i++)
			 { System.out.println(name+": "+i);
			   try{ Thread.sleep(1000);}
		         catch(Exception e){}
		       }
      }
}  


public class Q1Skel
{
public static void main(String[] args)
    {
	   		ExecutorService threadExecutor;
	   		threadExecutor=Executors.newCachedThreadPool();

            Display d1=new Display("First");
            Display d2=new Display("Second");
            Thread t1=new Thread(d1);
            Thread t2=new Thread(d2);
            //threadExecutor.execute(d1);
            //threadExecutor.execute(d2);

           t1.start();
           t2.start();
 //          d1.start();
 //          d2.start();
      }
}
