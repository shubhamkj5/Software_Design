package testGUI1;

import java.awt.EventQueue;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JCheckBox;

public class Start2 {

	private JFrame frame;
	private JTextField textField;
	JComboBox comboBox;
	JMenuBar menuBar;
	JMenu mnNewMenu ;
	JMenuItem mntmReset ;
	JMenuItem mntmExit ;
	Counter c=new Counter(6);
	private JCheckBox chckbxNewCheckBox;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start2 window = new Start2();
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
	public Start2() {
		initialize();
		myRefresh();
	}

	private void myRefresh() {
		textField.setText(""+c.readValue());
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("Value");
		label1.setBounds(85, 70, 46, 14);
		frame.getContentPane().add(label1);
		
		textField = new JTextField();
		textField.setBounds(160, 67, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnIncr = new JButton("Incr");
		btnIncr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.step();
				if(c.readValue()==0) {
					chckbxNewCheckBox.setSelected(true);
				}
				else {
					chckbxNewCheckBox.setSelected(false);
				
				myRefresh();
				}
			}
		});
		btnIncr.setBounds(52, 105, 89, 23);
		frame.getContentPane().add(btnIncr);
		
		JButton btnDecr = new JButton("Decr");
		btnDecr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(c.readValue()==0) {
					chckbxNewCheckBox.setSelected(true);
				}
				else {
					c.decr();
					chckbxNewCheckBox.setSelected(false);
				
				myRefresh();
				}
			}
		});
		btnDecr.setBounds(184, 105, 89, 23);
		frame.getContentPane().add(btnDecr);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int v1=Integer.parseInt(textField.getText());
				int v2= Integer.parseInt((String) comboBox.getSelectedItem());
				int  res=v1+v2;
				textField.setText(""+res);
				c.setValue(res);
				myRefresh();
				
				
				
			}
		});
		btnAdd.setBounds(52, 143, 89, 23);
		frame.getContentPane().add(btnAdd);
		
	    comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox.setBounds(184, 139, 62, 20);
		frame.getContentPane().add(comboBox);
		
		chckbxNewCheckBox = new JCheckBox("Already Zero");
		chckbxNewCheckBox.setBounds(102, 191, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		 menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		 mnNewMenu = new JMenu("OPTIONS");
		menuBar.add(mnNewMenu);
		
		mntmReset = new JMenuItem("Reset");
		mntmReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.setValue(0);
				myRefresh();
			}
		});
		mnNewMenu.add(mntmReset);
		
	 mntmExit = new JMenuItem("Exit");
	 mntmExit.addActionListener(new ActionListener() {
	 	public void actionPerformed(ActionEvent e) {
	 		System.exit(0);
	 	}
	 });
		mnNewMenu.add(mntmExit);
	}
	
}
