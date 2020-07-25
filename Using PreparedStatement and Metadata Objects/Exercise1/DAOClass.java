
import java.sql.*;

public class DAOClass {
      
	Connection conn;
	 DAOClass()
	 {
		 Connect c=new Connect();
		 conn=c.getConnection();
	 }
	
      boolean insert(String args[]){
		try {
			
		
		int roll =Integer.parseInt(args[1]);
		String name=args[2];
		String std=args[3];
		String dob=args[4];
		String d[]=dob.split("-");
		if(d[1].equalsIgnoreCase("Jan"))
			dob=d[0]+"-01-"+d[2];
		if(d[1].equalsIgnoreCase("Feb"))
			dob=d[0]+"-01-"+d[2];
		if(d[1].equalsIgnoreCase(""))
			dob=d[0]+"-01-"+d[2];
		if(d[1].equalsIgnoreCase("Jan"))
			dob=d[0]+"-01-"+d[2];
		if(d[1].equalsIgnoreCase("Jan"))
			dob=d[0]+"-01-"+d[2];
		if(d[1].equalsIgnoreCase("Jan"))
			dob=d[0]+"-01-"+d[2];
		if(d[1].equalsIgnoreCase("Jan"))
			dob=d[0]+"-01-"+d[2];
		if(d[1].equalsIgnoreCase("Jan"))
			dob=d[0]+"-01-"+d[2];
		if(d[1].equalsIgnoreCase("Jan"))
			dob=d[0]+"-01-"+d[2];
		if(d[1].equalsIgnoreCase("Jan"))
			dob=d[0]+"-01-"+d[2];
		if(d[1].equalsIgnoreCase("Jan"))
			dob=d[0]+"-01-"+d[2];
		if(d[1].equalsIgnoreCase("Jan"))
			dob=d[0]+"-01-"+d[2];
		int fees=Integer.parseInt(args[5]);
		PreparedStatement pst=conn.prepareStatement("INSERT INTO student(rollno,name,std,dob,fees) values(?,?,?,?,?)");
		pst.setInt(1,roll);
		pst.setString(2, name);
		pst.setString(3, std);
		pst.setDate(4, Date.valueOf(dob));
		pst.setInt(5, fees);
		pst.executeUpdate();
		return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	     return false;
	}
    boolean delete(int rollno)
    {
    	try {
    		PreparedStatement pst=conn.prepareStatement("DELETE student WHERE rollno=?");
    		pst.setInt(1, rollno);
    		pst.executeUpdate();
    		return true;
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    	return false;
    }
    boolean modify(int rollno,int fees)
    {
    	try {
    		PreparedStatement pst=conn.prepareStatement("UPDATE student SET fees=? WHERE rollno=?");
    		pst.setInt(1, fees);
    		pst.setInt(2, rollno);
    		pst.executeUpdate();
    		return true;
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    	return false;
    }
    public boolean display(int rollno) {
		String sql = "SELECT * FROM student WHERE rollno = ?";
		
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
		    pst.setInt(1, rollno);
			ResultSet rs =pst.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			
			while (rs.next()) {
				StringBuilder sb = new StringBuilder();
				
				for (int i = 1; i <= rsmd.getColumnCount(); i++) {
					String colName = rsmd.getColumnName(i);
					
					sb.append(rs.getObject(colName));
					if (i != rsmd.getColumnCount()) sb.append(", ");
				}
				System.out.println(sb);
			}
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean display(){
		String sql = "SELECT * FROM student";
		
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs =pst.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			
			while (rs.next()) {
				StringBuilder sb = new StringBuilder();
				
				for (int i = 1; i <= rsmd.getColumnCount(); i++) {
					String colName = rsmd.getColumnName(i);
					
					sb.append(rs.getObject(colName));
					if (i != rsmd.getColumnCount()) sb.append(", ");
				}
				
				System.out.println(sb);
			}
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
