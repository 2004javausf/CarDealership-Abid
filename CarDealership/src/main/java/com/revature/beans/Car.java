package com.revature.beans;

public class Car {
	
	private String carMake;
	private String carModel;
	private int carYear;
	private String carColor;
	private String carStatus;
	private long carMileage;
	private long carPrice;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String carMake, String carModel, int carYear, String carColor, String carStatus, long carMileage,
			long carPrice) {
		super();
		this.carMake = carMake;
		this.carModel = carModel;
		this.carYear = carYear;
		this.carColor = carColor;
		this.carStatus = carStatus;
		this.carMileage = carMileage;
		this.carPrice = carPrice;
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

	@Override
	public String toString() {
		return "Car [carMake=" + carMake + ", carModel=" + carModel + ", carYear=" + carYear + ", carColor=" + carColor
				+ ", carStatus=" + carStatus + ", carMileage=" + carMileage + ", carPrice=" + carPrice + "]";
	}
	
	
	
	

}
