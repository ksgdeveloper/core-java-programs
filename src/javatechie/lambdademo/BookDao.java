package javatechie.lambdademo;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
	public List<Book> getBooks(){

		List<Book> books = new ArrayList<>();
		books.add(new Book(1,"Core Java", "450"));
		books.add(new Book(2,"Java 8 Cookbook", "400"));
		books.add(new Book(3,"Hibernate Cookbook", "500"));
		books.add(new Book(4,"SpringBoot", "600"));
		return books;
	}
}
