package Windows;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

public class LoginWindow extends JFrame implements ActionListener{


	/**
	 * 
	 */
	private static final long serialVersionUID = -4168293935018626013L;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;
	JButton btnLogin;

	/**
	 * Create the application.
	 */
	public LoginWindow() {
		setTitle("Registration System Login");
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		setBounds(100, 100, 298, 145);
		setLocationRelativeTo(null); //center window on screen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(89, 10, 176, 23);
		getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setBounds(89, 44, 176, 20);
		getContentPane().add(pwdPassword);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(20, 11, 107, 23);
		getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(20, 47, 107, 17);
		getContentPane().add(lblPassword);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(this);
		btnLogin.setBounds(176, 72, 89, 23);
		getContentPane().add(btnLogin);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == btnLogin)
		{
			String username = txtUsername.getText();
			//char[] password = pwdPassword.getPassword();
			if(username.equals("Jorge"))
			{
				JOptionPane.showMessageDialog(null, "You logged in as Student");
				student one = new student();
			}
			else if(username.equals("Aaron"))
			{
				JOptionPane.showMessageDialog(null, "You logged in as Instructor");
				instructor two = new instructor();
			}
			else if(username.equals("Luis"))
			{
				JOptionPane.showMessageDialog(null, "You logged in as Faculty/Staff");
				faculty three = new faculty();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Invalid Username/Password, please check your credentials and try again", null, JOptionPane.ERROR_MESSAGE);
			}
		}
		dispose();
		
	}
}
