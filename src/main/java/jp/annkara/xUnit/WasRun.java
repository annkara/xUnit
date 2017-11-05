package jp.annkara.xUnit;

public class WasRun extends TestCase{

	String log;

	public WasRun(String name) {
		super(name);
	}
	
	public void setUp() {
		this.log = "setUp ";
	}

	public void testMethod() {
		this.log += "testMethod ";
	}
	
	public void tearDown() {
		this.log += "tearDown";
	}
}
