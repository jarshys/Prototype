/**
 * Contain all the windows for each user
 */
package Windows;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Windows.Student.RegisterWindow;
import Windows.Student.addDropWindow;
import Windows.Student.gradesWindow;
import Windows.Student.graduationWindow;
import Windows.Student.scheduleWindow;
/**
 * 
 * @author CodeBuster
 * @version 4
 *
 */
public class StudentWindow extends JFrame implements ActionListener {

	private static final long serialVersionUID = 8887427084755705187L;

	public StudentWindow() {
		JFrame frame = new JFrame("Student");
		frame.setBounds(100, 100, 498, 345);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);

		JLabel lblWelcomeJohnSmith = new JLabel("Welcome John Smith (Student)");
		lblWelcomeJohnSmith.setBounds(10, 11, 462, 14);
		frame.getContentPane().add(lblWelcomeJohnSmith);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnRegistration = new JMenu("Registration");
		menuBar.add(mnRegistration);

		JMenuItem mntmNewMenuItem = new JMenuItem("Register");
		mnRegistration.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem1 = new JMenuItem("Add/Drop");
		mnRegistration.add(mntmNewMenuItem1);
		
		JMenu mnRegistration1 = new JMenu("Student Records");
		menuBar.add(mnRegistration1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Grades");
		mnRegistration1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Schedule");
		mnRegistration1.add(mntmNewMenuItem_2);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Graduation");
		mnRegistration1.add(mntmNewMenuItem_3);

		for (int i = mnRegistration1.getItemCount(); i > 0; i--) {
			mnRegistration1.getItem(i - 1).addActionListener(this);
			
		}
		for (int i = mnRegistration.getItemCount(); i > 0; i--) {
			mnRegistration.getItem(i - 1).addActionListener(this);
		}

		frame.setVisible(true);
	}

	@SuppressWarnings("unused")
	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem menuclicked = (JMenuItem) e.getSource();

		switch (menuclicked.getText()) {
		case "Register":
			RegisterWindow RegisterWindow = new RegisterWindow();
			break;
		case "Add/Drop":
			addDropWindow addDropWindow = new addDropWindow();
			break;
		case "Grades":
			gradesWindow gradesWindow = new gradesWindow();
			break;
		case "Schedule":
			scheduleWindow scheduleWindow = new scheduleWindow();
			break;
		case "Graduation":
			graduationWindow graduationWindow = new graduationWindow();
			break;
		}
	}

}
