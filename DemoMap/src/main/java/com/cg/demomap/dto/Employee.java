package com.cg.demomap.dto;

import java.util.List;

public class Employee <T,K>{
	T empId;
	String empName;
	K empSalary;
	Department empDept;
	List<Project> empProjects;
	
	public Employee() {
		
	}
	
	
	
	public Employee(T empId, String empName, K empSalary, Department empDept, List<Project> empProjects) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDept = empDept;
		this.empProjects = empProjects;
	}



	public Department getEmpDept() {
		return empDept;
	}

	public void setEmpDept(Department empDept) {
		this.empDept = empDept;
	}

	public List<Project> getEmpProjects() {
		return empProjects;
	}

	public void setEmpProjects(List<Project> empProjects) {
		this.empProjects = empProjects;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empDept == null) ? 0 : empDept.hashCode());
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((empProjects == null) ? 0 : empProjects.hashCode());
		result = prime * result + ((empSalary == null) ? 0 : empSalary.hashCode());
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
		if (empDept == null) {
			if (other.empDept != null)
				return false;
		} else if (!empDept.equals(other.empDept))
			return false;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empProjects == null) {
			if (other.empProjects != null)
				return false;
		} else if (!empProjects.equals(other.empProjects))
			return false;
		if (empSalary == null) {
			if (other.empSalary != null)
				return false;
		} else if (!empSalary.equals(other.empSalary))
			return false;
		return true;
	}

	public T getEmpId() {
		return empId;
	}

	public void setEmpId(T empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public K getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(K empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDept=" + empDept
				+ ", empProjects=" + empProjects + "]";
	}

	

	
	
}
