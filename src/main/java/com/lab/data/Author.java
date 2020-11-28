package com.lab.data;

import java.math.BigInteger;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "author")
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int authorID;
	
	@Column(name = "authorname")
	private String authorName;
	
	@Column(name = "authorBDate")
	private Date authorBDate;
	
	@Transient
	private int bookCount;
	/*@ManyToMany(cascade = { CascadeType.ALL})
	@JoinTable(
			name = "author_book",
			joinColumns = { @JoinColumn(name = "authorID")},
			inverseJoinColumns = { @JoinColumn(referencedColumnName = "bookID")}
			)
	Set<Book> books;*/
	
	public int getAuthorID() {
		return authorID;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public Date getAuthorBDate() {
		return authorBDate;
	}
	
	public int getBookCount() {
		return bookCount;
	}
	
	//public Set<Book> getBooks() {
	//	return books;
	//}

	//public void setBooks(Set<Book> books) {
	//	this.books = books;
	//}

	public void setAuthorID(int authorID) {
		this.authorID = authorID;
	}
	
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	public void setAuthorBDate(Date authorBDate) {
		this.authorBDate = authorBDate;
	}
	
	public void setBookCount(BigInteger bookCount) {
		this.bookCount = bookCount.intValue();
	}
}

