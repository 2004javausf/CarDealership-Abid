package com.revature.beans;

public class Customer {
	
	private String firstName; 
	private String lastName;
	private CharSequence phoneNumber;
	private String email;
	private String userName;
	private String passWord;
	private int creditScore;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String firstName, String lastName, CharSequence phoneNumber, String email, String userName,
			String passWord, int creditScore) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.userName = userName;
		this.passWord = passWord;
		this.creditScore = creditScore;
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

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + ", userName=" + userName + ", passWord=" + passWord + ", creditScore="
				+ creditScore + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
