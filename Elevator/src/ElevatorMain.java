/*SAMPAD S.KAMAT
 * ROLL NUMBER: 1623
 * */
public class ElevatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Status S= new Status("Running");
		Button B=new Button("Up");
		Indicator I =new Indicator("On");
		LED L=new LED(G);
		StopButton  SB=new StopButton("Pressed");
		Door D=new Door("Open");*/
		Panel P=new Panel();
		Button B=new Button();
		Indicator I =new Indicator();
		LED L=new LED();
		StopButton SB= 	new StopButton();
		RequestButton RB=new RequestButton();
		Indicate Ind=new Indicate();
		Elevator E=new Elevator(P,B,I,L,SB,RB,Ind);
		E.display();
		E.Service2();
	}

}
