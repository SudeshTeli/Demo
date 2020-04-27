
public class Minote4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone myPhone = new SmartPhone("XIOMI","MINOTE4",3648236);
		SmartPhone yourPhone = new SmartPhone("SAMSUNG","S8",247923);
		//check which methods available to you when you use myphone reference
		
	System.out.println(myPhone.getModel());
		
		Phone phone = myPhone;
		Phone kphone = yourPhone;
		//check which methods are available when you use phone reference
		phone.makeCall(yourPhone);
		kphone.sms(myPhone);
		
		
		Camera Phone = myPhone;
		//check which methods are available when you use camera reference
		
		
		//similarly check musicplayer reference
	}

}
