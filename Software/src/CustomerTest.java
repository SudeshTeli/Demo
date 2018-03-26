import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CustomerTest {
	Movie m1,m2,m3;
	Customer c1;
	Rental myRental;
  
	@Before
	public void setUp() throws Exception {
	m1=new Movie("tiger",4);
	m2=new Movie("wolf",5);
	c1=new Customer("Rakesh");
	c1.addRental(new Rental(m1,4));
	c1.addRental(new Rental(m2,5));
	c1.statement();
	
	
	}

	@Test
	public void testStatement() {
		//fail("Not yet implemented");
	}

}
