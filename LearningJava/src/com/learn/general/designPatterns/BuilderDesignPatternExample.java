package com.learn.general.designPatterns;

public class BuilderDesignPatternExample {

	public static void main(String[] args) {
		Employee emp = new EmployeeBuilder().setEmpId(1).setEmpCity("Bangalore").setEmpName("Ashish").buildEmp();
		System.out.println(emp.toString());
	}
	
}

class Employee {

	private int empId;
	private String empName;
	private String empDesg;
	private String empCity;
	private String empCountry;

	public Employee(int empId, String empName, String empDesg, String empCity, String empCountry) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesg = empDesg;
		this.empCity = empCity;
		this.empCountry = empCountry;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDesg=" + empDesg + ", empCity=" + empCity
				+ ", empCountry=" + empCountry + "]";
	}

}

class EmployeeBuilder {

	private int empId;
	private String empName;
	private String empDesg;
	private String empCity;
	private String empCountry;

	public EmployeeBuilder setEmpId(int empId) {
		this.empId = empId;
		return this;
	}

	public EmployeeBuilder setEmpName(String empName) {
		this.empName = empName;
		return this;
	}

	public EmployeeBuilder setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
		return this;
	}

	public EmployeeBuilder setEmpCity(String empCity) {
		this.empCity = empCity;
		return this;
	}

	public EmployeeBuilder setEmpCountry(String empCountry) {
		this.empCountry = empCountry;
		return this;
	}
	
	public Employee buildEmp() {
		return new Employee(empId, empName, empDesg, empCity, empCountry);
	}
}