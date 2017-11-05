package jp.annkara.xUnit;

import java.text.MessageFormat;

public class TestResult {

	static String pattern = "{0} run, {1} failed";
	
	int runCount;
	int errorCount;
	
	TestResult() {
		this.runCount = 0;
		this.errorCount = 0;
	}
	
	public void testStarted(){
		this.runCount += 1;
	}
	
	public void testFailed() {
		this.errorCount += 1;
	}
	
	public String summary() {
		return MessageFormat.format(pattern, this.runCount, this.errorCount);
	}
}
