package com.revature.beans;

public class CarOffered {
	private int carOfferedID;
	private long offeredPrice;
	private String offerStatus;
	private String carStatus;
	
	public CarOffered() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarOffered(int carOfferedID, long offeredPrice, String offerStatus, String carStatus) {
		super();
		this.carOfferedID = carOfferedID;
		this.offeredPrice = offeredPrice;
		this.offerStatus = offerStatus;
		this.carStatus = carStatus;
	}

	public int getCarOfferedID() {
		return carOfferedID;
	}

	public void setCarOfferedID(int carOfferedID) {
		this.carOfferedID = carOfferedID;
	}

	public long getOfferedPrice() {
		return offeredPrice;
	}

	public void setOfferedPrice(long offeredPrice) {
		this.offeredPrice = offeredPrice;
	}

	public String getOfferStatus() {
		return offerStatus;
	}

	public void setOfferStatus(String offerStatus) {
		this.offerStatus = offerStatus;
	}

	public String getCarStatus() {
		return carStatus;
	}

	public void setCarStatus(String carStatus) {
		this.carStatus = carStatus;
	}

	@Override
	public String toString() {
		return "CarOffered [carOfferedID=" + carOfferedID + ", offeredPrice=" + offeredPrice + ", offerStatus="
				+ offerStatus + ", carStatus=" + carStatus + "]";
	}
	
	
	
	
	
	
	
	

}
