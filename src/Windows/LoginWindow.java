/**
 * Contain all the windows for each user
 */
package Windows;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import Database.Database;
import Users.faculty;
import Users.instructor;
import Users.student;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

/**
 * 
 * @author CodeBuster
 * @version 4
 *
 */
public class LoginWindow extends JFrame implements ActionListener{

	private static final long serialVersionUID = -4168293935018626013L;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;
	JButton btnLogin;
	Database db = new Database();
	private JLabel lblRegistrationSystemLogin;

	/**
	 * Create the application.
	 */
	public LoginWindow() {
		getContentPane().setBackground(new Color(192, 192, 192));
		setForeground(Color.BLUE); 
		getContentPane().setForeground(new Color(192, 192, 192));
		setTitle("Registration System Login");
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		setBounds(100, 100, 416, 246);
		setLocationRelativeTo(null); //center window on screen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(141, 86, 176, 23);
		getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setBounds(141, 120, 176, 23);
		getContentPane().add(pwdPassword);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblUsername.setBounds(69, 85, 75, 23);
		getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblPassword.setBounds(69, 120, 75, 23);
		getContentPane().add(lblPassword);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(this);
		btnLogin.setBounds(177, 162, 89, 23);
		getContentPane().add(btnLogin);
		
		lblRegistrationSystemLogin = new JLabel("Registration System Login");
		lblRegistrationSystemLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationSystemLogin.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblRegistrationSystemLogin.setBounds(10, 24, 380, 50);
		getContentPane().add(lblRegistrationSystemLogin);

		
		setVisible(true);
	}

	@SuppressWarnings("unused")
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == btnLogin && (!txtUsername.getText().equals("") && !pwdPassword.getPassword().equals("")))
		{
			String username = txtUsername.getText();
			char[] password = pwdPassword.getPassword();
			try {
				if(db.userLogin(username,password).resultrole=="Users.faculty")
				{
					FacultyWindow FacultyWindow = new FacultyWindow((faculty)db.userLogin(username,password).result);
					dispose();
				}
				else if (db.userLogin(username,password).resultrole=="Users.instructor")
				{
					InstructorWindow InstructorWindow = new InstructorWindow((instructor)db.userLogin(username,password).result);
					dispose();
				}
				else if (db.userLogin(username,password).resultrole=="Users.student")
				{
					StudentWindow StudentWindow = new StudentWindow((student)db.userLogin(username,password).result);
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Username/Password, please check your credentials and try again", null, JOptionPane.ERROR_MESSAGE);
				}
			} catch (HeadlessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
	}
}
