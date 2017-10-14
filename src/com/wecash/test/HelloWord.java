package com.wecash.test;

import java.util.Arrays;

public class HelloWord {

	public static String test = "test";
	
//	public static void main(String[] args) {
//		System.out.println("Hello World");
//		name();
//	}
	
	public static void name() {
		if (test.equals("wecash")) {
			System.out.println("My Company is Wecash");
		}else {
			System.out.println("My Company is test");
		}
	}
	

	public String[] prepareMyBag() {
		String[] schoolbag = { "Books", "Notebooks", "Pens" };
		System.out.println("My school bag contains: "
				+ Arrays.toString(schoolbag));
		return schoolbag;
	}

	public String[] addPencils() {
		String[] schoolbag = { "Books", "Notebooks", "Pens", "Pencils" };
		System.out.println("Now my school bag contains: "
				+ Arrays.toString(schoolbag));
		return schoolbag;
	}
	

}
