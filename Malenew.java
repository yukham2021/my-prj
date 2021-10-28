package examprj;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Malenew extends JFrame {

	private JPanel contentPane;

	
	public Malenew() {
		setTitle("Male New Total");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New Male");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(54, 74, 64, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lbl = new JLabel("");
		lbl.setBounds(154, 74, 88, 25);
		contentPane.add(lbl);
		
		try {
			Connection con=Eg2Connect.initializeDatabase();
			String sql="select count(*) as Total from record where gender='M' and new_old='N'";
			PreparedStatement stmt=con.prepareStatement(sql);
			ResultSet rs=stmt.executeQuery();
			while (rs.next()){
				String tol=rs.getString("Total");	
				lbl.setText(tol);
			}
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
