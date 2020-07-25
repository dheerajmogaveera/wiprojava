
import java.sql.*;

public class Connect {
       
	Connection newConnection;
	Connection getConnection()
	{
	  try {
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    newConnection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		}
		catch(Exception e)
		{   
			System.out.println("Connection could not be established due to:");
			System.out.println(e);
		}
	    return newConnection;
	}
}
