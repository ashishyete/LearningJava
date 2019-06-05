package com.learn.intStreamExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamExample1 {
	
	public static void main(String[] args) {
	List<Employee> empList = Arrays.asList(
			new Employee(1,"Ashish", 124d),
			new Employee(2,"Harsh", 943d),
			new Employee(3,"Nidhi", 324d),
			new Employee(4,"Ayana", 1133d)
			);
		
	empList.stream().sorted(Comparator.comparingDouble(Employee::getEmpSal).reversed()).limit(3).map(Employee::getEmpName).forEach(System.out::println);
	}

}

class Employee{
	private int empId;
	private String empName;
	private double empSal;
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
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public Employee(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	
	
}
