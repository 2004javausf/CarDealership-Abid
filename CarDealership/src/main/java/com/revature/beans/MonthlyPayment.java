package com.revature.beans;

public class MonthlyPayment {
	
	private int monthlyPaymentID;
	private long interestRate;
	private int numberOfMonth;
	private  long monthlyFee;
	private int carPaymentID;
	private String monthlyPaymentDate;
	
	public MonthlyPayment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MonthlyPayment(int monthlyPaymentID, long interestRate, int numberOfMonth, long monthlyFee, int carPaymentID,
			String monthlyPaymentDate) {
		super();
		this.monthlyPaymentID = monthlyPaymentID;
		this.interestRate = interestRate;
		this.numberOfMonth = numberOfMonth;
		this.monthlyFee = monthlyFee;
		this.carPaymentID = carPaymentID;
		this.monthlyPaymentDate = monthlyPaymentDate;
	}

	public int getMonthlyPaymentID() {
		return monthlyPaymentID;
	}

	public void setMonthlyPaymentID(int monthlyPaymentID) {
		this.monthlyPaymentID = monthlyPaymentID;
	}

	public long getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(long interestRate) {
		this.interestRate = interestRate;
	}

	public int getNumberOfMonth() {
		return numberOfMonth;
	}

	public void setNumberOfMonth(int numberOfMonth) {
		this.numberOfMonth = numberOfMonth;
	}

	public long getMonthlyFee() {
		return monthlyFee;
	}

	public void setMonthlyFee(long monthlyFee) {
		this.monthlyFee = monthlyFee;
	}

	public int getCarPaymentID() {
		return carPaymentID;
	}

	public void setCarPaymentID(int carPaymentID) {
		this.carPaymentID = carPaymentID;
	}

	public String getMonthlyPaymentDate() {
		return monthlyPaymentDate;
	}

	public void setMonthlyPaymentDate(String monthlyPaymentDate) {
		this.monthlyPaymentDate = monthlyPaymentDate;
	}

	@Override
	public String toString() {
		return "MonthlyPayment [monthlyPaymentID=" + monthlyPaymentID + ", interestRate=" + interestRate
				+ ", numberOfMonth=" + numberOfMonth + ", monthlyFee=" + monthlyFee + ", carPaymentID=" + carPaymentID
				+ ", monthlyPaymentDate=" + monthlyPaymentDate + "]";
	}
	
	
	
	
	

}
