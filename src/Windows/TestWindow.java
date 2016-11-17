/**
 * Contain all the windows for each user
 */
package Windows;

import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
/**
 * 
 * @author CodeBuster
 * @version 4
 *
 */
public class TestWindow extends JFrame implements ActionListener{

	private static final long serialVersionUID = 6723070314875070399L;
	/**
	 * Create the principal windows to test where we can link to the other windows
	 * 
	 */
	public TestWindow() {
		setTitle("Registration System Testing Panel");
		getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnTestingMenu = new JMenu("Testing Menu");
		menuBar.add(mnTestingMenu);
		
		JMenu mnWindows = new JMenu("Windows");
		mnTestingMenu.add(mnWindows);
		
		JMenuItem showLoginWindow = new JMenuItem("Show Login Window");
		showLoginWindow.addActionListener(this);
		mnWindows.add(showLoginWindow);
		
		JMenuItem showStudentWindow = new JMenuItem("Show Student Window");
		showStudentWindow.addActionListener(this);
		mnWindows.add(showStudentWindow);
		
		JMenuItem showInstructorWindow = new JMenuItem("Show Instructor Window");
		showInstructorWindow.addActionListener(this);
		mnWindows.add(showInstructorWindow);
		
		JMenuItem showFacultyWindow = new JMenuItem("Show Faculty Window");
		showFacultyWindow.addActionListener(this);
		mnWindows.add(showFacultyWindow);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		setBounds(100, 100, 365, 218);
		setLocationRelativeTo(null); //center window on screen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	@SuppressWarnings("unused")
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JMenuItem menuclicked = (JMenuItem)e.getSource();
		
		
		switch(menuclicked.getText())
		{
		case "Show Login Window":
			LoginWindow LoginWindow = new LoginWindow();
			break;
		case "Show Student Window":
			StudentWindow StudentWindow = new StudentWindow();
			break;
		case "Show Instructor Window":
			InstructorWindow InstructorWindow = new InstructorWindow();
			break;
//		case "Show Faculty Window":
//			FacultyWindow FacultyWindow = new FacultyWindow();
//			break;
		}
		
	}
}
