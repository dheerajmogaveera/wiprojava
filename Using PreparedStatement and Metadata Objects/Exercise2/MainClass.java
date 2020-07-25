package Exercise2;
import java.util.*;
import java.sql.*;

class MainClass{

	public static void main(String[] args) {
		try{
			InsertData e = new InsertData();
			e.insert(args);
		
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}