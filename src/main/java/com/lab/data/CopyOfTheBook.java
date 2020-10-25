package com.lab.data;

import javax.persistence.*;

@Entity
@Table(name = "copyofthebook")
public class CopyOfTheBook {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int inventoryNumber;
	
	@ManyToOne(targetEntity = BookEdition.class)
	@JoinColumn(name = "isbn")
	private BookEdition bookEdition;
	
	@ManyToOne(targetEntity = LibraryDepartment.class)
	@JoinColumn(name = "departCode")
	private LibraryDepartment libraryDepartment;
	
	@ManyToOne(targetEntity = LibraryUser.class)
	@JoinColumn(name = "userid")
	private LibraryUser libraryUser;

	public int getInventoryNumber() {
		return inventoryNumber;
	}

	public BookEdition getBookEdition() {
		return bookEdition;
	}

	public LibraryDepartment getLibraryDepartment() {
		return libraryDepartment;
	}

	public LibraryUser getLibraryUser() {
		return libraryUser;
	}

	public void setInventoryNumber(int inventoryNumber) {
		this.inventoryNumber = inventoryNumber;
	}

	public void setBookEdition(BookEdition bookEdition) {
		this.bookEdition = bookEdition;
	}

	public void setLibraryDepartment(LibraryDepartment libraryDepartment) {
		this.libraryDepartment = libraryDepartment;
	}

	public void setLibraryUser(LibraryUser libraryUser) {
		this.libraryUser = libraryUser;
	}
}
