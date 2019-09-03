package com.cg.assignments.dto;

import java.util.Arrays;

public class Assignment3_2 {
	
	public String[] sortStringUppercase(String[] arr,int n) {
		String[] ar=new String[n];
		Arrays.sort(arr);
		int len=arr.length;
		
		if(len%2==0) {
			
			int i=0;
			
			for(i=0;i<len/2;i++) {
				ar[i]=arr[i].toUpperCase();
			}
			
			for(int j=i;j<n;j++) {
				ar[j]=arr[j];
			}
			
		}
		else {
			
			int i=0;
			
			for(i=0;i<len/2+1;i++) {
				ar[i]=arr[i].toUpperCase();
			}
			
			for(int j=i;j<len;j++) {
				ar[j]=arr[j];
			}
			
		}
		
		
		return ar;
	}
}
