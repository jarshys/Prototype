package src;

import java.io.IOException;

import Database.Database;
import Windows.LoginWindow;


public class Application {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Database db = new Database();
//		db.cleardatafile();
//		db.insertmainadmin();
		
		//db.insertCourses();
		//db.removeSemesters();
		//db.insertSemesters();
		//db.insertCourses();
		//db.removeCourses();
		db.printAllRecords();
		
		
//		TestWindow TestPan = new TestWindow();
//		TestPan.setVisible(true);
		LoginWindow Login = new LoginWindow();
		Login.setVisible(true);
		

	}
}


