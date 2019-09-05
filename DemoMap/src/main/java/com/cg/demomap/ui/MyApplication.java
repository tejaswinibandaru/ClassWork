package com.cg.demomap.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.cg.demomap.dto.Employee;
import com.cg.demomap.service.EmployeeService;
import com.cg.demomap.service.EmployeeServiceImpl;

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
	}
	public static void main(String[] args) {
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
				Employee<Integer, Double> emp=new Employee<Integer, Double>(id, name, salary);
				System.out.println(es.addEmployee(emp));
				System.out.println("-----------------------------------------------------------------------");
				break;
			case 2:
				Map<Integer,Employee<Integer,Double>> hm=es.showEmployees();
				hm.forEach((k,v)->{System.out.println(v.getEmpId()+" "+v.getEmpName()+" "+v.getEmpSalary());});
				System.out.println("-----------------------------------------------------------------------");
				break;
			case 3:
				break;
			case 4:
				hm=es.showEmployees();
				List<Map.Entry<Integer, Employee<Integer,Double>>> ls=new ArrayList<Map.Entry<Integer,Employee<Integer,Double>>>(hm.entrySet());
				Collections.sort(ls, new SalaryComparator());
				System.out.println(ls);
				Map<Integer,Employee<Integer,Double>> map=new LinkedHashMap<Integer, Employee<Integer,Double>>();
				for(Map.Entry<Integer, Employee<Integer,Double>> e1:ls) {
					map.put(e1.getKey(), e1.getValue());
				}
				for(Employee<Integer,Double> v:map.values()) {
					System.out.println(v.getEmpId()+" "+v.getEmpName()+" "+v.getEmpSalary());
				}
				break;
			default:
				scanner.close();
				break;
			}
		}
	}
}
