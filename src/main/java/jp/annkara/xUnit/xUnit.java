package jp.annkara.xUnit;

public class xUnit {

	public static void main(String[] args) {
		
		WasRun test = new WasRun("testMethod");
		System.out.println(test.wasRun);
		test.run();
		System.out.println(test.wasRun);
		
	}
}
