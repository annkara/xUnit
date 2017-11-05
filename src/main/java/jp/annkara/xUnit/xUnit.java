package jp.annkara.xUnit;

public class xUnit {

	public static void main(String[] args) {
		
		xUnit xunit = new xUnit();
		xunit.new TestCaseTest("testTemplateMethod").run();
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
	}
}
