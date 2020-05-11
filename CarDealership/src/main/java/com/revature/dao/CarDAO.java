package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Car;

public interface CarDAO {
	
	//Create insertCar Method
	public void insertCar(int carID, String carMake, String carModel, int carYear, String carColor, String carStatus,
			long carMileage, long carPrice, int carOfferedID) throws SQLException;
	
	//Read all
	public List<Car> getCarList() throws SQLException;
	
	
	


}
