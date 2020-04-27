
public class Client {
/*
   In a client, create a method that takes an arbitrary array of int values as a parameter,
and returns an array that has the same length, but the value of an element
in the new array is half that of the value in the corresponding element in the
array passed as the parameter. Let the implementation of this method create an
instance of Half, and use this instance to calculate values for the array that is
returned. 
    */
	int array[];
	
	
 public Client(int[] array) {
	this.array = array;
}


public int[] getArray() {
		return array;
	}


	public void setArray(int[] array) {
		this.array = array;
	}


public int[] getarray(){
	 	int num=5;
		int newarray[]=new int[num];
		int superarray[]=new int[num];
		superarray=this.array;
	 	int j=0;
		while(j<=num)
		{
		System.out.println(superarray[j]);
		j++;
		}
	 
	 
	 for (int i=0;i<=num;i++)
	 {
		newarray[i]=superarray[i]/2; 
	 }
	 
 return newarray;
 }
	
	
}
