
public class Mobile {
	
	Float CameraFront,CameraRear;
	Screen screen;
	int battery,serial,anteena=0;
	String PowerSwitch="OFF",keyboard,calling="AVAILABLE";
	Sim sim1,sim2;
	int S1Stat=1,S2Stat=1;
	MCard memoryCard;
	String MobileName;
	


	public Mobile(String mobilename,Screen screen, float CameraFront, float CameraRear, int i, String keyboard, int serial, Sim sim, MCard memoryCard, Sim sim2) {
		// TODO Auto-generated constructor stub
		this.MobileName=mobilename;
		this.screen=screen;
		this.CameraFront=CameraFront;
		this.CameraRear=CameraRear;
		this.keyboard=keyboard;
		this.serial=serial;
		this.sim1=sim;
		this.sim2=sim2;
		this.memoryCard=memoryCard;
	}


	public void Power(){
		if(PowerStatus()==1){
			PowerSwitch="On";
			System.out.println("\nMobile Turned ON\n");
			if(sim1.MobileNo==0)
				S1Stat=0;
			if(sim2.MobileNo==0)
				S2Stat=0;
			calling="AVAILABLE";
	
			
		}
		else{
			PowerSwitch="OFF";
			System.out.println("\nMobile Turned OFF\n");
			calling="BUSY";
		
		}
	}
	
	
	public int PowerStatus(){
		if(PowerSwitch=="OFF")
			return 1;
		else
			return 0;
	}
	
	public void call(Mobile  mobile,int  MobileNo){
		
		System.out.println("\nOpening Call\n");
		System.out.println("\nDiling Number: "+MobileNo);
		if(mobile.sim1.getMobileNo()!=MobileNo)
			if(mobile.sim2.getMobileNo()!=MobileNo){
				System.out.println("\nInvalid Mobile No.\n");
				return;
			}
		System.out.println("\nCalling \n"+MobileNo);
		if (mobile.calling=="BUSY"){
			System.out.println(MobileNo+" is BUSY\n");
			return;
		}
			mobile.calling="BUSY";
			calling="BUSY";
			System.out.println("\n8675948564 Answered the Call");
			System.out.println("\nSpeaking with "+MobileNo);
			System.out.println("\nEnd Call with "+MobileNo);
			mobile.calling="AVAILABLE";
			calling="AVAILABLE";
			System.out.println("\nCall Ended\n");
	}


	public void RearCamClick() {
		// TODO Auto-generated method stub
		System.out.println("\nRear Camera Turned On");
		System.out.println("\nFocing on Subject");
		System.out.println("\nZooming In");
		System.out.println("\nCapturing");
		System.out.println("\nSaving Photo to Memory Card File Size:60MB");
		MCard.Used=MCard.Used+50;
		System.out.println("\nSaved");
	}
	
	public void FrontCamClick() {
		// TODO Auto-generated method stub
		System.out.println("\nFront Camera Turned On");
		System.out.println("\nFocing on Subject");
		System.out.println("\nZooming In");
		System.out.println("\nCapturing");
		System.out.println("\nSaving Photo to Memory Card File Size:20MB");
		MCard.Used=MCard.Used+20;
		System.out.println("\nSaved");
	}
	public void MobileStatus(){
		System.out.println("\nFront Camera: "+CameraFront+"MP");
		System.out.println("\nRear Camera: "+CameraRear+"MP");
		System.out.println("\nMemory Used: "+MCard.Used+"MB"+"\nTotal Memory: "+MCard.getTotal()+"MB");
		System.out.println("\nScreen Size: "+screen.Display+"");
		
	}
}

