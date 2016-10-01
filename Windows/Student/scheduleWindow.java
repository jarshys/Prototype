package Windows.Student;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class scheduleWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7232415692440713536L;

	public scheduleWindow() {
		
		JFrame frmCreateUser = new JFrame("Schedule");
		frmCreateUser.setTitle("Schedule");
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
		lblClassTitle.setBounds(10, 11, 99, 14);
		panel_1.add(lblClassTitle);
		
		
		frmCreateUser.setVisible(true);
	}

}
