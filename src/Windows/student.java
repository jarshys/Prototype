package Windows;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class student extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8887427084755705187L;

	public student() {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Student");
		frame.setBounds(100, 100, 498, 345);
		frame.setLocationRelativeTo(null); //center window on screen
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Welcome Student!");
		panel.add(label);

		frame.add(panel);
		frame.setVisible(true);
	}

	
}
