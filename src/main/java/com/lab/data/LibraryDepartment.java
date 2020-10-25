package com.lab.data;

import javax.persistence.*;

@Entity
@Table(name = "librarydepartment")
public class LibraryDepartment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departCode;
	
	@Column(name = "departname", unique = true)
	private String departName;

	public int getDepartCode() {
		return departCode;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartCode(int departCode) {
		this.departCode = departCode;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

}
