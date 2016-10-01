package Windows.Student;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class gradesWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1476150187237363455L;

	public gradesWindow() {
		
		JFrame frmCreateUser = new JFrame("Grades");
		frmCreateUser.setTitle("Grades");
		frmCreateUser.setBounds(100, 100, 445, 329);
		frmCreateUser.setLocationRelativeTo(null); //center window on screen
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
	
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(10, 59, 409, 191);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblClassTitle = new JLabel("Class Title:");
		lblClassTitle.setBounds(10, 10, 99, 14);
		panel_1.add(lblClassTitle);
		
		JLabel lblGrade = new JLabel("Grade:");
		lblGrade.setBounds(10, 30, 99, 14);
		panel_1.add(lblGrade);
		
		
		frmCreateUser.setVisible(true);
	}

}
