
public class Bill {
	
	Goods goods;
	int quantity;
	
	
	
	
	public Bill(Goods goods, int quantity) {
		this.goods = goods;
		this.quantity = quantity;
		
	
	}

	
	
	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/*
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
*/

	
	
	
	
	public static int tprice=0;
	
	public int billgeneration(){
		int total=0;
			total=this.goods.price;
			System.out.println("The total amount on "+this.goods.name+" with price "+this.goods.price+" for quantity "+this.quantity+" is "+total);
			tprice=tprice+total;
	
		//finaltotal=totalprice;
		return tprice;
	}
	
	
}
