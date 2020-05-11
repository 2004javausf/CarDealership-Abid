package com.revature.beans;

public class UserInfo {
	
	private int userInfoID;
	private String email;
	private String userName;
	private String passWord;
	private String userType;
	
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserInfo(int userInfoID, String email, String userName, String passWord, String userType) {
		super();
		this.userInfoID = userInfoID;
		this.email = email;
		this.userName = userName;
		this.passWord = passWord;
		this.userType = userType;
	}

	public int getUserInfoID() {
		return userInfoID;
	}

	public void setUserInfoID(int userInfoID) {
		this.userInfoID = userInfoID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "UserInfo [userInfoID=" + userInfoID + ", email=" + email + ", userName=" + userName + ", passWord="
				+ passWord + ", userType=" + userType + "]";
	}
	
	
	
	
	

}
