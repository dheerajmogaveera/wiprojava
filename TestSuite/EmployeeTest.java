
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class EmployeeTest
{
	Employee e=new Employee();
	
	ArrayList<String> emp=new ArrayList<String>();
	{
	emp.add("Akanksha");
	emp.add("Nikhil");
	emp.add("Vidhit");
	emp.add("Karan");
	emp.add("Anjali");
	emp.add("Rishabh");
	}
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
		assertEquals("FOUND",Employee.findName(emp,"Nikhil"));
	      System.out.print("Test Executed");
	}
	
}