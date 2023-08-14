package Bookstore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BookstoreEntity {

	private String Books;
	private String newBooks;
	
	@Id
	@GeneratedValue
	public String getBooks() {
		return Books;
	}
	public void setBooks(String books) {
		Books = books;
	}
	public String getNewBooks() {
		return newBooks;
	}
	public void setNewBooks(String newBooks) {
		this.newBooks = newBooks;
	}
	@Override
	public String toString() {
		return "BookstoreEntity [Books=" + Books + ", newBooks=" + newBooks + "]";
	}
	public BookstoreEntity(String books, String newBooks) {
		super();
		Books = books;
		this.newBooks = newBooks;
	}
	
	
}
