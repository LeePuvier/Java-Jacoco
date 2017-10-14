package com.wecash.test;

public class Jacoco {

	public static String test = "test";
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		name();
	}
	
	public static void name() {
		if (test.equals("wecash")) {
			System.out.println("My Company is Wecash");
		}else {
			System.out.println("My Company is test");
		}
	}

}
