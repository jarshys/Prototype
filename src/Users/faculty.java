package Users;
/**
 * Create a faculty user using a super class User
 * @author Codebuster
 *
 */

public class faculty extends user {

	private static final long serialVersionUID = 5150529805879291221L;
	private int department;
/**
 * 	Constructor
 * @param id A unique faculty ID
 * @param name Faculty name
 * @param password Faculty password
 * @param address Faculty address
 * @param number Faculty phone number
 * @param email Faculty school email
 */
	public faculty(int id, String name, String password, String address, String number, String email) {
		super(id, name, password, address, number, email);
		// TODO Auto-generated constructor stub
	}
/**
 * 
 * @return Return department name where Faculty works
 */
	public int getDepartment() {
		return department;
	}
/**
 * 
 * @param department Department where faculty works
 */
	public void setDepartment(int department) {
		this.department = department;
	}

}
