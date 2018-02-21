
public class Bookclub {
String clubname;
int members;
int fee;

public Bookclub(String clubname,int members,int fee){
	super();
	this.setClubname(clubname);
	this.setMembers(members);
	this.setFee(fee);
}


public String getClubname() {
	return clubname;
}
public void setClubname(String clubname) {
	this.clubname = clubname;
}
public int getMembers() {
	return members;
}
public void setMembers(int members) {
	this.members = members;
}
public int getFee() {
	return fee;
}
public void setFee(int fee) {
	this.fee = fee;
}

public void display(){
	
	System.out.println("The newe bookclub is" + this.clubname);
	System.out.println("The monthly fee is" + this.fee);
	System.out.println("Total members are"+this.members);
	
}


}
