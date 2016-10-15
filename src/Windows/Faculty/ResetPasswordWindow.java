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

public class ResetPasswordWindow extends JFrame implements KeyListener, ActionListener {
	private JLabel lblFullName;
	private JLabel lblAddress;
	private JLabel lblPhoneNumber;
	private JLabel lblEmail;
	private JLabel lblRole;
	/**
	 * 
	 */
	
	public ResetPasswordWindow() {
	JFrame frmCreateUser = new JFrame("Create User");
	frmCreateUser.setTitle("Reset Password");
	frmCreateUser.setBounds(100, 100, 445, 303);
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
	
	JButton btnResetPassword = new JButton("Reset Password");
	btnResetPassword.addActionListener(this);
	btnResetPassword.setBounds(10, 235, 414, 23);
	panel.add(btnResetPassword);
	
	JPanel panel_1 = new JPanel();
	panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
	panel_1.setBounds(10, 59, 414, 165);
	panel.add(panel_1);
	panel_1.setLayout(null);
	
	lblFullName = new JLabel("Name:");
	lblFullName.setBounds(10, 11, 394, 14);
	panel_1.add(lblFullName);
	
	lblAddress = new JLabel("Address:");
	lblAddress.setVerticalAlignment(SwingConstants.TOP);
	lblAddress.setBounds(10, 36, 394, 44);
	panel_1.add(lblAddress);
	
	lblPhoneNumber = new JLabel("Phone Number:");
	lblPhoneNumber.setBounds(10, 91, 394, 14);
	panel_1.add(lblPhoneNumber);
	
	lblEmail = new JLabel("Email:");
	lblEmail.setBounds(10, 116, 394, 14);
	panel_1.add(lblEmail);
	
	lblRole = new JLabel("Role:");
	lblRole.setBounds(10, 141, 394, 14);
	panel_1.add(lblRole);
	frmCreateUser.setVisible(true);
	}
	
	
	private static final long serialVersionUID = -322498080578139492L;
	private JTextField textField;
	private user userresult;
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton caller = (JButton) arg0.getSource();
		
		if(caller.getText().equals("Reset Password"))
		{
			Database db = new Database();
			try {
				db.resetpassword(userresult);
			} catch (NumberFormatException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
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
			else 
				{

					JOptionPane.showMessageDialog(this,"No user was found with that id","OK",JOptionPane.ERROR_MESSAGE);

				}
			}
	}
	@Override
	public void keyReleased(KeyEvent e) {

	}
		
	@Override
	public void keyTyped(KeyEvent e) {

		
	}
}
