import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {

	@Test
	public void testGetAccountnumber() {
		//fail("Not yet implemented");
		BankAccount b= new BankAccount(2335,"dd",45646);
		assertEquals(b.getAccountnumber(),2335);
	}

	@Test
	public void testGetCustomername() {
	//fail("Not yet implemented");
		BankAccount b= new BankAccount(2335,"dd",45646);
		assertEquals(b.getCustomername(),"dd");
	}

	@Test
	public void testGetBalance() {
		//fail("Not yet implemented");
		BankAccount b= new BankAccount(2335,"dd",45646);
		assertEquals(b.getBalance(),45646);
	}

}
