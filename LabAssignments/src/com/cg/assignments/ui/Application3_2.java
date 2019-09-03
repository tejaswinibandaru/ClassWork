package com.cg.assignments.ui;

import java.util.Scanner;

import com.cg.assignments.dto.Assignment3_2;

public class Application3_2 {
	
	public static void main(String[] args) {
		Assignment3_2 as=new Assignment3_2();
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=new String[n];
		for(int i=0;i<n;i++) {
			s[i]=sc.next();
		}
		String s1[]=as.sortStringUppercase(s, n);
		for(String str:s1) {
			System.out.println(str);
		}
		
		sc.close();
	}
}
