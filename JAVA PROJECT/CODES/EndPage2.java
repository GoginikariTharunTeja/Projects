import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class EndPage2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EndPage2 window = new EndPage2();
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
	public EndPage2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel output = new JLabel("New label");
		output.setBounds(43, 75, 335, 76);
		frame.getContentPane().add(output);
		String name="login successfully Thank u for Visiting";
		output.setText(name);
		
				
		JButton btnNewButton = new JButton("LOGOUT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employeesalary ec=new Employeesalary();
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(73, 203, 129, 23);
		frame.getContentPane().add(btnNewButton);
		frame.setVisible(true);
	}
}
