
public class Light {
	 // Instance fields:          
	int noOfWatts;    // wattage 
	private   boolean indicator;          // on or off 
	protected String  location;           // placement
	 
	// Static field:  
	private static int counter; // no. of Light objects created
	 
	// Constructor:  
	Light() {  
		noOfWatts = 50;   
		indicator = true;  
		location  = "X";    
		counter++;  
		}
	 
	// Instance methods: 
	public  void switchOn()  { 
		indicator = true;
		}  
	
	public  void switchOff() { 
		indicator = false;
		}
	
	public  boolean isOn()    {
		return indicator;
		}  
	//private void  printLocation() { 
		//	System.out.println("Location: " + location);
			//}
		
	  // Static methods:  
		public static void writeCount() {  
			System.out.println("Number of lights: " + counter);
			}  
}
