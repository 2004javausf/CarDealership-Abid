package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

public interface CarOfferedDAO {
	
	public void insertCarOffered(int carOfferedID, long offeredPrice, String offerStatus, String carStatus) throws SQLException;
	
	public List<CarOfferedDAO> getCarOfferedList() throws SQLException;

}
