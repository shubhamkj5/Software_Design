package Thread_Ex;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



class Counter5 extends Thread implements ActionListener{
	private int counter;
	private JFrame f1=new JFrame();
	private  JLabel l=new JLabel();
	private Font fnt=new Font("TimesNewRoman",Font.BOLD,16);
	Container content;
	private JButton b1=new JButton("Suspend");
	private JButton b2=new JButton("Resume");
	private boolean suspendFlag=false;
	    
	Counter5(){
		counter=0;
		content=f1.getContentPane();
		l.setFont(fnt);
		l.setText("Counter:  "+0);
       	             f1.setLayout(new FlowLayout());
                          f1.setSize(192,150);f1.setResizable(false);
                          content.add(l)	;	
                          content.add(b1)	;
                          content.add(b2)	;	
                          f1.setVisible(true);
                          b1.addActionListener(this);
                          b2.addActionListener(this);
                          }
	
	  public void actionPerformed(ActionEvent e){
		  Object target=e.getSource();
		  if (target == b1){   
			  //this.suspend();
			  this.mySuspend();
			  System.out.println("Suspended");  }
		  if (target == b2){  
			  //this.resume();
			  this.myResume();
			  System.out.println("Resumed"); }
	  }
	 
	    public void mySuspend() {
	                    suspendFlag = true;
	     }
	     public synchronized void myResume() {
	                   suspendFlag = false;
	                   notify();
	     }

	   public void run(){
                          while(counter <100)
                         {          counter++;
                                    l.setFont(fnt);
                                    l.setText("Counter:    "+counter);
                                    try{Thread.sleep(1000);
                                    synchronized (this) {
										while(suspendFlag){
											wait();
										}
									}
                                    }
                                    catch(Exception e){}}
                    } }   
       
public class Q5Skel{
public static void main(String[] args)
{
                   Counter5 c=new Counter5();
                   c.start();}
}

