package com.revature.beans;

public class CarPayment {
	
	private int carPaymentID;
	private long downPayment;
	private long loanAmount;
	private int carOfferedID;
	private String carSoldDate;
	
	public CarPayment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarPayment(int carPaymentID, long downPayment, long loanAmount, int carOfferedID, String carSoldDate) {
		super();
		this.carPaymentID = carPaymentID;
		this.downPayment = downPayment;
		this.loanAmount = loanAmount;
		this.carOfferedID = carOfferedID;
		this.carSoldDate = carSoldDate;
	}

	public int getCarPaymentID() {
		return carPaymentID;
	}

	public void setCarPaymentID(int carPaymentID) {
		this.carPaymentID = carPaymentID;
	}

	public long getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(long downPayment) {
		this.downPayment = downPayment;
	}

	public long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getCarOfferedID() {
		return carOfferedID;
	}

	public void setCarOfferedID(int carOfferedID) {
		this.carOfferedID = carOfferedID;
	}

	public String getCarSoldDate() {
		return carSoldDate;
	}

	public void setCarSoldDate(String carSoldDate) {
		this.carSoldDate = carSoldDate;
	}

	@Override
	public String toString() {
		return "CarPayment [carPaymentID=" + carPaymentID + ", downPayment=" + downPayment + ", loanAmount="
				+ loanAmount + ", carOfferedID=" + carOfferedID + ", carSoldDate=" + carSoldDate + "]";
	}
	
	
	
	

}
