import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Demo1Test{
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
		assertEquals("Results Sucessful","JamesBond",Demo1.stringConcat("James","Bond"));
	    assertEquals("",Demo1.stringConcat("Jack", "Jill"));
	}
	
}