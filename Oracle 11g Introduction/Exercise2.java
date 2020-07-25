import java.sql.*;
public class Exercise2{

	public static void main(String[] args) {
		try {
			
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection myconnection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		Statement st =myconnection.createStatement();
		ResultSet rs=st.executeQuery("SELECT * FROM employees");
		System.out.println("EMPLOYEE_ID"+" "+"FIRST_NAME"+" "+"LAST_NAME"+" "+"EMAIL"+" "+"PHONE_NUMBER"+" "+"HIRE_DATE"+" "+"JOB_ID"+" "+"SALARY");
		while(rs.next())
		{
			System.out.println(rs.getInt("EMPLOYEE_ID")+"      "+ rs.getString("FIRST_NAME")+"     "+rs.getString("LAST_NAME")+"     "+rs.getString("EMAIL")+"     "+rs.getString("PHONE_NUMBER")+"     "+rs.getDate("HIRE_DATE")+"     "+rs.getString("JOB_ID")+"     "
					+rs.getInt("SALARY"));
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
