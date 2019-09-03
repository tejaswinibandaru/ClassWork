package com.cg.assignments.dto;

import java.util.Arrays;

public class Assignment3 {
	public int getSecondSmallest(int[] arr) {
		
		Arrays.sort(arr);
		return arr[1];
	}
}
