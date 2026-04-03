package Connection_JDBC;

import java.sql.*;
import java.util.*;

public class Qiestion_4 
{
	public static void main(String args[])
	{
		try
		{
			String driver = "org.postgresql.Driver";
            String url = "jdbc:postgresql://192.168.1.17/cse_db24";
			String username="24bcsh01";
			String password="24bcsh01";
			Scanner in = new Scanner(System.in);
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			if (con != null) 
			{
                System.out.println("Connection established successfully...");
                Statement stmt = con.createStatement();
            
                System.out.print("Enter Roll No: ");
                int roll = in.nextInt();
                in.nextLine(); 
                
                System.out.print("Enter Name: ");
                String name = in.nextLine();
                
                System.out.print("Enter Age: ");
                int age = in.nextInt();
                in.nextLine(); 
                
                System.out.print("Enter Department: ");
                String dept = in.nextLine();
                
                System.out.print("Enter CGPA: ");
                double cgpa = in.nextDouble();
                
                String qry = "INSERT INTO student2(roll_no, name, age, department,cgpa)VALUES(?,?,?,?,?)";
                PreparedStatement pstmt = con.prepareStatement(qry);
                
                // Setting the values to the placeholders
                pstmt.setInt(1, roll);
                pstmt.setString(2, name);
                pstmt.setInt(3, age);
                pstmt.setString(4, dept);
                pstmt.setDouble(5, cgpa);
                
                int rows = pstmt.executeUpdate();
                System.out.println(rows + " record inserted successfully.");
                
                // Closing resources
                pstmt.close();
                con.close();
                in.close();
			}
		}
		catch (Exception e)
		{
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
                
			
		}
	}


