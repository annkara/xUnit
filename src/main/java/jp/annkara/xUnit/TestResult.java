package jp.annkara.xUnit;

import java.text.MessageFormat;

public class TestResult {

	static String pattern = "{0} run, 0 failed";
	
	int runCount;
	
	TestResult() {
		this.runCount = 0;
	}
	
	public void testStarted(){
		this.runCount += 1;
	}
	
	public String summary() {
		return MessageFormat.format(pattern, this.runCount);
	}
}
