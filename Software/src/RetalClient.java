
public class RetalClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie1,m2,m3;
		Customer c1;
		
		movie1 = new Movie("kkk",2);
		m2 = new Movie("Raid",1);
		c1=new Customer("Rakesh");
		c1.addRental(new Rental(movie1,4));
		c1.addRental(new Rental(m2,5));
		System.out.println(c1.statement());
		
		
	
	}

}
