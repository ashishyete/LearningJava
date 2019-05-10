package com.learn.general.collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
	
	public static void main(String[] args) {
		
		Hashtable<String, Person> hTableObj = new Hashtable<>();
		hTableObj.put("CENTURYLINK", new Person(1, "Ashish","SSE", 33.0d));
		hTableObj.put("TCS", new Person(1, "Apoorv","Lead", 56.0d));
		hTableObj.put("COMCAST", new Person(1, "Amar","Manager", 89.0d));
		
		/*Iterator itr = hTableObj.keySet().iterator();
		String key = null;
		Person p = null;
		while(itr.hasNext()) {
			key = (String) itr.next();
			p= hTableObj.get(key);
			System.out.println("Key : "+key + " Value : "+p.toString());
		}*/
		
		for(Map.Entry<String, Person> entry : hTableObj.entrySet()) {
			System.out.println("Key : "+entry.getKey() + " Value :"+entry.getValue().toString());
		}
	}

}

class Person {

	private int personId;
	private String personName;
	private String personDesg;
	private double personSal;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonDesg() {
		return personDesg;
	}

	public void setPersonDesg(String personDesg) {
		this.personDesg = personDesg;
	}

	public double getPersonSal() {
		return personSal;
	}

	public void setPersonSal(double personSal) {
		this.personSal = personSal;
	}

	public Person(int personId, String personName, String personDesg, double personSal) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personDesg = personDesg;
		this.personSal = personSal;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personDesg=" + personDesg
				+ ", personSal=" + personSal + "]";
	}
	
	
	
}
