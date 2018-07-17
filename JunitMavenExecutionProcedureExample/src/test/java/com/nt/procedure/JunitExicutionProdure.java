package com.nt.procedure;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitExicutionProdure {
	// beforeclass
	@BeforeClass
	public static void beforeClass() {
		System.out.println("in before class");
	}

	// after class
	@AfterClass
	public static void afterClass() {
		System.out.println("in After class");
	}

	// before
	@Before
	public void before() {
		System.out.println("in before");
	}

	// after
	@After
	public void after() {
		System.out.println("in after");
	}

	// testcase1
	@Test
	public void testcase1() {
		System.out.println("in test case 1 ");
		
	}
	
	
	public void middle() {
		System.out.println("");
	}
	// testcase 2
	@Test
	public void testcase2() {
		System.out.println("in testcase 2");
	}

}
