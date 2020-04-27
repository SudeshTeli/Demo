import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankAccount2Test {
	BankAccount b;
	@Before
	public void setUp() throws Exception {
		 b= new BankAccount(2335,"dd",45646);
	}

	
	@Test
	public void testGetCustomername() {
		//fail("Not yet implemented");
		assertEquals("dd",b.getCustomername());
	}

	@Test
	public void testGetBalance() {
	//	fail("Not yet implemented");
		assertEquals(b.getBalance(),45646);
	}

}
