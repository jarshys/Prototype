package Users;

public class user {
private int id;
private String name;
private String password;
private String address;
private String number;
private String email;

public user(int id, String name, String password, String address,String number,String email){
	this.setId(id);
	this.setName(name);
	this.setPassword(password);
	this.setAddress(address);
	this.setNumber(number);
	this.setEmail(email);
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
}
