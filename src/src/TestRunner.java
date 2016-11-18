package src;

import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Database.Database;



public class TestRunner {
	Database db = new Database();
	@Before
	public void setUp() throws Exception {
		System.out.println("set up");
		java.util.Iterator<String> linesi = Files.lines(Paths.get("mockdata")).iterator();
	    while(linesi.hasNext())
	    {
	    	String line = linesi.next();
	    	String name = line.split(",")[0];
	    	String address = line.split(",")[1];
	    	String phone = line.split(",")[2];
	    	String email = line.split(",")[3];
//	    	String rolename = "No role";
	    	
	    	int role = 1 + (int)(Math.random() * ((3 - 1) + 1));
//	    	switch(role) {
//	    	case 1:
//	    		rolename = "Student";
//	    		break;
//	    	case 2:
//	    		rolename = "Instructor";
//	    		break;
//	    	case 3:
//	    		rolename = "Faculty";
//	    		break;
//	    	}
	    	
	    	if(role==1)
	    		db.addStudent(name, address, phone, email);
	    	if(role==2)
	    		db.addInstructor(name, address, phone, email);
	    	if(role==3)
	    		db.addFaculty(name, address, phone, email);
	    }
	    db.insertmainadmin();
	    System.out.println(String.format("Db now has %d records", db.count()));
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tear down");
		db.cleardatafile();
	}

	@Test
	public void test() {
		System.out.println("testing");
		assertEquals(db.count(), 101);
		assertEquals(db.nextid(), 102);
		System.out.println("done testing");
	}

}
