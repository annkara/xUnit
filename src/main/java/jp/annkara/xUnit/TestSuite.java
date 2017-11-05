package jp.annkara.xUnit;

import java.util.List;

import java.util.ArrayList;

public class TestSuite {

	List<TestCase> tests;
	
	TestSuite() {
		this.tests = new ArrayList<TestCase>();
	}
	
	public void add(TestCase test) {
		this.tests.add(test);
	}
	
	public void run(TestResult result){
		for(TestCase test : this.tests){
			test.run(result);
		}
	}
}
