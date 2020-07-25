package com.wipro.sales.service;

import java.util.ArrayList;
import java.util.Date;
import com.wipro.sales.bean.Sales;
import com.wipro.sales.bean.SalesReport;
import com.wipro.sales.bean.Stock;
import com.wipro.sales.dao.SalesDao;
import com.wipro.sales.dao.StockDao;

public class Administrator {
	private static StockDao stockDao = new StockDao();
	private static SalesDao salesDao = new SalesDao();
	
	
	public synchronized String insertStock(Stock stock) {		
		if (stock != null && stock.getProductName().length() >= 2) {
			String productID = stockDao.generateProductID(stock.getProductName());
			stock.setProductID(productID);
			if (stockDao.insertStock(stock) == true)
				return productID+" inserted sucessfully";
			else
				return "Data is not valid for insertion";
		} else {
			return "Data is not valid for insertion";
		}
	}
	
	
	public String deleteStock(String ProductID) {		
		if (stockDao.deleteStock(ProductID) == true)
			return ProductID+" removed";
		else 
			return null;
	}
	
	
	public String insertSales(Sales sales) {
		if (sales == null) 
			return "Object not valid for insertion";
		
		if (stockDao.getStock(sales.getProductID()) == null)
			return "Product ID for sales cannot be empty";
		
		if (stockDao.getStock(sales.getProductID()).getQuantityOnHand() < sales.getQuantitySold())
			return "Not enough stock on hand for sales";
		
		if (!sales.getSalesDate().before(new Date()))
			return ""+sales.getSalesDate();
		
		String salesID = salesDao.generateSalesID(sales.getSalesDate());
		sales.setSalesID(salesID);
		
		if (salesDao.insertSales(sales) == 1) 
		{
			if (stockDao.updateStock(sales.getProductID(), sales.getQuantitySold()) == 1)
				return "sales record inserted successfully";
			else 
				return "Error while insertion";
		} else {
			return "Error while insertion";
		}
	}
	
	
	public ArrayList<SalesReport> getSalesReport() {	
		return salesDao.getSalesReport();
	}
	
}