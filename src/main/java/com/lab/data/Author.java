package com.lab.data;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	
	public int getAuthorID() {
		return authorID;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public Date getAuthorBDate() {
		return authorBDate;
	}
	
	public void setAuthorID(int authorID) {
		this.authorID = authorID;
	}
	
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	public void setAuthorBDate(Date authorBDate) {
		this.authorBDate = authorBDate;
	}
}
