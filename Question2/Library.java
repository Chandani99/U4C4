package Question2;
import java.util.*;
public class Library {
	List<Book> bookList = new ArrayList<>();
	public void addBook(Book book) {
		
	}
	
	boolean isEmpty() {
		if(bookList.size()==0) {
			return true;
		}
		return false;
	}
}
