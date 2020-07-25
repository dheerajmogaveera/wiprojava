import java.sql.*;

public class Exercise1{

	public static void main(String[] args) {
		try {
			
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection myconnection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracledb","hr","hr");
		Statement st =myconnection.createStatement();
		ResultSet rs=st.executeQuery("SELECT employee_id,first_name FROM employees");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"  "+rs.getString("first_name"));
		}
		myconnection.close();
		}
		catch(Exception e)
		{   
			System.out.println("Connection could not be established due to:");
			System.out.println(e);
		}
		
	}

}
