package com.wipro.sales.dao;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.wipro.sales.bean.Sales;
import com.wipro.sales.bean.SalesReport;
import com.wipro.sales.util.DBUtil;

public class SalesDao {
  
	Connection conn=null;
	public int insertSales(Sales sales)
	{
		java.sql.Date sqlDate = new java.sql.Date(sales.getSalesDate().getTime());
		try {
		conn=new DBUtil().getDBConnection();
		PreparedStatement pst=conn.prepareStatement("INSERT INTO TBL_SALES VALUES(?,?,?,?,?)");
		System.out.println("sales id:"+sales.getSalesID()+" sales date:"+sales.getSalesDate());
		pst.setString(1,sales.getSalesID());
		pst.setDate(2, sqlDate);
		pst.setString(3, sales.getProductID());
		pst.setInt(4, sales.getQuantitySold());
		pst.setDouble(5, sales.getSalesPricePerUnit());
		pst.executeUpdate();
	
		return 1;
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}
	
	public String generateSalesID(java.util.Date salesDate)
	{
		String out="";
		try {
			int sid;
			SimpleDateFormat sd=new SimpleDateFormat("dd-MM-yyyy");
			String sdate=sd.format(salesDate);
			String[] d=sdate.split("-");
			out=d[2].substring(2);
			System.out.println("out:"+out);
			conn=new DBUtil().getDBConnection();
			PreparedStatement pst=conn.prepareStatement("SELECT SEQ_SALES_ID.NEXTVAL FROM DUAL");
			ResultSet rs=pst.executeQuery();
			rs.next();
			sid=rs.getInt(1);
			out=out+sid;
			return out;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
	}
	
	public ArrayList<SalesReport> getSalesReport() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM V_SALES_REPORT";
		
		ArrayList<SalesReport> list = new ArrayList<SalesReport>();
		
		try {
			conn = new DBUtil().getDBConnection();
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				SalesReport salesReport = new SalesReport();
				salesReport.setSalesID(rs.getString(1));
				salesReport.setSalesDate(rs.getDate(2));
				salesReport.setProductID(rs.getString(3));
				salesReport.setProductName(rs.getString(4));
				salesReport.setQuantitySold(rs.getInt(5));
				salesReport.setProductUnitPrice(rs.getDouble(6));
				salesReport.setSalesPricePerUnit(rs.getDouble(7));
				salesReport.setProfitAmount(rs.getDouble(8));
				list.add(salesReport);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}		
		
		return list;
	}
}
