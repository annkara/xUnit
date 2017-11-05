package jp.annkara.xUnit;

public class xUnit {

	public static void main(String[] args) {
		
		xUnit xunit = new xUnit();
		println(xunit.new TestCaseTest("testTemplateMethod").run().summary());
		println(xunit.new TestCaseTest("testResult").run().summary());
		println(xunit.new TestCaseTest("testFailedResult").run().summary());
		println(xunit.new TestCaseTest("testFailedResultFormatting").run().summary());
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
		
		public void testFailedResultFormatting() {
			TestResult result = new TestResult();
			result.testStarted();
			result.testFailed();
			assert("1 run, 1 failed".equals(result.summary()));
		}
	}
	
	private static void println(Object param) {
		System.out.println(param);
	}
}
