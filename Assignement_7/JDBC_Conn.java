package Connection_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
public class JDBC_Conn {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			String driver = "org.postgresql.Driver";
			String url="jdbc:postgresql://192.168.1.17/cse_db24";
			String username = "24bcsh01";
			String password = "24bcsh01";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password); 
			if (con!= null)
			{
				System.out.println("Connection established successfully...");
			}
		}
		catch (Exception e) 
			{ 
			System.out.println(e);
			}
		}

	}

