package lab5;

import java.math.BigDecimal;

public class Book implements Comparable<Book> {
	private String name;
	private String author;
	private int pages;
	private String binding;
	private int price;
	
	public Book() { }
	public Book(String name, String author, int pages, String binding, int price) {
		this.name = name;
		this.author = author;
		this.pages = pages;
		this.binding = binding;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return (name + " " + author + " " + 
				pages + " " + binding + " " + price);
	}

	@Override
	public int compareTo(Book arg0) {
		return (name.compareTo(arg0.getName()));
	}
}
