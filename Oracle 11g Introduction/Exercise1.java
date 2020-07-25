import java.sql.*;
public class Exercise1{

	public static void main(String[] args) {
		try {
			
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection myconnection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		Statement st =myconnection.createStatement();
		System.out.println("Connection Established successfully");
		}
		catch(Exception e)
		{
			System.out.println("Connection could not be Established ");
                        System.out.println(e);
                         
		}
	}

}
