
public class SmartPhone implements Phone, Camera {

	public static Boolean engage=true;
	public static Boolean mssg=true;
	
String Manufacturer;
String Model;
int Number;

public SmartPhone(String manufacturer, String model, int number) {
	this.Manufacturer = manufacturer;
	this.Model = model;
	this.Number = number;
}


public String getManufacturer() {
	return Manufacturer;
}


public void setManufacturer(String manufacturer) {
	this.Manufacturer = manufacturer;
}


public String getModel() {
	return Model;
}


public void setModel(String model) {
	this.Model = model;
}

public void setNumber(int number ) {
	this.Number = number;
}

public int getNumber() {
	return Number;
}





	@Override
	public void clickPhoto() {
		// TODO Auto-generated method stub
		Boolean status=false;
		status=true;
		if (status==true)
				{
					System.out.println("Photo clicked");
					status=false;
				}
		
		}

	@Override
	public void takeSelfie() {
		// TODO Auto-generated method stub
		Boolean status=false;
		status=true;
		if (status==true)
				{
					System.out.println("selfie clicked");
					status=false;
				}
		
	}

	@Override
	public void makeVideo() {
		// TODO Auto-generated method stub
		Boolean status=false;
		status=true;
		if (status==true)
				{
					System.out.println("video taken");
					status=false;
				}
		
	}

	@Override
	public void makeCall(Phone p) {
		// TODO Auto-generated method stub
		SmartPhone newp=(SmartPhone)p;
		SmartPhone newbie = new SmartPhone(this.Manufacturer,this.Model,this.Number);
		System.out.println("THe call is being connected to "+newp.Number);
		
		if(engage=true)
		{
			p.receiveCall(newbie);
			
		}
		else
		{
			engage=false;
			System.out.println("Uable to place call to "+newp.Number);
			
		}
		//System.out.println(newp.Number);
	}

	@Override
	public void sms(Phone p) {
		// TODO Auto-generated method stub
		SmartPhone receiver=(SmartPhone)p;
		SmartPhone sender = new SmartPhone(this.Manufacturer,this.Model,this.Number);
		
		
		if(mssg==true)
		{
			System.out.println("Message sent to "+receiver.Number );
			mssg=false;
			sender.sms(receiver);
		}
		else
		{
			System.out.println("Message received from "+sender.Number );
			
			mssg=true;
		}
		
		}
		
	

	@Override
	public void receiveCall(Phone p) {
		// TODO Auto-generated method stub
		SmartPhone newp=(SmartPhone)p;
		System.out.println("THe call received from "+newp.Number);
		
	}

}
