package TestSuite;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo2Test {

	@Test
	public void test() {
		Demo2 demo=new Demo2();
		
		assertTrue(demo.palindromeCheck("madam"));
		assertTrue(demo.palindromeCheck("mom"));
		assertTrue(demo.palindromeCheck("dad"));
	}

}
