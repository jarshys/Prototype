package Windows.Faculty;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Database.Database;

import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.DefaultComboBoxModel;



public class CreateUserWindow extends JFrame implements ActionListener {
	public ActionListener createuser;
	
	private static final long serialVersionUID = -322498080578139492L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JComboBox<String> comboBox;
	private Database db = new Database();

	public CreateUserWindow() {
	JFrame frmCreateUser = new JFrame("Create User");
	frmCreateUser.setTitle("Create User");
	frmCreateUser.setBounds(100, 100, 445, 475);
	frmCreateUser.setLocationRelativeTo(null); //center window on screen
	JPanel panel = new JPanel();

	frmCreateUser.getContentPane().add(panel);
	panel.setLayout(null);
	
	JLabel label = new JLabel("First Name:");
	label.setBounds(10, 11, 74, 14);
	panel.add(label);
	
	textField = new JTextField();
	textField.setColumns(10);
	textField.setBounds(10, 28, 414, 20);
	panel.add(textField);
	
	JLabel label_1 = new JLabel("Last Name:");
	label_1.setBounds(10, 59, 74, 14);
	panel.add(label_1);
	
	textField_1 = new JTextField();
	textField_1.setColumns(10);
	textField_1.setBounds(10, 76, 414, 20);
	panel.add(textField_1);
	
	JLabel label_2 = new JLabel("Address:");
	label_2.setBounds(10, 107, 74, 14);
	panel.add(label_2);
	
	textField_2 = new JTextField();
	textField_2.setColumns(10);
	textField_2.setBounds(10, 124, 414, 20);
	panel.add(textField_2);
	
	JLabel label_3 = new JLabel("City:");
	label_3.setBounds(10, 155, 74, 14);
	panel.add(label_3);
	
	textField_3 = new JTextField();
	textField_3.setColumns(10);
	textField_3.setBounds(10, 172, 414, 20);
	panel.add(textField_3);
	
	JLabel label_4 = new JLabel("State:");
	label_4.setBounds(10, 203, 74, 14);
	panel.add(label_4);
	
	textField_4 = new JTextField();
	textField_4.setColumns(10);
	textField_4.setBounds(10, 220, 414, 20);
	panel.add(textField_4);
	
	JLabel label_5 = new JLabel("Phone Number:");
	label_5.setBounds(10, 251, 74, 14);
	panel.add(label_5);
	
	textField_5 = new JTextField();
	textField_5.setColumns(10);
	textField_5.setBounds(10, 268, 414, 20);
	panel.add(textField_5);
	
	JLabel label_6 = new JLabel("Email:");
	label_6.setBounds(10, 299, 74, 14);
	panel.add(label_6);
	
	textField_6 = new JTextField();
	textField_6.setColumns(10);
	textField_6.setBounds(10, 316, 414, 20);
	panel.add(textField_6);
	
	JLabel label_7 = new JLabel("Role:");
	label_7.setBounds(10, 347, 74, 14);
	panel.add(label_7);
	
	comboBox = new JComboBox<String>();
	comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Student", "Instructor", "Faculty"}));
	comboBox.setBounds(10, 372, 414, 20);
	panel.add(comboBox);
	

	JButton button = new JButton("Save");
	button.addActionListener(this);
	button.setBounds(10, 407, 414, 23);
	panel.add(button);
	frmCreateUser.setVisible(true);

	}
	

	@Override
	public void actionPerformed(ActionEvent e)  {

		JButton caller = (JButton) e.getSource();
		
		if(caller.getText().equals("Save"))
		{
			String role = comboBox.getSelectedItem().toString();
			String name = textField.getText() + " " + textField_1.getText();
			String address = textField_2.getText() + System.lineSeparator() + textField_3.getText() + ", " + textField_4.getText() + ", USA";
			String number = textField_5.getText();
			String email = textField_6.getText();
			
			if(role.equals("Student")){
				try {
					db.addStudent(name, address, number, email);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			if(role.equals("Faculty")){
				try {
					db.addFaculty(name, address, number, email);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			if(role.equals("Instructor")){
				try {
					db.addInstructor(name, address, number, email);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}

	
	
}
