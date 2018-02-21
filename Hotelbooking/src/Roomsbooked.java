import javax.swing.JOptionPane;
public class Roomsbooked {
Room room;
Occupants Occupants[];

public Roomsbooked(Room room, Occupants[] occupants) {
	this.room = room;
	this.Occupants = occupants;
	System.out.println("The room was successfully booked");
}

public Room getRoom() {
	return room;
}

public void setRoom(Room room) {
	this.room = room;
}

public Occupants[] getOccupants() {
	return Occupants;
}

public void setOccupants(Occupants[] occupants) {
	this.Occupants = occupants;
}

void printroomsbooked(){
	this.room.Printroomdetails();
	for (int i=0;i<this.Occupants.length;i++)
	{
		this.Occupants[i].printoccupants();	
	}
	
}

/*

void booking(){
	String bname=JOptionPane.showInputDialog("Enter the room number you wish to book?");
	System.out.println(this.room.getRoomno());
	int number = Integer.parseInt(bname);
	if(number==1){
		r1.
	}	
		
	}
	*/
}


