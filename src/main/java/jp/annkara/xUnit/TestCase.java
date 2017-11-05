package jp.annkara.xUnit;

import java.lang.reflect.Method;

public class TestCase {
	
	String name;
	
	public TestCase(String name) {
		this.name = name;
	}
	
	public void setUp(){}
	
	public void tearDown(){}
	
	public void run(TestResult result) {
		try {
			result.testStarted();
			this.setUp();
			Method method = this.getClass().getMethod(this.name);
			method.invoke(this);
		} catch (Exception e) {
			result.testFailed();
		}
		this.tearDown();
	}
}
