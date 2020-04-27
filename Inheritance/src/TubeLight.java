
public class TubeLight extends Light {
	 // Instance fields:  
	private int tubeLength = 54; 
	private int colorNo    = 10;
	
	  // Instance methods:  
	public int getTubeLength() { 
		return tubeLength; 
		}
	
	  public void printInfo() {  
		  System.out.println("Tube length: "  + getTubeLength());
		  System.out.println("Color number: " + colorNo); 
		  System.out.println("Wattage: "      + noOfWatts);   
		  // Inherited. 
		  // System.out.println("Indicator: " + indicator);
		  // Not Inherited. 
		  System.out.println("Indicator: "    + isOn());     
		  // Inherited.    
		  System.out.println("Location: "     + location);    
		  // Inherited.
		  //  printLocation();        
		  // Not Inherited. 
		  // System.out.println("Counter: "   + counter);  
		  // Not Inherited.   
		  writeCount();    
		  // Inherited.  
		  }
	  
	  
	  
}