package Users;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Semester implements Serializable{
	private int id;
	private String name;
	private Date beginning;
	private Date end;
	
	public Semester(int id, String name, Date beginning, Date end)
	{
		this.id = id;
		this.name = name;
		this.beginning = beginning;
		this.end = end;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Date getBeginning() {
		return this.beginning;
	}
	
	public Date getEnd() {
		return this.end;
	}

	public void print() {
		System.out.println("Semester-------------------");
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println(String.format("Date: [%s : %s]", dateFormat.format(beginning), dateFormat.format(end)));		
	}
}
