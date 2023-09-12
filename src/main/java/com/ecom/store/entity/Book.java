package com.ecom.store.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "book_id")
public class Book extends Product {

	private long isbn;
	private String title;
	private String genre;
	@Column(name="book_description")
	private String description;
	
	public Book() {
		
	}

	public Book(long id, String manufacturer, double price, long isbn, String title, String genre, String description) {
		super(id, manufacturer, price);
		this.isbn = isbn;
		this.title = title;
		this.genre = genre;
		this.description = description;
	}

	public long getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public String getDescription() {
		return description;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
