package com.learn.general;

public class HashCodeEqualsExample {

	public static void main(String[] args) {
		
		EmployeeHashCodeExampleSubClass emp1 = new EmployeeHashCodeExampleSubClass();
		emp1.setEmpId(1);
		emp1.setEmpName("Ashish");
		emp1.setEmpDesg("ML");
		System.out.println("Emp1 : "+emp1.toString() + " Emp1 HashCode :"+emp1.hashCode());
		EmployeeHashCodeExampleSubClass emp2 = new EmployeeHashCodeExampleSubClass();
		emp2.setEmpId(1);
		emp2.setEmpName("Ashish");
		emp2.setEmpDesg("ML");
		System.out.println("Emp2 : "+emp2.toString() + " Emp2 HashCode :"+emp2.hashCode());
		
		if(emp1.equals(emp2))
			System.out.println("Equal Objects");
		else
			System.out.println("UNEqual Objects");
	}

}

class EmployeeHashCodeExampleSubClass {
	private int empId;
	private String empName;
	private String empDesg;

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

	@Override
	public String toString() {
		return "EmployeeHashCodeExampleSubClass [empId=" + empId + ", empName=" + empName + ", empDesg=" + empDesg
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empDesg == null) ? 0 : empDesg.hashCode());
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
		EmployeeHashCodeExampleSubClass other = (EmployeeHashCodeExampleSubClass) obj;
		if (empDesg == null) {
			if (other.empDesg != null)
				return false;
		} else if (!empDesg.equals(other.empDesg))
			return false;
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
