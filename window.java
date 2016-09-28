import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

public class window extends JFrame implements ActionListener{


	JButton btnBoton;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;
	JButton btnInstructor;
	JButton btnStudent;

	/**
	 * Create the application.
	 */
	public window() {
		setTitle("Registration System Login");
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		btnBoton = new JButton("Faculty");
		btnBoton.addActionListener(this);
		btnBoton.setBounds(69, 131, 89, 23);
		getContentPane().add(btnBoton);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(159, 32, 176, 23);
		getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setBounds(159, 60, 176, 20);
		getContentPane().add(pwdPassword);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(78, 32, 80, 23);
		getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(69, 62, 89, 17);
		getContentPane().add(lblPassword);
		
		btnInstructor = new JButton("Instructor");
		btnInstructor.addActionListener(this);
		btnInstructor.setBounds(188, 131, 89, 23);
		getContentPane().add(btnInstructor);
		
		btnStudent = new JButton("Student");
		btnStudent.addActionListener(this);
		btnStudent.setBounds(308, 131, 89, 23);
		getContentPane().add(btnStudent);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
	
		if(e.getSource()== btnBoton)
		{
			JOptionPane.showMessageDialog(null,"You ara a Faculty");
		}
		if(e.getSource() == btnInstructor)
		{
			JOptionPane.showMessageDialog(null, "You are an Instructor");
			
		}
		if(e.getSource() == btnStudent)
		{
			JOptionPane.showMessageDialog(null, "You are an Student");
			
		}
		
	}
}
