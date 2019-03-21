import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DetailFrame {

	private JFrame frame;
	private String refno;
	private JTable table;
	private static LinkedList list;
	private JButton btnBack;
	private JButton btnDelete;

	 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DetailFrame window = new DetailFrame("0",list);
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
	public DetailFrame(String refno,LinkedList list) {
		this.list=list;
		this.refno=refno;
		initialize();
		frame.setVisible(true);
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 790, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		DefaultTableModel dtm= new DefaultTableModel(
				new Object[][] {},
				new String[] {
					"Ref #No.", "Name", "Contact", "Meeting Name", "Meeting Contact", "Date", "Time", "Room"
				}
			) {
				boolean[] columnEditables = new boolean[] {
					true, true, true, true, true, true, true, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			};
		for(int i=1;i<=list.count();i++) {
		 String aname=list.readAppointment(i).getaname();
		 String acontact=list.readAppointment(i).getacontact();
		 String name=list.readAppointment(i).getName();
		 String contact=list.readAppointment(i).getContact();
		 String ref=list.readAppointment(i).getRefno();
		 String room=list.readAppointment(i).getRoom();
		 String time=list.readAppointment(i).getTime();
		 String date=list.readAppointment(i).getDate();
		 if(refno.equals("0")) {
			 dtm.addRow(new Object[] { ref, aname, acontact,
		                name, contact, date,time,room });
		 }
		 else {
			 if(ref.equals(refno)) {
				 dtm.addRow(new Object[] { ref, aname, acontact,
			                name, contact, date,time,room });
			 }
		 }
		
		
		}
	
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 43, 754, 362);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(dtm);
		table.getColumnModel().getColumn(3).setPreferredWidth(80);
		table.getColumnModel().getColumn(4).setPreferredWidth(92);
		table.setFont(new Font("Tahoma", Font.PLAIN, 11));
		table.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		scrollPane.setViewportView(table);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LandingFrame f= new LandingFrame(list);
				frame.dispose();
			}
		});
		btnBack.setBounds(638, 9, 89, 23);
		frame.getContentPane().add(btnBack);
		
		btnDelete = new JButton("Delete");
		
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=table.getSelectedRow();
				if(i==0) {
					list.delete_first();
				}
				else {
					list.delAppointment(i);
				}
				
				dtm.removeRow(i);
			}
		});
		btnDelete.setBounds(509, 9, 89, 23);
		frame.getContentPane().add(btnDelete);
		 if(refno.equals("0")) {
			 btnDelete.setEnabled(true);
		 }
		 else {
			 btnDelete.setEnabled(false);
		 }
		
	}
}
