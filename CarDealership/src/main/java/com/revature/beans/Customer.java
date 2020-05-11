package com.revature.beans;

public class Customer {
	
	private int customerId;
	private String firstName; 
	private String lastName;
	private String phoneNumber;
	private String creditScore;
	private int userInfoID;
	private int carOfferedID;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String firstName, String lastName, String phoneNumber, String creditScore,
			int userInfoID, int carOfferedID) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.creditScore = creditScore;
		this.userInfoID = userInfoID;
		this.carOfferedID = carOfferedID;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(String creditScore) {
		this.creditScore = creditScore;
	}

	public int getUserInfoID() {
		return userInfoID;
	}

	public void setUserInfoID(int userInfoID) {
		this.userInfoID = userInfoID;
	}

	public int getCarOfferedID() {
		return carOfferedID;
	}

	public void setCarOfferedID(int carOfferedID) {
		this.carOfferedID = carOfferedID;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNumber=" + phoneNumber + ", creditScore=" + creditScore + ", userInfoID=" + userInfoID
				+ ", carOfferedID=" + carOfferedID + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
