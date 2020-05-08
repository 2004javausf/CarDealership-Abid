package com.revature.beans;

public class Employee {
	
	private String firstName; 
	private String lastName;
	private String designation;
	private CharSequence phoneNumber;
	private String email;
	private String userName;
	private String passWord;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstName, String lastName, String designation, CharSequence phoneNumber, String email,
			String userName, String passWord) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.userName = userName;
		this.passWord = passWord;
	}

	public String getFirstName() {
		return firstName;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public CharSequence getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(CharSequence phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", designation=" + designation
				+ ", phoneNumber=" + phoneNumber + ", email=" + email + ", userName=" + userName + ", passWord="
				+ passWord + "]";
	}
	
	
	
	

}
