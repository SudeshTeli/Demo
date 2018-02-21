
public class Elevator {
	Panel panel;
	Button button;
	Indicator indicator;
	LED led;
	StopButton stopbutton;
	RequestButton requestbutton;
	Indicate indicate;
	public Elevator(Panel p, Button b, Indicator i, StopButton sB) {
		// TODO Auto-generated constructor stub
		this.panel=p;
		this.button=b;
		this.indicator=i;
		this.stopbutton=sB;
	}
	public Elevator(Panel p, Button b, Indicator i, StopButton sB, RequestButton rB) {
		// TODO Auto-generated constructor stub
	}
	public Elevator(Panel p, Button b, Indicator i, LED l, StopButton sB, RequestButton rB) {
		// TODO Auto-generated constructor stub
		this.panel=p;
		this.button=b;
		this.indicator=i;
		this.led=l;
		this.stopbutton=sB;
		this.requestbutton=rB;
	}
	public Elevator(Panel p, Button b, Indicator i, LED l, StopButton sB, RequestButton rB, Indicate ind) {
		// TODO Auto-generated constructor stub
		this.panel=p;
		this.button=b;
		this.indicator=i;
		this.led=l;
		this.stopbutton=sB;
		this.requestbutton=rB;
		this.indicate=ind;
	}
	void display(){
		System.out.println("-----SERVICE REQUEST 1-------");
		System.out.println("--------------GOING FROM GROUND FLOOR TO THIRD FLOOR---------------");
		 panel.RUNNING();
		 button.UP();
		 indicator.ON();
		 led.GROUND();
		 led.FIRST();
		 led.SECOND();
		 led.THIRD();
		 stopbutton.OFF();
		 requestbutton.UP();
		 indicate.GOINGUP();
		 stopbutton.ON();
		 panel.STOP();
		 
		 
	 }
	public void Service2() {
		// TODO Auto-generated method stub
		System.out.println("-----SERVICE REQUEST 2-------");
		System.out.println("--------------GOING FROM THIRD FLOOR TO FIRST FLOOR---------------");
		panel.RUNNING();
		button.DOWN();
		indicator.ON();
		led.THIRD();
		led.SECOND();
		led.FIRST();
		led.GROUND();
		stopbutton.OFF();
		requestbutton.DOWN();
		indicate.GOINGDOWN();
		stopbutton.ON();
		panel.STOP();






		
	}

}
