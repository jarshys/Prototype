/**
 * Provides all the classes of users.
 */
package Users;
/**
 * Create a Student user using a super class user.
 * @author CodeBuster
 * @version 4
 *
 */
public class student extends user {
	private static final long serialVersionUID = 6421758157471557234L;
	private int numberofclassestaken;
	private int currentsemester;
	private int[] semesterstaken;
	
/**
 * Constructor
 * @param id A unique Student id
 * @param name Student name
 * @param password Student password
 * @param address Student address
 * @param number Student number
 * @param email Student school email
 */
	public student(int id, String name, String password, String address, String number, String email) {
		super(id, name, password, address, number, email);
		// TODO Auto-generated constructor stub
	}

/**
 * 
 * @return Return a list of all the semester that student took
 */
	public int[] getSemesterstaken() {
		return semesterstaken;
	}

/**
 * 
 * @param semesterstaken An array of the semesters that student complete
 */
	public void setSemesterstaken(int[] semesterstaken) {
		this.semesterstaken = semesterstaken;
	
	}
/**
 * 
 * @return Return the current semeter
 */

	public int getCurrentsemester() {
		return currentsemester;
	}

/**
 *current semester porque es int???
 * @param currentsemester 
 */
	public void setCurrentsemester(int currentsemester) {
		this.currentsemester = currentsemester;
	}

/**
 * 
 * @return Return the number of classes that student has completed
 */
	public int getNumberofclassestaken() {
		return numberofclassestaken;
	}

/**
 * 
 * @param numberofclassestaken The number of classes that student has completed
 */
	public void setNumberofclassestaken(int numberofclassestaken) {
		this.numberofclassestaken = numberofclassestaken;
	}
/**
 * Student can look the classes to register 
 */
	public void register(){
		
	}
/**
 * Student can check when could graduate
 */
	public void checkGraduation(){
		
	}
/**
 * Student can check the semester schedule
 */
	public void checkSchedule(){
		
	}
/**
 * Student can revise what are their grades
 */
	public void checkGrades(){
		
	}

}
