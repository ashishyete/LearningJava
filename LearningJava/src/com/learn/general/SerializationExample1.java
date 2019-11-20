package com.learn.general;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerialUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1007661944638492440L;

	private int userId;
	private String userName;
	private String userDesg;
	private String userLocation;

	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserDesg() {
		return userDesg;
	}

	public String getUserLocation() {
		return userLocation;
	}

	@Override
	public String toString() {
		return "SerialUser [userId=" + userId + ", userName=" + userName + ", userDesg=" + userDesg + ", userLocation="
				+ userLocation + "]";
	}

	public SerialUser(int userId, String userName, String userDesg, String userLocation) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userDesg = userDesg;
		this.userLocation = userLocation;
	}

}

public class SerializationExample1 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		SerialUser user = new SerialUser(1, "Ashish", "Team Lead", "Bangalore");
		new SerializationExample1().writeIntoFile(user);
		new SerializationExample1().readFromFile();

	}

	public void writeIntoFile(SerialUser user) throws FileNotFoundException, IOException {

		ObjectOutputStream ooS = new ObjectOutputStream(new FileOutputStream("user.ser"));
		ooS.writeObject(user);
		ooS.close();
	}

	public void readFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream oiS  = new ObjectInputStream(new FileInputStream("user.ser"));
		SerialUser user = (SerialUser)oiS.readObject();
		user.toString();
		oiS.close();
		
	}

}
