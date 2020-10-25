package com.lab.data;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "libraryuser")
public class LibraryUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userID;
	
	@Column(name = "username")
	private String userName;
	
	@Column(name = "userpassport", unique = true)
	private long userPassport;
	
	@Column(name = "userbdate")
	private Date userBDate;
	
	@Column(name = "useraddress")
	private String userAddress;

	public int getUserID() {
		return userID;
	}

	public String getUserName() {
		return userName;
	}

	public long getUserPassport() {
		return userPassport;
	}

	public Date getUserBDate() {
		return userBDate;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserPassport(long userPassport) {
		this.userPassport = userPassport;
	}

	public void setUserBDate(Date userBDate) {
		this.userBDate = userBDate;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

}
