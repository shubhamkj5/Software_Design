package inheritance.person;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame2 extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("  Student  Application  ");
	private JLabel l1 = new JLabel("Name ");
	private JTextField t1=new JTextField(" ",8);
	private JLabel l2 = new JLabel("Age ");
	private JTextField t2=new JTextField("0",8);
	private JLabel l3 = new JLabel("Country ");
	private JTextField t3=new JTextField("0",8);
	private JButton b0=new JButton("Change Age");
	private JTextField t0=new JTextField("0",8);
	private JButton b2=new JButton("Mature?");
	private JButton b1=new JButton("Print Details");
	private JTextField t5=new JTextField(" ",8);
	private JPanel p1=new JPanel();
	
	private ForeignStudent student =new ForeignStudent("Ernesto Shine",   21, "Spain");
	
	public MyFrame2(String s){
		super(s);
		Container content=getContentPane();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(5,2));
		l0.setFont(f);  l1.setFont(f);
		content.add(l0);
		p1.add(l1); p1.add(t1);
		p1.add(l2); p1.add(t2);
		p1.add(l3); p1.add(t3);
		p1.add(b2);  p1.add(t5);
		p1.add(b0);  p1.add(t0);
		content.add(p1); content.add(b1); 
		b2.addActionListener(this);  
		b1.addActionListener(this);  b0.addActionListener(this); 
		t1.setText(student.readName());
		t2.setText(""+student.readAge());
		t3.setText(""+student.readCountry());
		setSize(230,250);    setVisible(true);}
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	  	t5.setText("");
	 	if (target==b1){
	          		student.printDetails();
	             }
	 	if (target==b2){
      		    boolean res= student.matureStudent();
            	t5.setText(""+res);
         }
	 	if (target==b0){
  		    boolean res= student.changeAge(Integer.parseInt(t0.getText()));
        	if (res==true){t2.setText(""+student.readAge());t5.setText("");}
        	else          t5.setText("Invalid Age");
     }
	 	
	 }

}