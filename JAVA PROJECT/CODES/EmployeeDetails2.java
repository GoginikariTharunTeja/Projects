import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeDetails2 {

	private JFrame frame;
	static int i;
	public double salary;
	public String msg;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeDetails2 window = new EmployeeDetails2();
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
	public EmployeeDetails2() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Employee details");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel bi = new JLabel("Basic Information:");
		bi.setFont(new Font("Times New Roman", Font.BOLD, 13));
		bi.setBounds(22, 22, 119, 14);
		frame.getContentPane().add(bi);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(32, 51, 49, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Empolyee status:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(32, 76, 109, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("no.of days presented:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(32, 101, 132, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
	
		JCheckBox chckbxNewCheckBox = new JCheckBox("mark attendance");
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxNewCheckBox.setBounds(32, 143, 132, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
	
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(153, 101, 49, 14);
		frame.getContentPane().add(lblNewLabel_7);
		lblNewLabel_7.setText(""+i);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(32, 172, 160, 14);
		frame.getContentPane().add(lblNewLabel);
	
		JButton btnNewButton = new JButton("Upadte Attendance");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.getModel().isSelected())
				{ 
				i++;
				EndPage2 ed=new EndPage2();
				frame.setVisible(false);
				}
				else {
					msg="click mark attendance";
					lblNewLabel.setText(""+msg);
				}
			}
		});
		btnNewButton.setBounds(22, 197, 129, 23);
		frame.getContentPane().add(btnNewButton);
		
			
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(288, 101, 49, 14);
		frame.getContentPane().add(lblNewLabel_8);
		frame.setVisible(true);
		
		JButton btnNewButton_1 = new JButton("Calc. Salary");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salary=i*500;
			lblNewLabel_8.setText(""+salary);
			}
		});
		btnNewButton_1.setBounds(240, 197, 132, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		if(i>=30) {
			 i=0;
		 }
		
		JLabel lblNewLabel_4 = new JLabel("Salary:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(237, 101, 49, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		
		JLabel lblNewLabel_5 = new JLabel("vinay");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(74, 51, 90, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("student2");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(133, 76, 59, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		
	}

	private void textField(int i) {
		// TODO Auto-generated method stub
		
	}
}
