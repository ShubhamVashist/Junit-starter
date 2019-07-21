package com.demo.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

class MyMathTest {
	MyMath myMath = new MyMath();
	
	//MyMath.sum
	// 1,2,3 -> 6
	@Test
	public void sum_with3number() {
		System.out.println("Test 1");
//		fail("Not yet implemented");
		//Absence of failure is Success
		//MyMath myMath = new MyMath();
		//int result = myMath.sum(new int[]{1,2,3});
		// check that result is 6
		//assertEquals(6,result);
		assertEquals(6,myMath.sum(new int[] {6}));
	}
	
	@Test
	public void sum_with1numbers() {
		System.out.println("Test 2");
//		fail("Not yet implemented");
		//Absence of failure is Success
		//int result = myMath.sum(new int[] {3});
		// check that result is 6
		assertEquals(3,myMath.sum(new int[] {3}));
	}
	

		@Before
		public void before() {
			System.out.println("Before");
		}

		@After
		public void after() {
			System.out.println("After");
		}

		@BeforeClass
		public static void beforeClass() {
			System.out.println("Before Class");
		}

		@AfterClass
		public static void afterClass() {
			System.out.println("After Class");
		}

		// MyMath.sum
		// 1,2,3 => 6
		@Test
		public void sum_with3numbers() {
			System.out.println("Test1");
			assertEquals(6, myMath.sum(new int[] { 1, 2, 3 }));
		}

		@Test
		public void sum_with1number() {
			System.out.println("Test2");
			assertEquals(3, myMath.sum(new int[] { 3 }));
		}

}
