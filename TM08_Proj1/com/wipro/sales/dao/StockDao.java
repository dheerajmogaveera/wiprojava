package com.wipro.sales.dao;

import java.sql.*;
import com.wipro.sales.bean.Stock;
import com.wipro.sales.util.DBUtil;

public class StockDao {
    Connection conn=null;
	
	public boolean insertStock(Stock stock)
	{
		try {
			conn=new DBUtil().getDBConnection();
			PreparedStatement pst=conn.prepareStatement("INSERT INTO TBL_STOCK VALUES(?,?,?,?,?)");
			pst.setString(1, stock.getProductID());
			pst.setString(2, stock.getProductName());
			pst.setInt(3, stock.getQuantityOnHand());
			pst.setDouble(4, stock.getProductUnitPrice());
			pst.setInt(5,stock.getReorderLevel());
			pst.executeUpdate();
			return true;
			
		}
		catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
				
	}

	
	public String generateProductID(String productName)
	{
	    String out="";
	    int pid;
	    out=productName.substring(0,2);
	    try {
	    	conn=new DBUtil().getDBConnection();
	    	PreparedStatement pst=conn.prepareStatement("SELECT SEQ_PRODUCT_ID.NEXTVAL FROM DUAL");
	    	ResultSet rs =pst.executeQuery();
	    	rs.next();
	    	pid=rs.getInt(1);
	    	out=out+pid;
	    	return out;
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    	return null;
	    }
	    
          }
	public int updateStock(String productID,int soldQty)
	{
		
		try {
			conn=new DBUtil().getDBConnection();
			PreparedStatement pst=conn.prepareStatement("UPDATE TBL_STOCK SET Quantity_On_Hand = Quantity_On_Hand - ? WHERE Product_ID = ?");
			pst.setInt(1,soldQty);
			pst.setString(2, productID);
		     pst.executeUpdate();
			return 1;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return 0;
		}
		
	}
	
	public Stock getStock(String productID) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM TBL_STOCK WHERE Product_ID = ?";
		
		try {
			conn = new DBUtil().getDBConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, productID);
			
			ResultSet rs = pstmt.executeQuery();
			
			rs.next();
			Stock stock = new Stock();
			stock.setProductID(rs.getString(1));
			stock.setProductName(rs.getString(2));
			stock.setQuantityOnHand(rs.getInt(3));
			stock.setProductUnitPrice(rs.getDouble(4));
			stock.setReorderLevel(rs.getInt(5));
			
			return stock;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}		
	}
	
	public boolean deleteStock(String productID) {
		Connection conn = null;
		PreparedStatement pstmt ,psmt1= null;
		
		//If Deleting the stocks data from tbl_stocks the data will also have to be deleted 
		// from v_sales_report view due or it will cause an error due to integrity constraint 
		//as v_sales_report is child view of tbl_stocks and contains child record of tbl_stocks
		
		String sql2 = "DELETE TBL_STOCK WHERE Product_ID = ?";
		String sql1="DELETE V_SALES_REPORT WHERE PRODUCT_ID = ?";
		
		try {
			conn = new DBUtil().getDBConnection();
			pstmt = conn.prepareStatement(sql1);
			pstmt.setString(1, productID);
			
			if (pstmt.executeUpdate() >= 1) 
			{
		    psmt1=conn.prepareStatement(sql2);
		    psmt1.setString(1, productID);
		    psmt1.executeUpdate();
		    return true;
			}
				
			else 
				return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}