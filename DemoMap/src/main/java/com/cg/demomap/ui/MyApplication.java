package com.cg.demomap.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.cg.demomap.dto.Department;
import com.cg.demomap.dto.Employee;
import com.cg.demomap.exception.EmployeeException;
import com.cg.demomap.service.EmployeeService;
import com.cg.demomap.service.EmployeeServiceImpl;


class NameComparator implements Comparator<Map.Entry<Integer, Employee<Integer,Double>>>{

	@Override
	public int compare(Entry<Integer, Employee<Integer, Double>> o1, Entry<Integer, Employee<Integer, Double>> o2) {
		// TODO Auto-generated method stub
		return o1.getValue().getEmpName().compareTo(o2.getValue().getEmpName());
	}

	
}

class SalaryComparator implements Comparator<Map.Entry<Integer, Employee<Integer,Double>>>{

	@Override
	public int compare(Entry<Integer, Employee<Integer, Double>> o1, Entry<Integer, Employee<Integer, Double>> o2) {
		// TODO Auto-generated method stub
		if(o1.getValue().getEmpSalary()>o2.getValue().getEmpSalary()) {
			return 1;
		}
		else if(o1.getValue().getEmpSalary()<o2.getValue().getEmpSalary()) {
			return -1;
		}
		return 0;
	}
	
}
public class MyApplication {
	public static void printMenu() {
		System.out.println("1.Add employee");
		System.out.println("2.Show employees");
		System.out.println("3.Sort Employees By Name");
		System.out.println("4.Sort Employees By Salary");
		System.out.println("5.Add employees to project list");
		System.out.println("6.Add project to employee");
	}
	public static void main(String[] args){
		EmployeeService<Integer, Double> es=new EmployeeServiceImpl<Integer, Double>();
		Scanner scanner=new Scanner(System.in);
		while(true) {
			printMenu();
			System.out.println("Enter your choice: ");
			int choice=scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the employee id:");
				int id=scanner.nextInt();
				
				System.out.println("Enter the employee name:");
				String name=scanner.next();
				
				System.out.println("Enter the employee salary: ");
				double salary=scanner.nextDouble();
				
				try {
					EmployeeServiceImpl.validateSalary(salary);
				}catch(Exception e){
					System.out.println(e.getMessage());
				}
				
				System.out.println("Enter the employee department id:");
				int deptId=scanner.nextInt();
				
				System.out.println("Enter the employee department name:");
				String deptName=scanner.next();
				
				Department dept=new Department(deptId,deptName);
				
				Employee<Integer, Double> emp=new Employee<Integer, Double>(id, name, salary,dept,null);
				System.out.println(es.addEmployee(emp));
				System.out.println("-----------------------------------------------------------------------");
				break;
			case 2:
				Map<Integer,Employee<Integer,Double>> hm=es.showEmployees();
				hm.forEach((k,v)->{System.out.println(v.getEmpId()+" "+v.getEmpName()+" "+v.getEmpSalary());});
				System.out.println("-----------------------------------------------------------------------");
				break;
			case 3:
				hm=es.showEmployees();
				List<Map.Entry<Integer, Employee<Integer,Double>>> lis=new LinkedList<Map.Entry<Integer,Employee<Integer,Double>>>(hm.entrySet());
				Collections.sort(lis, new NameComparator());
				System.out.println(lis);
				break;
				
			case 4:
				hm=es.showEmployees();
				List<Map.Entry<Integer, Employee<Integer,Double>>> ls=new LinkedList<Map.Entry<Integer,Employee<Integer,Double>>>(hm.entrySet());
				Collections.sort(ls, new SalaryComparator());
				System.out.println(ls);
				break;
			default:
				scanner.close();
				break;
			}
		}
	}

}
