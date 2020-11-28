package com.lab.data;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "library_user")
public class LibraryUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userID;
	
	@Column(name = "username")
	private String userName;
	
	@Column(name = "userpassport", unique = true)
	private long userPassport;
	
	@Column(name = "userbdate")
	private Date userDate;
	
	@Column(name = "useraddress")
	private String userAddress;
	
	@Transient
	private int count;

	public int getUserID() {
		return userID;
	}

	public String getUserName() {
		return userName;
	}

	public long getUserPassport() {
		return userPassport;
	}

	public Date getUserDate() {
		return userDate;
	}

	public String getUserAddress() {
		return userAddress;
	}
	
	public int getCount() {
		return count;
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

	public void setUserDate(Date userBDate) {
		this.userDate = userBDate;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
	public void setCount(int count) {
		this.count = count;
	}

}
