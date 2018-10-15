package inheritance.q3_outing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame2 extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("  Account  Application  ");
	private JLabel l1 = new JLabel("Max ");
	private JTextField t1=new JTextField(" ",8);
	private JLabel l2 = new JLabel("Count ");
	private JTextField t2=new JTextField("0",8);

	private JButton b1=new JButton("Remove");

	private JButton b2=new JButton("Add");
	 private JTextPane textPane; 
	private JLabel l3 = new JLabel("Message ");
	private JTextField t5=new JTextField(" ",8);
	private JPanel p1=new JPanel();
	
	private RestrictedOuting o =new RestrictedOuting(0,   20);
	private final JButton print = new JButton("Print Details");
	
	public MyFrame2(String s){
		super(s);
		Container content=getContentPane();
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setBounds(26, 65, 142, 108);
		p1.setLayout(new GridLayout(4,2));
		l0.setBounds(0, 5, 194, 27);
		l0.setFont(f);  l1.setFont(f);
		getContentPane().setLayout(null);
		content.add(l0);
		print.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String details= o.print_details();
		        	textPane.setText(details);
		        	System.out.println(o.print_details());
			}
		});
		
		print.setBounds(49, 185, 89, 23);
		
		getContentPane().add(print);
		p1.add(l1); p1.add(t1);
		p1.add(l2); p1.add(t2);
		p1.add(b1); p1.add(b2); 
		p1.add(l3); p1.add(t5);
		content.add(p1);
		b1.addActionListener(this);   
		b2.addActionListener(this);  
 
		t1.setText("20");
		t2.setText(""+o.readCount());
		
		textPane = new JTextPane();
		textPane.setBounds(26, 219, 142, 55);
		getContentPane().add(textPane);
		setSize(198,324);    setVisible(true);}

	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	  	t5.setText("");
	 	if (target==b1){
	          		boolean res =o.cancel();
	             	t2.setText(""+o.readCount());
	             	if (res==false)t5.setText("Already 0");
	             }
	 	if (target==b2){
      		    boolean res= o.add();
            	t2.setText(""+o.readCount());
         	    if (res==false)t5.setText("Exceeds Max");
         }
	 
	 	
	 }
}