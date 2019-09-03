package com.cg.democollection.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.cg.democollection.dto.Employee;
import com.cg.democollection.dto.Project;
import com.cg.democollection.dto.Shape;


public class MyApplication {
	
	public static void printDetails() {
		System.out.println("1.Add");
		System.out.println("2.Show");
		System.out.println("3.Exit");
	}
	
	public static void main(String[] args) {
		Employee<Integer, Double> e=new Employee<Integer, Double>();
		Employee<String, Double> e1=new Employee<String, Double>();
		e.setEmpId(1001);
		e1.setEmpId("E101");
		
		Project<String> p1=new Project<String>();
		Project<Integer> p2=new Project<Integer>();
		
		p1.set("P101");
		p2.set(1001);
		
		Set<String>hs=new HashSet<String>();
		
		hs.add("Hello");
		hs.add("Good");
		hs.add("Tejaswini");
		
		for(int i=0;i<hs.size();i++) {
			System.out.println(hs.toArray()[i]);
		}
		
		System.out.println("-------------------------------------------------------");
		Iterator<String> itr=hs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("--------------------------------------------------------");
		
		for(String s: hs) {
			System.out.println(s);
		}
		
		
		Set<Employee<Integer, Double>> empSet=new HashSet<Employee<Integer,Double>>();
		
		Employee<Integer, Double> empOne=new Employee<Integer, Double>(1001,"abcd",50000.00);
		Employee<Integer, Double> empTwo=new Employee<Integer, Double>(1001,"abcd",50000.00);
		
		empSet.add(empOne);
		empSet.add(empTwo);
		
		System.out.println(empSet);
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println(empOne.hashCode());
		System.out.println(empTwo.hashCode());
		
		System.out.println("--------------------------------------------------------");
		
		for (Employee<Integer, Double> employee : empSet) {
			System.out.println("Name:"+employee.getEmpName());
			System.out.println("ID:"+employee.getEmpId());
			System.out.println("Salary:"+employee.getSalary());
			System.out.println("--------------------------------------------------------");
		}
		
		
		Set<Integer> ts=new TreeSet<Integer>();
		
		ts.add(8);
		
		ts.add(6);
		ts.add(7);
		ts.add(5);
		
		System.out.println(ts);
		
		
		Set<Integer>s1=new HashSet<Integer>();
		Set<Integer>s2=new HashSet<Integer>();
		
		s1.add(1);
		s1.add(2);
		s1.add(3);
		
		s2.add(1);
		s2.add(2);
		s2.add(3);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1.equals(s2));
		
		System.out.println("--------------------------------------------------------");
		
		ArrayList<String> as=new ArrayList<String>(); 
		as.add("Hello");
		System.out.println(as.size());
		//System.out.println(as.ensureCapacity(minCapacity););
		
		List<Employee<Integer, Double>>empList=new ArrayList<Employee<Integer,Double>>();
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			printDetails();
			System.out.println("Enter your choice: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter your employee id: ");
				int id=sc.nextInt();
				System.out.println("Enter your name: ");
				String name=sc.next();
				System.out.println("Enter your salary :");
				double salary=sc.nextDouble();
				Employee<Integer, Double> emp=new Employee<Integer, Double>(id,name,salary);
				empList.add(emp);
				break;
			case 2:
				System.out.println("List of Employees :");
				Collections.sort(empList);
				for(Employee<Integer, Double>employee:empList) {
				System.out.println("ID: "+employee.getEmpId());
				System.out.println("Name : "+employee.getEmpName());
				System.out.println("Salary: "+employee.getSalary());
				System.out.println("--------------------------------------------------------");
				}
				break;
			default:
				System.exit(0);
				break;
					
			}
		}
		
	}

}
