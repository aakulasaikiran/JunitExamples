package com.nt.suit;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.nt.testcase.TestCaseAdd;
import com.nt.testcase.TestCaseProduct;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestCaseAdd.class,
	TestCaseProduct.class
})
public class TestSuit {

	
	
}
