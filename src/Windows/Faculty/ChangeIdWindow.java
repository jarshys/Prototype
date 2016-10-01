package Windows.Faculty;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;

public class ChangeIdWindow extends JFrame {
	/**
	 * 
	 */
	
	public ChangeIdWindow() {
	JFrame frmCreateUser = new JFrame("Create User");
	frmCreateUser.setTitle("Change Id");
	frmCreateUser.setBounds(100, 100, 445, 380);
	frmCreateUser.setLocationRelativeTo(null); //center window on screen
	JPanel panel = new JPanel();

	frmCreateUser.getContentPane().add(panel);
	panel.setLayout(null);
	
	JLabel lblSearchById = new JLabel("Search by ID:");
	lblSearchById.setBounds(10, 11, 74, 14);
	panel.add(lblSearchById);
	
	textField = new JTextField();
	textField.setColumns(10);
	textField.setBounds(10, 28, 414, 20);
	panel.add(textField);
	
	JLabel lblNewId = new JLabel("New ID:");
	lblNewId.setBounds(10, 261, 74, 14);
	panel.add(lblNewId);
	
	textField_1 = new JTextField();
	textField_1.setColumns(10);
	textField_1.setBounds(10, 278, 414, 20);
	panel.add(textField_1);
	
	JButton button = new JButton("Save");
	button.setBounds(10, 309, 414, 23);
	panel.add(button);
	
	JPanel panel_1 = new JPanel();
	panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
	panel_1.setBounds(10, 59, 414, 191);
	panel.add(panel_1);
	panel_1.setLayout(null);
	
	JLabel lblFirstName = new JLabel("First Name:");
	lblFirstName.setBounds(10, 11, 99, 14);
	panel_1.add(lblFirstName);
	
	JLabel lblLastName = new JLabel("Last Name:");
	lblLastName.setBounds(10, 36, 99, 14);
	panel_1.add(lblLastName);
	
	JLabel lblAddress = new JLabel("Address:");
	lblAddress.setBounds(10, 61, 99, 14);
	panel_1.add(lblAddress);
	
	JLabel lblPhoneNumber = new JLabel("Phone Number:");
	lblPhoneNumber.setBounds(10, 116, 99, 14);
	panel_1.add(lblPhoneNumber);
	
	JLabel lblEmail = new JLabel("Email:");
	lblEmail.setBounds(10, 141, 99, 14);
	panel_1.add(lblEmail);
	
	JLabel lblRole = new JLabel("Role:");
	lblRole.setBounds(10, 166, 99, 14);
	panel_1.add(lblRole);
	frmCreateUser.setVisible(true);
	}
	
	
	private static final long serialVersionUID = -322498080578139492L;
	private JTextField textField;
	private JTextField textField_1;
}
