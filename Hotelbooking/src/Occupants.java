
public class Occupants {
String name;
String address;
String mobile;
String email;


public Occupants(String name, String address, String mobile, String email) {
	this.name = name;
	this.address = address;
	this.mobile = mobile;
	this.email = email;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public String getMobile() {
	return mobile;
}


public void setMobile(String mobile) {
	this.mobile = mobile;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}

void printoccupants(){
	System.out.println("The occupant name is "+this.name);
	System.out.println("The occupant address is "+this.address);
	System.out.println("The occupant mobile is "+this.mobile);
	System.out.println("The occupant email is "+this.email);
}


}
