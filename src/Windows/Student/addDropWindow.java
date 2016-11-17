/**
 * Contains all the classes from Students
 */
package Windows.Student;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
/**
 * Class to add or drop a course.
 * @author CodeBuster
 * @version 4
 *
 */
public class addDropWindow extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTextField textField;

	public addDropWindow() {

		JFrame frmCreateUser = new JFrame("Add/Drop Class");
		frmCreateUser.setTitle("Add/Drop Class");
		frmCreateUser.setBounds(100, 100, 445, 475);
		frmCreateUser.setLocationRelativeTo(null); // center window on screen
		JPanel panel = new JPanel();

		frmCreateUser.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblFirstName = new JLabel("Search:");
		lblFirstName.setBounds(10, 11, 99, 14);
		panel.add(lblFirstName);
				
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 30, 409, 20);
		panel.add(textField);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(10, 61, 409, 166);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblEnrolled = new JLabel("Classes:");
		lblEnrolled.setBounds(10, 11, 99, 14);
		panel_1.add(lblEnrolled);

		JButton button = new JButton("Add");
		button.setBounds(10, 407, 200, 23);
		panel.add(button);
		
		JButton button1 = new JButton("Drop");
		button1.setBounds(219, 407, 200, 23);
		panel.add(button1);
		
		JLabel lblEnrolledClasses = new JLabel("Enrolled Classes:");
		lblEnrolledClasses.setBounds(10, 238, 99, 20);
		panel.add(lblEnrolledClasses);
		
		

		frmCreateUser.setVisible(true);
	}
}
