package com.cg.demomap.dao;

import java.util.Map;

import com.cg.demomap.dto.Employee;

public interface EmployeeDao <T,K>{
	
	public Employee<T, K> addEmployee(Employee<T, K> e);
	public Map<T,Employee<T,K>> showEmployees();	
}
