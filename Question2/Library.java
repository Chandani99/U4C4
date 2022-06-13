package Question2;
import java.util.*;
public class Library {
	List<Book> bookList = new ArrayList<>();
	
	public void addBook(Book book) {
		
		bookList.add(book);
		System.out.println("Book added successfully");
	}
	
	boolean isEmpty() {
		if(bookList.size()==0) {
			return true;
		}
		return false;
	}
	
	List<Book> viewAllBooks(){
		return bookList;
		
	}
	
	List<Book> viewBooksByAuthor(String author ){
		List <Book> bookList1=  new ArrayList<>();
		
		for(int i=0; i<bookList.size(); i++) {
			Book b1=bookList.get(i);
			if(b1.getAuthor().equalsIgnoreCase(author)) {
				bookList1.add(b1);
			}
		}
		return bookList1;
	}
	
	int countNoOfBook(String bookName) {
		int count=0;
		for(int i=0; i<bookList.size(); i++) {
			Book b1=bookList.get(i);
			if(b1.getBookName().equalsIgnoreCase(bookName)) {
				count++;
			}
		}
		return count;
	}
}
