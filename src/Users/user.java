/**
 * Provides all the classes of users.
 */
package Users;

import java.io.Serializable;
/**
 * Super Class User provides all the methods to set the personal information from all users.
 * @author CodeBuster
 * @version 4
 * 
 */
public class user implements Serializable{

	private static final long serialVersionUID = 8439464442677055059L;
	private int id;
	private String name;
	private String password;
	private String address;
	private String number;
	private String email;
/**
 * Constructor
 * @param id A unique User id
 * @param name User Name
 * @param password User Password
 * @param address User Address
 * @param number User phone number
 * @param email User email
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
 * @return Return user id
 */
public int getId() {
	return id;
}
/**
 * 
 * @param id Assign user id
 */
public void setId(int id) {
	this.id = id;
}
/**
 * 
 * @return Return user name
 */
public String getName() {
	return name;
}
/**
 * 
 * @param name Assign user name
 */
public void setName(String name) {
	this.name = name;
}
/**
 * 
 * @return Return user password
 */
public String getPassword() {
	return password;
}
/**
 * 
 * @param password Assign user password
 */
public void setPassword(String password) {
	this.password = password;
}
/**
 * 
 * @return Return user address
 */
public String getAddress() {
	return address;
}
/**
 * 
 * @param address Assign user address
 */
public void setAddress(String address) {
	this.address = address;
}
/**
 * 
 * @return Return user number
 */
public String getNumber() {
	return number;
}
/**
 * 
 * @param number Assign user phone number
 */
public void setNumber(String number) {
	this.number = number;
}
/**
 * 
 * @return Return user email
 */
public String getEmail() {
	return email;
}
/**
 * 
 * @param email Assign user email
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
 * Print all the information about the user
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
