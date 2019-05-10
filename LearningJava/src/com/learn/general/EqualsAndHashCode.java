package com.learn.general;

import java.util.HashMap;
import java.util.Map;

public class EqualsAndHashCode {

	public static void main(String[] args) {
		
		Employee  emp1 = new Employee(1, "Ashish");
		Employee  emp2 = new Employee(1, "Ashish");
		
		Map<Employee, String> empMap = new HashMap<>();
		empMap.put(emp1, "Employee1");
		empMap.put(emp2, "Employee1");
		
		System.out.println("empMap size is : "+empMap.size());
	}
}
	
class Employee {

	private int empId;
	private String empName;

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
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
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}
	
	
	
}
