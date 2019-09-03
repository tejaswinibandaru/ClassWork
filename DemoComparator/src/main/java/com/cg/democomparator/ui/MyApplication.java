package com.cg.democomparator.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.cg.democomparator.dto.Employee;

class SalaryComparator implements Comparator<Employee<Integer, Double>> {

	public int compare(Employee<Integer, Double> o1, Employee<Integer, Double> o2) {
		// TODO Auto-generated method stub
		if (o1.getEmpSalary() > o2.getEmpSalary()) {
			return 1;
		} else if (o1.getEmpSalary() < o2.getEmpSalary()) {
			return -1;
		}
		return 0;
	}

}

class NameComparator implements Comparator<Employee<Integer, Double>> {

	public int compare(Employee<Integer, Double> o1, Employee<Integer, Double> o2) {
		// TODO Auto-generated method stub
		return o1.getEmpName().compareTo(o2.getEmpName());
	}

}

class IdComparator implements Comparator<Employee<Integer, Double>>{

	public int compare(Employee<Integer, Double> o1, Employee<Integer, Double> o2) {
		// TODO Auto-generated method stub
		if(o1.getEmpId()>o2.getEmpId()) {
			return 1;
		}
		else if(o1.getEmpId()<o2.getEmpId()) {
			return -1;
		}
		return 0;
	}
	
}
public class MyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee<Integer, Double>> empList = new ArrayList<Employee<Integer, Double>>();
		Employee<Integer, Double> e1 = new Employee<Integer, Double>(1002, "abc", 25000.0);
		empList.add(e1);
		Employee<Integer, Double> e2 = new Employee<Integer, Double>(1005, "bcd", 80000.0);
		empList.add(e2);
		Employee<Integer, Double> e3 = new Employee<Integer, Double>(1000, "bce", 5000.0);
		empList.add(e3);

		Collections.sort(empList, new SalaryComparator());

		for (Employee<Integer, Double> e : empList) {
			System.out.println(e.getEmpId());
			System.out.println(e.getEmpName());
			System.out.println(e.getEmpSalary());
		}

		System.out.println("--------------------------------------------------------");

		Collections.sort(empList, new NameComparator());

		for (Employee<Integer, Double> e : empList) {
			System.out.println(e.getEmpId());
			System.out.println(e.getEmpName());
			System.out.println(e.getEmpSalary());
		}
		
		System.out.println("--------------------------------------------------------");
		
		Collections.sort(empList, new IdComparator());

		for (Employee<Integer, Double> e : empList) {
			System.out.println(e.getEmpId());
			System.out.println(e.getEmpName());
			System.out.println(e.getEmpSalary());
		}


	}

}
