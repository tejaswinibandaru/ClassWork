package com.cg.demomap.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.demomap.dto.Employee;
import com.cg.demomap.dto.Project;

public class ProjectDaoImpl implements ProjectDao{
	
	List<Project> projList=new ArrayList<Project>();

	@Override
	public Project addProject(Project proj) {
		// TODO Auto-generated method stub
		
		projList.add(proj);
		return proj;
	}

	@Override
	public List<Project> showProjects() {
		// TODO Auto-generated method stub
		return projList;
	}

	@Override
	public List<Project> searchProjects(Integer empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> searchEmployees(Integer projId) {
		// TODO Auto-generated method stub
		return null;
	}
}
