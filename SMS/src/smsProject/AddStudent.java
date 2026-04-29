package smsProject;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Cursor;

import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddStudent extends JFrame 
{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textID;
	private JTextField textName;
	private JTextField textDOB;
	private JTextField textNRC;
	private JTextField textPhone;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private JTextArea textAddress;
	private JLabel lblGender;
	private JLabel lblHeader;
	private JPanel panel;
	private JLabel lblID;
	private JButton btnAdd;
	private JButton btnClear;
	private JLabel lblName;
	private JLabel lblDOB;
	private JLabel lblNRC;
	private JLabel lblPhone;
	private JScrollPane scrollPane;
	private JLabel lblAddress;
	
	public AddStudent() 
	{
		setTitle("Add Student Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 505);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblHeader = new JLabel("Student Management System");
		lblHeader.setOpaque(true);
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setForeground(Color.WHITE);
		lblHeader.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblHeader.setBackground(new Color(0, 64, 0));
		lblHeader.setBounds(0, 0, 436, 58);
		contentPane.add(lblHeader);
		
		panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(10, 69, 416, 388);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textID = new JTextField();
		textID.setHorizontalAlignment(SwingConstants.CENTER);
		textID.setFont(new Font("Verdana", Font.PLAIN, 11));
		textID.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		textID.setColumns(10);
		textID.setBounds(10, 45, 137, 33);
		panel.add(textID);
		
		lblID = new JLabel("Student ID");
		lblID.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblID.setBounds(10, 11, 89, 27);
		panel.add(lblID);
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (e.getSource() == btnAdd) 
				{
					DefaultTableModel model = (DefaultTableModel) Students.studentsTable.getModel();
		            
		            model.addRow(new Object[]
					{
						textID.getText(),
						textName.getText(),
						textDOB.getText(),
						textNRC.getText(),
						textPhone.getText(),
						textAddress.getText()
					});
		            
		            this.clear();
		        }
			}
			
			public void clear() 
			{
				dispose();
				
			}
		});
		btnAdd.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Lucida Bright", Font.BOLD, 13));
		btnAdd.setBorder(null);
		btnAdd.setBackground(new Color(0, 128, 0));
		btnAdd.setBounds(219, 350, 75, 27);
		panel.add(btnAdd);
		
		btnClear = new JButton("Clear");
		btnClear.setHorizontalTextPosition(SwingConstants.CENTER);
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Lucida Bright", Font.BOLD, 13));
		btnClear.setBorder(null);
		btnClear.setBackground(Color.RED);
		btnClear.setBounds(112, 350, 75, 27);
		panel.add(btnClear);
		
		textName = new JTextField();
		textName.setHorizontalAlignment(SwingConstants.CENTER);
		textName.setFont(new Font("Verdana", Font.PLAIN, 11));
		textName.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		textName.setColumns(10);
		textName.setBounds(157, 45, 249, 33);
		panel.add(textName);
		
		lblName = new JLabel("Student Name");
		lblName.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblName.setBounds(157, 11, 119, 27);
		panel.add(lblName);
		
		textDOB = new JTextField();
		textDOB.setHorizontalAlignment(SwingConstants.CENTER);
		textDOB.setFont(new Font("Verdana", Font.PLAIN, 11));
		textDOB.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		textDOB.setColumns(10);
		textDOB.setBounds(10, 121, 137, 33);
		panel.add(textDOB);
		
		lblDOB = new JLabel("DOB");
		lblDOB.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblDOB.setBounds(10, 87, 89, 27);
		panel.add(lblDOB);
		
		lblNRC = new JLabel("NRC");
		lblNRC.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNRC.setBounds(157, 89, 89, 27);
		panel.add(lblNRC);
		
		textNRC = new JTextField();
		textNRC.setHorizontalAlignment(SwingConstants.CENTER);
		textNRC.setFont(new Font("Verdana", Font.PLAIN, 11));
		textNRC.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		textNRC.setColumns(10);
		textNRC.setBounds(157, 123, 137, 33);
		panel.add(textNRC);
		
		textPhone = new JTextField();
		textPhone.setHorizontalAlignment(SwingConstants.CENTER);
		textPhone.setFont(new Font("Verdana", Font.PLAIN, 11));
		textPhone.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		textPhone.setColumns(10);
		textPhone.setBounds(10, 197, 137, 33);
		panel.add(textPhone);
		
		lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblPhone.setBounds(10, 163, 89, 27);
		panel.add(lblPhone);
		
		lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblGender.setBounds(157, 163, 89, 27);
		panel.add(lblGender);
		
		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBackground(SystemColor.inactiveCaptionBorder);
		rdbtnMale.setBounds(157, 203, 110, 22);
		panel.add(rdbtnMale);
		
		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBackground(SystemColor.inactiveCaptionBorder);
		rdbtnFemale.setBounds(269, 203, 110, 22);
		panel.add(rdbtnFemale);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 266, 396, 54);
		panel.add(scrollPane);
		
		textAddress = new JTextArea();
		scrollPane.setViewportView(textAddress);
		textAddress.setBackground(SystemColor.text);
		
		lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblAddress.setBounds(10, 235, 89, 27);
		panel.add(lblAddress);
		
		setVisible(true);
	}
}
