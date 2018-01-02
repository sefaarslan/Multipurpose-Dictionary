//*** SEFA ARSLAN
//*** Database Connection Operations

package dao;
import java.io.IOException;
import java.sql.*;

import javax.swing.JOptionPane;

import ui.AdminPanel;
import ui.mainPage;

public class DAO {

	//*** In section that validate with database.
	
	public static boolean validate(String username,String password){
		boolean status=false;
		try{
			Connection connection=dbConnection.dbConnector();
			String query="Select * from Admin where userName=? and password=?";
			PreparedStatement pst=connection.prepareStatement(query);
			//pst.setString(1,textField.getText());
		//	pst.setString(2,String.valueOf(passwordField.getPassword()));
			pst.setString(1,username);
			pst.setString(2,password);
			ResultSet rs=pst.executeQuery();
			status=rs.next();
			connection.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	
	//* Application connect the database and admin insert word information in this function.
	
	public static void insert(){
		
		try {		
				Connection connection=dbConnection.dbConnector();
				String query = "insert into Name (tr_name,en_name,sp_name) values( ?,?,?)";
				PreparedStatement ps;
				ps = connection.prepareStatement(query);
				ps.setString(1,AdminPanel.textField.getText());
				ps.setString(2,AdminPanel.textField_4.getText());
				ps.setString(3,AdminPanel.textField_8.getText());
				 ps.executeUpdate();						
				connection.close();		
			
		} catch (SQLException e1) {

			e1.printStackTrace();
		}
		//****
		try {
			Connection connection=dbConnection.dbConnector();
			String query = "insert into Video (tr_video,en_video,sp_video) values( ?,?,?)";
			PreparedStatement ps;
			ps = connection.prepareStatement(query);
			ps.setString(1,AdminPanel.textField_2.getText());
			ps.setString(2,AdminPanel.textField_6.getText());
			ps.setString(3,AdminPanel.textField_10.getText());
			 ps.executeUpdate();
			
			
			connection.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//****
		try {
			Connection connection=dbConnection.dbConnector();
			String query = "insert into Mp3 (tr_mp3,en_mp3,sp_mp3) values( ?,?,?)";
			PreparedStatement ps;
			ps = connection.prepareStatement(query);
			ps.setString(1,AdminPanel.textField_3.getText());
			ps.setString(2,AdminPanel.textField_7.getText());
			ps.setString(3,AdminPanel.textField_11.getText());
			 ps.executeUpdate();
			
			
			connection.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Connection connection=dbConnection.dbConnector();
			String query = "insert into Text (tr_text,en_text,sp_text) values( ?,?,?)";
			PreparedStatement ps;
			ps = connection.prepareStatement(query);
			ps.setString(1,AdminPanel.textField_1.getText());
			ps.setString(2,AdminPanel.textField_5.getText());
			ps.setString(3,AdminPanel.textField_9.getText());
			ps.executeUpdate();
			connection.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, "Saved");
		
	}
	
//********
//* Application connect the database and admin delete word information in this function.

public static void delete(){
		
		try {
			Connection connection=dbConnection.dbConnector();
			String query = "DELETE FROM Name WHERE tr_name=?,en_name=?,sp_name=?";
			PreparedStatement ps;
			ps = connection.prepareStatement(query);
			ps.setString(1,AdminPanel.textField.getText());
			ps.setString(2,AdminPanel.textField_4.getText());
			ps.setString(3,AdminPanel.textField_8.getText());
			 ps.executeUpdate();
			
			
			connection.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//****
		try {
			Connection connection=dbConnection.dbConnector();
			String query = "DELETE FROM Video WHERE tr_video=?,en_video=?,sp_video=?";
			PreparedStatement ps;
			ps = connection.prepareStatement(query);
			ps.setString(1,AdminPanel.textField_2.getText());
			ps.setString(2,AdminPanel.textField_6.getText());
			ps.setString(3,AdminPanel.textField_10.getText());
			 ps.executeUpdate();
			
			
			connection.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//****
		try {
			Connection connection=dbConnection.dbConnector();
			String query = "DELETE FROM Mp3 WHERE tr_mp3=?,en_mp3=?,sp_mp3=?";
			PreparedStatement ps;
			ps = connection.prepareStatement(query);
			ps.setString(1,AdminPanel.textField_3.getText());
			ps.setString(2,AdminPanel.textField_7.getText());
			ps.setString(3,AdminPanel.textField_11.getText());
			 ps.executeUpdate();
			
			
			connection.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Connection connection=dbConnection.dbConnector();
			String query = "DELETE FROM Text WHERE tr_text=?,en_text=?,sp_text=?";
			PreparedStatement ps;
			ps = connection.prepareStatement(query);
			ps.setString(1,AdminPanel.textField_1.getText());
			ps.setString(2,AdminPanel.textField_5.getText());
			ps.setString(3,AdminPanel.textField_9.getText());
			 ps.executeUpdate();
			
			
			connection.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, "Deleted");
	}

//******************
//* Application connect the database and admin update word information in this function.

public static void update(){
	
	try {
		Connection connection=dbConnection.dbConnector();
		String query = "UPDATE Name SET tr_name=?,en_name=?,sp_name=?";
		PreparedStatement ps;
		ps = connection.prepareStatement(query);
		ps.setString(1,AdminPanel.textField.getText());
		ps.setString(2,AdminPanel.textField_4.getText());
		ps.setString(3,AdminPanel.textField_8.getText());
		 ps.executeUpdate();
		
		
		connection.close();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	//****
	try {
		Connection connection=dbConnection.dbConnector();
		String query = "UPDATE Video SET tr_video=?,en_video=?,sp_video=?";
		PreparedStatement ps;
		ps = connection.prepareStatement(query);
		ps.setString(1,AdminPanel.textField_2.getText());
		ps.setString(2,AdminPanel.textField_6.getText());
		ps.setString(3,AdminPanel.textField_10.getText());
		 ps.executeUpdate();
		
		
		connection.close();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	//****
	try {
		Connection connection=dbConnection.dbConnector();
		String query = "UPDATE Mp3 SET tr_mp3=?,en_mp3=?,sp_mp3=?";
		PreparedStatement ps;
		ps = connection.prepareStatement(query);
		ps.setString(1,AdminPanel.textField_3.getText());
		ps.setString(2,AdminPanel.textField_7.getText());
		ps.setString(3,AdminPanel.textField_11.getText());
		 ps.executeUpdate();
		
		
		connection.close();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		Connection connection=dbConnection.dbConnector();
		String query = "UPDATE Text SET tr_text=?,en_text=?,sp_text=?";
		PreparedStatement ps;
		ps = connection.prepareStatement(query);
		ps.setString(1,AdminPanel.textField_1.getText());
		ps.setString(2,AdminPanel.textField_5.getText());
		ps.setString(3,AdminPanel.textField_9.getText());
		 ps.executeUpdate();
		
		
		connection.close();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	JOptionPane.showMessageDialog(null, "Updated");
}

//*********************

		
}
