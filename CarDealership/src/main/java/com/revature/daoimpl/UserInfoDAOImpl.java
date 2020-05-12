package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.revature.beans.UserInfo;
import com.revature.dao.UserInfoDAO;
import com.revature.util.ConnFactory;

public class UserInfoDAOImpl implements UserInfoDAO{
	public static ConnFactory cf = ConnFactory.getInstance();

	@Override
	public void insertUserInfo(String email, String userName, String passWord, String userType)
			throws SQLException {
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		String sql = "INSERT INTO USER_INFO (EMAIL, USER_NAME, PASS_WORD, USER_TYPE ) VALUES ('"+email+"', '"+userName+"', '"+passWord+"',  '"+userType+"')";
		stmt.executeUpdate(sql);	
	}

	@Override
	public List<UserInfo> getUserInfoList() throws SQLException {
		List<UserInfo> userInfoList = new ArrayList<UserInfo>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM USER_INFO");
		UserInfo userInfo = null;
		while(rs.next()) {
			userInfo = new UserInfo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5) );
			userInfoList.add(userInfo);
		}
		
		return userInfoList;
	}
	
	public static boolean checklogin(String userName, String passWord, String userType) {
		UserInfoDAOImpl userInfo = new UserInfoDAOImpl();
		boolean userNameSucess = false;
		try {
			List<UserInfo> user = userInfo.getUserInfoList();
			for(int i = 0; i < user.size(); i++) {
				if((userName.equals(user.get(i).getUserName())) && (passWord.equals(user.get(i).getPassWord())) && userType.equals(user.get(i).getUserType())) {
				userNameSucess = true;
				}
			}
			if(userNameSucess == true) {
				System.out.println("You have successfully Logged in");
				return true;
			}
				System.out.println("Sorry Username and password does not match!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		return false;
	}
	
	public static boolean checkUniqueUser(String userName) {
		UserInfoDAOImpl userInfo = new UserInfoDAOImpl();
		boolean userNameSucess = true;
		try {
			List<UserInfo> user = userInfo.getUserInfoList();
			for(int i = 0; i < user.size(); i++) {
				if(userName.equalsIgnoreCase(user.get(i).getUserName())) {
				userNameSucess = false;
				System.out.println("Username already exits");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		return userNameSucess;
	}
	
	public static boolean checkUniqueEmail(String userEmail) {
		UserInfoDAOImpl userInfo = new UserInfoDAOImpl();
		boolean userEmailSuccess = true;
		try {
			List<UserInfo> user = userInfo.getUserInfoList();
			for(int i = 0; i < user.size(); i++) {
				if(userEmail.equalsIgnoreCase(user.get(i).getEmail())) {
					userEmailSuccess = false;
				System.out.println("This email is already registered. Please enter a different email.");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		return userEmailSuccess;
		
	}
	public static boolean validateEmail(String email) { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) {
        	System.out.println("There is no email");
            return false; 
        }
        else if (pat.matcher(email).matches() == false) {
        	System.out.println("This is not a valid email adress. Try again.");
        }
        return pat.matcher(email).matches(); 
    } 
	public static boolean validatePhone(String l) {
		Pattern pattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
		Pattern anotherPattern = Pattern.compile("\\d{10}"); 
		Matcher matcher = pattern.matcher(l);
		Matcher anotherMatcher = anotherPattern.matcher(l);
		if(matcher.matches() || anotherMatcher.matches()) {
			return true;	
		}
		else {
			System.out.println("Invalid Entry");
			return false;
		}
		
	}
	

	
	
	
	
	
	
	

	}


