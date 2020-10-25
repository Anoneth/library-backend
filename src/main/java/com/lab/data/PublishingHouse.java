package com.lab.data;

import javax.persistence.*;

@Entity
@Table(name = "publishinghouse")
public class PublishingHouse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int phID;
	
	@Column(name = "phname", unique = true)
	private String phName;
	
	@Column(name = "phaddress")
	private String phAddress;

	public int getPhID() {
		return phID;
	}

	public String getPhName() {
		return phName;
	}

	public String getPhAddress() {
		return phAddress;
	}

	public void setPhID(int phID) {
		this.phID = phID;
	}

	public void setPhName(String phName) {
		this.phName = phName;
	}

	public void setPhAddress(String phAddress) {
		this.phAddress = phAddress;
	}

}
