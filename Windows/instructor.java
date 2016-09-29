package Windows;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class instructor extends JFrame {

	public instructor() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Instructor");
		frame.setBounds(100, 100, 498, 345);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Welcome Instructor!");
		panel.add(label);

		frame.add(panel);
		frame.setVisible(true);
	}
}

