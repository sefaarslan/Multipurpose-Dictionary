//*** SEFA ARSLAN
//*** Login Page

package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.DAO;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Login extends JFrame {
	
//** we have defined the variables that we need.
	
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the frame.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection connection=null;
	ResultSet rs=null;
	PreparedStatement pst=null;
	private JLabel label;
	private JButton btnBackToDictionary;
	
	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(264, 71, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setBounds(155, 76, 76, 16);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setBounds(155, 114, 76, 16);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(264, 109, 130, 26);
		contentPane.add(passwordField);
		
		//** Button Login settings 
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username=textField.getText();
				String password=String.valueOf(passwordField.getPassword());
				//System.out.println(name+" "+password);
				if(DAO.validate(username, password)){
					
					   
					   AdminPanel pnl=new AdminPanel();
					   pnl.setVisible(true);
				
				   JOptionPane.showMessageDialog(null, "Welcome to Admin Panel");
				}else{
					JOptionPane.showMessageDialog(null, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
					textField.setText("");
					passwordField.setText("");
				}
				}
			
		});
		btnLogin.setBounds(277, 177, 117, 29);
		contentPane.add(btnLogin);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getResource("/loginn.png")));
		label.setBounds(13, 29, 130, 139);
		contentPane.add(label);
		
		btnBackToDictionary = new JButton("Back to Dictionary");
		btnBackToDictionary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				mainPage pnl2=new mainPage();
				   pnl2.setVisible(true);
				
			}
		});
		btnBackToDictionary.setBounds(131, 177, 143, 29);
		contentPane.add(btnBackToDictionary);
	}
}
