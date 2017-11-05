package jp.annkara.xUnit;

public class xUnit {

	public static void main(String[] args) {
		
		xUnit xunit = new xUnit();
		xunit.new TestCaseTest("testRunning").run();
		xunit.new TestCaseTest("testSetUp").run();
	}
	
	class TestCaseTest extends TestCase{
		
		WasRun test;
		
		public TestCaseTest(String name) {
			super(name);
		}
		
		public void setUp() {
			this.test = new WasRun("testMethod");
		}

		public void testRunning() {
			this.test.run();
			assert(test.wasRun);
		}
		
		public void testSetUp() {
			this.test.run();
			assert(test.wasSetUp);
		}
	}
}
