package com.learn.general;

import java.util.Arrays;

public class ArrayEquality {

	public static void main(String[] args) {

		int[] ar1 = { 2, 4, 5, 9, 0 };
		int[] ar2 = { 2, 4, 5, 9, 0 };

		boolean arrEqual = Arrays.equals(ar1, ar2);
		System.out.println(arrEqual);

		
		Cust custArr1[] = {new Cust(1,"Ashish"),new Cust(2, "Nidhi")};
		Cust custArr2[] = {new Cust(1,"Ashish"),new Cust(2, "Nidhi")};

		boolean arrEqual2 = Arrays.deepEquals(custArr1, custArr2);
		System.out.println(arrEqual2);
		
		char[][] abcd = {{'A', 'B'}, {'C', 'D'}};  
		char[][] ABCD = {{'A', 'B'}, {'C', 'D'}};
		
		boolean arrEqual3 = Arrays.deepEquals(abcd, ABCD);
		System.out.println(arrEqual3);

	}

}

class Cust {
	private int cust_id;
	private String cust_name;

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public Cust(int cust_id, String cust_name) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cust_id;
		result = prime * result + ((cust_name == null) ? 0 : cust_name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cust other = (Cust) obj;
		if (cust_id != other.cust_id)
			return false;
		if (cust_name == null) {
			if (other.cust_name != null)
				return false;
		} else if (!cust_name.equals(other.cust_name))
			return false;
		return true;
	}

	
	
}
