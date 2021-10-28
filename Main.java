package examprj;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.sql.DriverManager;
import javax.swing.JSeparator;
public class Main extends JFrame {

	private JPanel contentPane;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setTitle("Out Patient Information");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(25, 25, 25, 25));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 444, 23);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("MENU");
		menuBar.add(mnNewMenu);
		
		JMenuItem addpt = new JMenuItem("Add New Pt");
		
		mnNewMenu.add(addpt);
		
		JMenuItem Pti = new JMenuItem("Show Pt Information");
		
		mnNewMenu.add(Pti);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Delete Information");
		
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Update Information");
		
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Exit");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(EXIT_ON_CLOSE);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_1 = new JMenu("ATTENDANCE");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_4 = new JMenu("All Total");
		mnNewMenu_1.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("New");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Newtotal Ntol=new Newtotal();
			Ntol.setVisible(true);
			}
		});
		mnNewMenu_4.add(mntmNewMenuItem_5);
		
		JSeparator separator = new JSeparator();
		mnNewMenu_4.add(separator);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Old");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Oldtotal Otol=new Oldtotal();
				Otol.setVisible(true);
			}
		});
		mnNewMenu_4.add(mntmNewMenuItem_6);
		
		JMenu mnNewMenu_5 = new JMenu("Male Total");
		mnNewMenu_1.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("New");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Malenew mn=new Malenew();
				mn.setVisible(true);
			}
		});
		mnNewMenu_5.add(mntmNewMenuItem_7);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu_5.add(separator_1);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Old");
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Maleold mo=new Maleold();
				mo.setVisible(true);
			}
		});
		mnNewMenu_5.add(mntmNewMenuItem_8);
		
		JMenu mnNewMenu_6 = new JMenu("Female Total");
		mnNewMenu_1.add(mnNewMenu_6);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("New");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Femalenew fn=new Femalenew();
				fn.setVisible(true);
			}
		});
		mnNewMenu_6.add(mntmNewMenuItem_9);
		
		JSeparator separator_2 = new JSeparator();
		mnNewMenu_6.add(separator_2);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Old");
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Femaleold fo=new Femaleold();
				fo.setVisible(true);
			}
		});
		mnNewMenu_6.add(mntmNewMenuItem_10);
		
		JMenu mnNewMenu_7 = new JMenu("Pre-School Total");
		mnNewMenu_1.add(mnNewMenu_7);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("New");
		mntmNewMenuItem_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Preschoolnew pn=new Preschoolnew();
				pn.setVisible(true);
			}
		});
		mnNewMenu_7.add(mntmNewMenuItem_11);
		
		JSeparator separator_3 = new JSeparator();
		mnNewMenu_7.add(separator_3);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Old");
		mntmNewMenuItem_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Preschoolold po=new Preschoolold();
				po.setVisible(true);
			}
		});
		mnNewMenu_7.add(mntmNewMenuItem_12);
		
		JMenu mnNewMenu_8 = new JMenu("School-Going Total");
		mnNewMenu_1.add(mnNewMenu_8);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("New");
		mntmNewMenuItem_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Schoolgoingnew sn=new Schoolgoingnew();
				sn.setVisible(true);
			}
		});
		mnNewMenu_8.add(mntmNewMenuItem_13);
		
		JSeparator separator_4 = new JSeparator();
		mnNewMenu_8.add(separator_4);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Old");
		mntmNewMenuItem_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Schoolgoingold so=new Schoolgoingold();
				so.setVisible(true);
			}
		});
		mnNewMenu_8.add(mntmNewMenuItem_14);
		
		JMenu mnNewMenu_9 = new JMenu("Adult Total");
		mnNewMenu_1.add(mnNewMenu_9);
		
		JMenuItem mntmNewMenuItem_15 = new JMenuItem("New ");
		mntmNewMenuItem_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adultnew an=new Adultnew();
				an.setVisible(true);
			}
		});
		mnNewMenu_9.add(mntmNewMenuItem_15);
		
		JSeparator separator_5 = new JSeparator();
		mnNewMenu_9.add(separator_5);
		
		JMenuItem mntmNewMenuItem_16 = new JMenuItem("Old");
		mntmNewMenuItem_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adultold ao=new Adultold();
				ao.setVisible(true);
			}
		});
		mnNewMenu_9.add(mntmNewMenuItem_16);
		
		JMenu mnNewMenu_2 = new JMenu("DIAGNOSIS");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Calculate");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Diagnosis1 dx=new Diagnosis1();
				dx.setVisible(true);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_3 = new JMenu("TREATMENT");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Calculate");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Treatment tx=new Treatment();
				tx.setVisible(true);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 30, 1345,650);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"serial_no", "reg_no", "pt_name", "age", "gender", "new_old", "address", "diagnosis","dx_class","treatment","tx_class","precription_medication"
			}
		));
		scrollPane.setViewportView(table);
		Pti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con=Eg2Connect.initializeDatabase();
					String sql="select * from record";
					PreparedStatement stmt=con.prepareStatement(sql);
					ResultSet rs=stmt.executeQuery();
					
					while(rs.next()){
						String srno=rs.getString("serial_no");
						String regno=rs.getString("reg_no");
						String name=rs.getString("pt_name");
					    String age=rs.getString("age");
						String sex=rs.getString("gender");
						String newold=rs.getString("new_old");
						String add=rs.getString("address");
						String dx=rs.getString("diagnosis");
						String dxc=rs.getString("dx_class");
						String tx=rs.getString("treatment");
						String txc=rs.getString("tx_class");
						String med=rs.getString("precription_medication");
						((DefaultTableModel)table.getModel()).addRow(new Object[] {srno,regno,name,age,sex,newold,add,dx,dxc,tx,txc,med});
					}	
					}
					catch (Exception exp){
					exp.printStackTrace();
				}
				}
			});
		
		addpt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Addpt reg=new Addpt();
				reg.setVisible(true);
			}
		});
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Delete dl=new Delete();
				dl.setVisible(true);
			}
		});	
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update1 update=new Update1();
				update.setVisible(true);
				
			}
		});
		
	}
	}
		

