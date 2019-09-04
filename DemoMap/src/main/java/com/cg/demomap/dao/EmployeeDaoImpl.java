package com.cg.demomap.dao;


import java.util.HashMap;
import java.util.Map;

import com.cg.demomap.dto.Employee;

public class EmployeeDaoImpl<T,K> implements EmployeeDao<T, K>{
	
	Map<T,Employee<T, K>> hm=new HashMap<T, Employee<T,K>>();

	public Employee<T, K> addEmployee(Employee<T, K> e) {
		// TODO Auto-generated method stub
		hm.put(e.getEmpId(), e);
		return e;
	}

	public Map<T, Employee<T, K>> showEmployees() {
		// TODO Auto-generated method stub
		return hm;
	}

}
