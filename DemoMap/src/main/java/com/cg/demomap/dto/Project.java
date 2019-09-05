package com.cg.demomap.dto;

import java.util.List;

public class Project {
	
	Integer projId;
	String projName;
	Double projCost;
	List<Employee<Integer, Double>> empList;
	
	public Project() {
		
	}

	public Project(Integer projId, String projName, Double projCost, List<Employee<Integer, Double>> empList) {
		super();
		this.projId = projId;
		this.projName = projName;
		this.projCost = projCost;
		this.empList = empList;
	}

	public Integer getProjId() {
		return projId;
	}

	public void setProjId(Integer projId) {
		this.projId = projId;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public Double getProjCost() {
		return projCost;
	}

	public void setProjCost(Double projCost) {
		this.projCost = projCost;
	}

	public List<Employee<Integer, Double>> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee<Integer, Double>> empList) {
		this.empList = empList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empList == null) ? 0 : empList.hashCode());
		result = prime * result + ((projCost == null) ? 0 : projCost.hashCode());
		result = prime * result + ((projId == null) ? 0 : projId.hashCode());
		result = prime * result + ((projName == null) ? 0 : projName.hashCode());
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
		Project other = (Project) obj;
		if (empList == null) {
			if (other.empList != null)
				return false;
		} else if (!empList.equals(other.empList))
			return false;
		if (projCost == null) {
			if (other.projCost != null)
				return false;
		} else if (!projCost.equals(other.projCost))
			return false;
		if (projId == null) {
			if (other.projId != null)
				return false;
		} else if (!projId.equals(other.projId))
			return false;
		if (projName == null) {
			if (other.projName != null)
				return false;
		} else if (!projName.equals(other.projName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Project [projId=" + projId + ", projName=" + projName + ", projCost=" + projCost + ", empList="
				+ empList + "]";
	}
	
	

}
