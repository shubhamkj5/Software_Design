package testGUI1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start_Welcome {

	private JFrame frame;
	Start2 window2=new Start2();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start_Welcome window = new Start_Welcome();
					
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
	public Start_Welcome() {
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
		
		JLabel lblWelcome = new JLabel("WELCOME");
		lblWelcome.setBounds(155, 67, 46, 14);
		frame.getContentPane().add(lblWelcome);
		
		JButton btnBegin = new JButton("Begin");
		btnBegin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				window2.frame.setVisible(true);
			}
		});
		btnBegin.setBounds(131, 111, 89, 23);
		frame.getContentPane().add(btnBegin);
	}
}
