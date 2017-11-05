package jp.annkara.xUnit;

public class xUnit {

	public static void main(String[] args) {
		
		new xUnit().new TestCaseTest("testRunning").run();
	}
	
	class TestCaseTest extends TestCase{
		
		public TestCaseTest(String name) {
			super(name);
		}

		public void testRunning() {
			WasRun test = new WasRun("testMethod");
			assert(!test.wasRun);
			test.run();
			assert(test.wasRun);
		}
	}
}
