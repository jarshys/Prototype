/**
 * Contain all the windows for each user
 */
package Windows;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import Users.instructor;
import Windows.Instructor.*;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.Font;
/**
 * 
 * @author CodeBuster
 * @version 4
 *
 */
public class InstructorWindow extends JFrame implements ActionListener {
	private static final long serialVersionUID = 5513864781481112888L;
	/**
	 * 
	 * @param user 
	 */
	public InstructorWindow(instructor user) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Instructor");
		frame.setBounds(100, 100, 498, 345);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcomeJohnSmith = new JLabel("Welcome "+user.getName());
		lblWelcomeJohnSmith.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblWelcomeJohnSmith.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeJohnSmith.setBounds(0, 0, 482, 286);
		frame.getContentPane().add(lblWelcomeJohnSmith);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnClasses = new JMenu("Classes");
		menuBar.add(mnClasses);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("List Classes");
		mnClasses.add(mntmNewMenuItem);
		

		for(int i = mnClasses.getItemCount();i>0;i--)
		{
			mnClasses.getItem(i-1).addActionListener(this);			
		}
		
		frame.setVisible(true);
		

	}

	@SuppressWarnings("unused")
	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem menuclicked = (JMenuItem)e.getSource();
		
		switch(menuclicked.getText())
		{
		case "List Classes":
			ListClassesWindow ListClassesWindow = new ListClassesWindow();
			break;
		}	
	}
}