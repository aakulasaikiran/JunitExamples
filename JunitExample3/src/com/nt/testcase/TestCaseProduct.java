package com.nt.testcase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.nt.example.ProducrGenerator;

public class TestCaseProduct {
	

	

	
	    @Test
		public void testAdd() {
			int excepted=6;
			assertEquals(excepted,ProducrGenerator.calculateproGenerator(2, 3));
			
			//assertEquals(excepted,SumGenerator.calculateSumGenerator(3, 3));
			
		}
		
		
	}

