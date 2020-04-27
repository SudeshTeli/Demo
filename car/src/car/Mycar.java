package car;

public class Mycar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		carcontrols car = new carcontrols("off","off","bugatti","off",1,0);  
		
		System.out.println("Before the car starts");
		System.out.println(car.engine);
		System.out.println(car.brakes);
		System.out.println(car.chassis);
		System.out.println(car.ignition);
		System.out.println(car.gears);
		System.out.println(car.odometer);
		car.startcar();
		car.print();
	car.setState(gearstate.NEUTRAL);
	//car.setState(NEUTRAL);
		gearstate g = car.getState();
		
		System.out .println("The machine state is:" + g);
		
		
		
		
	
	}

}
