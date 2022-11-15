package com.shree.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
	// using Lambda notation just 1 line
	public void getBookServiceSortLambdaById1() {
		List<Book> books = new  BookDAO().getBooks();
		//descending order
		//method 1
		System.out.println("Books in Ascending Order by Id");
		Collections.sort(books, (o1,o2) -> Integer.compare(o1.getId(), o2.getId()) );
		System.out.println(books);
	}
	
	public void getBookServiceSortLambdaById2() {
		List<Book> books = new  BookDAO().getBooks();
		//descending order
		//method 2
		System.out.println("Books in Descending Order by Id");
		Collections.sort(books, (o1,o2) -> Integer.valueOf(o2.getId()).
												compareTo(Integer.valueOf(o1.getId())) 
												);
		
		System.out.println(books);
	}

	public void getBookServiceSortLambdaNameAscending() {
		List<Book> books = new  BookDAO().getBooks();
		//ascending order Name
		//method 2
		System.out.println("Books in Ascending Order Book Name");
		Collections.sort(books, (o1,o2) -> o1.getName().compareTo(o2.getName())); 
		System.out.println(books);
	}
	
	// traditional approach
	public void getBookServiceComparator() {
		List<Book> books = new  BookDAO().getBooks();
		//ascending order
		System.out.println("Books in Descending Order Book Name - Traditional Approach");
		Collections.sort(books, new MyComparatorImpl() );
		System.out.println(books);
		
	}
	
	public static void main(String[] args) {
		new BookService().getBookServiceSortLambdaById1();
		new BookService().getBookServiceSortLambdaById2();
		new BookService().getBookServiceSortLambdaNameAscending();
		new BookService().getBookServiceComparator();
	}
}

class MyComparatorImpl implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	
}

 class BookDAO {

	public List<Book> getBooks() {
		List<Book> books = new ArrayList<>();
		books.add(new Book(101, "Core Java", 400));
		books.add(new Book(363, "Hibernate", 180));
		books.add(new Book(275, "Spring", 200));
		books.add(new Book(893, "WebService", 300));
		return books;
	}
}
 

 class Book {
	private int id;
	private String name;
	private int pages;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", pages=" + pages + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pages;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pages != other.pages)
			return false;
		return true;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String name, int pages) {
		super();
		this.id = id;
		this.name = name;
		this.pages = pages;
	}

}