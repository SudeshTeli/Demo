
public class SavingAccount extends BankAccount {
	public SavingAccount(int Accountnumber, String Customername, int Balance) {
		super(Accountnumber, Customername, Balance);
		// TODO Auto-generated constructor stub
	}

	int interestrate=7;
	
	
	public void calculateinterest(){
	int interest;
		interest=(balance*interestrate)/100;
		System.out.println("The interest rate is "+interest);
			}
}
