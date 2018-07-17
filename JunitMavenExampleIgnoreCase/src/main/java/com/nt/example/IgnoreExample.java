package com.nt.example;

import org.junit.Ignore;
import org.junit.Test;

public class IgnoreExample {
	@Ignore
	@Test
	public void testcase1() {
		System.out.println("in side test case 1");
	}

	@Test
	public void testcase2() {
		System.out.println("in side test case 2");
	}

}
