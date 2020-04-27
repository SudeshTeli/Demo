
public class light {
	   int     noOfWatts;      // wattage  
	   boolean indicator;   // on or off 
	   String  location;     // placement
		  // Static variable
	   static int counter; // No. of Light objects created.         (1)
		  // Explicit default constructor 
	  public light(int noOfWatts, boolean indicator, String location) {  
		   this.noOfWatts = noOfWatts;    
		   this.indicator = indicator;  
		   this.location  = location; 
		   ++counter;     // Increment counter.  }
	   }
		
		  // Static method  
	   public static void writeCount(){ 
		   System.out.println("Number of lights: " + counter);         // (2)    // Compile-time error. Field noOfWatts is not accessible:    // 
		   //System.out.println("Number of Watts: " + noOfWatts);     // (3) 
		   }
	   }

