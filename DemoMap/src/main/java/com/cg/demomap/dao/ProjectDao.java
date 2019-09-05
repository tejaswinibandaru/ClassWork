package com.cg.demomap.dao;

import java.util.List;

import com.cg.demomap.dto.Employee;
import com.cg.demomap.dto.Project;

public interface ProjectDao {
	
	public Project addProject(Project proj);
	public List<Project> showProjects();
	public List<Project> searchProjects(Integer empId);
	public List<Employee> searchEmployees(Integer projId);

}
