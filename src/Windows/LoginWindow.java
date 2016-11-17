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

import javax.swing.JPasswordField;
import javax.swing.JLabel;
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
