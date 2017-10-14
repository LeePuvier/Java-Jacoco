package com.wecash.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.wecash.test.HelloWord;

public class HelloWordTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	HelloWord test = new HelloWord();
	String[] bag1 = { "Books", "Notebooks", "Pens" };
	String[] bag2 = { "Books", "Notebooks", "Pens", "Pencils" };
	
	@Test
	public void testName() {
		System.out.println("Inside testName()");
	}
	
	@Test
	public void testPrepareMyBag() {
		assertArrayEquals(bag1, test.prepareMyBag());
	}
}
