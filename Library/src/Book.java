public class Book implements Cloneable  {
String title;
Author author;
int pages;
private int price;
int serialnumber;

static int number;

public Book(String title, int price, Author author, int pages) {
	// TODO Auto-generated constructor stub
	 this(0,false);
	this.setTitle(title);
	this.setPrice(price);
	this.setAuthor(author);
	this.setPages(pages);
	 ++number;
	 this.serialnumber=Book.number;
	
}

//public Book(Book newbook){
	//this.setBook(newbook);
//}

public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
public int getPages() {
	
	return pages;
}
public void setPages(int pages) {
	this.pages = pages;
}
public float getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}


/*public void setBook(Book newbook){
		this.author=newbook.author;
		this.pages=newbook.pages;
	this.price=newbook.price;
	this.title=newbook.title;
}

public Book(Book source){
	this.author=source.author;
	this.pages=source.pages;
	this.price=source.price;
	this.title=source.title;
	
}
*/

public static void writeCount(){ 
	   System.out.println("Number of books: " + number);    
}

//constructors

public Book(int something,Boolean ind ){
	
	this(22,22,"vv");
	System.out.println("Returning from the constructor 2");
	
}

public Book(int something,int onlything,String kk){
	System.out.println("returning from the 3rd constructor");
}

protected Object clone() throws CloneNotSupportedException
{
    return super.clone();
}


public void print(){
	System.out.println("************");
	 System.out.println("The title is "+this.title);
	 System.out.println("The book has pages upto "+this.pages);
	 System.out.println("The book priced "+this.price);
	 System.out.println("The serial number "+this.serialnumber);
	 this.author.print();
	 System.out.println("************");
}

}
