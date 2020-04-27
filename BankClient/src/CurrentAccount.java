
public class CurrentAccount extends BankAccount {

	public CurrentAccount(int Accountnumber, String Customername, int Balance) {
		super(Accountnumber, Customername, Balance);
		// TODO Auto-generated constructor stub
	}
	
	public void overdraft(int amount){
		int limit;
		System.out.println("The original balance amount in the acoount of "+this.customername + " was "+this.balance);
		limit=this.balance-amount;
		if(this.balance>-5000){
			if(limit>=-5000){
		this.balance=balance-amount;
		System.out.println("The account "+this.customername+" has balance "+this.balance);
							}
								}
		else{
			System.out.println("The amount requested could not be credited because the overdraft limit is reached");
			
		}
		
	}

}
