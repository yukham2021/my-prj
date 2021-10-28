package examprj;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Diagnosis1 extends JFrame {

	private JPanel contentPane;
	private JTable table;

	
	public Diagnosis1() {
		setTitle("Diagnosis");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Vector<Object> columnname=new Vector<Object>();
		Vector<Vector<Object>> data=new Vector<Vector<Object>>();
		
		
		try{
		
			Connection con=Eg2Connect.initializeDatabase();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select dx_class,count(*) from record group by dx_class");
			ResultSetMetaData md=rs.getMetaData();
			int column=md.getColumnCount();
			
			for(int i=1;i<=column;i++) {
				columnname.addElement(md.getColumnName(i));
			
			while(rs.next()) {
					Vector<Object> row=new Vector<Object>(column);
					for (int r=1;r<=column;r++) {
						row.addElement(rs.getObject(r));
						data.addElement(row);
						}
		}
				}
		}catch (Exception e) {
			e.printStackTrace();
		}
		//create Default Table
		DefaultTableModel model=new DefaultTableModel(data,columnname){
			public Class getColumnClass(int column) {
			for (int row=0;row<getRowCount();row++) {
				Object o=getValueAt(row,column);
				if(o !=null) {
					return o.getClass();
				}
			}
		return Object.class;
		}	
		};
			
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 30, 800, 500);
		contentPane.add(scrollPane);
		
		table = new JTable(model);
		scrollPane.setViewportView(table);
	}

}
