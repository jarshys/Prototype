package Windows.Student;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class graduationWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8535309493471552162L;

	public graduationWindow() {
		
		JFrame frmCreateUser = new JFrame("Graduation");
		frmCreateUser.setTitle("Graduation");
		frmCreateUser.setBounds(100, 100, 445, 329);
		frmCreateUser.setLocationRelativeTo(null); //center window on screen
		JPanel panel = new JPanel();

		frmCreateUser.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(10, 59, 409, 191);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblClassTaken = new JLabel("Classes Taken:");
		lblClassTaken.setBounds(10, 30, 99, 14);
		panel_1.add(lblClassTaken);
		
		JLabel lblGradYear = new JLabel("Graduation Year:");
		lblGradYear.setBounds(10, 10, 99, 14);
		panel_1.add(lblGradYear);
		
		
		frmCreateUser.setVisible(true);
	}

}
