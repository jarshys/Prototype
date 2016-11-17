/**
 * Contains all the classes from Students
 */
package Windows.Student;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
/**
 * Class to register to courses on a specific semester.
 * @author CodeBuster
 * @version 4
 *
 */
public class RegisterWindow extends JFrame {

	private static final long serialVersionUID = 1L;

	public RegisterWindow() {

		JFrame frmCreateUser = new JFrame("Register");
		frmCreateUser.setTitle("Register");
		frmCreateUser.setBounds(100, 100, 445, 475);
		frmCreateUser.setLocationRelativeTo(null); // center window on screen
		JPanel panel = new JPanel();

		frmCreateUser.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel label = new JLabel("Select Term:");
		label.setBounds(10, 10, 74, 14);
		panel.add(label);

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {
				"Spring 2016", "Summer 2016", "Fall 2016" }));
		comboBox.setBounds(10, 30, 409, 20);
		panel.add(comboBox);

		JLabel label_1 = new JLabel("Search class:");
		label_1.setBounds(10, 60, 280, 14);
		panel.add(label_1);

		JTextField textField = new JTextField();
		textField.setBounds(10, 80, 409, 20);
		panel.add(textField);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(10, 111, 409, 285);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JButton button = new JButton("OK");
		button.setBounds(10, 407, 409, 23);
		panel.add(button);

		frmCreateUser.setVisible(true);
	}
}