package Windows;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class student extends JFrame {

	public student() {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Student");
		frame.setBounds(100, 100, 498, 345);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Welcome Student!");
		panel.add(label);

		frame.add(panel);
		frame.setVisible(true);
	}

	
}
