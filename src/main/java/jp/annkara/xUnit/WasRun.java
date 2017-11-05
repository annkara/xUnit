package jp.annkara.xUnit;

public class WasRun extends TestCase{

	boolean wasRun;
	boolean wasSetUp;

	public WasRun(String name) {
		super(name);
	}
	
	public void setUp() {
		this.wasRun = false;
		this.wasSetUp = true;
	}

	public void testMethod() {
		this.wasRun = true;
	}
}
