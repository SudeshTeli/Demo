import javax.swing.JOptionPane;
public class Hotelbooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
 * initialising room details.
 * */
		Room r1=new Room(1,1);
		Room r2=new Room(2,1);
		Room r3=new Room(3,1);
		Room r4=new Room(4,1);
		Room r5=new Room(5,2);
		Room r6=new Room(6,2);
		Room r7=new Room(7,2);
		Room r8=new Room(8,2);
		Room r9=new Room(9,3);
		Room r10=new Room(10,3);
		
		Occupants o1=new Occupants("sudesh","Bicholim","6423964239","sudeshteli@gmail.com");
		Occupants o2=new Occupants("Ashitosh","Advoi","462396324","Ashitosh@gmail.com");
		
		r1.Printroomdetails();
		
	
		Roomsbooked rb1=new Roomsbooked(null,null);
		
		if(r1.flag==false){
			rb1.room=r1;
			
		}
			else{
					if(r2.flag==false){
					rb1.room=r2;
					}
					else{
						if(r3.flag==false){
							rb1.room=r3;
							}
						else{
							if(r4.flag==false){
								rb1.room=r4;
								}
							else{
								if(r5.flag==false){
									rb1.room=r5;
									}
							}
						}
					}
					}
	
		Occupants[] occup=new Occupants[2];
		occup[0]=o1;
		occup[1]=o2;
			rb1.Occupants=occup;		
			rb1.Occupants[0]=o1;
			rb1.Occupants[1]=o2;
			rb1.room.flag=true; 
			rb1.printroomsbooked();
		
			
		
		
	}

}
