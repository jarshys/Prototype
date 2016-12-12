/**
 * Contains all the classes from Students
 */
package Windows.Student;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

import Database.Database;
/**
 * Class to register to courses on a specific semester.
 * @author CodeBuster
 * @version 4
 *
 */
public class RegisterWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	public String selectedSemester;

	public RegisterWindow() {
		Database db = new Database();
		JFrame frmCreateUser = new JFrame("Register");
		frmCreateUser.setTitle("Register");
		frmCreateUser.setBounds(100, 100, 445, 297);
		frmCreateUser.setLocationRelativeTo(null); // center window on screen
		JPanel panel = new JPanel();

		frmCreateUser.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel label = new JLabel("Select Term:");
		label.setBounds(10, 10, 74, 14);
		panel.add(label);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();

		//comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		comboBox_1.setModel(new DefaultComboBoxModel(db.courseList(selectedSemester).toArray()));
		comboBox_1.setBounds(10, 86, 409, 20);
		panel.add(comboBox_1);

		JComboBox<String> comboBox = new JComboBox<String>();
		//comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Spring 2016", "Summer 2016", "Fall 2016" }));
		comboBox.setModel(new DefaultComboBoxModel(db.SemesterList().toArray()));
		comboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				selectedSemester = comboBox.getSelectedItem().toString();
				comboBox_1.setModel(new DefaultComboBoxModel(db.courseList(selectedSemester).toArray()));
				System.out.println("Changed to "+selectedSemester);
				
			}


	    });
		comboBox.setBounds(10, 30, 409, 20);
		panel.add(comboBox);
		selectedSemester = comboBox.getSelectedItem().toString();
		comboBox_1.setModel(new DefaultComboBoxModel(db.courseList(selectedSemester).toArray()));

		JLabel lblAddClass = new JLabel("Add class:");
		lblAddClass.setBounds(10, 61, 280, 14);
		panel.add(lblAddClass);

		JButton button = new JButton("OK");
		button.setBounds(10, 206, 409, 23);
		panel.add(button);
		
		JLabel lblDropClass = new JLabel("Drop class:");
		lblDropClass.setBounds(10, 150, 280, 14);
		panel.add(lblDropClass);
		
		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setBounds(10, 175, 409, 20);
		panel.add(comboBox_2);
		
		JButton button_1 = new JButton("OK");
		button_1.setBounds(10, 116, 409, 23);
		button_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//db.addClass(comboBox_1.getSelectedItem().toString());
				
			}
			
		});
		panel.add(button_1);
		

		


		frmCreateUser.setVisible(true);
	}
}