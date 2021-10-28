package examprj;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.UIManager;
import java.awt.Color;

public class Addpt extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JTextField txt7;
	private JTextField txt8;
	private JTextField txt9;
	private JTextField txt10;
	private JTextField txt5;
	private JTextField txt6;

	
	public Addpt() {
		setBackground(Color.WHITE);
		setTitle("Register Patient");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.CYAN);
		contentPane.setBorder(UIManager.getBorder("EditorPane.border"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sr No.");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Reg No.");
		lblNewLabel_1.setBounds(192, 11, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Patient Name");
		lblNewLabel_2.setBounds(10, 39, 94, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Age");
		lblNewLabel_3.setBounds(10, 81, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setBounds(192, 81, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Address");
		lblNewLabel_5.setBounds(10, 106, 63, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New/Old");
		lblNewLabel_6.setBounds(192, 106, 63, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Diagnosis");
		lblNewLabel_7.setBounds(10, 137, 63, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Treatment");
		lblNewLabel_8.setBounds(10, 162, 63, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Medication Precription");
		lblNewLabel_9.setBounds(10, 201, 137, 14);
		contentPane.add(lblNewLabel_9);
		
		JButton btnReg = new JButton("Register");
		btnReg.setBounds(180, 229, 89, 23);
		contentPane.add(btnReg);
		
		JLabel lblNewLabel_10 = new JLabel("Diagnosis Category");
		lblNewLabel_10.setBounds(173, 137, 116, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Treatment Category");
		lblNewLabel_11.setBounds(173, 162, 116, 14);
		contentPane.add(lblNewLabel_11);
		
		txt1 = new JTextField();
		txt1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					txt2.requestFocus();
				}
			}
		});
		txt1.setBounds(86, 8, 86, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					txt3.requestFocus();}}}
			
		);
			
		
		txt2.setBounds(287, 8, 86, 20);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		txt3 = new JTextField();
		txt3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
				txt4.requestFocus();
			}
		}});
		txt3.setBounds(86, 36, 86, 20);
		contentPane.add(txt3);
		txt3.setColumns(10);
		
		txt4 = new JTextField();
		txt4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					txt5.requestFocus();
				}}
		});
		txt4.setBounds(86, 78, 86, 20);
		contentPane.add(txt4);
		txt4.setColumns(10);
		
		txt7 = new JTextField();
		txt7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					txt6.requestFocus();
				}}
		});
		txt7.setBounds(86, 103, 86, 20);
		contentPane.add(txt7);
		txt7.setColumns(10);
		
		txt8 = new JTextField();
		txt8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					txt9.requestFocus();
				}}
		});
		txt8.setBounds(86, 134, 86, 20);
		contentPane.add(txt8);
		txt8.setColumns(10);
		
		txt9 = new JTextField();
		txt9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					txt10.requestFocus();
				}}
		});
		txt9.setBounds(86, 159, 86, 20);
		contentPane.add(txt9);
		txt9.setColumns(10);
		
		txt10 = new JTextField();
		txt10.setBounds(149, 198, 275, 20);
		contentPane.add(txt10);
		txt10.setColumns(10);
		
		String dxc[]= {"Caries","Pulpitis","Periodontitis","Gingivitis","Stomatitis","Ulcer of the oral cavity","Pericoronitis","Abscess","Cellulitis","Injuries","Eruption(Shedding,Retained)","Attrition","Erosion","Cancer","Impaction","Others"};
		JComboBox comboBox = new JComboBox(dxc);
		comboBox.setBounds(287, 133, 137, 22);
		contentPane.add(comboBox);
		
		String txc[]= {"Permanent teeth Extraction","Temporary","Prophylaxis","Composit filling","Glass ionomer filling","Temporary filling","Root Canal Treatment","Surgical Treatment","Pre & post operative follow up care","Feedback to Referrals to BHS & School Teachers","Referrals to Reference Teaching Hospitals","Feedback Referrals from Reference/Teaching Hospitals","Others"};
		JComboBox comboBox_1 = new JComboBox(txc);
		comboBox_1.setBounds(287, 158, 137, 22);
		contentPane.add(comboBox_1);
		
		txt5 = new JTextField();
		txt5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					txt7.requestFocus();
				}}
		});
		txt5.setBounds(287, 78, 86, 20);
		contentPane.add(txt5);
		txt5.setColumns(10);
		
		txt6 = new JTextField();
		txt6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					txt8.requestFocus();
				}}
		});
		txt6.setBounds(287, 103, 86, 20);
		contentPane.add(txt6);
		txt6.setColumns(10);
		
		btnReg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String srno=txt1.getText();
				String regno=txt2.getText();
				String name=txt3.getText();
				String age=txt4.getText();
				String sex = txt5.getText();
				String newold =txt6.getText();
			    String add=txt7.getText();
				String dx=txt8.getText();
				String tx=txt9.getText();
				String med=txt10.getText();
				String dxc=comboBox.getSelectedItem().toString();
				String txc=comboBox_1.getSelectedItem().toString();
				try {
					Connection con=Eg2Connect.initializeDatabase();
					String sql="INSERT INTO examprj.record(serial_no,reg_no,pt_name,age,gender,new_old,address,diagnosis,dx_class,treatment,tx_class,precription_medication) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement stmt=con.prepareStatement(sql);
					stmt.setString(1,srno);
					stmt.setString(2,regno);
					stmt.setString(3,name);
					stmt.setString(4,age);
					stmt.setString(5,sex);
					stmt.setString(6,newold);
					stmt.setString(7,add);
					stmt.setString(8,dx);
					stmt.setString(9,dxc);
					stmt.setString(10,tx);
					stmt.setString(11,txc);
					stmt.setString(12,med);
					stmt.executeUpdate();
					JOptionPane.showMessageDialog(null,"Successfully registered");
					txt1.setText("");
					txt2.setText("");
					txt3.setText("");
					txt4.setText("");
					txt5.setText("");
					txt6.setText("");
					txt7.setText("");
					txt8.setText("");
					txt10.setText("");
					txt9.setText("");
				
				}catch (Exception exc) {
					exc.printStackTrace();
				}
				
			}
		});
	}
}
