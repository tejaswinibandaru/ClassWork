package com.cg.democollection.dto;

public class Project <T>{
	T obj;
	
	public T get() {
		return obj;
	}
	
	public void set(T obj) {
		this.obj=obj;
	}
}
