/**
 * 
 */
package Users;
/**
 * 
 */
import java.io.Serializable;
/**
 * 
 * @author Luis
 *
 */
public class user implements Serializable{
/**
 * 
 */
	private static final long serialVersionUID = 8439464442677055059L;
private int id;
private String name;
private String password;
private String address;
private String number;
private String email;
/**
 * 
 * @param id
 * @param name
 * @param password
 * @param address
 * @param number
 * @param email
 */
public user(int id, String name, String password, String address,String number,String email){
	this.setId(id);
	this.setName(name);
	this.setPassword(password);
	this.setAddress(address);
	this.setNumber(number);
	this.setEmail(email);
}
/**
 * 
 * @return
 */
public int getId() {
	return id;
}
/**
 * 
 * @param id
 */
public void setId(int id) {
	this.id = id;
}
/**
 * 
 * @return
 */
public String getName() {
	return name;
}
/**
 * 
 * @param name
 */
public void setName(String name) {
	this.name = name;
}
/**
 * 
 * @return
 */
public String getPassword() {
	return password;
}
/**
 * 
 * @param password
 */
public void setPassword(String password) {
	this.password = password;
}
/**
 * 
 * @return
 */
public String getAddress() {
	return address;
}
/**
 * 
 * @param address
 */
public void setAddress(String address) {
	this.address = address;
}
/**
 * 
 * @return
 */
public String getNumber() {
	return number;
}
/**
 * 
 * @param number
 */
public void setNumber(String number) {
	this.number = number;
}
/**
 * 
 * @return
 */
public String getEmail() {
	return email;
}
/**
 * 
 * @param email
 */
public void setEmail(String email) {
	this.email = email;
}
/**
 * 
 */
public void sendpassword(){
	System.out.println("Sending password ("+password+") to " + name +" - "+ email);
}
/**
 * 
 */
public void print()
{
	System.out.println("User-------------------");
	System.out.println("Role: "+this.getClass().getName());
	System.out.println("id: "+id);
	System.out.println("name: "+name);
	System.out.println("password: "+password);
	System.out.println("address: "+address);
	System.out.println("number:"+number);
	System.out.println("email: "+email);

}

}
