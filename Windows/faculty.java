package Windows;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class faculty extends JFrame {

	public faculty() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Faculty");
		frame.setBounds(100, 100, 498, 345);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Welcome Faculty!");
		panel.add(label);

		frame.add(panel);
		frame.setVisible(true);
	}
}