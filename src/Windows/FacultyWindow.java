package Windows;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import Windows.Faculty.*;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FacultyWindow extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8437962221390200655L;

	public FacultyWindow() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Faculty");
		frame.setBounds(100, 100, 498, 345);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcomeJohnSmith = new JLabel("Welcome John Smith (Faculty)");
		lblWelcomeJohnSmith.setBounds(10, 11, 462, 14);
		frame.getContentPane().add(lblWelcomeJohnSmith);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnRegistration = new JMenu("Records");
		menuBar.add(mnRegistration);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Create User");
		mnRegistration.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Change ID");
		mnRegistration.add(mntmNewMenuItem_1);
		
		JMenuItem mntmResetPassword = new JMenuItem("Reset Password");
		mnRegistration.add(mntmResetPassword);
		
		JMenuItem mntmLookupStudent = new JMenuItem("Lookup Student");
		mnRegistration.add(mntmLookupStudent);
		

		for(int i = mnRegistration.getItemCount();i>0;i--)
		{
			mnRegistration.getItem(i-1).addActionListener(this);			
		}
		
		frame.setVisible(true);
		

	}

	@SuppressWarnings("unused")
	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem menuclicked = (JMenuItem)e.getSource();
		
		switch(menuclicked.getText())
		{
		case "Create User":
			CreateUserWindow CreateUserWindow = new CreateUserWindow();
			break;
		case "Change ID":
			ChangeIdWindow ChangeIdWindow = new ChangeIdWindow();
			break;
		case "Reset Password":
			ResetPasswordWindow ResetPasswordWindow = new ResetPasswordWindow();
			break;
		case "Lookup Student":
			LookupStudentWindow LookupStudentWindow = new LookupStudentWindow();
			break;
		}	
	}
}