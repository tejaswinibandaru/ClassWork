package com.cg.demomap.service;

import java.util.Map;

import com.cg.demomap.dao.EmployeeDao;
import com.cg.demomap.dao.EmployeeDaoImpl;
import com.cg.demomap.dto.Employee;
import com.cg.demomap.exception.EmployeeException;

public class EmployeeServiceImpl<T,K> implements EmployeeService<T, K>{
	
	EmployeeDao<T, K> ed=new EmployeeDaoImpl<T,K>();

	public Employee<T, K> addEmployee(Employee<T, K> e) {
		// TODO Auto-generated method stub
		return ed.addEmployee(e);
	}

	public Map<T, Employee<T, K>> showEmployees() {
		// TODO Auto-generated method stub
		return ed.showEmployees();
	}
	
	public static void validateSalary(double salary) throws EmployeeException {
		if(salary<10000) {
			throw new EmployeeException("Salary should be greater than 10000");
		}
	}

}
