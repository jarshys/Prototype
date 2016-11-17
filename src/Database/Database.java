package Database;

import java.io.FileInputStream;
import java.util.Random;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.HashSet;
import java.util.Iterator;


import Users.*;
/**
 * Save all the users from the system using a Hashset.
 * @author CodeBuster
 * @version 4
 * 
 */
public class Database {
HashSet<instructor> instructors = new HashSet<instructor>();
HashSet<faculty> allfaculty = new HashSet<faculty>();
HashSet<student> students = new HashSet<student>();


public Database() {
	try {
		readdata();
	} catch (ClassNotFoundException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void insertestdata() {
	
	instructor i1 = new instructor(nextinstructorid(), "Jorge Dominguez", "asdf", "123 test", "915-123-1234", "jorge@test.com");
	instructor i2 = new instructor(3, "Juan Perez", "asdf", "123 test", "915-123-1234", "jorge@test.com");
	instructor i3 = new instructor(nextinstructorid(), "Rodlfo Gonzalez", "asdf", "123 test", "915-123-1234", "jorge@test.com");
	
	faculty f1 = new faculty(nextfacultyid(), "f1 Gonzalez", "asdf", "123 test", "915-123-1234", "jorge@test.com");
	faculty f2 = new faculty(nextfacultyid(), "f2 Gonzalez", "asdf", "123 test", "915-123-1234", "jorge@test.com");
	faculty f3 = new faculty(nextfacultyid(), "f3 Gonzalez", "asdf", "123 test", "915-123-1234", "jorge@test.com");
	
	student s1 = new student(nextstudentid(), "s1 Gonzalez", "asdf", "123 test", "915-123-1234", "jorge@test.com");
	student s2 = new student(nextstudentid(), "s2 Gonzalez", "asdf", "123 test", "915-123-1234", "jorge@test.com");
	student s3 = new student(nextstudentid(), "s3 Gonzalez", "asdf", "123 test", "915-123-1234", "jorge@test.com");
	

	instructors.add(i1);
	instructors.add(i2);
	instructors.add(i3);
	
	allfaculty.add(f1);
	allfaculty.add(f2);
	allfaculty.add(f3);
	
	students.add(s1);
	students.add(s2);
	students.add(s3);
}
/**
 * 
 * @return
 */
public int nextstudentid() {
	int currentid = -1;
	
	for(student c : students)
		currentid = c.getId();
	return currentid+1;
}
/**
 * 
 * @return
 */
public int nextfacultyid() {
	int currentid = -1;
	
	for(faculty c : allfaculty)
		currentid = c.getId();
	return currentid+1;
}
/**
 * 
 * @return
 */
public int nextinstructorid() {
	int currentid = -1;
	
	for(instructor c : instructors)
		currentid = c.getId();
	return currentid+1;
}
/**
 * 
 * @param id
 * @return
 */
public instructor searchInstructorbyId(int id)
{
	instructor r = null;
	for(instructor c : instructors)
	{
		if(c.getId() == id)
			r = c;
	}
	
	return r;
}
/**
 * 
 * @param id
 * @return
 */
public student searchStudentbyId(int id)
{
	student r = null;
	for(student c : students)
	{
		if(c.getId() == id)
			r = c;
	}
	
	return r;
}
/**
 * 
 * @param id
 * @return
 */
public faculty searchFacultybyId(int id)
{
	faculty r = null;
	for(faculty c : allfaculty)
	{
		if(c.getId() == id)
			r = c;
	}
	
	return r;
}
/**
 * 
 * @param id
 * @return
 */
public user searchallbyid(int id)
{
	user facultyresult = searchFacultybyId(id);
	user instructorresult = searchInstructorbyId(id);
	user studentresult = searchStudentbyId(id);
	if(facultyresult != null)
		return facultyresult;
	if(instructorresult != null)
		return instructorresult;
	if(studentresult != null)
		return studentresult;
	return null;
}

/**
 * 
 * @throws IOException
 */
public void writedata() throws IOException{
	@SuppressWarnings("resource")
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test"));
	oos.writeObject(instructors);
	oos.writeObject(allfaculty);
	oos.writeObject(students);
}
/**
 * 
 * @throws FileNotFoundException
 * @throws IOException
 * @throws ClassNotFoundException
 */
@SuppressWarnings("unchecked")
public void readdata() throws FileNotFoundException, IOException, ClassNotFoundException {
	@SuppressWarnings("resource")
	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test"));
	instructors = (HashSet<instructor>)ois.readObject();
	allfaculty = (HashSet<faculty>)ois.readObject();
	students = (HashSet<student>)ois.readObject();
}

public void printAllInstructors() {
	Iterator<instructor> Iterator = this.instructors.iterator();
	while(Iterator.hasNext())
	{
		instructor current = Iterator.next();
		current.print();
	}	
}
public void printAllFaculty() {
	Iterator<faculty> Iterator = this.allfaculty.iterator();
	while(Iterator.hasNext())
	{
		faculty current = Iterator.next();
		current.print();
	}	
}

public void printAllStudents() {
	Iterator<student> Iterator = this.students.iterator();
	while(Iterator.hasNext())
	{
		student current = Iterator.next();
		current.print();
	}	
}

public void printAllRecords(){
	printAllFaculty();
	printAllInstructors();
	printAllStudents();
}
/**
 * 
 * @throws IOException
 */
public void insertmainadmin() throws IOException {
	faculty mainadmin = new faculty(nextfacultyid(), "Jorge Dominguez", "1234", "123 test ave.", "915-123-4567", "jdominguez11@miners.utep.edu");
	allfaculty.add(mainadmin);
	this.writedata();
}
/**
 * 
 * @throws IOException
 */
public void cleardatafile() throws IOException {
	this.instructors = new HashSet<instructor>();
	this.allfaculty = new HashSet<faculty>();
	this.students = new HashSet<student>();
	
	this.writedata();
}
/**
 * 
 * @param username
 * @param password
 * @return
 */
private Object findbyCredentials(String username, String password) {
	int id = Integer.parseInt(username);
	for(faculty c : this.allfaculty)
	{
		if(c.getId() == id && c.getPassword().equals(password))
			return c;
	}
	return new FindError("Couldn't find anyone by id: "+id);
}
/**
 * 
 * @param username
 * @param password
 * @return
 * @throws FileNotFoundException
 * @throws ClassNotFoundException
 * @throws IOException
 */

public LoginResult userLogin(String username, char[] password) throws FileNotFoundException, ClassNotFoundException, IOException {
	this.readdata();
	String spassword = new String(password);
	Object result = findbyCredentials(username,spassword);
	String resultrole = result.getClass().getName();	
	return new LoginResult(resultrole, result);
}
/**
 * 
 * @return
 */

private String generatepassword() {
	
	char[] allowedCharacters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0'};


	StringBuffer password = new StringBuffer();
	Random Random = new Random();

	for(int i = 0; i < 12; i++) {
	    password.append(allowedCharacters[ Random.nextInt(allowedCharacters.length) ]);
	}
	

	return password.toString();
}
/**
 * 
 * @param name
 * @param address
 * @param number
 * @param email
 * @throws IOException
 */
public void addStudent(String name, String address, String number, String email) throws IOException {
	int id = nextstudentid();
	String password = generatepassword();
	student studenttoadd = new student(id, name, password, address, number, email);
	System.out.println("Adding user: ");
	studenttoadd.print();
	studenttoadd.sendpassword();
	students.add(studenttoadd);
	writedata();
}
/**
 * 
 * @param name
 * @param address
 * @param number
 * @param email
 * @throws IOException
 */

public void addFaculty(String name, String address, String number, String email) throws IOException {
	int id = nextfacultyid();
	String password = generatepassword();
	faculty facultytoadd = new faculty(id, name, password, address, number, email);
	System.out.println("Adding user: ");
	facultytoadd.print();
	facultytoadd.sendpassword();
	allfaculty.add(facultytoadd);
	writedata();
	
}
/**
 * 
 * @param name
 * @param address
 * @param number
 * @param email
 * @throws IOException
 */
public void addInstructor(String name, String address, String number, String email) throws IOException {
	int id = nextinstructorid();
	String password = generatepassword();
	instructor instructortoadd = new instructor(id, name, password, address, number, email);
	System.out.println("Adding user: ");
	instructortoadd.print();
	instructortoadd.sendpassword();
	instructors.add(instructortoadd);
	writedata();	
}

/**
 * 
 * @param userresult
 * @param newid
 * @throws IOException
 */

public void changeid(user userresult, int newid) throws IOException {
	searchallbyid(userresult.getId()).setId(newid);
	writedata();
	searchallbyid(newid).print();
}

/**
 * 
 * @param userresult
 * @throws IOException
 */

public void resetpassword(user userresult) throws IOException {
	
	user u = searchallbyid(userresult.getId());
	System.out.println("Old Password was: "+u.getPassword());
	u.setPassword(generatepassword());
	u.sendpassword();
	u.print();
	writedata();
	
}







}
