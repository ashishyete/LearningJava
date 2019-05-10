package com.learn.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompartorComparable {

	public static void main(String[] args) {

		List<User> userList = new ArrayList<User>();
		userList.add(new User(5, "Ashish","ML"));
		userList.add(new User(4, "Ayana","TL"));
		userList.add(new User(3, "Nidhi","PL"));
		userList.add(new User(2, "Deepak","DL"));
		
		List<User> userList1 = userList;
		
		Collections.sort(userList);
		for(User u : userList) {
			System.out.println(u.getUserName());
		}
		System.out.println("*****");
		Collections.sort(userList1,new DesignationCompartor());
		for(User u : userList1) {
			System.out.println(u.getUserName());
		}
	}
	
}

class User implements Comparable<User> {

	private int userId;
	private String userName;
	private String userDesg;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserDesg() {
		return userDesg;
	}

	public void setUserDesg(String userDesg) {
		this.userDesg = userDesg;
	}

	public User(int userId, String userName, String userDesg) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userDesg = userDesg;
	}

	@Override
	public int compareTo(User o) {
		return this.userId-o.userId;
	}

}

class DesignationCompartor implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		return o1.getUserDesg().compareTo(o2.getUserDesg());
	}
	
}
