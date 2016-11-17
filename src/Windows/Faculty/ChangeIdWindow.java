/**
 * Provides the classes to Faculty to implement all the methods
 */
package Windows.Faculty;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.border.BevelBorder;

import Database.Database;
import Users.user;
import javax.swing.SwingConstants;
/**
 * Window to change ID's for any user.
 * @author CodeBuster
 * @version 4
 *
 */
public class ChangeIdWindow extends JFrame implements KeyListener, ActionListener {
	private JLabel lblFullName;
	private JLabel lblAddress;
	private JLabel lblPhoneNumber;
	private JLabel lblEmail;
	private JLabel lblRole;
	private user userresult;
	/**
	 * 
	 */
	
	public ChangeIdWindow() {
	JFrame frmCreateUser = new JFrame("Create User");
	frmCreateUser.setTitle("Change Id");
	frmCreateUser.setBounds(100, 100, 445, 357);
	frmCreateUser.setLocationRelativeTo(null); //center window on screen
	JPanel panel = new JPanel();

	frmCreateUser.getContentPane().add(panel);
	panel.setLayout(null);
	
	JLabel lblSearchById = new JLabel("Search by ID:");
	lblSearchById.setBounds(10, 11, 74, 14);
	panel.add(lblSearchById);
	
	textField = new JTextField();
	textField.addKeyListener(this);
	textField.setColumns(10);
	textField.setBounds(10, 28, 414, 20);
	panel.add(textField);
	
	JLabel lblNewId = new JLabel("New ID:");
	lblNewId.setBounds(10, 233, 74, 14);
	panel.add(lblNewId);
	
	textField_1 = new JTextField();
	textField_1.setColumns(10);
	textField_1.setBounds(10, 258, 414, 20);
	panel.add(textField_1);
	
	JButton button = new JButton("Save");
	button.addActionListener(this);
	button.setBounds(10, 289, 414, 23);
	panel.add(button);
	
	JPanel panel_1 = new JPanel();
	panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
	panel_1.setBounds(10, 59, 414, 163);
	panel.add(panel_1);
	panel_1.setLayout(null);
	
	lblFullName = new JLabel("Name:");
	lblFullName.setVerticalAlignment(SwingConstants.TOP);
	lblFullName.setBounds(10, 11, 394, 14);
	panel_1.add(lblFullName);
	
	lblAddress = new JLabel("Address:");
	lblAddress.setVerticalAlignment(SwingConstants.TOP);
	lblAddress.setBounds(10, 36, 394, 44);
	panel_1.add(lblAddress);
	
	lblPhoneNumber = new JLabel("Phone Number:");
	lblPhoneNumber.setVerticalAlignment(SwingConstants.TOP);
	lblPhoneNumber.setBounds(10, 91, 394, 14);
	panel_1.add(lblPhoneNumber);
	
	lblEmail = new JLabel("Email:");
	lblEmail.setVerticalAlignment(SwingConstants.TOP);
	lblEmail.setBounds(10, 116, 394, 14);
	panel_1.add(lblEmail);
	
	lblRole = new JLabel("Role:");
	lblRole.setVerticalAlignment(SwingConstants.TOP);
	lblRole.setBounds(10, 141, 394, 14);
	panel_1.add(lblRole);
	frmCreateUser.setVisible(true);
	}
	
	
	private static final long serialVersionUID = -322498080578139492L;
	private JTextField textField;
	private JTextField textField_1;
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==10 && (!textField.getText().equals(""))){
			
			int idtosearch = Integer.parseInt(textField.getText());
			
			Database db = new Database();
			userresult = db.searchallbyid(idtosearch);
			if(userresult != null)
			{
				lblFullName.setText("Name: "+userresult.getName());
				lblAddress.setText("Address: "+userresult.getAddress());
				lblPhoneNumber.setText("Phone: "+userresult.getNumber());
				lblEmail.setText("Email: "+userresult.getEmail());
				lblRole.setText("Role: "+userresult.getClass().getName());
			}
			else{
				JOptionPane.showMessageDialog(null, "No user was found with that id", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
		

	@Override
	public void keyReleased(KeyEvent e) {

		
	}
	@Override
	public void keyTyped(KeyEvent e) {

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton caller = (JButton) e.getSource();
		
		if(caller.getText().equals("Save"))
		{
			Database db = new Database();
			try {
				db.changeid(userresult, Integer.parseInt(textField_1.getText()));
			} catch (NumberFormatException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
}
