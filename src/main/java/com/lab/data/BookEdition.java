package com.lab.data;

import javax.persistence.*;

@Entity
@Table(name = "book_edition")
public class BookEdition {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int beID;
	
	@Column(unique = true)
	private String ISBN;
	
	@Column(name = "bookid")
	private int bookID;
	
	@Column(name = "phID")
	private int phID;
	
	@Column(name = "beyear")
	private int beYear;
	
	@Transient
	private int count;

	public int getBeID() {
		return beID;
	}

	public String getISBN() {
		return ISBN;
	}

	public int getBookID() {
		return bookID;
	}

	public int getPhID() {
		return phID;
	}

	public int getBeYear() {
		return beYear;
	}
	
	public int getCount() {
		return count;
	}

	public void setBeID(int beID) {
		this.beID = beID;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public void setBookId(int bookID) {
		this.bookID = bookID;
	}

	public void setPhID(int phID) {
		this.phID = phID;
	}

	public void setBeYear(int beYear) {
		this.beYear = beYear;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
}
