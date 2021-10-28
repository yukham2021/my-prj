package examprj;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.protocol.Resultset;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Update1 extends JFrame {

	private JPanel contentPane;

	

	
	public Update1() {
		setTitle("Update");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select Patient Reg No");
		lblNewLabel.setBounds(10, 87, 140, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Register Number List");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(143, 22, 140, 22);
		contentPane.add(lblNewLabel_1);
		
		JComboBox <String>comboBox = new JComboBox<String>();
		comboBox.setBounds(179, 87, 187, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Edit");
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(175, 175, 89, 30);
		contentPane.add(btnNewButton);
		
		
		try {
			Connection con=Eg2Connect.initializeDatabase();
			String sql="select * from record";
			PreparedStatement stmt=con.prepareStatement(sql);
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()) {
				String reg=rs.getString("reg_no");
				comboBox.addItem(reg);
				
			}
			
			
		}catch(Exception cep) {
			cep.printStackTrace();
		}
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String reg=(String)comboBox.getSelectedItem();
				Updatedetail detail=new Updatedetail(reg);
				detail.setVisible(true);
				
			}
		});
	}
}
