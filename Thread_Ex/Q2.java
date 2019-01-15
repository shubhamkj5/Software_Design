package Thread_Ex;
public class Q2
{
    public static void main(String[] args)
    {
             Incrementer  i = new Incrementer();                     
           
             Decrementer d = new Decrementer();                  
            Thread t1=new Thread(i);
            Thread t2=new Thread(d);
            t1.start();
            t2.start();
    }
}


/**************************************/


class Incrementer implements Runnable{
     public void run()
    {             for (int i = 1; i <= 6; i++)
                  {
                                 System.out.println("Incrementer: "+ i);
                                 try{ Thread.sleep(1000);}
                                 catch(Exception e){}
                      }
    }}


/**************************************/

class Decrementer implements Runnable{
      public void run()
      {             for (int i = 6; i >0; i--)
                    {
                                  System.out.println("Decrementer: "+ i);
                                  try{ Thread.sleep(1000);}
                                  catch(Exception e){}
        }
    }
}

