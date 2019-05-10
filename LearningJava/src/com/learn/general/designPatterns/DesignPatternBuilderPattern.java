package com.learn.general.designPatterns;

public class DesignPatternBuilderPattern {
	
	public static void main(String[] args) {
		DPEmployee emp = new DPEmployeeBuilder().setEmpId(1).setEmpDesg("ModuleLead").buildEmp();
		System.out.println(emp);
	}

}

class DPEmployee {
	private int empId;
	private String empName;
	private String empDesg;
	private String empCity;

	public DPEmployee(int empId, String empName, String empDesg, String empCity) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesg = empDesg;
		this.empCity = empCity;
	}

	@Override
	public String toString() {
		return "DPEmployee [empId=" + empId + ", empName=" + empName + ", empDesg=" + empDesg + ", empCity=" + empCity
				+ "]";
	}
}

class DPEmployeeBuilder {

	private int empId;
	private String empName;
	private String empDesg;
	private String empCity;

	public DPEmployeeBuilder setEmpId(int empId) {
		this.empId = empId;
		return this;
	}

	public DPEmployeeBuilder setEmpName(String empName) {
		this.empName = empName;
		return this;
	}

	public DPEmployeeBuilder setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
		return this;
	}

	public DPEmployeeBuilder setEmpCity(String empCity) {
		this.empCity = empCity;
		return this;
	}

	public DPEmployee buildEmp() {
		return new DPEmployee(empId, empName, empDesg, empCity);
	}
	
}
