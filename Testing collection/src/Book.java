public class Book{
String title;
Author author;
int pages;
int price;
int serialnumber;



public Book(String title, int price, Author author, int pages) {
	// TODO Auto-generated constructor stub
	 
	this.setTitle(title);
	this.setPrice(price);
	this.setAuthor(author);
	this.setPages(pages);
	
	 	
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






public void print(){
	System.out.println("************");
	 System.out.println("The title is "+this.title);
	 System.out.println("The book has pages upto "+this.pages);
	 System.out.println("The book priced "+this.price);
	 this.author.print();
	 System.out.println("************");
}

}
