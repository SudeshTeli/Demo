

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Book.writeCount();
		
		Book[] Book=new Book[3];
		Author sk=new Author("Sherrilyn Kenyon","United States","Science fiction");
		Author ns=new Author("Nalini Singh","United Kingdom","paranormal");
		Author kk=new Author("Kiran","india","Educational");
		Book javaBook=new Book("Java Programming",300,sk,300);
		Book python=new Book("Python Programming",400,kk,400);
		Book php=new Book("Php simplified",500,kk,300);
		Book clone=null; 
		//default constructor 
		//Bookclub konkan= new Bookclub();
		
		Bookclub club= new Bookclub("Geekers",10,50);
		club.display();
		
		Author ff=new Author("NULL","NULL","NULL");
		//ff.copycat(sk);
		
		
		Book b=new Book("java",200,ff,600);
		//Book c=new Book(b);
		
		//Book newBook=new Book(javaBook);
		
		
		
		
		//sk.setAuthorname("Sherrilyn Kenyon");
		//sk.setCountry("UK");
		//sk.setGenre("science fiction");
		//javaBook.pages=10;
		//javaBook.setPages(100);
		//javaBook.setAuthor("Dagger Ixur");
		//javaBook.setPrice(50);
		//javaBook.setTitle("Legend");
		
		
		
		
		//System.out.println(sk.getAuthorname());
		//System.out.println(sk.getCountry());
		//System.out.println(sk.getGenre());
		
		
		/*
		System.out.println(javaBook.getPages());
		System.out.println(javaBook.getPrice());
		System.out.println(sk.getAuthorname());
		System.out.println(sk.getCountry());
		System.out.println(sk.getGenre());
		System.out.println(javaBook.getTitle());
		
		System.out.println(php.getPages());
		System.out.println(php.getPrice());
		System.out.println(kk.getAuthorname());
		System.out.println(kk.getCountry());
		System.out.println(kk.getGenre());
		System.out.println(php.getTitle());
		
		System.out.println(python.getPages());
		System.out.println(python.getPrice());
		System.out.println(kk.getAuthorname());
		System.out.println(kk.getCountry());
		System.out.println(kk.getGenre());
		System.out.println(python.getTitle());
		*/
		javaBook.getAuthor().setCountry("US");
		
		

		Book cplus=new Book("C Plus",500,sk,1000);
		
		String s=cplus.getAuthor().getCountry();
		System.out.println(s);
		/*
		//String bname=JOptionPane.showInputDialog("Enter the book name?");
		System.out.println(javaBook.getTitle());
		
		//System.out.println(javaBook.getAuthor);
		
		System.out.println("new"+ff.getAuthorname());
		System.out.println("new"+ff.getCountry());
		System.out.println("new"+ff.getGenre());
		
		
		
		System.out.println("b details"+b.pages);
		System.out.println("b details"+b.title);
		System.out.println("b details"+b.author.getAuthorname());
		
		//System.out.println("c details"+c.pages);
	//	System.out.println("c details"+c.title);
		//System.out.println("c details"+c.author.getAuthorname());
	//	
	//Book.writeCount();
	System.out.println("The book has serial number" + javaBook.serialnumber);
	System.out.println("The book has serial number" + b.serialnumber);
	System.out.println("The book has serial number" + cplus.serialnumber);
	System.out.println("The book has serial number" + python.serialnumber);
	System.out.println("The book has serial number" + php.serialnumber);
	
	
	

	Book[0]=new Book("title1",100,sk,200);
	Book[1]=new Book("title 2",200,kk,200);
	Book[2]=new Book("title 3",300,sk,500);
	
	System.out.println("The array object 1 is "+Book[0].title);
	System.out.println("The array object 2 is "+Book[1].title);

	*/
		sk.setBook("Deadmanwalking");
		
		//trying cloning for author object ff
		try{
			clone=(Book)javaBook.clone();
			
		}
		 catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
		
		clone.print();
		javaBook.print();
	
		//changing one field
	
		clone.author.setAuthorname("Alfran shaikh");
		javaBook.print();
		clone.print();

			
	
	}

}


