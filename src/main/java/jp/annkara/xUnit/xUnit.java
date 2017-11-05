package jp.annkara.xUnit;

public class xUnit {

	public static void main(String[] args) {
		
		xUnit xunit = new xUnit();
		xunit.new TestCaseTest("testTemplateMethod").run();
		xunit.new TestCaseTest("testResult").run();
		//xunit.new TestCaseTest("testFailedResult").run();
	}
	
	class TestCaseTest extends TestCase{
		
		WasRun test;
		
		public TestCaseTest(String name) {
			super(name);
		}
		
		public void testTemplateMethod() {
			this.test = new WasRun("testMethod");
			this.test.run();
			assert("setUp testMethod tearDown".equals(test.log));
		}
		
		public void testResult() {
			this.test = new WasRun("testMethod");
			TestResult result = this.test.run();
			assert("1 run, 0 failed".equals(result.summary()));
		}
		
		public void testFailedResult() {
			this.test = new WasRun("testBrokenMethod");
			TestResult result = this.test.run();
			assert("1 run, 1 failed".equals(result.summary()));
		}
	}
}
