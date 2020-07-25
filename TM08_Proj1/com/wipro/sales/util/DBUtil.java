package com.wipro.sales.util;

import java.sql.*;
public class DBUtil {

	private static Connection newConnection;
	public Connection getDBConnection()
	{
	  try {
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    newConnection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracledb","hr","hr");
		    return newConnection;
	  }
		catch(Exception e)
		{   
			System.out.println("Connection could not be established due to:");
			System.out.println(e);
			return null;
		}
	    
	}
}
