package com.nt.testcase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.nt.example.SumGenerator;

public class TestCaseAdd {
    @Test
	public void testAdd() {
		int excepted=5;
		assertEquals(excepted,SumGenerator.calculateSumGenerator(2, 3));
		//assertEquals(excepted,SumGenerator.calculateSumGenerator(3, 3));
		
	}
	
	
}
