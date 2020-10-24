package com.lab.data;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookID;
	
	@Column(name = "bookname")
	private String bookName;
	
	@Column(name = "bookgenre")
	private String bookGenre;
	
	public int getBookID() {
		return bookID;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public String getBookGenre() {
		return bookGenre;
	}
	
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}
}
