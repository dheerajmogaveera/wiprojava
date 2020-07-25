package Exercise2;
import java.sql.*;

class InsertData{

	Connection con;

	InsertData(){
		ConnectionClass x = new ConnectionClass();
		con = x.connectionFactory();
	}
	
	public void insert(String[] args) throws SQLException{
		int Rollno = Integer.parseInt(args[0]);
		String StudentName = args[1];
		String Standard =  args[2];
		String Date_Of_Birth = args[3];
		int Fees = Integer.parseInt(args[4]);
		PreparedStatement pst = con.prepareStatement("insert into student values(?, ?, ?, ?, ?)");
		pst.setInt(1, Rollno);
		pst.setString(2, StudentName);
		pst.setString(3, Standard);
		pst.setString(4, Date_Of_Birth);
		pst.setInt(5, Fees);
		pst.executeUpdate();
	}
}





