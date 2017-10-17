package com.wecash.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.wecash.test.HelloWord;

public class HelloWordTest {

	private ArrayList<String> testList;

	@BeforeClass
	public static void onceExecutedBeforeAll() {
		System.out.println("@BeforeClass: onceExecutedBeforeAll");
	}

	@Before
	public void executedBeforeEach() {
		testList = new ArrayList<String>();
		System.out.println("@Before: executedBeforeEach");
	}

	@AfterClass
	public static void onceExecutedAfterAll() {
		System.out.println("@AfterClass: onceExecutedAfterAll");
	}

	@After
	public void executedAfterEach() {
		testList.clear();
		System.out.println("@After: executedAfterEach");
	}

	@Test
	public void EmptyCollection() {
		assertTrue(testList.isEmpty());
		System.out.println("@Test: EmptyArrayList");

	}

	@Test
	public void OneItemCollection() {
		testList.add("oneItem");
		assertEquals(1, testList.size());
		System.out.println("@Test: OneItemArrayList");
	}

	@Ignore
	public void executionIgnored() {

		System.out.println("@Ignore: This execution is ignored");
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
	
	@Test
	public void testAssert() {
		String obj1 = "junit";
		String obj2 = "junit";
		String obj3 = "test";
		String obj4 = "test";
		String obj5 = null;
		int var1 = 1;
		int var2 = 2;
		int[] arithmetic1 = { 1, 2, 3 };
		int[] arithmetic2 = { 1, 2, 3 };

		assertEquals(obj1, obj2);

		assertSame(obj3, obj4);

		assertNotSame(obj2, obj4);

		assertNotNull(obj1);

		assertNull(obj5);

		assertTrue(var1 == var2);

		assertArrayEquals(arithmetic1, arithmetic2);
	}
}
