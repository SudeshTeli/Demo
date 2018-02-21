import java.util.*;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Book[] Book=new Book[3];
		Author sk=new Author("Sherrilyn Kenyon","United States","Science fiction");
		Author ns=new Author("Nalini Singh","United Kingdom","paranormal");
		Author kk=new Author("Kiran","india","Educational");
		Book javaBook=new Book("Java Programming",300,sk,300);
		Book python=new Book("Python Programming",400,ns,400);
		Book php=new Book("Php simplified",500,kk,300);
	
		
		
		Bookclub club= new Bookclub("Geekers",10,50);
		club.display();
		
		Author ff=new Author("NULL","NULL","NULL");
		
		
		
		Book b=new Book("java",200,ff,600);
		
	
		javaBook.getAuthor().setCountry("US");
		
		

		Book cplus=new Book("C Plus",500,sk,1000);
		
		String s=cplus.getAuthor().getCountry();
		System.out.println(s);

		sk.setBook("Deadmanwalking");
		
	
		
		ArrayList<Book> kick=new ArrayList<Book>();

		ArrayList<Book> book=new ArrayList<Book>();
		Book a=new Book("title1",100,sk,200);
		book.add(a);
		Book  a2=new Book("title2",200,ns,300);
		book.add(a2);
		Book  a3=new Book("title3",300,ns,200);
		Book  a4=new Book("title4",500,ns,700);
		book.add(a3);
		book.add(a4);
		Book[0]=new Book("1",100,sk,200);
		Book[1]=new Book("2",200,kk,200);
		Book[2]=new Book("3",300,sk,500);
		
		
		/*
		for ( Book i : Book) {
			kick.add(i);
		}
		*/
		for(int k=0;k<3;k++){
			book.add(Book[k]);
		}
		
			
		Iterator<Book> iterator = book.iterator(); // (3) Get an iterator.
		while (iterator.hasNext()) { 
		Book value = iterator.next(); 
		
		//iterator.remove(); 
		System.out.println("object"+iterator.hashCode());
		value.print(); 
		}
		
		
		Collection<Author> author = new ArrayList<Author>();
		Author aa=new Author("chelsea campbell","canada","sci-fi");
		Author bb=new Author("Brandon sanderson","Australia","sci-fi");
		author.add(aa);
		author.add(bb);
		Book  a5=new Book("title5",700,aa,300);
		Book  a6=new Book("title6",200,bb,600);
		book.add(a5);
		book.add(a6);
		Iterator<Author> serial = author.iterator(); // (3) Get an iterator.
		while (serial.hasNext()) { 
		Author val = serial.next(); 
		System.out.println("object"+serial.hashCode());
		val.print(); 
		}
		
		LinkedList<Author> lineage= new LinkedList<Author>(); 
		Author cc=new Author("kevin hardman","canada","kid");
		Author dd=new Author("simon green","Australia","humour");
		lineage.add(cc);
		lineage.add(dd);
		Book a7=new Book("title 7",50,cc,40);
		book.add(a7);
		Book a8=new Book("title 8",500,dd,400);
		book.add(a8);
		
		
		
		
		for ( Book i : Book) {
			kick.add(i);
			i.print();
		}
	
		
	
		
		
	
			
	}

}


