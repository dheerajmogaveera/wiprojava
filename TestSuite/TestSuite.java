package TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   Demo1Test.class,
   Demo2Test.class,
   EmployeeTest.class
})
public class TestSuite {

}
