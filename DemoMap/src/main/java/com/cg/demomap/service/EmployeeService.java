package com.cg.demomap.service;

import java.util.Map;

import com.cg.demomap.dto.Employee;

public interface EmployeeService<T,K> {
	public Employee<T, K> addEmployee(Employee<T, K> e);
	public Map<T,Employee<T,K>> showEmployees();
}
