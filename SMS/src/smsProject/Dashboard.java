package smsProject;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Dashboard extends JFrame implements ActionListener
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblHeader;
	private JPanel menuBar;
	private JButton btnStudents;
	private JButton btnCourse;
	private JButton btnTeachers;
	private JButton btnDashboard;
	private JPanel panelChartContainer;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public static ArrayList<Student> students = new ArrayList<Student>(); 
	private JButton btnLogOut;

	/**
	 * Create the frame.
	 */
	public Dashboard() 
	{
		setTitle("Dashboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 873, 500);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblHeader = new JLabel("Student Management System");
		lblHeader.setBounds(0, 0, 859, 58);
		lblHeader.setForeground(new Color(255, 255, 255));
		lblHeader.setOpaque(true);
		lblHeader.setBackground(new Color(0, 64, 0));
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("MS PGothic", Font.BOLD, 30));
		contentPane.add(lblHeader);
		
		menuBar = new JPanel();
		menuBar.setBounds(0, 59, 156, 404);
		menuBar.setBackground(new Color(0, 64, 0));
		contentPane.add(menuBar);
		menuBar.setLayout(null);
		
		btnStudents = new JButton("Students");
		buttonGroup.add(btnStudents);
		btnStudents.setBounds(10, 57, 136, 22);
		menuBar.add(btnStudents);
		
		btnCourse = new JButton("Course");
		buttonGroup.add(btnCourse);
		btnCourse.setBounds(10, 90, 136, 22);
		menuBar.add(btnCourse);
		
		btnTeachers = new JButton("Teachers");
		buttonGroup.add(btnTeachers);
		btnTeachers.setBounds(10, 123, 136, 22);
		menuBar.add(btnTeachers);
		
		btnDashboard = new JButton("Dashboard");
		buttonGroup.add(btnDashboard);
		btnDashboard.setBounds(10, 24, 136, 22);
		menuBar.add(btnDashboard);
		
		btnLogOut = new JButton("Log Out");
		btnLogOut.setForeground(Color.WHITE);
		btnLogOut.setFont(new Font("Lucida Bright", Font.BOLD, 13));
		btnLogOut.setBorder(null);
		btnLogOut.setBackground(Color.RED);
		btnLogOut.setBounds(31, 362, 85, 31);
		menuBar.add(btnLogOut);
		
		panelChartContainer = new JPanel();
		panelChartContainer.setBounds(166, 69, 683, 383);
		contentPane.add(panelChartContainer);
		panelChartContainer.setLayout(null);
//		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblHeader, menuBar, btnStudents, btnCourse, btnTeachers, btnDashboard, panelChartContainer}));
		
		students.add(new Student("SS001", "Soe Moe Lwin", "27.06.2001", "12/ThaGaKa(N)192443", "09780802841", "Thingangyun"));
		students.add(new Student("SS002", "Zwe Htet Aung", "-", "-", "-", "Hledan"));
		students.add(new Student("SS003", "Ei Kyar Phyu", "-", "-", "-", "Dubai"));
		students.add(new Student("SS004", "Kyaw Htet", "-", "-", "-", "USA"));
		students.add(new Student("SS005", "Kyaw Khant Wai", "-", "-", "-", "Yangon"));
		students.add(new Student("SS006", "Kyaw Zayar", "-", "-", "-", "Yangon"));
		
		
		btnDashboard.addActionListener(this);
		btnStudents.addActionListener(this);
		btnLogOut.addActionListener(this);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == btnStudents)
		{
			this.dispose();
			new Students();
		}
		else if(e.getSource() == btnDashboard)
		{
			this.dispose();
			new Dashboard();
		}
		else if(e.getSource() == btnLogOut)
		{
			this.dispose();
			new SMSHome();
		}
	}
}
