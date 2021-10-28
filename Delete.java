package examprj;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Delete extends JFrame {

	private JPanel contentPane;

	
	public Delete() {
		setTitle("Delete Patient Information");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Register No.");
		lblNewLabel_1.setBounds(47, 50, 72, 28);
		contentPane.add(lblNewLabel_1);
		
		JComboBox <String>comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(167, 53, 163, 22);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.setBounds(167, 147, 89, 23);
		contentPane.add(btnNewButton);
		try {
			Connection con=Eg2Connect.initializeDatabase();
			String sql="select * from record";
			PreparedStatement stmt=con.prepareStatement(sql);
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()) {
				
				String reg=rs.getString("reg_no");
				
				comboBox_1.addItem(reg);
				}
			
		}catch (Exception exp) {
			exp.printStackTrace();
		}
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String reg=(String)comboBox_1.getSelectedItem();
				try {
					Connection con=Eg2Connect.initializeDatabase();
					String sql="delete from record where reg_no=?";
					PreparedStatement stmt=con.prepareStatement(sql);
					stmt.setString(1,reg);
					stmt.executeUpdate();
					JOptionPane.showMessageDialog(null,"Successfully Deleted");
					
					
				}catch (Exception exe) {
					exe.printStackTrace();
				}
				
			}
		});
		
	}
}
