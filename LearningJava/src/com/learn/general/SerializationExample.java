package com.learn.general;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int personId;
	transient String personName;
	transient int age;
	
	public Person(int personId, String personName, int age) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", age=" + age + "]";
	}
	
	
}

public class SerializationExample {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Person person = new Person(1,"Ashish", 34);
		new SerializationExample().writeToFile(person);
		new SerializationExample().readFromFile();
		
	}
	
	public void writeToFile(Person person) throws FileNotFoundException, IOException {
		ObjectOutputStream ooS = new ObjectOutputStream(new FileOutputStream("Person.bin"));
		ooS.writeObject(person);
		ooS.close();
	}
	
	public void readFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream oiS = new ObjectInputStream(new FileInputStream("Person.bin"));
		Person person = (Person) oiS.readObject();
		System.out.println(person.toString());
		
	}

}
