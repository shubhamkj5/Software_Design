import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class LandingFrame {

	JFrame frame;
	private JTextField txtReference;
	private JPasswordField passwordField;
	public static LinkedList list;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LandingFrame window = new LandingFrame(list);
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
	public LandingFrame(LinkedList list) {
		this.list=list;
		initialize();
		
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 633, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 597, 364);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Search Appointment");
		label.setFont(new Font("Modern No. 20", Font.PLAIN, 24));
		label.setBounds(51, 131, 200, 26);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Create Appointment");
		label_1.setFont(new Font("Modern No. 20", Font.PLAIN, 24));
		label_1.setBounds(341, 131, 194, 26);
		panel.add(label_1);
		
		txtReference = new JTextField();
		txtReference.setText("Enter Reference No.");
		txtReference.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtReference.setColumns(10);
		txtReference.setBounds(51, 178, 200, 26);
		panel.add(txtReference);
		
		JButton button = new JButton("Find");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ref_no="";
				if(txtReference.getText().equals("Enter Reference No.")) {
					ref_no="0";
				}
				else {
					ref_no=txtReference.getText();
				}
				DetailFrame df= new DetailFrame(ref_no,list);
				frame.setVisible(false);
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		button.setBounds(98, 236, 89, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("Create");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(passwordField.getText().equals("admin")) {
					MainFrame mf= new MainFrame(list);
					mf.frame.setVisible(true);
					frame.setVisible(false);
				}
				else {
					 JOptionPane.showMessageDialog(null, "Password Incorrect","Message" , JOptionPane.WARNING_MESSAGE);
					 list.printlist();

				}
				
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		button_1.setBounds(395, 236, 89, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("View All");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DetailFrame df= new DetailFrame("0",list);
				frame.setVisible(false);
			}
		});
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		button_2.setBounds(243, 300, 126, 33);
		panel.add(button_2);
		
		JLabel label_2 = new JLabel("Appointment Management Software");
		label_2.setFont(new Font("Gill Sans MT", Font.BOLD, 35));
		label_2.setBounds(0, 27, 600, 42);
		panel.add(label_2);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField.setBounds(353, 178, 167, 26);
		panel.add(passwordField);
	}
	
}
