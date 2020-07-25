package Exercise2;
import java.sql.*;
class ConnectionClass{

	Connection con;

	Connection connectionFactory(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521/orcl";
			con = DriverManager.getConnection(url,"hr", "hr");
            System.out.println("Connection Established successfully.");
		}
		catch(Exception e){
			System.out.println(e);
		}

		return con;
	}
}