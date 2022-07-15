package com.unisys.day02JavaConfig;

public class Book {
	
	private String title;
	private String author;
	
	public Book() {
		
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
	public void init() {
		System.out.println("=======> Book init method");
	}
	
	public void destroy() {
		System.out.println("=======> Book destroy method");
	}
	
}
