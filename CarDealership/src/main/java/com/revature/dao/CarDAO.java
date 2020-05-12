package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Car;

public interface CarDAO {
	//Read all
	public List<Car> getCarList() throws SQLException;
	
	
	


}
