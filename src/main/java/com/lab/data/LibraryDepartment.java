package com.lab.data;

import javax.persistence.*;

@Entity
@Table(name = "library_department")
public class LibraryDepartment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departCode;
	
	@Column(name = "departname", unique = true)
	private String departName;
	
	@Transient
	private int count;

	public int getDepartCode() {
		return departCode;
	}

	public String getDepartName() {
		return departName;
	}
	
	public int getCount() {
		return count;
	}

	public void setDepartCode(int departCode) {
		this.departCode = departCode;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}
	
	public void setCount(int count) {
		this.count = count;
	}

}
