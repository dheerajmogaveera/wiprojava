
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestDemo2
{
	
	@BeforeClass
	public static void BeforeTestClass()
	{
		System.out.println("Loading Test Class");
	}
	@Before
	public void BeforeTest() {
		System.out.println("Executing Tests");
	}
	
	@Test
	public void demo1Test()
	{
		assertEquals("is palindrome:",true,Demo2.palindromeCheck("madam"));
		assertEquals(true, Demo2.palindromeCheck("mom"));
		assertFalse( Demo2.palindromeCheck("palindrome"));
		assertFalse(Demo2.palindromeCheck("Check"));
		assertTrue(Demo2.palindromeCheck("MALAYALAM"));
		
	      System.out.print("Test Executed");
	}
	
}