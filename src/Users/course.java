/**
 * Provides all the classes of users.
 */
package Users;

import java.io.Serializable;


public class course implements Serializable{

	private static final long serialVersionUID = -3012132928673897020L;
	private int id;
	private String name;
	private Semester semester;
	private instructor instructor;

public course(int id, String name, Semester semester, instructor instructor){
	this.id = id;
	this.name = name;
	this.semester = semester;
	this.instructor = instructor;
}


public void print()
{
	System.out.println("Course-------------------");
	System.out.println("id: "+id);
	System.out.println("name: "+name);
	System.out.println("   Semsester");
		semester.print();
	System.out.println("   Instructor");
		instructor.print();
}

public Semester getSemester() {
	return this.semester;
}

public String getName() {
	return this.name;
}
}
