package smsProject;

import java.awt.Color;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import java.awt.Cursor;

public class SMSHome extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	private static final Component ActionListener = null;
	private JPanel contentPane;
	private JTextField txtEmail;
	private JLabel lblEmail;
	private JLabel lblPassword;
	private JPasswordField pswPassword;
	private JButton btnLogIn;
	private JButton btnReset;
	private JLabel lblHeader;
	private JLabel lblSystem;
	private JPanel logoPanel;
	private JLabel lblLogo;
	private JLabel lblLogIn;
	private JSeparator separator;

	/**
	 * Create the frame.
	 */
	public SMSHome() 
	{
		setResizable(false);
		setTitle("Log In Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 383);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblEmail.setBounds(33, 109, 47, 27);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmail.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txtEmail.setText("admin@gmail.com");
		txtEmail.setFont(new Font("Verdana", Font.PLAIN, 11));
		txtEmail.setColumns(10);
		txtEmail.setBounds(33, 147, 235, 33);
		contentPane.add(txtEmail);
		
		lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblPassword.setBounds(33, 181, 107, 27);
		contentPane.add(lblPassword);
		
		pswPassword = new JPasswordField();
		pswPassword.setHorizontalAlignment(SwingConstants.CENTER);
		pswPassword.setFont(new Font("Verdana", Font.PLAIN, 11));
		pswPassword.setBounds(33, 219, 234, 33);
		pswPassword.setText("admin123");
		contentPane.add(pswPassword);
		
		btnLogIn = new JButton("Log In");
		btnLogIn.setHorizontalTextPosition(SwingConstants.CENTER);
		btnLogIn.setForeground(Color.WHITE);
		btnLogIn.setFont(new Font("Lucida Bright", Font.BOLD, 13));
		btnLogIn.setBorder(null);
		btnLogIn.setBackground(new Color(0, 128, 0));
		btnLogIn.setBounds(150, 263, 75, 27);
		contentPane.add(btnLogIn);
		
		btnReset = new JButton("Reset");
		btnReset.setHorizontalTextPosition(SwingConstants.CENTER);
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Lucida Bright", Font.BOLD, 13));
		btnReset.setBorder(null);
		btnReset.setBackground(Color.RED);
		btnReset.setBounds(65, 263, 75, 27);
		contentPane.add(btnReset);
		
		logoPanel = new JPanel();
		logoPanel.setBackground(new Color(0, 128, 64));
		logoPanel.setBounds(289, 0, 322, 346);
		contentPane.add(logoPanel);
		logoPanel.setLayout(null);
		
		lblHeader = new JLabel("Student Management");
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setForeground(new Color(255, 255, 255));
		lblHeader.setBounds(10, 196, 302, 39);
		logoPanel.add(lblHeader);
		lblHeader.setFont(new Font("Lucida Bright", Font.BOLD, 25));
		
		lblLogo = new JLabel("");
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setIcon(new ImageIcon(getClass().getResource("/image/2.png")));
		lblLogo.setForeground(Color.WHITE);
		lblLogo.setFont(new Font("MS PGothic", Font.BOLD, 30));
		lblLogo.setBounds(68, 60, 180, 124);
		logoPanel.add(lblLogo);
		
		lblSystem = new JLabel("System");
		lblSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblSystem.setForeground(Color.WHITE);
		lblSystem.setFont(new Font("Lucida Bright", Font.BOLD, 25));
		lblSystem.setBounds(20, 232, 292, 39);
		logoPanel.add(lblSystem);
		
		lblLogIn = new JLabel("Log In ");
		lblLogIn.setForeground(new Color(0, 128, 64));
		lblLogIn.setFont(new Font("Lucida Bright", Font.BOLD, 33));
		lblLogIn.setBounds(97, 34, 128, 64);
		contentPane.add(lblLogIn);
		
		separator = new JSeparator();
		separator.setForeground(new Color(0, 128, 64));
		separator.setBounds(65, 92, 160, 17);
		contentPane.add(separator);
		
		btnLogIn.addActionListener(this);
		btnReset.addActionListener(this);
		this.getRootPane().setDefaultButton(btnLogIn);
		
		setVisible(true);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String email = txtEmail.getText();
		String password = pswPassword.getText();
		
		if(e.getSource() == btnLogIn)
		{
			if(email.equals("admin@gmail.com") && password.equals("admin123")) 
			{
				JOptionPane.showMessageDialog((this), "Log In Successful!" );
				this.dispose();
				new Dashboard();
			}else
			{
				JOptionPane.showMessageDialog((this), "Invalid Email or Password !");
			}
			
		}
		else if(e.getSource() == btnReset)
		{
			txtEmail.setText("");
			pswPassword.setText("");
		}
	}
}
