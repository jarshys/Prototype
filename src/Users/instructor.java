/**
 * Provides all the classes of users.
 */
package Users;
/**
 * Create an Instructor user using a super class user.
 * @author CodeBuster
 * @version 4
 *
 */
public class instructor extends user {
	
	private static final long serialVersionUID = -343477414282033618L;
	private String dateHired;
	private Boolean hasTenure;
	private int[] currentCourses;
/**
 * Constructor 
 * @param id A unique Instructor id
 * @param name Instructor name
 * @param password Instructor Password
 * @param address Instructor Address
 * @param number Instructor Phone number
 * @param email Instructor school email
 */
	public instructor(int id, String name, String password, String address, String number, String email) {
		super(id, name, password, address, number, email);
		// TODO Auto-generated constructor stub
	}
/**
 * 
 * @return Return When the instructor was hired
 */
	public String getDateHired() {
		return dateHired;
	}
/**
 * 
 * @param dateHired When instructor is hired
 */
	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
/**
 * 
 * @return
 */
	public Boolean getHasTenure() {
		return hasTenure;
	}
/**
 * 
 * @param hasTenure
 */
	public void setHasTenure(Boolean hasTenure) {
		this.hasTenure = hasTenure;
	}
/**
 * 
 * @return Return an array of current courses
 */
	public int[] getCurrentCourses() {
		return currentCourses;
	}
/**
 * 
 * @param currentCourses An array of current courses that instructor teach
 */
	public void setCurrentCourses(int[] currentCourses) {
		this.currentCourses = currentCourses;
	}

}
