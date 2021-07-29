package com.learnJava.defaults;

public interface Interface4 {
	
	default void methodA() {
		System.out.println("methodA "+Interface4.class);
	}
}
