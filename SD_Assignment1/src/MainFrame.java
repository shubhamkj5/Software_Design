import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame  {

	JFrame frame;
	private JTextField txtReference;
	private JTextField txtAname;
	private JTextField txtAcontact;
	private JTextField txtDate;
	private JTextField txtTime;
	private JTextField txtName;
	private JTextField txtContact;
	private JTextField txtRoom;
	public static LinkedList list;
	private Reference refno=new Reference();
	private int index=0;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame(list);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame(LinkedList list) {
		this.list=list;
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 560, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCreateAppointment = new JLabel("Create Appointment");
		lblCreateAppointment.setFont(new Font("Gill Sans MT", Font.BOLD, 28));
		lblCreateAppointment.setBounds(152, 21, 274, 33);
		frame.getContentPane().add(lblCreateAppointment);
		
		JLabel lblRefNo = new JLabel("Ref. No.");
		lblRefNo.setFont(new Font("Modern No. 20", Font.PLAIN, 19));
		lblRefNo.setBounds(22, 100, 63, 21);
		frame.getContentPane().add(lblRefNo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Modern No. 20", Font.PLAIN, 19));
		lblDate.setBounds(282, 143, 63, 21);
		frame.getContentPane().add(lblDate);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setFont(new Font("Modern No. 20", Font.PLAIN, 19));
		lblContact.setBounds(22, 182, 63, 21);
		frame.getContentPane().add(lblContact);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Modern No. 20", Font.PLAIN, 19));
		lblTime.setBounds(282, 182, 63, 21);
		frame.getContentPane().add(lblTime);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Modern No. 20", Font.PLAIN, 19));
		lblName.setBounds(22, 139, 63, 21);
		frame.getContentPane().add(lblName);
		
		JLabel lblContactPerson = new JLabel("Meeting Person");
		lblContactPerson.setFont(new Font("Microsoft Tai Le", Font.BOLD, 19));
		lblContactPerson.setBounds(22, 224, 141, 25);
		frame.getContentPane().add(lblContactPerson);
		
		JLabel label = new JLabel("Name");
		label.setFont(new Font("Modern No. 20", Font.PLAIN, 19));
		label.setBounds(22, 275, 63, 21);
		frame.getContentPane().add(label);
		
		JLabel lblRoom = new JLabel("Room No.");
		lblRoom.setFont(new Font("Modern No. 20", Font.PLAIN, 19));
		lblRoom.setBounds(260, 275, 76, 21);
		frame.getContentPane().add(lblRoom);
		
		txtReference = new JTextField();
		txtReference.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		txtReference.setText(refno.getRef());
		txtReference.setBounds(114, 100, 136, 26);
		frame.getContentPane().add(txtReference);
		txtReference.setColumns(10);
		
		txtAname = new JTextField();
		txtAname.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		txtAname.setColumns(10);
		txtAname.setBounds(114, 141, 136, 26);
		frame.getContentPane().add(txtAname);
		
		txtAcontact = new JTextField();
		txtAcontact.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		txtAcontact.setColumns(10);
		txtAcontact.setBounds(114, 182, 136, 26);
		frame.getContentPane().add(txtAcontact);
		
		txtDate = new JTextField();
		txtDate.setText("dd/mm/yy");
		txtDate.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		txtDate.setColumns(10);
		txtDate.setBounds(344, 138, 136, 26);
		frame.getContentPane().add(txtDate);
		
		txtTime = new JTextField();
		txtTime.setText("00:00");
		txtTime.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		txtTime.setColumns(10);
		txtTime.setBounds(344, 181, 136, 26);
		frame.getContentPane().add(txtTime);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		txtName.setColumns(10);
		txtName.setBounds(114, 272, 136, 26);
		frame.getContentPane().add(txtName);
		
		txtContact = new JTextField();
		txtContact.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		txtContact.setColumns(10);
		txtContact.setBounds(114, 313, 136, 26);
		frame.getContentPane().add(txtContact);
		
		JLabel label_1 = new JLabel("Contact");
		label_1.setFont(new Font("Modern No. 20", Font.PLAIN, 19));
		label_1.setBounds(22, 314, 63, 21);
		frame.getContentPane().add(label_1);
		
		txtRoom = new JTextField();
		txtRoom.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		txtRoom.setColumns(10);
		txtRoom.setBounds(346, 270, 136, 26);
		frame.getContentPane().add(txtRoom);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String ref=txtReference.getText();
                 String aname=txtAname.getText();
                 String name=txtName.getText();
                 String acontact=txtAcontact.getText();
                 String contact=txtContact.getText();
                 String room=txtRoom.getText();
                 
                 String time[]=txtTime.getText().split(":");         
                 String h1=time[0];
                 String m1=time[1];
 	 		   
	 		     
	 		    String date[]=txtDate.getText().split("/");         
	 		   String d=date[0];
	 		  String mo=date[1];
	 		 String y=date[2];
	 		     
	 		        
	 		     list.insert(ref, aname, acontact, name, contact, h1, m1, d, mo, y, room);
				list.printlist();
				reset();
			}
		});
		btnCreate.setFont(new Font("Modern No. 20", Font.PLAIN, 19));
		btnCreate.setBounds(337, 333, 89, 23);
		frame.getContentPane().add(btnCreate);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LandingFrame f= new LandingFrame(list);
				frame.dispose();
				
		         
				
				
			}
		});
		btnBack.setBounds(445, 11, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();

			}
		});
		btnReset.setFont(new Font("Modern No. 20", Font.PLAIN, 19));
		btnReset.setBounds(436, 333, 89, 23);
		frame.getContentPane().add(btnReset);
	}
	public void reset(){
		txtReference.setText(refno.getRef());
		txtAname.setText("");
		txtAcontact.setText("");
		txtName.setText("");
		txtContact.setText("");
		txtRoom.setText("");
		txtTime.setText("00:00");
		txtDate.setText("dd/mm/yy");
	}

}
