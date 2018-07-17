package com.nt.testrunner;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.nt.suit.TestSuit;
import com.nt.testcase.TestCaseAdd;

public class TestRunnerExample {

	public static void main(String[] args) {
		Result result=JUnitCore.runClasses(TestSuit.class);
System.out.println("Result:"+result.wasSuccessful());

for(Failure failure:result.getFailures()) {
	System.out.println(failure.toString());
}

	}

}
