package Users;

public class student extends user {
	private int numberofclassestaken;
	private int currentsemester;
	private int[] semesterstaken;
	

	public student(int id, String name, String password, String address, String number, String email) {
		super(id, name, password, address, number, email);
		// TODO Auto-generated constructor stub
	}


	public int[] getSemesterstaken() {
		return semesterstaken;
	}


	public void setSemesterstaken(int[] semesterstaken) {
		this.semesterstaken = semesterstaken;
	
	}


	public int getCurrentsemester() {
		return currentsemester;
	}


	public void setCurrentsemester(int currentsemester) {
		this.currentsemester = currentsemester;
	}


	public int getNumberofclassestaken() {
		return numberofclassestaken;
	}


	public void setNumberofclassestaken(int numberofclassestaken) {
		this.numberofclassestaken = numberofclassestaken;
	}
	
	public void register(){
		
	}
	
	public void checkGraduation(){
		
	}
	
	public void checkSchedule(){
		
	}
	
	public void checkGrades(){
		
	}

}
