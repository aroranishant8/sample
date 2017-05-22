package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class testdb {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost\\sqlexpress:1434;databaseName=student1;integratedSecurity=true");
	
		Statement st=con.createStatement();
		st.execute("insert into studentdata values(3,'abc',2435,'dhs')");
	}

}
