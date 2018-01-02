package dao;
import java.sql.*;
import javax.swing.*;
public class dbConnection {

	dbConnection conn=null;
	public static Connection dbConnector() {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Mdictionary","root","1234");
			System.out.println("Başarılı");
			return conn;
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
}
