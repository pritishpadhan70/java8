package com.java8.pikun;


@FunctionalInterface
interface Myinter{
	public int mod1(int a, int b);
	
}


public class Test1 {
	public static void main(String[] args) {
		
		Myinter m1 = (a, b)->a+b;
		System.out.println("Result is :"+m1.mod1(7, 8));
		
	}
}
