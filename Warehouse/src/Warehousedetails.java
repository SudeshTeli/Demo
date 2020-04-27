
public class Warehousedetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  light.writeCount();        // Invoked using class name   
		  light light1 = new light(100, true, "basement"); // Create an object  
		  
		  System.out.println(        "Value of counter: " + light.counter+" and this is "+light1.location     );     // Accessed via class name
				  light light2 = new light(200, false, "garage");  // Create another object  
				  light2.writeCount();        // Invoked using reference
				  light light3 = new light(300, true, "kitchen");  // Create another object 
				  System.out.println(        "Value of counter: " + light3.counter    );     // Accessed via reference 
				  final int i; 
	}

}
