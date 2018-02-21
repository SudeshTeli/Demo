
public class Perishable extends Goods{
	public static final int tax=10;
	public static int totalprice=0;

	public Perishable(String name, int price) {
		
		super(name, price);
		int pric=this.price;
		this.price=pric+tax();
		// TODO Auto-generated constructor stub
	}
public int tax(){
	int num=this.price;
	int taxamount=0,total=0;
	taxamount=num/tax;
	total=2*(this.price+taxamount);
	totalprice=totalprice+total;
	return totalprice;
	
}
}
