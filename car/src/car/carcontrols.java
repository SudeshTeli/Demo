package car;

public class carcontrols {
	String engine;
	String brakes;
	String chassis;
	String ignition;
	int gears;
	int odometer;
	
	public carcontrols(String engine, String brakes, String chassis, String ignition, int gears, int odometer) {
		this.engine = engine;
		this.brakes = brakes;
		this.chassis = chassis;
		this.ignition = ignition;
		this.gears = gears;
		this.odometer = odometer;
	}
	
	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getBrakes() {
		return brakes;
	}

	public void setBrakes(String brakes) {
		this.brakes = brakes;
	}

	public String getChassis() {
		return chassis;
	}

	public void setChassis(String chassis) {
		this.chassis = chassis;
	}

	public String getIgnition(){
		return ignition;
	}

	public void setIgnition(String ignition) {
		this.ignition = ignition;
	}
	
	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}
	
	public int getOdometer() {
		return odometer;
	}

	public void setOdometer(int odometer) {
		this.odometer = odometer;
	}
	
	public void startcar(){
		
		
					if(this.engine=="off")
					{
						this.setEngine("on");
			
					}
					
						if(this.ignition=="off")
						{
							this.setIgnition("on");
						}
					
						else

					if(this.gears!=1)
						{
						this.setGears(1);
						}
						if(this.odometer==0)
							{
							this.setOdometer(10);
							}
				}	
		
	
	public void print()
	{
		System.out.println("After the car is started");
		System.out.println(this.engine);
		System.out.println(this.brakes);
		System.out.println(this.chassis);
		System.out.println(this.ignition);
		System.out.println(this.gears);
		System.out.println(this.odometer);
		
	}
	
	
	
			private gearstate g;
			
			public void setState(gearstate g){
				this.g = g; 
			}
			public gearstate getState() {
				return this.g; 
				}
	

}




