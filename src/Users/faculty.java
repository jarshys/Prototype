package Users;

public class faculty extends user {

	private int department;
	
	public faculty(int id, String name, String password, String address, String number, String email) {
		super(id, name, password, address, number, email);
		// TODO Auto-generated constructor stub
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

}
