package com.lab.data;

import javax.persistence.*;

@Entity
@Table(name = "bookedition")
public class BookEdition {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int beID;
	
	@Column(unique = true)
	private String ISBN;
	
	@ManyToOne(targetEntity = Book.class)
	@JoinColumn(name = "bookid")
	private Book book;
	
	@ManyToOne(targetEntity = PublishingHouse.class)
	@JoinColumn(name = "phid")
	private PublishingHouse publishingHouse;
	
	@Column(name = "beyear")
	private int beYear;

	public int getBeID() {
		return beID;
	}

	public String getISBN() {
		return ISBN;
	}

	public Book getBook() {
		return book;
	}

	public PublishingHouse getPublishingHouse() {
		return publishingHouse;
	}

	public int getBeYear() {
		return beYear;
	}

	public void setBeID(int beID) {
		this.beID = beID;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public void setPublishingHouse(PublishingHouse publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public void setBeYear(int beYear) {
		this.beYear = beYear;
	}
}
