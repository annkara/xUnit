package jp.annkara.xUnit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {
	
	String name;
	
	public TestCase(String name) {
		this.name = name;
	}
	
	public void setUp(){
	}
	
	public void tearDown(){
	}
	
	public void run() {
		try {
			this.setUp();
			Method method = this.getClass().getMethod(this.name);
			method.invoke(this);
			this.tearDown();
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

}
