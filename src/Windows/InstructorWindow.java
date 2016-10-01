package Windows;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import Windows.Instructor.*;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class InstructorWindow extends JFrame implements ActionListener {
	private static final long serialVersionUID = 5513864781481112888L;



	public InstructorWindow() {
		// TODO Auto-generated method stub
		JFrame frmInstructor = new JFrame("Faculty");
		frmInstructor.setTitle("Instructor");
		frmInstructor.setBounds(100, 100, 498, 345);
		frmInstructor.setLocationRelativeTo(null);
		frmInstructor.getContentPane().setLayout(null);
		
		JLabel lblWelcomeJohnSmith = new JLabel("Welcome John Smith (Instructor)");
		lblWelcomeJohnSmith.setBounds(10, 11, 462, 14);
		frmInstructor.getContentPane().add(lblWelcomeJohnSmith);
		
		JMenuBar menuBar = new JMenuBar();
		frmInstructor.setJMenuBar(menuBar);
		
		JMenu mnClasses = new JMenu("Classes");
		menuBar.add(mnClasses);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("List Classes");
		mnClasses.add(mntmNewMenuItem);
		

		for(int i = mnClasses.getItemCount();i>0;i--)
		{
			mnClasses.getItem(i-1).addActionListener(this);			
		}
		
		frmInstructor.setVisible(true);
		

	}

	@SuppressWarnings("unused")
	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem menuclicked = (JMenuItem)e.getSource();
		
		switch(menuclicked.getText())
		{
		case "List Classes":
			ListClassesWindow ListClassesWindow = new ListClassesWindow();
			break;
		}	
	}
}