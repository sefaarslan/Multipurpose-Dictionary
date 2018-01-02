package ui;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Statement;

import dao.DAO;
import dao.dbConnection;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class AdminPanel extends JFrame {
	
//** we have defined the variables that we need but they are public because we used them in DAO.
	
	private JPanel contentPane;
	public static JTextField textField;
	public static JTextField textField_1;
	public static JTextField textField_2;
	public static JTextField textField_3;
	public static JTextField textField_4;
	public static JTextField textField_5;
	public static JTextField textField_6;
	public static JTextField textField_7;
	public static JTextField textField_8;
	public static JTextField textField_9;
	public static JTextField textField_10;
	public static JTextField textField_11;

	/**
	 * Launch the frame.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPanel frame = new AdminPanel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminPanel() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 534, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTurkishMean = new JLabel("Turkish :");
		lblTurkishMean.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTurkishMean.setBounds(49, 39, 149, 23);
		contentPane.add(lblTurkishMean);
		
		textField = new JTextField();
		textField.setBounds(127, 38, 113, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblRelatedTurkishText = new JLabel(" Turkish Text :");
		lblRelatedTurkishText.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRelatedTurkishText.setBounds(9, 75, 189, 23);
		contentPane.add(lblRelatedTurkishText);
		
		textField_1 = new JTextField();
		textField_1.setBounds(127, 74, 113, 23);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblRelatedTurkishVideo = new JLabel("Turkish Video:");
		lblRelatedTurkishVideo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRelatedTurkishVideo.setBounds(9, 105, 149, 23);
		contentPane.add(lblRelatedTurkishVideo);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(127, 104, 113, 23);
		contentPane.add(textField_2);
		
		JLabel lblTurkishMp = new JLabel("Turkish Mp3 :");
		lblTurkishMp.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTurkishMp.setBounds(19, 134, 101, 23);
		contentPane.add(lblTurkishMp);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(127, 133, 113, 23);
		contentPane.add(textField_3);
		
		JLabel lblEnglish = new JLabel("English  :");
		lblEnglish.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEnglish.setBounds(49, 169, 82, 23);
		contentPane.add(lblEnglish);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(127, 165, 113, 23);
		contentPane.add(textField_4);
		
		JLabel lblEnglishText = new JLabel("English Text :");
		lblEnglishText.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEnglishText.setBounds(17, 197, 118, 23);
		contentPane.add(lblEnglishText);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(127, 193, 113, 23);
		contentPane.add(textField_5);
		
		JLabel lblEnglishVideo = new JLabel("English Video : ");
		lblEnglishVideo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEnglishVideo.setBounds(9, 227, 122, 23);
		contentPane.add(lblEnglishVideo);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(127, 223, 113, 23);
		contentPane.add(textField_6);
		
		JLabel lblEnglishMp = new JLabel("English Mp3 : ");
		lblEnglishMp.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEnglishMp.setBounds(19, 256, 112, 23);
		contentPane.add(lblEnglishMp);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(127, 252, 113, 23);
		contentPane.add(textField_7);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty() || textField_4.getText().isEmpty() || textField_8.getText().isEmpty() ||
						textField_1.getText().isEmpty() || textField_2.getText().isEmpty() || textField_3.getText().isEmpty() ||
						textField_5.getText().isEmpty() || textField_6.getText().isEmpty() || textField_7.getText().isEmpty() ||
						textField_9.getText().isEmpty() || textField_10.getText().isEmpty() || textField_11.getText().isEmpty()){
						JOptionPane.showMessageDialog(null, " Please fill in all the blanks about word.");
				}else {
					 DAO.insert();
					 setVisible(false);
						mainPage pnl2=new mainPage();
						   pnl2.setVisible(true);
				}		
}
		     });
				
		
		btnAdd.setBounds(380, 189, 101, 31);
		contentPane.add(btnAdd);
		
		JLabel lblSpanish = new JLabel("Spanish : ");
		lblSpanish.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSpanish.setBounds(294, 39, 101, 23);
		contentPane.add(lblSpanish);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(380, 38, 113, 23);
		contentPane.add(textField_8);
		
		JLabel lblSpanishText = new JLabel("Spanish Text :");
		lblSpanishText.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSpanishText.setBounds(257, 75, 118, 23);
		contentPane.add(lblSpanishText);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(380, 71, 113, 23);
		contentPane.add(textField_9);
		
		JLabel lblSpanishVideo = new JLabel("Spanish Video :");
		lblSpanishVideo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSpanishVideo.setBounds(257, 105, 118, 23);
		contentPane.add(lblSpanishVideo);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(380, 101, 113, 23);
		contentPane.add(textField_10);
		
		JLabel lblSpanishMp = new JLabel("Spanish Mp3 :");
		lblSpanishMp.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSpanishMp.setBounds(257, 133, 118, 23);
		contentPane.add(lblSpanishMp);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(380, 130, 113, 23);
		contentPane.add(textField_11);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty() || textField_4.getText().isEmpty() || textField_8.getText().isEmpty() ||
						textField_1.getText().isEmpty() || textField_2.getText().isEmpty() || textField_3.getText().isEmpty() ||
						textField_5.getText().isEmpty() || textField_6.getText().isEmpty() || textField_7.getText().isEmpty() ||
						textField_9.getText().isEmpty() || textField_10.getText().isEmpty() || textField_11.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, " Please fill in all the blanks about word.");
			}else {
				 DAO.update();
				 setVisible(false);
					mainPage pnl2=new mainPage();
					   pnl2.setVisible(true);
			}		
			}
		});
		btnUpdate.setBounds(380, 221, 101, 31);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty() || textField_4.getText().isEmpty() || textField_8.getText().isEmpty() ||
						textField_1.getText().isEmpty() || textField_2.getText().isEmpty() || textField_3.getText().isEmpty() ||
						textField_5.getText().isEmpty() || textField_6.getText().isEmpty() || textField_7.getText().isEmpty() ||
						textField_9.getText().isEmpty() || textField_10.getText().isEmpty() || textField_11.getText().isEmpty()){
						JOptionPane.showMessageDialog(null, " Please fill in all the blanks about word.");
				}else {
					 DAO.delete();
					 setVisible(false);
						mainPage pnl2=new mainPage();
						   pnl2.setVisible(true);
				}		
			}
		});
		btnDelete.setBounds(380, 255, 101, 31);
		contentPane.add(btnDelete);
		
		JButton btnWordList = new JButton("Back to Mainpage");
		btnWordList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				mainPage pnl2=new mainPage();
				   pnl2.setVisible(true);
				
			}
		});
		btnWordList.setBounds(29, 301, 142, 29);
		contentPane.add(btnWordList);
		
		JLabel lblNewLabel = new JLabel("*** Please enter a link like this..");
		lblNewLabel.setBounds(271, 287, 199, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("https://youtu.be/i5or-7fC6to?t=25s");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(294, 314, 234, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("*** Please fill in all the blanks about word.");
		lblNewLabel_2.setBounds(49, 6, 274, 16);
		contentPane.add(lblNewLabel_2);
	}
}
