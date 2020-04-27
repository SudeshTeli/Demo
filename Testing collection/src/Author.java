
public class Author{
	String Authorname;
	String Country;
	String Genre;
	String book;
	
	

	
public Author(String authorname, String country, String genre){
	
		this.setAuthorname(authorname);
		this.setCountry(country);
		this.setGenre(genre);
		
	}
	
	public String getAuthorname() {
		return Authorname;
	}
	public void setAuthorname(String authorname) {
		this.Authorname = authorname;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		this.Country = country;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		this.Genre = genre;
	}

	public void setBook(String book) {
		this.book=book;
	}
	
	public String getBook() {
		return book;
	}
	
	 
	 
	 public void print(){
		 System.out.println("The author is "+this.Authorname);
		 System.out.println("The author country is "+this.Country);
		 System.out.println("The author preferred genre "+this.Genre);
		// System.out.println("The author has written "+this.book);
		 
	 }
	
	
		
	}
	

