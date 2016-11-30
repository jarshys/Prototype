package src;

import java.io.IOException;

import Database.Database;
import Windows.LoginWindow;
import Windows.TestWindow;

public class Application {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Database db = new Database();
//		db.cleardatafile();
//		db.insertmainadmin();
		db.printAllRecords();
//		TestWindow TestPan = new TestWindow();
//		TestPan.setVisible(true);
		LoginWindow Login = new LoginWindow();
		Login.setVisible(true);
		

	}
}


