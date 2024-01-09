import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Employeesalary {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employeesalary window = new Employeesalary();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Employeesalary() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Employee login Page");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel jl1 = new JLabel("User Name:");
		jl1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		jl1.setForeground(Color.BLACK);
		jl1.setBounds(99, 47, 85, 23);
		frame.getContentPane().add(jl1);
		
		JLabel jl2 = new JLabel("Password:");
		jl2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		jl2.setBounds(99, 93, 85, 23);
		frame.getContentPane().add(jl2);
		
		textField = new JTextField();
		textField.setBounds(182, 49, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(182, 95, 96, 20);
		frame.getContentPane().add(passwordField);
		
		JButton jb = new JButton("Login");
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				@SuppressWarnings("deprecation")
				String s=passwordField.getText();
				if(name.equals("tharun")&&s.equals("1234"))
				{
				EmployeeDetails1 ee=new EmployeeDetails1();
				frame.setVisible(false);
				}
				if(name.equals("vinay")&&s.equals("5678"))
				{
				EmployeeDetails2 ee=new EmployeeDetails2();
				frame.setVisible(false);
				}
				else if(name.equals("tharun")&&!s.equals("1234"))
				{
					lblNewLabel_1.setText("invalid password");
				}
				else if(!name.equals("tharun")&&!s.equals("1234"))
				{
					lblNewLabel_1.setText("invalid login");
				}
				else {
					lblNewLabel_1.setText("enter correct details");	
				}
			}
		});
		jb.setForeground(Color.ORANGE);
		jb.setFont(new Font("Times New Roman", Font.BOLD, 13));
		jb.setBounds(156, 155, 89, 23);
		frame.getContentPane().add(jb);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(24, 208, 377, 14);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setVisible(true);
	}
}
