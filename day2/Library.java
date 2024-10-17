package week1.day2;

public class Library {
	
	public String addBook(String bookTitle) {
System.out.println("Book Name : " + bookTitle + " is added successfully");
return bookTitle;
	}
public void issueBook() {
	System.out.println("Book is issued Successfully");

}
	public static void main(String[] args) {
Library lib = new Library();	
lib.addBook("Rich Dad Poor Dad"); 
lib.issueBook();


	}

}