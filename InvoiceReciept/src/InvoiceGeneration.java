import javax.swing.JOptionPane;

public class InvoiceGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int tt=0;
		Goods[] g=new Goods[10];
		g[0]= new Perishable("Banana",24);
		g[1]= new Nonperishable("Plastic pipes",50);
		g[2]= new Perishable("Onions",30);
		g[3]= new Nonperishable("schoolbag",550);
		g[4]= new Perishable("sugar",48);
		g[5]=new Nonperishable("shoes",300);
		g[6]=new Perishable("Tea Powder",20);
		g[7]=new Nonperishable("ruler",30);
		g[8]=new Perishable("potatoes",40);
		g[9]=new Nonperishable("cd",40);
		
		
		
		//g[0].display();
		
		
		Bill[] b=new Bill[10];
		for(int i=0;i<=9;i++){
			
			String quantity;
			quantity=JOptionPane.showInputDialog("Enter "+ g[i].name +" quantity that is to be billed");
			int numquantity=Integer.parseInt(quantity);
		b[i]=new Bill(g[i],numquantity);	
		}
		
		int[] t=new int[10];
		for(int j=0;j<9;j++){
		t[j]=b[j].billgeneration();
		tt=t[j];
		}
		System.out.println("The grand total is "+tt);
		
		
			
			
			
	}
	}


