package com.learn.stream;

public class Employee {

	private int empId;
	private String empName;
	private String empDesg;
	private int empSal;

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

	public String getEmpDesg() {
		return empDesg;
	}

	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public Employee(int empId, String empName, String empDesg, int empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesg = empDesg;
		this.empSal = empSal;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDesg=" + empDesg + ", empSal=" + empSal
				+ "]";
	}

}
