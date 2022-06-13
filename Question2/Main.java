package Question2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Library lib=new Library();
		System.out.println("1.Add Book\r\n"
				+ "2.Display all book details\r\n"
				+ "3.Search Book by author\r\n"
				+ "4.Count number of books - by book name\r\n"
				+ "5.Exit\r\n"
				+"=========================="
				+ "Enter your choice:");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter the isbn no:");
			int isbn=sc.nextInt();
			System.out.println("Enter the book name:");
			String bookName=sc.next();
			System.out.println("Enter the author name:");
			String author=sc.next();
			Book bk=new Book(isbn,bookName,author);
			
			lib.addBook(bk);
	        break;
	        
		case 2:
			System.out.println("Details of aal books are --:");
			List <Book> bks=new ArrayList<>(lib.viewAllBooks());
			for(int j=0; j<bks.size(); j++) {
				Book bk1=bks.get(j);
				System.out.println(bk1);
			}
	        break;
	        
		case 3:
			System.out.println("Enter the author name:");
			
			String author1=sc.next();
			
			List <Book> bs=new ArrayList<>(lib.viewBooksByAuthor(author1));
			for(int j=0; j<bs.size(); j++) {
				Book bk1=bs.get(j);
				System.out.println("isbn no: " +bk1.getIsbn());
				System.out.println("Book name: " +bk1.getBookName());
				System.out.println("Author name: " +bk1.getAuthor());
			}
	        break;
	        
		case 4:
			
			System.out.println("Enter the book name:");
			String bookName1=sc.next();
			int num=lib.countNoOfBook(bookName1);
			System.out.println("Number of books is : " +num);
	        break;
	        
		case 5:
			System.out.println("Thank you !!");
			
	        break;
		default:
			System.out.println("Invalid choice");
			
	        break;
			
			
		}

	}

}
