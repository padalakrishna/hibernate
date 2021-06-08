package com.hibernate.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee  implements Serializable {
	
	public Employee(Integer employeeNumber, String firstName, String lastName, String extension, String email, 
			String jobTitle) {
		this.employeeNumber = employeeNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.extension = extension;
		this.email = email;
		this.jobTitle = jobTitle;
	}
	
	public Employee() {
		
	}
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employeeNumber", unique = true, nullable = false)
	private Integer employeeNumber;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "extension")
	private String extension;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "jobTitle")
	private String jobTitle;
	
	@Column(name = "officeCode")	
	private String officeCode = "1";
	

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	
	public String toString() {
		return "Employee is  { employeeNumber:"+employeeNumber+" lastName:"+lastName+" firstName:"+firstName+" email:"+email;
	}
	
	
}
