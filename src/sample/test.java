package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.Statement;

public class test {
	static Connection con;
	
	public static void main(String[] args)  throws Exception
	
	{
		
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//Connection con=DriverManager.getConnection(URL);
		con=DriverManager.getConnection("jdbc:sqlserver://localhost\\sqlexpress:1434;databaseName=emp;integratedSecurity=true");
		
		
		Statement st=con.createStatement();
		String query="select * from employee ";
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(4));
		
		}
		
		
		
		
		} 
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.print(e);
		}
		finally
		{
			con.close();
		}
		
			
	}

}
