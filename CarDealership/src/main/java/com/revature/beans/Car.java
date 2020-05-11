package com.revature.beans;

public class Car {
	
	private int carID;
	private String carMake;
	private String carModel;
	private int carYear;
	private String carColor;
	private String carStatus;
	private long carMileage;
	private long carPrice;
	private int carOfferedID;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int carID, String carMake, String carModel, int carYear, String carColor, String carStatus,
			long carMileage, long carPrice, int carOfferedID) {
		super();
		this.carID = carID;
		this.carMake = carMake;
		this.carModel = carModel;
		this.carYear = carYear;
		this.carColor = carColor;
		this.carStatus = carStatus;
		this.carMileage = carMileage;
		this.carPrice = carPrice;
		this.carOfferedID = carOfferedID;
	}

	public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getCarYear() {
		return carYear;
	}

	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getCarStatus() {
		return carStatus;
	}

	public void setCarStatus(String carStatus) {
		this.carStatus = carStatus;
	}

	public long getCarMileage() {
		return carMileage;
	}

	public void setCarMileage(long carMileage) {
		this.carMileage = carMileage;
	}

	public long getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(long carPrice) {
		this.carPrice = carPrice;
	}

	public int getCarOfferedID() {
		return carOfferedID;
	}

	public void setCarOfferedID(int carOfferedID) {
		this.carOfferedID = carOfferedID;
	}

	@Override
	public String toString() {
		return "carID=" + carID + ", carMake=" + carMake + ", carModel=" + carModel + ", carYear=" + carYear
				+ ", carColor=" + carColor + ", carStatus=" + carStatus + ", carMileage=" + carMileage + ", carPrice="
				+ carPrice + "";
	}
	
	
	
	
	

}
