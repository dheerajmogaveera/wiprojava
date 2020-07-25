package TestSuite;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo1Test {

	@Test
	public void test() {
		Demo1 demo = new Demo1();
		String result = demo.stringConcat("Hello","World");
		assertEquals("HelloWorld",result);
	}

}