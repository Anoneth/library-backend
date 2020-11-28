package com.lab.data;

import javax.persistence.*;

@Entity
@Table(name = "copy_of_the_book")
public class CopyOfTheBook {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int inventoryNumber;
	
	@Column(name = "isbn")
	private String isbn;
	
	@Column(name = "departCode")
	private int departCode;
	
	@Column(name = "userid", nullable = true)
	private Integer userID;
	
	@Transient
	private int count;

	public int getInventoryNumber() {
		return inventoryNumber;
	}

	public String getISBN() {
		return isbn;
	}

	public int getDepartCode() {
		return departCode;
	}

	public Integer getUserID() {
		return userID;
	}
	
	public int count() {
		return count;
	}

	public void setInventoryNumber(int inventoryNumber) {
		this.inventoryNumber = inventoryNumber;
	}

	public void setISBN(String isbn) {
		this.isbn = isbn;
	}

	public void setDepartCode(int departCode) {
		this.departCode = departCode;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
}
