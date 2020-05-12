package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.beans.Car;
import com.revature.beans.CarOffered;
import com.revature.dao.CarDAO;
import com.revature.util.ConnFactory;

public class CarDAOImpl implements CarDAO {
	public static ConnFactory cf = ConnFactory.getInstance();

	@Override
	public List<Car> getCarList() throws SQLException {
		List<Car> carList = new ArrayList<Car>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM CAR");
		Car car = null;
		while(rs.next()) {
			car = new Car(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getLong(7), rs.getLong(8), rs.getInt(9));
			carList.add(car);
		}
		System.out.println("***************************************************************************************************************************************");
		System.out.println("***************************************************Inventory List************************************************************************");
		for(int i=0; i < carList.size(); i++) {
			System.out.println(carList.get(i));
		}
		System.out.println("***************************************************************************************************************************************");
		System.out.println("***************************************************************************************************************************************");
		return carList;
	}
	
	
	
	
	
}
