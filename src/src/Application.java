package src;

import java.io.IOException;

import Database.Database;
import Windows.TestWindow;

public class Application {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Database db = new Database();
		db.printAllRecords();
		TestWindow TestPan = new TestWindow();
		TestPan.setVisible(true);
		

	}
}


