
public class Goods {
String name;
int price;


public Goods(String name, int price) {
	this.name = name;
	this.price = price;
	
	
}

public void display(){
System.out.println("The goods name is "+name);
System.out.println("The good cost  is "+price);
//System.out.println("The good is "+ type+"type");	
}
}