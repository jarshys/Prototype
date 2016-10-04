package Users;

public class instructor extends user {
	private String dateHired;
	private Boolean hasTenure;
	private int[] currentCourses;

	public instructor(int id, String name, String password, String address, String number, String email) {
		super(id, name, password, address, number, email);
		// TODO Auto-generated constructor stub
	}

	public String getDateHired() {
		return dateHired;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}

	public Boolean getHasTenure() {
		return hasTenure;
	}

	public void setHasTenure(Boolean hasTenure) {
		this.hasTenure = hasTenure;
	}

	public int[] getCurrentCourses() {
		return currentCourses;
	}

	public void setCurrentCourses(int[] currentCourses) {
		this.currentCourses = currentCourses;
	}

}
