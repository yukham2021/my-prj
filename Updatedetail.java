package examprj;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Updatedetail extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt3;
	private JTextField txt2;
	private JTextField txt4;
	private JTextField txt5;
	private JTextField txt7;
	private JTextField txt6;
	private JTextField txt8;
	private JTextField txt9;
	private JTextField txt10;

	
	public Updatedetail(String reg) {
		setTitle("Register Patient");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sr No.");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Reg No.");
		lblNewLabel_1.setBounds(218, 11, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Patient Name");
		lblNewLabel_2.setBounds(10, 36, 73, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Age");
		lblNewLabel_3.setBounds(10, 72, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setBounds(218, 72, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Address");
		lblNewLabel_5.setBounds(10, 97, 73, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New/Old");
		lblNewLabel_6.setBounds(218, 97, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Diagnosis");
		lblNewLabel_7.setBounds(10, 130, 73, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Diagnosis Category");
		lblNewLabel_8.setBounds(167, 130, 119, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Treatment");
		lblNewLabel_9.setBounds(10, 167, 73, 14);
		contentPane.add(lblNewLabel_9);
		
		String dxc[]= {"Caries","Pulpitis","Periodontitis","Gingivitis","Stomatitis","Ulcer of the oral cavity","Pericoronitis","Abscess","Cellulitis","Injuries","Eruption(Shedding,Retained)","Attrition","Erosion","Cancer","Impaction","Others"};
		JComboBox comboBox = new JComboBox(dxc);
		comboBox.setBounds(296, 130, 138, 22);
		contentPane.add(comboBox);
		
		String txc[]= {"Permanent teeth Extraction","Temporary","Prophylaxis","Composit filling","Glass ionomer filling","Temporary filling","Root Canal Treatment","Surgical Treatment","Pre & post operative follow up care","Feedback to Referrals to BHS & School Teachers","Referrals to Reference Teaching Hospitals","Feedback Referrals from Reference/Teaching Hospitals","Others"};
		JComboBox comboBox_1 = new JComboBox(txc);
		comboBox_1.setBounds(296, 163, 138, 22);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_10 = new JLabel("Treatment Category");
		lblNewLabel_10.setBounds(167, 166, 119, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Medication  Precription");
		lblNewLabel_11.setBounds(10, 201, 132, 14);
		contentPane.add(lblNewLabel_11);
		
		txt1 = new JTextField();
		txt1.setBounds(83, 8, 86, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt3 = new JTextField();
		txt3.setBounds(83, 33, 86, 20);
		contentPane.add(txt3);
		txt3.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(296, 8, 86, 20);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		txt4 = new JTextField();
		txt4.setBounds(83, 69, 86, 20);
		contentPane.add(txt4);
		txt4.setColumns(10);
		
		txt5 = new JTextField();
		txt5.setBounds(296, 69, 86, 20);
		contentPane.add(txt5);
		txt5.setColumns(10);
		
		txt7 = new JTextField();
		txt7.setBounds(83, 94, 86, 20);
		contentPane.add(txt7);
		txt7.setColumns(10);
		
		txt6 = new JTextField();
		txt6.setBounds(296, 94, 86, 20);
		contentPane.add(txt6);
		txt6.setColumns(10);
		
		txt8 = new JTextField();
		txt8.setBounds(83, 127, 86, 20);
		contentPane.add(txt8);
		txt8.setColumns(10);
		
		txt9 = new JTextField();
		txt9.setBounds(83, 164, 86, 20);
		contentPane.add(txt9);
		txt9.setColumns(10);
		
		txt10 = new JTextField();
		txt10.setBounds(141, 198, 283, 20);
		contentPane.add(txt10);
		txt10.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(160, 229, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String srno=txt1.getText();
				String regg=txt2.getText();
				String name=txt3.getText();
				String age=txt4.getText();
				String sex=txt5.getText();
				String newold=txt6.getText();
				String add=txt7.getText();
				String dx=txt8.getText();
				String dxc=(String)comboBox.getSelectedItem();
				String tx=txt9.getText();
				String txc=(String)comboBox_1.getSelectedItem();
				String med=txt10.getText();
				
				try {
					Connection con=Eg2Connect.initializeDatabase();
					String sql="UPDATE record SET serial_no=?,reg_no=?,pt_name=?,age=?,gender=?,new_old=?,address=?,diagnosis=?,dx_class=?,treatment=?,tx_class=?,precription_medication=? where reg_no=?";
					PreparedStatement stmt=con.prepareStatement(sql);
					stmt.setString(1, srno);
					stmt.setString(2, regg);
					stmt.setString(3, name);
					stmt.setString(4, age);
					stmt.setString(5, sex);
					stmt.setString(6, newold);
					stmt.setString(7, add);
					stmt.setString(8, dx);
					stmt.setString(9, dxc);
					stmt.setString(10, tx);
					stmt.setString(11,txc);
					stmt.setString(12, med);
					stmt.setString(13,reg);
					stmt.executeUpdate();
					txt1.setText("");
					txt2.setText("");
					txt3.setText("");
					txt4.setText("");
					txt5.setText("");
					txt6.setText("");
					txt7.setText("");
					txt8.setText("");
					txt9.setText("");
					txt10.setText("");
					JOptionPane.showMessageDialog(null,"Successfully Registered");
					}catch(Exception x) {
					x.printStackTrace();
				}
			}
		});
		try {
			Connection con=Eg2Connect.initializeDatabase();
			String sql="Select * from record where reg_no=?";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setString(1,reg);
			ResultSet rs=stmt.executeQuery();
			
			while (rs.next()) {
				String srno=rs.getString("serial_no");
				String name=rs.getString("pt_name");
				String age=rs.getString("age");
				String sex=rs.getString("gender");
				String newold=rs.getString("new_old");
				String add=rs.getString("address");
				String dx=rs.getString("diagnosis");
				String dxc1=rs.getString("dx_class");
				String tx=rs.getString("treatment");
				String txc1=rs.getString("tx_class");
				String med=rs.getString("precription_medication");
				txt1.setText(srno);
				txt2.setText(reg);
				txt3.setText(name);
				txt4.setText(age);
				txt5.setText(sex);
				txt6.setText(newold);
				txt7.setText(add);
				txt8.setText(dx);
				txt9.setText(tx);
				txt10.setText(med);
				
			}
			
		}catch (Exception c) {
			c.printStackTrace();
		}
			
		
		
	}
}
