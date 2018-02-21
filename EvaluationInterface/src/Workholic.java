import javax.swing.JOptionPane;

public class Workholic {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		String quantity;
		int num=5;
		int barray[]=new int[num];
		int[] arrays = null;
		
		for (int i=0;i<num;i++)
		 {
			quantity=JOptionPane.showInputDialog("Enter array input value ");
			int numquantity=Integer.parseInt(quantity);
			barray[i]=numquantity;
		 }
		Client kick=new Client(barray);
		
		
		int newarray[]=new int[num];
		

			newarray=kick.getArray();
		
			

		/*	int j=0;
			while(j<num)
			{
			System.out.println(array[j]);
			j++;
			}
	*/
}

	
	}
