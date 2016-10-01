package Windows.Instructor;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;

public class ListClassesWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7232415692440713536L;

	public ListClassesWindow() {
		
		JFrame frmClasses = new JFrame("Schedule");
		frmClasses.setTitle("Classes");
		frmClasses.setBounds(100, 100, 445, 258);
		frmClasses.setLocationRelativeTo(null); //center window on screen
		JPanel panel = new JPanel();

		frmClasses.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblSelectClass = new JLabel("Select Class:");
		lblSelectClass.setBounds(10, 10, 74, 14);
		panel.add(lblSelectClass);

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"MATH 0311 - Intro Math", "MATH 1300 - Precalculus", "MATH 2331 - Calculus 2"}));
		comboBox.setBounds(10, 30, 409, 20);
		panel.add(comboBox);
	
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(10, 59, 409, 152);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblClassTitle = new JLabel("Class Title:");
		lblClassTitle.setBounds(10, 11, 99, 14);
		panel_1.add(lblClassTitle);
		
		JLabel lblSemester = new JLabel("Semester:");
		lblSemester.setBounds(10, 36, 99, 14);
		panel_1.add(lblSemester);
		
		JLabel lblStudents = new JLabel("Students:");
		lblStudents.setBounds(10, 61, 99, 14);
		panel_1.add(lblStudents);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setModel(new DefaultComboBoxModel<String>(new String[] {"Luis Romero", "Aaron De Santiago", "Jorge Dominguez"}));
		comboBox_1.setBounds(10, 86, 389, 20);
		panel_1.add(comboBox_1);
		
		JButton btnNewButton = new JButton("Add/Change Grade");
		btnNewButton.setBounds(10, 117, 389, 23);
		panel_1.add(btnNewButton);
		
		
		frmClasses.setVisible(true);
	}
}
