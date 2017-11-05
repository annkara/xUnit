package jp.annkara.xUnit;

public class xUnit {

	public static void main(String[] args) {
		
		xUnit xunit = new xUnit();
		TestSuite suite = new TestSuite();
		suite.add(xunit.new TestCaseTest("testTemplateMethod"));
		suite.add(xunit.new TestCaseTest("testResult"));
		suite.add(xunit.new TestCaseTest("testFailedResult"));
		suite.add(xunit.new TestCaseTest("testFailedResultFormatting"));
		suite.add(xunit.new TestCaseTest("testSuite"));
		TestResult result = new TestResult();
		suite.run(result);
		println(result.summary());
	}
	
	class TestCaseTest extends TestCase{
		
		WasRun test;
		TestResult result;
		
		public TestCaseTest(String name) {
			super(name);
		}
		
		public void setUp() {
			this.result = new TestResult();
		}
		
		public void testTemplateMethod() {
			this.test = new WasRun("testMethod");
			this.test.run(result);
			assert("setUp testMethod tearDown".equals(test.log));
		}
		
		public void testResult() {
			this.test = new WasRun("testMethod");
			this.test.run(result);
			assert("1 run, 0 failed".equals(result.summary()));
		}
		
		public void testFailedResult() {
			this.test = new WasRun("testBrokenMethod");
			this.test.run(result);;
			assert("1 run, 1 failed".equals(result.summary()));
		}
		
		public void testFailedResultFormatting() {
			result.testStarted();
			result.testFailed();
			assert("1 run, 1 failed".equals(result.summary()));
		}
		
		public void testSuite() {
			TestSuite suite = new TestSuite();
			suite.add(new WasRun("testMethod"));
			suite.add(new WasRun("testBrokenMethod"));
			suite.run(result);
			assert("2 run, 1 failed".equals(result.summary()));
		}
	}
	
	private static void println(Object param) {
		System.out.println(param);
	}
}
