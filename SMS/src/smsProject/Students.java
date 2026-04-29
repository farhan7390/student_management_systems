package smsProject;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class Students extends JFrame implements ActionListener
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblHeader;
	private JPanel menuBar;
	private JButton btnStudents;
	private JButton btnCourse;
	private JButton btnTeachers;
	private JButton btnDashboard;
	public static JTable studentsTable;
	private JButton btnAddStudents;
	private JButton btnDeleteStudents;
	private JButton btnLogOut;

	/**
	 * Create the frame.
	 */
	public Students() 
	{
		setTitle("Students");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 872, 500);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblHeader = new JLabel("Student Management System");
		lblHeader.setBounds(0, 0, 858, 58);
		lblHeader.setForeground(new Color(255, 255, 255));
		lblHeader.setOpaque(true);
		lblHeader.setBackground(new Color(0, 64, 0));
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeader.setFont(new Font("Lucida Bright", Font.BOLD, 30));
		contentPane.add(lblHeader);
		
		menuBar = new JPanel();
		menuBar.setBounds(0, 59, 156, 404);
		menuBar.setBackground(new Color(0, 64, 0));
		contentPane.add(menuBar);
		menuBar.setLayout(null);
		
		btnStudents = new JButton("Students");
		btnStudents.setBounds(10, 57, 136, 22);
		menuBar.add(btnStudents);
		
		btnCourse = new JButton("Course");
		btnCourse.setBounds(10, 90, 136, 22);
		menuBar.add(btnCourse);
		
		btnTeachers = new JButton("Teachers");
		btnTeachers.setBounds(10, 123, 136, 22);
		menuBar.add(btnTeachers);
		
		btnDashboard = new JButton("Dashboard");
		btnDashboard.setBounds(10, 24, 136, 22);
		menuBar.add(btnDashboard);
		
		JScrollPane scrollPaneViewStudents = new JScrollPane();
		scrollPaneViewStudents.setBounds(166, 111, 682, 267);
		contentPane.add(scrollPaneViewStudents);
		
		studentsTable = new JTable();
		studentsTable.setBackground(new Color(255, 255, 255));
		studentsTable.setShowVerticalLines(false);
		studentsTable.setGridColor(new Color(0, 128, 64));
		studentsTable.setForeground(new Color(0, 0, 0));
		studentsTable.setFont(new Font("Lucida Bright", Font.PLAIN, 11));
		studentsTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		studentsTable.setRowHeight(40);
		
		DefaultTableModel model = (DefaultTableModel) studentsTable.getModel();
		model.setRowCount(0);
		
		Object[][] data = new Object[Dashboard.students.size()][6];
		
		for(int i = 0; i < Dashboard.students.size(); i++)
		{
			Student s = Dashboard.students.get(i);
			data[i][0] = s.getId();
			data[i][1] = s.getName();
			data[i][2] = s.getDob();
			data[i][3] = s.getNrc();
			data[i][4] = s.getPhone();
			data[i][5] = s.getAddress();
		}
		
		DefaultTableModel dataModel = new DefaultTableModel(				
//			new Object[][] {				
//				{"SS001", "Soe Moe Lwin", "27.06.2001", "12/ThaGaKa(N)192443", "09780802841", "Thingangyun"},
//				{"SS002", "Zwe Htet Aung", "-", "-", "-", "Hledan"},
//				{"SS003", "Ei Kyar Phyu", "-", "-", "-", "Dubai"},
//				{"SS004", "Kyaw Khant Wai", "-", "-", "-", "Yangon"},
//				{"SS005", "Kyaw Htet", "-", "-", "-", "USA"},
//				{"SS006", "Kyaw Zayar Khant", "-", "-", "-", "Yangon"},
//			},
				
			data,
			
			new String[] 
			{
				"Student_ID", "Name", "DOB", "NRC", "Phone", "Address"
			}
		) {
			Class[] columnTypes = new Class[] 
			{
				String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) 
			{
				return columnTypes[columnIndex];
			}
		};
		studentsTable.setModel(dataModel);
		studentsTable.getColumnModel().getColumn(0).setPreferredWidth(69);
		studentsTable.getColumnModel().getColumn(1).setResizable(false);
		studentsTable.getColumnModel().getColumn(1).setPreferredWidth(140);
		studentsTable.getColumnModel().getColumn(2).setPreferredWidth(67);
		studentsTable.getColumnModel().getColumn(2).setMaxWidth(2147483640);
		studentsTable.getColumnModel().getColumn(3).setResizable(false);
		studentsTable.getColumnModel().getColumn(3).setPreferredWidth(123);
		studentsTable.getColumnModel().getColumn(4).setPreferredWidth(99);
		studentsTable.getColumnModel().getColumn(5).setPreferredWidth(151);
		scrollPaneViewStudents.setViewportView(studentsTable);
		
		JButton btnEditStudents = new JButton("Edit Student");
		btnEditStudents.setFont(new Font("Lucida Bright", Font.BOLD, 13));
		btnEditStudents.setForeground(new Color(255, 255, 255));
		btnEditStudents.setBorder(null);
		btnEditStudents.setBackground(new Color(0, 128, 255));
		btnEditStudents.setBounds(166, 389, 113, 31);
		contentPane.add(btnEditStudents);
		
		btnAddStudents = new JButton("+ Add Student");
		btnAddStudents.setForeground(Color.WHITE);
		btnAddStudents.setFont(new Font("Lucida Bright", Font.BOLD, 13));
		btnAddStudents.setBorder(null);
		btnAddStudents.setBackground(new Color(0, 128, 64));
		btnAddStudents.setBounds(166, 69, 113, 31);
		contentPane.add(btnAddStudents);
		
		btnDeleteStudents = new JButton("Delete Student");
			
		btnDeleteStudents.setForeground(Color.WHITE);
		btnDeleteStudents.setFont(new Font("Lucida Bright", Font.BOLD, 13));
		btnDeleteStudents.setBorder(null);
		btnDeleteStudents.setBackground(new Color(255, 0, 0));
		btnDeleteStudents.setBounds(289, 389, 113, 31);
		contentPane.add(btnDeleteStudents);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblHeader, menuBar, btnStudents, btnCourse, btnTeachers, btnDashboard, scrollPaneViewStudents, btnEditStudents, studentsTable, btnAddStudents, btnDeleteStudents}));
		
		btnLogOut = new JButton("Log Out");
		btnLogOut.setForeground(Color.WHITE);
		btnLogOut.setFont(new Font("Lucida Bright", Font.BOLD, 13));
		btnLogOut.setBorder(null);
		btnLogOut.setBackground(Color.RED);
		btnLogOut.setBounds(31, 362, 85, 31);
		menuBar.add(btnLogOut);
		
		btnDeleteStudents.addActionListener(this);
		btnAddStudents.addActionListener(this);
		btnStudents.addActionListener(this);
		btnDashboard.addActionListener(this);
		btnLogOut.addActionListener(this);
		
		setVisible(true);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource() == btnDeleteStudents)
			{
				DefaultTableModel model = (DefaultTableModel) studentsTable.getModel();
				
				int selectedRow = studentsTable.getSelectedRow();
				
				if (selectedRow > -1)
				{
					int confirm = JOptionPane.showConfirmDialog(null, "Are you Sure?", "Delete", JOptionPane.YES_NO_CANCEL_OPTION);
					
					if (confirm == JOptionPane.YES_OPTION)
					{
						model.removeRow(selectedRow);
						JOptionPane.showMessageDialog(null,"Delete Successful!");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please Select a Row to Delete");
				}
			}
			else if(e.getSource() == btnAddStudents)
			{
				new AddStudent();
			}
			else if(e.getSource() == btnStudents)
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