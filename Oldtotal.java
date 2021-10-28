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

public class Oldtotal extends JFrame {

	private JPanel contentPane;

	
	public Oldtotal() {
		setTitle("Old Total Attendance");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Old Total");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(62, 74, 62, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lbl = new JLabel("");
		lbl.setBounds(153, 74, 97, 24);
		contentPane.add(lbl);
		
		try {
			Connection con=Eg2Connect.initializeDatabase();
			String sql="select count(*) as Total from record where new_old='O'";
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
