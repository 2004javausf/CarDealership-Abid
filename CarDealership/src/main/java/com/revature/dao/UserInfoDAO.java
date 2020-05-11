package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.UserInfo;

public interface UserInfoDAO {
	
	public void insertUserInfo(String email, String userName, String passWord, String userType) throws  SQLException;
	
	public List<UserInfo> getUserInfoList() throws SQLException;
	
	

}
