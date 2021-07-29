package com.java8.page590;

public class Emp {
	private Double sal;
	private String dept;
	private String name;
	public Emp(Double sal, String dept, String name) {
		super();
		this.sal = sal;
		this.dept = dept;
		this.name = name;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [sal=" + sal + ", dept=" + dept + ", name=" + name + "]";
	}
	
	
}

//emp sal group by dept
