package jp.annkara.xUnit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WasRun {

	boolean wasRun;
	String name;

	public WasRun(String name) {
		this.wasRun = false;
		this.name = name;
	}
	
	public void run() {
		try {
			Method method = this.getClass().getMethod(this.name);
			method.invoke(this);
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void testMethod() {
		this.wasRun = true;
	}
}
