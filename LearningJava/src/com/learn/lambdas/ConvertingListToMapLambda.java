package com.learn.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertingListToMapLambda {
	
	public static void main(String[] args) {
		
		List<User> listUser = new ArrayList<User>();
		listUser = Arrays.asList(
				new User(1,"Ashish", "ML", "1234"),new User(2,"Ayana", "Manager", "2323"),new User(3,"Nidhi", "TL", "5377"),new User(4,"Raashi", "Dir", "3570")
				);
		
	}

}

class User {

	int userId;
	String username;
	String userDesg;
	String userPhone;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserDesg() {
		return userDesg;
	}

	public void setUserDesg(String userDesg) {
		this.userDesg = userDesg;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public User(int userId, String username, String userDesg, String userPhone) {
		super();
		this.userId = userId;
		this.username = username;
		this.userDesg = userDesg;
		this.userPhone = userPhone;
	}

	

}
