package Windows;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class instructor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1894562340505890756L;

	public instructor() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Instructor");
		frame.setBounds(100, 100, 498, 345);
		frame.setLocationRelativeTo(null); //center window on screen
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Welcome Instructor!");
		panel.add(label);

		frame.add(panel);
		frame.setVisible(true);
	}
}

