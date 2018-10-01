package testGUI1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class start {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	JCheckBox checkbox1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					start window = new start();
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
	public start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("Value 1");
		label1.setBounds(35, 36, 46, 14);
		frame.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("Value 2");
		label2.setBounds(35, 76, 46, 14);
		frame.getContentPane().add(label2);
		
		JLabel label3 = new JLabel("Result");
		label3.setBounds(35, 176, 46, 14);
		frame.getContentPane().add(label3);
		
		textField1 = new JTextField();
		textField1.setBounds(122, 33, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(122, 73, 86, 20);
		frame.getContentPane().add(textField2);
		
		textField3 = new JTextField();
		textField3.setColumns(10);
		textField3.setBounds(122, 173, 86, 20);
		frame.getContentPane().add(textField3);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int val1=Integer.parseInt(textField1.getText());
				int val2=Integer.parseInt(textField2.getText());
				int res =val1+val2;
				textField3.setText(""+ res);
				if(res>10) {
					checkbox1.setSelected(true);
				}
				else {
					checkbox1.setSelected(false);
				}

			}
		});
		btnAdd.setBounds(28, 130, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSubtract = new JButton("Subtract");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int val1=Integer.parseInt(textField1.getText());
				int val2=Integer.parseInt(textField2.getText());
				int res =val1-val2;
				textField3.setText(""+ res);
				if(res>10) {
					checkbox1.setSelected(true);
				}
				else {
					checkbox1.setSelected(false);
				}
			}
		});
		btnSubtract.setBounds(146, 130, 89, 23);
		frame.getContentPane().add(btnSubtract);
		checkbox1 = new JCheckBox("Greater 10");
		checkbox1.setBounds(87, 217, 97, 23);
		frame.getContentPane().add(checkbox1);
	}
}
