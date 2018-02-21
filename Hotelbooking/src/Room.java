
public class Room {
int roomno;
int floor;
boolean flag=false;
public static int noofrooms=10;

public Room(int roomno, int floor) {
	this.roomno = roomno;
	this.floor = floor;
}


public int getRoomno() {
	return roomno;
}


public void setRoomno(int roomno) {
	this.roomno = roomno;
}


public int getFloor() {
	return floor;
}


public void setFloor(int floor) {
	this.floor = floor;
}

void Printroomdetails(){
System.out.println("The room number is "+this.roomno);
System.out.println("The room is situated on the "+this.floor+" floor");
if(flag==false){
System.out.println("The room is currently unoccupied");
}
else
{

	System.out.println("The room is occupied");
}
}



}


