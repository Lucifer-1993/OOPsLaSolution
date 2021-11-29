package com.greatlearning.bean;

public class Employee {
	
//Creating The variable in bean class
	private String firstName;
	
	private String lastName;
	
	private String departmentName;
	
	private String companyName;
	
	
	//Generating Setter and Getter Using super class.
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Generating Setter and Getter Using parameterize constructor

	
//Generating Setter and Getter
	public String getFirstName() {
		return firstName;
	}

	public Employee(String firstName, String lastName, String departmentName, String companyName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.departmentName = departmentName;
		this.companyName = companyName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
}
