//*** SEFA ARSLAN
//*** Dictionary Mainpage 

package ui;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.dbConnection;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;

public class mainPage extends JFrame {

	//** we have defined the variables that we need.
	
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTextField entext;
	private JTextField trtext;
	private JTextField sptext;
	private JLabel lblEnterTheWord;
	private JLabel lblTurkish;
	private JLabel lblEnglish;
	private JLabel lblSpanish;
	private JButton btnVideo;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JLabel lblSefaArslan;

	/**
	 * Launch the frame.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainPage frame = new mainPage();
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
	public mainPage() {
		Connection connection=dbConnection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				   setVisible(false);
				   Login pnl=new Login();
				   pnl.setVisible(true);
			}
		});
		btnLogin.setBounds(327, 14, 117, 29);
		contentPane.add(btnLogin);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				
				try {
					String query="Select * from Name where tr_name=? ";
					PreparedStatement ps;
					ps = connection.prepareStatement(query);
					
					
					
					ps.setString(1,textField.getText());
					
					ResultSet rs=ps.executeQuery();
					
					if(rs.next()){
						String val0=rs.getString("en_name");
						entext.setText(val0);
						String val1=rs.getString("sp_name");
						sptext.setText(val1);
						String val2=rs.getString("tr_name");
						trtext.setText(val2);
					}
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				try {
					String query="Select * from Name where en_name=? ";
					PreparedStatement ps;
					ps = connection.prepareStatement(query);
					
					
					
					ps.setString(1,textField.getText());
					
					ResultSet rs=ps.executeQuery();
					
					if(rs.next()){
						String val0=rs.getString("en_name");
						entext.setText(val0);
						String val1=rs.getString("sp_name");
						sptext.setText(val1);
						String val2=rs.getString("tr_name");
						trtext.setText(val2);
					}
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				

				try {
					String query="Select * from Name where sp_name=? ";
					PreparedStatement ps;
					ps = connection.prepareStatement(query);
					
					
					
					ps.setString(1,textField.getText());
					
					ResultSet rs=ps.executeQuery();
					
					if(rs.next()){
						String val0=rs.getString("en_name");
						entext.setText(val0);
						String val1=rs.getString("sp_name");
						sptext.setText(val1);
						String val2=rs.getString("tr_name");
						trtext.setText(val2);
					}
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		textField.setBounds(111, 47, 136, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		table = new JTable();
		table.setBounds(186, 110, -113, 38);
		contentPane.add(table);
		
		 entext = new JTextField();
		 entext.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		entext.setBounds(111, 139, 130, 29);
		contentPane.add(entext);
		entext.setColumns(10);
		
		trtext = new JTextField();
		trtext.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		trtext.setBounds(111, 101, 130, 29);
		contentPane.add(trtext);
		trtext.setColumns(10);
		
		sptext = new JTextField();
		sptext.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		sptext.setBounds(111, 180, 130, 27);
		contentPane.add(sptext);
		sptext.setColumns(10);
		
		lblEnterTheWord = new JLabel("Enter the word you want to translate.");
		lblEnterTheWord.setBounds(81, 19, 242, 16);
		contentPane.add(lblEnterTheWord);
		
		lblTurkish = new JLabel("Turkish :");
		lblTurkish.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblTurkish.setBounds(39, 103, 69, 26);
		contentPane.add(lblTurkish);
		
		lblEnglish = new JLabel("English :");
		lblEnglish.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblEnglish.setBounds(38, 147, 61, 16);
		contentPane.add(lblEnglish);
		
		lblSpanish = new JLabel("Spanish :");
		lblSpanish.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblSpanish.setBounds(39, 186, 69, 16);
		contentPane.add(lblSpanish);
		
		btnVideo = new JButton("");
		btnVideo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					if(textField.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Please");
						
					}else{
						try {
							
							String query="Select Video.id_video,Video.tr_video,Name.tr_name from Video Inner join Name on Name.id_name=Video.id_video where tr_name=?";
							PreparedStatement ps;
							ps = connection.prepareStatement(query);
							ps.setString(1,textField.getText());
							
							ResultSet rs=ps.executeQuery();
							if(rs.next()){
								String val0=rs.getString("tr_video");
								java.awt.Desktop.getDesktop().browse(java.net.URI.create(val0));				
							}	
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						
						///-------------------------------
                         try {
							
							String query="Select Video.id_video,Video.tr_video,Name.en_name from Video Inner join Name on Name.id_name=Video.id_video where en_name=?";
							PreparedStatement ps;
							ps = connection.prepareStatement(query);
							ps.setString(1,textField.getText());
							
							ResultSet rs=ps.executeQuery();
							if(rs.next()){
								String val0=rs.getString("tr_video");
								java.awt.Desktop.getDesktop().browse(java.net.URI.create(val0));				
							}	
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						///-----------------------------------
                         try {
 							
 							String query="Select Video.id_video,Video.tr_video,Name.en_name from Video Inner join Name on Name.id_name=Video.id_video where sp_name=?";
 							PreparedStatement ps;
 							ps = connection.prepareStatement(query);
 							ps.setString(1,textField.getText());
 							
 							ResultSet rs=ps.executeQuery();
 							if(rs.next()){
 								String val0=rs.getString("tr_video");
 								java.awt.Desktop.getDesktop().browse(java.net.URI.create(val0));				
 							}	
 						} catch (SQLException e1) {
 							// TODO Auto-generated catch block
 							e1.printStackTrace();
 						} catch (IOException e1) {
 							// TODO Auto-generated catch block
 							e1.printStackTrace();
 						}
                         
					}

		}		
		});
		btnVideo.setIcon(new ImageIcon(this.getClass().getResource("/video3.png")));
		btnVideo.setBounds(253, 101, 48, 28);
		contentPane.add(btnVideo);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please");
					
				}else{
					try {
						
						String query="Select Video.id_video,Video.en_video,Name.tr_name from Video Inner join Name on Name.id_name=Video.id_video where tr_name=?";
						PreparedStatement ps;
						ps = connection.prepareStatement(query);
						ps.setString(1,textField.getText());
						
						ResultSet rs=ps.executeQuery();
						if(rs.next()){
							String val0=rs.getString("en_video");
							java.awt.Desktop.getDesktop().browse(java.net.URI.create(val0));				
						}	
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					///-------------------------------
                     try {
						
						String query="Select Video.id_video,Video.en_video,Name.en_name from Video Inner join Name on Name.id_name=Video.id_video where en_name=?";
						PreparedStatement ps;
						ps = connection.prepareStatement(query);
						ps.setString(1,textField.getText());
						
						ResultSet rs=ps.executeQuery();
						if(rs.next()){
							String val0=rs.getString("en_video");
							java.awt.Desktop.getDesktop().browse(java.net.URI.create(val0));				
						}	
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					///-----------------------------------
                     try {
							
							String query="Select Video.id_video,Video.en_video,Name.en_name from Video Inner join Name on Name.id_name=Video.id_video where sp_name=?";
							PreparedStatement ps;
							ps = connection.prepareStatement(query);
							ps.setString(1,textField.getText());
							
							ResultSet rs=ps.executeQuery();
							if(rs.next()){
								String val0=rs.getString("en_video");
								java.awt.Desktop.getDesktop().browse(java.net.URI.create(val0));				
							}	
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
                     
				}
				
			}
		});
		button.setBounds(253, 139, 48, 29);
		button.setIcon(new ImageIcon(this.getClass().getResource("/video3.png")));
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please");
					
				}else{
					try {
						
						String query="Select Video.id_video,Video.sp_video,Name.tr_name from Video Inner join Name on Name.id_name=Video.id_video where tr_name=?";
						PreparedStatement ps;
						ps = connection.prepareStatement(query);
						ps.setString(1,textField.getText());
						
						ResultSet rs=ps.executeQuery();
						if(rs.next()){
							String val0=rs.getString("sp_video");
							java.awt.Desktop.getDesktop().browse(java.net.URI.create(val0));				
						}	
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					///-------------------------------
                     try {
						
						String query="Select Video.id_video,Video.sp_video,Name.en_name from Video Inner join Name on Name.id_name=Video.id_video where en_name=?";
						PreparedStatement ps;
						ps = connection.prepareStatement(query);
						ps.setString(1,textField.getText());
						
						ResultSet rs=ps.executeQuery();
						if(rs.next()){
							String val0=rs.getString("sp_video");
							java.awt.Desktop.getDesktop().browse(java.net.URI.create(val0));				
						}	
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					///-----------------------------------
                     try {
							
							String query="Select Video.id_video,Video.en_video,Name.sp_name from Video Inner join Name on Name.id_name=Video.id_video where sp_name=?";
							PreparedStatement ps;
							ps = connection.prepareStatement(query);
							ps.setString(1,textField.getText());
							
							ResultSet rs=ps.executeQuery();
							if(rs.next()){
								String val0=rs.getString("sp_video");
								java.awt.Desktop.getDesktop().browse(java.net.URI.create(val0));				
							}	
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
                     
				}
			}
		});
		button_1.setBounds(253, 181, 48, 29);
		
		button_1.setIcon(new ImageIcon(this.getClass().getResource("/video3.png")));
		contentPane.add(button_1);
		
		button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please");
					
				}else{
					try {
						
						String query="Select Mp3.id_mp3,Mp3.tr_mp3,Name.tr_name from Mp3 Inner join Name on Name.id_name=Mp3.id_mp3 where tr_name=?";
						PreparedStatement ps;
						ps = connection.prepareStatement(query);
						ps.setString(1,textField.getText());
						
						ResultSet rs=ps.executeQuery();
						if(rs.next()){
							String val0=rs.getString("tr_mp3");
							java.awt.Desktop.getDesktop().browse(java.net.URI.create(val0));				
						}	
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					///-------------------------------
                     try {
						
						String query="Select Mp3.id_mp3,Mp3.tr_mp3,Name.en_name from Mp3 Inner join Name on Name.id_name=Mp3.id_mp3 where en_name=?";
						PreparedStatement ps;
						ps = connection.prepareStatement(query);
						ps.setString(1,textField.getText());
						
						ResultSet rs=ps.executeQuery();
						if(rs.next()){
							String val0=rs.getString("tr_mp3");
							java.awt.Desktop.getDesktop().browse(java.net.URI.create(val0));				
						}	
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					///-----------------------------------
                     try {
							
							String query="Select Mp3.id_mp3,Mp3.tr_mp3,Name.sp_name from Mp3 Inner join Name on Mp3.id_mp3=Name.id_name where sp_name=?";
							PreparedStatement ps;
							ps = connection.prepareStatement(query);
							ps.setString(1,textField.getText());
							
							ResultSet rs=ps.executeQuery();
							if(rs.next()){
								String val0=rs.getString("tr_mp3");
								java.awt.Desktop.getDesktop().browse(java.net.URI.create(val0));				
							}	
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
                     
				}
			
			
			}
		});
		button_2.setBounds(311, 101, 44, 29);
		button_2.setIcon(new ImageIcon(this.getClass().getResource("/music3.png")));
		contentPane.add(button_2);
		
		button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please");
					
				}else{
					try {
						
						String query="Select Mp3.id_mp3,Mp3.en_mp3,Name.tr_name from Mp3 Inner join Name on Name.id_name=Mp3.id_mp3 where tr_name=?";
						PreparedStatement ps;
						ps = connection.prepareStatement(query);
						ps.setString(1,textField.getText());
						
						ResultSet rs=ps.executeQuery();
						if(rs.next()){
							String val0=rs.getString("en_mp3");
							java.awt.Desktop.getDesktop().browse(java.net.URI.create(val0));				
						}	
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					///-------------------------------
                     try {
						
						String query="Select Mp3.id_mp3,Mp3.en_mp3,Name.en_name from Mp3 Inner join Name on Name.id_name=Mp3.id_mp3 where en_name=?";
						PreparedStatement ps;
						ps = connection.prepareStatement(query);
						ps.setString(1,textField.getText());
						
						ResultSet rs=ps.executeQuery();
						if(rs.next()){
							String val0=rs.getString("en_mp3");
							java.awt.Desktop.getDesktop().browse(java.net.URI.create(val0));				
						}	
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					///-----------------------------------
                     try {
							
							String query="Select Mp3.id_mp3,Mp3.en_mp3,Name.sp_name from Mp3 Inner join Name on Mp3.id_mp3=Name.id_name where sp_name=?";
							PreparedStatement ps;
							ps = connection.prepareStatement(query);
							ps.setString(1,textField.getText());
							
							ResultSet rs=ps.executeQuery();
							if(rs.next()){
								String val0=rs.getString("en_mp3");
								java.awt.Desktop.getDesktop().browse(java.net.URI.create(val0));				
							}	
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
                     
				}
				
			}
		});
		button_3.setBounds(311, 139, 44, 29);
		button_3.setIcon(new ImageIcon(this.getClass().getResource("/music3.png")));
		contentPane.add(button_3);
		
		button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please");
					
				}else{
					try {
						
						String query="Select Mp3.id_mp3,Mp3.sp_mp3,Name.tr_name from Mp3 Inner join Name on Name.id_name=Mp3.id_mp3 where tr_name=?";
						PreparedStatement ps;
						ps = connection.prepareStatement(query);
						ps.setString(1,textField.getText());
						
						ResultSet rs=ps.executeQuery();
						if(rs.next()){
							String val0=rs.getString("sp_mp3");
							java.awt.Desktop.getDesktop().browse(java.net.URI.create(val0));				
						}	
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					///-------------------------------
                     try {
						
						String query="Select Mp3.id_mp3,Mp3.sp_mp3,Name.en_name from Mp3 Inner join Name on Name.id_name=Mp3.id_mp3 where en_name=?";
						PreparedStatement ps;
						ps = connection.prepareStatement(query);
						ps.setString(1,textField.getText());
						
						ResultSet rs=ps.executeQuery();
						if(rs.next()){
							String val0=rs.getString("sp_mp3");
							java.awt.Desktop.getDesktop().browse(java.net.URI.create(val0));				
						}	
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					///-----------------------------------
                     try {
							
							String query="Select Mp3.id_mp3,Mp3.sp_mp3,Name.sp_name from Mp3 Inner join Name on Mp3.id_mp3=Name.id_name where sp_name=?";
							PreparedStatement ps;
							ps = connection.prepareStatement(query);
							ps.setString(1,textField.getText());
							
							ResultSet rs=ps.executeQuery();
							if(rs.next()){
								String val0=rs.getString("sp_mp3");
								java.awt.Desktop.getDesktop().browse(java.net.URI.create(val0));				
							}	
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
                     
				}
				
				
			}
		});
		button_4.setBounds(311, 181, 44, 29);
		button_4.setIcon(new ImageIcon(this.getClass().getResource("/music3.png")));
		contentPane.add(button_4);
		
		button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please");
					
				}else{
					try {
						
						String query="Select Text.id_text,Text.tr_text,Name.tr_name from Text Inner join Name on Name.id_name=Text.id_text where tr_name=?";
						PreparedStatement ps;
						ps = connection.prepareStatement(query);
						ps.setString(1,textField.getText());
						
						ResultSet rs=ps.executeQuery();
						if(rs.next()){
							String val0=rs.getString("tr_text");
							java.awt.Desktop.getDesktop().browse(java.net.URI.create(val0));				
						}	
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					///-------------------------------
                     try {
						
						String query="Select Text.id_text,Text.tr_text,Name.en_name from Text Inner join Name on Name.id_name=Text.id_text where en_name=?";
						PreparedStatement ps;
						ps = connection.prepareStatement(query);
						ps.setString(1,textField.getText());
						
						ResultSet rs=ps.executeQuery();
						if(rs.next()){
							String val0=rs.getString("tr_text");
							java.awt.Desktop.getDesktop().browse(java.net.URI.create(val0));				
						}	
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					///-----------------------------------
                     try {
							
							String query="Select Text.id_text,Text.tr_text,Name.sp_name from Text Inner join Name on Text.id_text=Name.id_name where sp_name=?";
							PreparedStatement ps;
							ps = connection.prepareStatement(query);
							ps.setString(1,textField.getText());
							
							ResultSet rs=ps.executeQuery();
							if(rs.next()){
								String val0=rs.getString("tr_text");
								java.awt.Desktop.getDesktop().browse(java.net.URI.create(val0));				
							}	
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
                     
				}
			}
		});
		button_5.setBounds(367, 101, 44, 29);
		button_5.setIcon(new ImageIcon(this.getClass().getResource("/text.png")));
		contentPane.add(button_5);
		
		button_6 = new JButton("");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please");
					
				}else{
					try {
						
						String query="Select Text.id_text,Text.en_text,Name.tr_name from Text Inner join Name on Name.id_name=Text.id_text where tr_name=?";
						PreparedStatement ps;
						ps = connection.prepareStatement(query);
						ps.setString(1,textField.getText());
						
						ResultSet rs=ps.executeQuery();
						if(rs.next()){
							String val0=rs.getString("en_text");
							java.awt.Desktop.getDesktop().browse(java.net.URI.create(val0));				
						}	
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					///-------------------------------
                     try {
						
						String query="Select Text.id_text,Text.en_text,Name.en_name from Text Inner join Name on Name.id_name=Text.id_text where en_name=?";
						PreparedStatement ps;
						ps = connection.prepareStatement(query);
						ps.setString(1,textField.getText());
						
						ResultSet rs=ps.executeQuery();
						if(rs.next()){
							String val0=rs.getString("en_text");
							java.awt.Desktop.getDesktop().browse(java.net.URI.create(val0));				
						}	
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					///-----------------------------------
                     try {
							
							String query="Select Text.id_text,Text.en_text,Name.sp_name from Text Inner join Name on Text.id_text=Name.id_name where sp_name=?";
							PreparedStatement ps;
							ps = connection.prepareStatement(query);
							ps.setString(1,textField.getText());
							
							ResultSet rs=ps.executeQuery();
							if(rs.next()){
								String val0=rs.getString("en_text");
								java.awt.Desktop.getDesktop().browse(java.net.URI.create(val0));				
							}	
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
     
			
				}}
		});
		button_6.setBounds(367, 142, 44, 28);
		button_6.setIcon(new ImageIcon(this.getClass().getResource("/text.png")));
		contentPane.add(button_6);
		
		button_7 = new JButton("");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please");
					
				}else{
					try {
						
						String query="Select Text.id_text,Text.sp_text,Name.tr_name from Text Inner join Name on Name.id_name=Text.id_text where tr_name=?";
						PreparedStatement ps;
						ps = connection.prepareStatement(query);
						ps.setString(1,textField.getText());
						
						ResultSet rs=ps.executeQuery();
						if(rs.next()){
							String val0=rs.getString("sp_text");
							java.awt.Desktop.getDesktop().browse(java.net.URI.create(val0));				
						}	
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					///-------------------------------
                     try {
						
						String query="Select Text.id_text,Text.sp_text,Name.en_name from Text Inner join Name on Name.id_name=Text.id_text where en_name=?";
						PreparedStatement ps;
						ps = connection.prepareStatement(query);
						ps.setString(1,textField.getText());
						
						ResultSet rs=ps.executeQuery();
						if(rs.next()){
							String val0=rs.getString("sp_text");
							java.awt.Desktop.getDesktop().browse(java.net.URI.create(val0));				
						}	
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					///-----------------------------------
                     try {
							
							String query="Select Text.id_text,Text.sp_text,Name.sp_name from Text Inner join Name on Text.id_text=Name.id_name where sp_name=?";
							PreparedStatement ps;
							ps = connection.prepareStatement(query);
							ps.setString(1,textField.getText());
							
							ResultSet rs=ps.executeQuery();
							if(rs.next()){
								String val0=rs.getString("sp_text");
								java.awt.Desktop.getDesktop().browse(java.net.URI.create(val0));				
							}	
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				}
				
			}
		});
		button_7.setBounds(367, 181, 44, 28);
		button_7.setIcon(new ImageIcon(this.getClass().getResource("/text.png")));
		contentPane.add(button_7);
		
		JLabel label = new JLabel("");
		label.setBounds(21, 14, 61, 72);
		label.setIcon(new ImageIcon(this.getClass().getResource("/translate.png")));
		contentPane.add(label);
		
		lblSefaArslan = new JLabel("by SEFA ARSLAN");
		lblSefaArslan.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblSefaArslan.setBounds(353, 245, 91, 16);
		contentPane.add(lblSefaArslan);
	}
}
