package Windows;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class faculty extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8437962221390200655L;

	public faculty() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Faculty");
		frame.setBounds(100, 100, 498, 345);
		frame.setLocationRelativeTo(null); //center window on screen
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Welcome Faculty!");
		panel.add(label);

		frame.add(panel);
		frame.setVisible(true);
	}
}