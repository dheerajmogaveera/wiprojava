import java.sql.*;

public class Exercise5 {
	
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		int rollno = 0;
		if(args.length==1)
			rollno = Integer.parseInt(args[0]);
		
		try {
			if(rollno!=0)
				sql = "SELECT * FROM student WHERE rollno = ?";
			else 
				sql = "SELECT * FROM student";
			
			pstmt = conn.prepareStatement(sql);
			if (rollno != 0) pstmt.setInt(1, rollno);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int ROLLNO = rs.getInt("ROLLNO");
				String STUDENTNAME = rs.getString("NAME");
				String STANDARD = rs.getString("STD");
				String DATE_OF_BIRTH = rs.getString("DOB");
				double FEES = rs.getDouble("FEES");
				
				System.out.println(ROLLNO + " " + STUDENTNAME + " " + STANDARD + 
						" " + DATE_OF_BIRTH + " " + FEES);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if(!pstmt.isClosed()) pstmt.close();
			if(!conn.isClosed()) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}