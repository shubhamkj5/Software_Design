package assignment;
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
	private int refno;
	private JTable table;
	public static BSTree bstree=BSTree.getInstance();
	public static HashTable htable=HashTable.getInstance();
	private JButton btnBack;
	private JButton btnDelete;
	int refarr[] =null;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DetailFrame window = new DetailFrame("0");
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
	public DetailFrame(String refno) {

		this.refno=Integer.parseInt(refno);
		initialize();
		frame.setVisible(true);


	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		BSTIterator bite=new BSTIterator(bstree.head);


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

		int temp=0;
		while(bite.hasNext()){
		
			temp=bite.next();
			
			bite.next();
			if(temp!=0 && temp!=-1 ) {
				String bst_aname=bstree.search(temp).getaname();
				String bst_acontact=bstree.search(temp).getacontact();
				String bst_name=bstree.search(temp).getName();
				String bst_contact=bstree.search(temp).getContact();
				int bst_ref=bstree.search(temp).getRefno();
				String bst_room=bstree.search(temp).getRoom();
				String bst_time=bstree.search(temp).getTime();
				String bst_date=bstree.search(temp).getDate();
				
				String htab_aname=bstree.search(temp).getaname();
				String htab_acontact=bstree.search(temp).getacontact();
				String htab_name=bstree.search(temp).getName();
				String htab_contact=bstree.search(temp).getContact();
				int htab_ref=bstree.search(temp).getRefno();
				String htab_room=bstree.search(temp).getRoom();
				String htab_time=bstree.search(temp).getTime();
				String htab_date=bstree.search(temp).getDate();
				
				if(refno==1010) {
					
					dtm.addRow(new Object[] { htab_ref, htab_aname, htab_acontact,
							htab_name, htab_contact, htab_date,htab_time,htab_room });
				
				}
				else {
					
					if(bst_ref==refno) {
						
						dtm.addRow(new Object[] { bst_ref, bst_aname, bst_acontact,
								bst_name,bst_contact, bst_date,bst_time,bst_room });
					}
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
				LandingFrame f= new LandingFrame();
				frame.dispose();
			}
		});
		btnBack.setBounds(638, 9, 89, 23);
		frame.getContentPane().add(btnBack);

	/*	btnDelete = new JButton("Delete");

		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=table.getSelectedRow();
				if(i==0) {
					//list.delete_first();
				}
				else {
					//list.delAppointment(i);
				}

				//dtm.removeRow(i);
			}
		});
		btnDelete.setBounds(509, 9, 89, 23);
		frame.getContentPane().add(btnDelete);
		if(refno==0) {
			btnDelete.setEnabled(true);
		}
		else {
			btnDelete.setEnabled(false);
		}*/

	}
}
